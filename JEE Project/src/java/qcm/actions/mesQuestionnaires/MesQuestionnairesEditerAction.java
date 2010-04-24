/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.actions.mesQuestionnaires;

import java.sql.SQLException;
import qcm.actions.EnseignantAction;
import qcm.exceptions.UnauthorizedActionException;
import qcm.models.Questionnaire;
import qcm.persistences.QuestionnaireDAO;
import qcm.services.ActionHelper;

/**
 *
 * @author marya
 */
public class MesQuestionnairesEditerAction extends EnseignantAction{
    
    public void execute() throws SQLException , UnauthorizedActionException{
        Questionnaire questionnaire = QuestionnaireDAO.getById(Integer.parseInt(request.getParameter("questionnaire").toString()));
        int idUser = ActionHelper.getIdUser(request);
        if(idUser != questionnaire.getIdUser()){
            throw new UnauthorizedActionException("Vous n'avez pas le droit d'éditer ce questionnaire car vous n'êtes pas son créateur.");
        }
        request.setAttribute("questionnaire", questionnaire);
        ActionHelper.setAttributeNiveau(questionnaire.getIdNiveau(), request);
        setView("/mesQuestionnaires/editer.jsp");
    }

}
