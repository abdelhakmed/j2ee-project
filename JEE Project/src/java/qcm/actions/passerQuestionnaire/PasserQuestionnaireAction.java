/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.actions.passerQuestionnaire;

import javax.servlet.http.HttpServletRequest;
import qcm.actions.AbstractAction;
import qcm.exceptions.ExpiredSessionException;

/**
 *
 * @author marya
 */
public abstract class PasserQuestionnaireAction  extends AbstractAction{


    @Override
    public void setRequestAndCheckAuthorization(HttpServletRequest request) throws Exception{
        
        if(!super.isUserAuthenticated()){
            throw new ExpiredSessionException("Merci de vous authentifier");
        }
        super.setRequestAndCheckAuthorization(request);
    }

    public abstract void execute() throws Exception;
}
