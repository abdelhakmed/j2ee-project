/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.actions;

import java.sql.SQLException;
import qcm.models.User;
import qcm.services.ActionHelper;
import qcm.services.Helper;

/**
 *
 * @author marya
 */
public class IndexAction extends AbstractAction{

    




    public void execute() throws SQLException,Exception{

        String page = "/scripts/login.jsp";
        Helper helper = new Helper();
       
        if(!isUserAuthentificated()){
            String login = request.getParameter("login").toString();
            String password = request.getParameter("password").toString();
            if (login == null || login.trim().isEmpty()) {
                throw new Exception("Veuillez renseigner votre login");
            } else if (password == null || password.trim().isEmpty()) {
                throw new Exception("Veuillez renseigner votre mot de passe");
            }else{
                User user = ActionHelper.checkUserByLoginAndPassWord(login,password);
                if(user != null){
                    request.getSession().setAttribute("user", user);
                    page = "/user/accueil.jsp";
                }else{
                    throw new Exception("Utilisateur inconnu : "+login);
                }
            }
        }else{
            page = "/user/accueil.jsp";
        }
        setView(page);
       
        
    }

}
