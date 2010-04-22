/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.services;

import java.sql.SQLException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import qcm.actions.Action;
import qcm.models.Questionnaire;
import qcm.models.QuestionnairePasse;
import qcm.models.User;
import qcm.persistences.NiveauDAO;
import qcm.persistences.QuestionnairePasseDAO;
import qcm.persistences.ThemeDAO;
import qcm.persistences.UserDAO;

/**
 *
 * @author marya
 */
public class ActionHelper {

    public static void setAttributeThemes(HttpServletRequest request) throws SQLException{
        request.setAttribute("themes", ThemeDAO.getAll());
    }

    public static void setAttributeNiveaux(HttpServletRequest request) throws SQLException{
        request.setAttribute("niveaux", NiveauDAO.getAll());
    }

    public static boolean userHasAlreadyPassedQuestionnaire(int idUser, Questionnaire q) throws SQLException{
        return getQuestionnairesPasseByUser(idUser).contains(new QuestionnairePasse(q.getIdQuestionnaire(), idUser));
    }

    public static int getIdUser(HttpServletRequest request){
        return ((User) request.getSession().getAttribute("user")).getIdUser();
    }

    public static List<QuestionnairePasse> getQuestionnairesPasseByUser(int idUser) throws SQLException{
        return QuestionnairePasseDAO.getByUser(idUser);
    }


    public static boolean userHasRoleToAccessRequest(final String role , final HttpServletRequest request){
        return ((User) request.getSession().getAttribute("user")).getStatut().getLibelle().equals(role);
    }

     public static User checkUserByLoginAndPassWord(String login, String passw) throws SQLException{
        return UserDAO.getByLoginAndPassword(login, passw);
    }
}
