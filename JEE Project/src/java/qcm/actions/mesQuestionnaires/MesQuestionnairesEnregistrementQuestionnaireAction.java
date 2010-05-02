/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.actions.mesQuestionnaires;

import qcm.actions.EnseignantAction;
import qcm.exceptions.UnauthorizedActionException;
import qcm.models.Questionnaire;
import qcm.persistences.QuestionnaireDAO;
import qcm.services.ActionHelper;
import qcm.services.Helper;

/**
 *
 * @author marya
 */
public class MesQuestionnairesEnregistrementQuestionnaireAction extends EnseignantAction {
    public void execute() throws Exception {
        Integer idQuestionnaire = Integer.parseInt(request.getParameter("idQuestionnaire"));
        if(idQuestionnaire == null){
            throw new UnauthorizedActionException("Le questionnaire n'a pas été trouvé");
        }
        Questionnaire questionnaire = QuestionnaireDAO.getById(idQuestionnaire);
        int idUser = ActionHelper.getIdUser(request);
        if(idUser != questionnaire.getIdUser()){
            throw new UnauthorizedActionException("Vous n'avez pas le droit d'éditer ce questionnaire car vous n'êtes pas son créateur.");
        }
        if(questionnaire.estPasse()){
            throw new UnauthorizedActionException("Ce questionnaire n'est pas modifiable car il a déjà été passé.");
        }
        String libelleQuestionnaire = (String) request.getParameter("libelleQuestionnaire");
        Integer niveauQuestionnaire = Integer.parseInt(request.getParameter("niveauQuestionnaire"));
        if(niveauQuestionnaire == null){
            throw new UnauthorizedActionException("Merci de spécifier le niveau pour votre questionnaire");
        }
        questionnaire.setLibelle(libelleQuestionnaire);
        questionnaire.setIdNiveau(niveauQuestionnaire);
        Helper.save(questionnaire);
        request.setAttribute("questionnaire" , idQuestionnaire);
        setView("/mesQuestionnaires/actionEffectue.jsp");
    }
}
