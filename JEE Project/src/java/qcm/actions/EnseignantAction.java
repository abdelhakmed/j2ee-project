package qcm.actions;

import javax.servlet.http.HttpServletRequest;
import qcm.actions.AbstractAction;
import qcm.exceptions.ExpiredSessionException;
import qcm.exceptions.UnauthorizedActionException;
import qcm.services.ActionHelper;

/**
 * Action de creation d'un questionnaire
 * @author marya
 */
public abstract class EnseignantAction extends AbstractAction {

    public EnseignantAction() {
        super();
    }

    @Override
    public void setRequest(HttpServletRequest request) throws UnauthorizedActionException  , ExpiredSessionException{
        if(!isUserAuthenticated()){
            throw new ExpiredSessionException("Merci de vous authentifier");
        }

        if (!ActionHelper.userHasRoleToAccessRequest("Enseignant", request) || !ActionHelper.userHasRoleToAccessRequest("Administrateur", request)) {
            throw new UnauthorizedActionException("Vous n'avez pas l'autorisation requise pour cette page");
        } 
        this.request = request;
    }

    public abstract void execute() throws Exception;
}
