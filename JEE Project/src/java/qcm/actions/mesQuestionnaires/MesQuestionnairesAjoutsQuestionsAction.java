/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.actions.mesQuestionnaires;

import qcm.actions.EnseignantAction;
import qcm.exceptions.UnauthorizedActionException;
import qcm.models.Questionnaire;
import qcm.persistences.QuestionnaireDAO;
import qcm.services.ActionHelper;

/**
 *
 * @author marya
 */
public class MesQuestionnairesAjoutsQuestionsAction extends EnseignantAction{

    public void execute() throws Exception {
        Integer idQuestionnaire = Integer.parseInt(request.getParameter("idQuestionnaire"));
        if(idQuestionnaire == null){
            throw new UnauthorizedActionException("Merci de spécifier le questionnaire");
        }
        Questionnaire questionnaire = QuestionnaireDAO.getById(idQuestionnaire);
        ActionHelper.setAttributeQuestionsByThemeNewQuestionnaire(questionnaire.getIdTheme(), request);
        request.setAttribute("questionnaire", questionnaire);
        setView("/mesQuestionnaires/ajoutQuestion.jsp");
    }

}
