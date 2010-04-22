/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.actions;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author marya
 */
public abstract class AbstractAction implements Action{


    protected HttpServletRequest request;
    private String view;



    protected AbstractAction(){
    }

    public void setRequest(HttpServletRequest request) throws Exception{
        this.request = request;
    }



    public String getView(){
        return view;
    }

    protected void setView(String forward){
        this.view = forward;
    }



    /**
     * Vérifie si la session de l'utilisateur a été initialisée
     * @param request, Request sur laquelle on va testé l'existence de la session
     * @return true si la session n'est pas null, false sinon
     */
    public boolean isUserAuthentificated() {
        return request.getSession().getAttribute("user") != null;
    }

    public abstract void execute() throws Exception;

}
