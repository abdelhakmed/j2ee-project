/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.actions.mesResultats;

import java.sql.SQLException;
import qcm.actions.AbstractAction;
import qcm.exceptions.ExpiredSessionException;
import qcm.exceptions.UnauthorizedActionException;
import qcm.models.Questionnaire;
import qcm.persistences.QuestionnaireDAO;
import qcm.services.ActionHelper;

/**
 *
 * @author marya
 */
public class MesResultatsCorrectionAction extends AbstractAction{

    public void execute() throws SQLException , ExpiredSessionException ,UnauthorizedActionException{
        if(!isUserAuthenticated()){
            throw new ExpiredSessionException("Merci de vous authentifier");
        }
        Questionnaire questionnaire = QuestionnaireDAO.getById(Integer.parseInt(request.getParameter("questionnaire").toString()));
        if(!ActionHelper.userHasAlreadyPassedQuestionnaire(ActionHelper.getIdUser(request), questionnaire)){
            throw new UnauthorizedActionException("Vous n'avez pas encore passé ce questionnaire");
        }
        request.setAttribute("questionnaire", questionnaire);
        setView("/mesResultats/afficherCorrection.jsp");
    }
}
