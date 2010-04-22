/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.actions;

import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import qcm.models.User;
import qcm.services.UserService;

/**
 *
 * @author marya
 */
public class AuthenticateAction extends AbstractAction{

    




    public void execute(){
System.out.println("login");

        String page = "index.jsp";
        UserService uS = new UserService();
        try{
            if(!isUserAuthentificated()){
                String login = request.getParameter("login").toString();
                String password = request.getParameter("password").toString();
                if (login == null || login.trim().isEmpty()) {
                    addErrorMessage("Veuillez renseigner votre login");
                } else if (password == null || password.trim().isEmpty()) {
                    addErrorMessage("Veuillez renseigner votre mot de passe");
                }else{
                    User user = (User) uS.checkUserByLoginAndPassWord(login,password);
                    if(user != null){
                        request.getSession().setAttribute("user", user);
                        page = "/user/accueil.jsp";
                    }else{
                        addErrorMessage("Utilisateur inconnu : "+login);
                    }
                }
            }else{
                page = "/user/accueil.jsp";
            }
            
        }
        catch(SQLException e){
            addErrorMessage("Erreur interne, merci de recommencer ultérieurement");
        }
        
        finally{
            setPageToForward(page);
        }
    }

}
