package qcm.actions.admin;

import java.sql.SQLException;
import java.util.HashMap;
import qcm.actions.AdminAction;
import qcm.models.User;
import qcm.persistences.UserDAO;

/**
 *
 * @author marya
 */
public class AdminUsersControleAction extends AdminAction {

    public void execute() throws SQLException {
        Integer idUser = Integer.parseInt(request.getParameter("id"));
        if (idUser != null && idUser >= 0) {
            System.out.println(idUser);
            Boolean estActif = Boolean.parseBoolean(request.getParameter("est_actif"));
            User user = UserDAO.getById(idUser);
            user.setEstActif(estActif);
            UserDAO.update(user);
            String message = "Le compte utilisateur de <strong>" + user.getNom() + " " + user.getPrenom() + "</strong> a été ";
            if (estActif) {
                message += "activé";
            } else {
                message += "désactivé";
            }
            request.setAttribute("message", message);
        } else {
            request.setAttribute("message", "Utilisateur inexistant");
        }
        HashMap<Integer, User> users = UserDAO.getAll();
        request.setAttribute("users", users);
        setView("/admin/gererUtilisateurs.jsp");
    }
}
