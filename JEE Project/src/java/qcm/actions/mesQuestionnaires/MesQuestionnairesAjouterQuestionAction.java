/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.actions.mesQuestionnaires;

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
        System.out.println("1");
        if(idQuestionnaire == null){
            throw new UnauthorizedActionException("Merci de spécifier le questionnaire");
        }
        System.out.println("2");
        Questionnaire questionnaire = QuestionnaireDAO.getById(idQuestionnaire);
        if(questionnaire.getIdUser() != ActionHelper.getIdUser(request)){
            throw new UnauthorizedActionException("Vous n'avez pas le droit de modifier ce questionnaire car vous n'êtes pas son créateur.");
        }
        System.out.println("3");
        int idQuestion = Integer.parseInt(request.getParameter("idQuestionToAdd"));
        Question questionToAdd = QuestionDAO.getById(idQuestion);
        System.out.println("4");
        if ((!questionnaire.getQuestions().contains(questionToAdd)) ){
            questionnaire.addQuestion(questionToAdd);
            QuestionnaireDAO.addQuestion(idQuestionnaire, questionToAdd);
        }
        System.out.println("5");
        request.setAttribute("questionnaire", questionnaire);
        ActionHelper.setAttributeQuestionsByThemeNewQuestionnaire(questionnaire.getIdTheme(), request);
        setView("/mesQuestionnaires/ajoutQuestion.jsp");
    }

}
