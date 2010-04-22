/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.actions.passerQuestionnaire;

import java.sql.SQLException;
import qcm.actions.AbstractAction;
import qcm.services.ActionHelper;

/**
 *
 * @author marya
 */
public class PasserQuestionnaireIndexAction extends AbstractAction{

    public void execute() throws SQLException{
        ActionHelper.setAttributeNiveaux(request);
         
    }


    
}
