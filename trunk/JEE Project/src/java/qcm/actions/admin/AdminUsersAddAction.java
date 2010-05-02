package qcm.actions.admin;

import java.util.List;
import qcm.actions.AdminAction;
import qcm.models.Statut;
import qcm.persistences.StatutDAO;

/**
 *
 * @author Lou
 */
public class AdminUsersAddAction extends AdminAction {

    @Override
    public void execute() throws Exception {
        List<Statut> statuts = StatutDAO.getAll();
        request.setAttribute("statuts", statuts);
        setView("/admin/addUser.jsp");
    }

}
