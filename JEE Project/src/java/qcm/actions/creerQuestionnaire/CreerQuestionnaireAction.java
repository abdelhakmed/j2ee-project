/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.actions.creerQuestionnaire;

import javax.servlet.http.HttpServletRequest;
import qcm.actions.AbstractAction;
import qcm.services.ActionHelper;

/**
 *
 * @author marya
 */
public abstract class CreerQuestionnaireAction extends AbstractAction{

    public CreerQuestionnaireAction() {
        super();
    }


    @Override
    public void setRequest(HttpServletRequest request) throws Exception{
        if(!ActionHelper.userHasRoleToAccessRequest("Enseignant", request) || !ActionHelper.userHasRoleToAccessRequest("Administrateur", request)){
            throw new Exception();
        }
        this.request = request;
    }

    public abstract void execute();
}
