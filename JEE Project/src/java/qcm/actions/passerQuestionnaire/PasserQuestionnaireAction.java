/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.actions.passerQuestionnaire;

import javax.servlet.http.HttpServletRequest;
import qcm.actions.AbstractAction;
import qcm.exceptions.ExpiredSessionException;
import qcm.exceptions.UnauthorizedActionException;

/**
 *
 * @author marya
 */
public abstract class PasserQuestionnaireAction  extends AbstractAction{

    protected PasserQuestionnaireAction() {
        super();
    }

    @Override
    public void setRequest(HttpServletRequest request) throws UnauthorizedActionException  , ExpiredSessionException{
        System.out.println("PasserQuestionnaireAction");
        if(!isUserAuthenticated()){
            System.out.println("PasserQuestionnaireAction1");
            throw new ExpiredSessionException("Merci de vous authentifier");
        }
        System.out.println("PasserQuestionnaireAction2");
        this.request = request;
    }

    public abstract void execute() throws Exception;
}
