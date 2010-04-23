package qcm.actions.admin;

import java.sql.SQLException;
import qcm.actions.AdminAction;
import qcm.persistences.QuestionnaireDAO;

/**
 *
 * @author marya
 */
public class AdminQuestionnairesIndexAction extends AdminAction {

    public void execute() throws SQLException {
        request.setAttribute("questionnaires", QuestionnaireDAO.getAll());
        setView("/admin/gererQuestionnaires.jsp");
    }
}
