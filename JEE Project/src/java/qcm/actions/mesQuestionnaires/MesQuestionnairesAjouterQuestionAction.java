/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.actions.mesQuestionnaires;

import java.util.List;
import qcm.actions.EnseignantAction;
import qcm.exceptions.UnauthorizedActionException;
import qcm.models.Question;
import qcm.models.Questionnaire;
import qcm.persistences.QuestionDAO;
import qcm.persistences.QuestionnaireDAO;
import qcm.services.ActionHelper;

/**
 *
 * @author marya
 */
public class MesQuestionnairesAjouterQuestionAction extends EnseignantAction{

    
    public void execute() throws Exception {
        Integer idQuestionnaire = Integer.parseInt(request.getParameter("idQuestionnaire"));
        if(idQuestionnaire == null){
            throw new UnauthorizedActionException("Merci de spécifier le questionnaire");
        }
        Questionnaire questionnaire = QuestionnaireDAO.getById(idQuestionnaire);
        int idQuestion = Integer.parseInt(request.getParameter("idQuestionToAdd").toString());
        Question questionToAdd = QuestionDAO.getById(idQuestion);
        if ((!questionnaire.getQuestions().contains(questionToAdd)) ){
            questionnaire.addQuestion(questionToAdd);
        }
        request.setAttribute("questionnaire", questionnaire);
        ActionHelper.setAttributeQuestionsByThemeNewQuestionnaire(questionnaire.getIdTheme(), request);
        setView("/mesQuestionnaire/ajoutQuestion.jsp");
    }

}
