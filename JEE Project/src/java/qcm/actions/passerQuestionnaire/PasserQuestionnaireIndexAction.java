package qcm.actions.passerQuestionnaire;

import java.sql.SQLException;
import qcm.actions.AbstractAction;
import qcm.exceptions.ExpiredSessionException;
import qcm.services.ActionHelper;

/**
 * Action pour passer un questionnaire
 * @author marya
 */
public class PasserQuestionnaireIndexAction extends AbstractAction {

    public void execute() throws SQLException  , ExpiredSessionException{
        if(!isUserAuthentificated()){
            throw new ExpiredSessionException("Merci de vous authentifier");
        }
        ActionHelper.setAttributeNiveaux(request);
        ActionHelper.setAttributeThemes(request);
        setView("/passerQuestionnaire/choixQuestionnaire.jsp");
    }
}
