/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.actions.creerQuestionnaire;

import java.sql.SQLException;
import qcm.actions.EnseignantAction;
import qcm.services.ActionHelper;

/**
 * Action index pour la creation d'un questionnaire
 * @author marya
 */
public class CreerQuestionnaireIndexAction extends EnseignantAction{
    
    public void execute() throws SQLException{
        ActionHelper.setAttributeThemes(request);
        ActionHelper.setAttributeNiveaux(request);
        setView("/creerQuestionnaire/choix.jsp");
    }

}
