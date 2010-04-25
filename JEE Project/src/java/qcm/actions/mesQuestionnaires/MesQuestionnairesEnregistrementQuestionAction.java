/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.actions.mesQuestionnaires;

import java.util.List;
import qcm.actions.EnseignantAction;
import qcm.exceptions.UnauthorizedActionException;
import qcm.models.Question;
import qcm.models.Reponse;
import qcm.persistences.QuestionDAO;
import qcm.persistences.QuestionnaireDAO;
import qcm.services.ActionHelper;

/**
 *
 * @author marya
 */
public class MesQuestionnairesEnregistrementQuestionAction extends EnseignantAction{

    public void execute() throws Exception {
        Integer idQuestion = Integer.parseInt(request.getParameter("idQuestion"));
        if(idQuestion == null){
            throw new UnauthorizedActionException("La question n'a pas été trouvé");
        }
        int idUser = ActionHelper.getIdUser(request);
        Question question = QuestionDAO.getById(idQuestion);
        if(idUser != question.getIdUser()){
            throw new UnauthorizedActionException("Vous ne pouvez pas modifier cette question car vous n'êtes pas son créateur");
        }
        if(!question.estModifiable()){
             throw new UnauthorizedActionException("Cette question n'est pas modifiable car elle appartient à un questionnaire déjà passé.");
        }

        String libelleReponse = null;
        String descriptifReponse = null;
        Integer noteReponse = 0;
        boolean estCorrecte = false;
        int i = 0;
        List<Reponse> reponses = question.getReponses();
        for(Reponse reponse : reponses){
            i = reponse.getIdReponse();
            libelleReponse = (String) request.getParameter("libelleReponse_" + i);
            descriptifReponse = (String) request.getParameter("descriptifReponse_" + i);
            noteReponse = Integer.parseInt(request.getParameter("noteReponse_" + i ));
            if(noteReponse == null){
                throw new UnauthorizedActionException("Merci de spécifier chaque note pour chaque réponse");
            }
            estCorrecte = request.getParameterValues("estCorrecteReponse_" + i) != null ;
            reponse.setLibelle(libelleReponse);
            reponse.setDescriptif(descriptifReponse);
            reponse.setNote(noteReponse);
            reponse.setEstCorrecte(estCorrecte);
        }
        question.setReponses(reponses);
        QuestionDAO.update(question);
        request.setAttribute("questionnaire", QuestionnaireDAO.getById(Integer.parseInt(request.getSession().getAttribute("questionnaireEdite").toString())));
        ActionHelper.setAttributeNiveaux(request);
        setView("/mesQuestionnaires/modifierQuestionnaire.jsp");
    }

}
