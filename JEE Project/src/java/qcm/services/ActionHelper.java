package qcm.services;

import java.sql.SQLException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import qcm.models.Questionnaire;
import qcm.models.QuestionnairePasse;
import qcm.models.User;
import qcm.persistences.NiveauDAO;
import qcm.persistences.QuestionnairePasseDAO;
import qcm.persistences.ThemeDAO;
import qcm.persistences.UserDAO;

/**
 * Ensemble de méthodes qui sont régulièrement appelées dans l'application
 * @author Maria Rabarison et Lou Ferrand
 */
public class ActionHelper {

    public static void setAttributeThemes(HttpServletRequest request) throws SQLException {
        request.setAttribute("themes", ThemeDAO.getAll());
    }


    public static void setAttributeTheme(int theme , HttpServletRequest request) throws SQLException {
        request.setAttribute("theme", ThemeDAO.getById(theme));
    }

    public static void setAttributeNiveaux(HttpServletRequest request) throws SQLException {
        request.setAttribute("niveaux", NiveauDAO.getAll());
    }

    public static void setAttributeNiveau(int niveau , HttpServletRequest request) throws SQLException {
        request.setAttribute("niveau", NiveauDAO.getById(niveau));
    }

    public static boolean userHasAlreadyPassedQuestionnaire(int idUser, Questionnaire q) throws SQLException {
        return getQuestionnairesPasseByUser(idUser).contains(new QuestionnairePasse(q.getIdQuestionnaire(), idUser));
    }

    public static int getIdUser(HttpServletRequest request) {
        return ((User) request.getSession().getAttribute("user")).getIdUser();
    }

    public static List<QuestionnairePasse> getQuestionnairesPasseByUser(int idUser) throws SQLException {
        return QuestionnairePasseDAO.getByUser(idUser);
    }

    public static boolean userHasRoleToAccessRequest(final String role, final HttpServletRequest request) {
        return ((User) request.getSession().getAttribute("user")).getStatut().getLibelle().equals(role);
    }

    public static User checkUserByLoginAndPassWord(String login, String passw) throws SQLException {
        return UserDAO.getByLoginAndPassword(login, passw);
    }
}
