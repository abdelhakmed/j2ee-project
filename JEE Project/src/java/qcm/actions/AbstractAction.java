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
    private List<String> errorMessages;



    protected AbstractAction(){
        this.errorMessages = new ArrayList<String>();
    }

    public void setRequest(HttpServletRequest request){
        this.request = request;
    }

    

    protected void addErrorMessage(String errorMessage){
        errorMessages.add(errorMessage);
    }

    

    public String getView(){
        return view;
    }

    protected void setView(String forward){
        this.view = forward;
    }

    public List<String> getErrorMessages(){
        return errorMessages;
    }


    /**
     * Vérifie si la session de l'utilisateur a été initialisée
     * @param request, Request sur laquelle on va testé l'existence de la session
     * @return true si la session n'est pas null, false sinon
     */
    public boolean isUserAuthentificated() {
        return request.getSession().getAttribute("user") != null;
    }

    public abstract void execute();

}
