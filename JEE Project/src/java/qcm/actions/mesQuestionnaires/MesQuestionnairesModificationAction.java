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

/**
 *
 * @author marya
 */
public class MesQuestionnairesModificationAction extends EnseignantAction {
    public void execute() throws Exception {
        Questionnaire questionnaire = QuestionnaireDAO.getById(Integer.parseInt(request.getParameter("questionnaire")));
        int idUser = ActionHelper.getIdUser(request);
        if(idUser != questionnaire.getIdUser()){
            throw new UnauthorizedActionException("Vous n'avez pas le droit de modifier ce questionnaire car vous n'êtes pas son créateur.");
        }
        if(questionnaire.estPasse()){
            throw new UnauthorizedActionException("Ce questionnaire n'est pas modifiable car il a déjà été passé.");
        }
        ActionHelper.setAttributeNiveaux(request);
        request.setAttribute("questionnaire", questionnaire);
        setView("/mesQuestionnaires/modifierQuestionnaire.jsp");
    }
}
