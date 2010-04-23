/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.actions.passerQuestionnaire;

import java.sql.SQLException;
import qcm.actions.AbstractAction;
import qcm.exceptions.ExpiredSessionException;
import qcm.models.Qcm;
import qcm.persistences.QuestionDAO;

/**
 *
 * @author marya
 */
public class PasserQuestionnaireModifierReponsesAction  extends AbstractAction{

    public void execute() throws SQLException , ExpiredSessionException{
        if(!isUserAuthentificated()){
            throw new ExpiredSessionException("Merci de vous authentifier");
        }
        if(!((Qcm) request.getSession().getAttribute("qcm")).estFini()){
            int modifyQuestion = Integer.parseInt(request.getParameter("modifyQuestion").toString());
            request.setAttribute("questionCourante", QuestionDAO.getById(modifyQuestion));
        }
        setView("/passerQuestionnaire/afficherQuestion.jsp");
    }
}
