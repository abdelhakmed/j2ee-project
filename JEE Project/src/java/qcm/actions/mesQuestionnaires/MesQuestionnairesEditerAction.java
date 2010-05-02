/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.actions.mesQuestionnaires;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import qcm.actions.EnseignantAction;
import qcm.exceptions.UnauthorizedActionException;
import qcm.models.Question;
import qcm.models.Questionnaire;
import qcm.models.Reponse;
import qcm.persistences.QuestionnaireDAO;
import qcm.persistences.QuestionnairePasseDAO;
import qcm.services.ActionHelper;

/**
 *
 * @author marya
 */
public class MesQuestionnairesEditerAction extends EnseignantAction{
    
    public void execute() throws SQLException , UnauthorizedActionException{
        int idQuestionnaire = Integer.parseInt(request.getParameter("questionnaire"));
        Questionnaire questionnaire = QuestionnaireDAO.getById(idQuestionnaire);
        int idUser = ActionHelper.getIdUser(request);
        if(idUser != questionnaire.getIdUser()){
            throw new UnauthorizedActionException("Vous n'avez pas le droit d'éditer ce questionnaire car vous n'êtes pas son créateur.");
        }
        request.setAttribute("questionnaire", questionnaire);
        ActionHelper.setAttributeNiveau(questionnaire.getIdNiveau(), request);

        Map<Integer, Integer> usersResponses = new HashMap<Integer, Integer>();

        for(Question q: questionnaire.getQuestions()){
            for(Reponse r : q.getReponses()){
                usersResponses.put(r.getIdReponse(), QuestionnairePasseDAO.getNbUsersByResponse(r.getIdReponse(), q.getIdQuestion(), idQuestionnaire));
            }
        }

        request.getSession().setAttribute("questionnaireEdite", idQuestionnaire);
        request.setAttribute("usersResponses", usersResponses);
        setView("/mesQuestionnaires/editer.jsp");
    }

}
