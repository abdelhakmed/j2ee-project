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
    protected String forward;
    protected List<String> errorMessages;



    protected AbstractAction(HttpServletRequest request){
        this.request = request;
        this.errorMessages = new ArrayList<String>();
    }

    protected void setForward(String forward){
        this.forward = forward;
    }

    protected void addErrorMessage(String errorMessage){
        errorMessages.add(errorMessage);
    }

    

    public String getForward(){
        return forward;
    }


    public List<String> getErrorMessages(){
        return errorMessages;
    }


    public abstract void execute();

}
