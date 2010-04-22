package qcm.actions.passerQuestionnaire;

import java.sql.SQLException;
import qcm.actions.AbstractAction;
import qcm.services.ActionHelper;

/**
 * Action pour passer un questionnaire
 * @author marya
 */
public class PasserQuestionnaireIndexAction extends AbstractAction {

    public void execute() throws SQLException {
        ActionHelper.setAttributeNiveaux(request);

    }
}
