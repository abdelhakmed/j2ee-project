/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.actions.mesQuestionnaires;

import qcm.actions.EnseignantAction;
import qcm.exceptions.UnauthorizedActionException;
import qcm.models.Question;
import qcm.persistences.QuestionDAO;
import qcm.services.ActionHelper;

/**
 *
 * @author marya
 */
public class MesQuestionnairesModificationQuestionAction extends EnseignantAction{

    public void execute() throws Exception {
        Integer idQuestion = Integer.parseInt(request.getParameter("idQuestion"));
        if(idQuestion == null){
            throw new UnauthorizedActionException("La question n'a pas été trouvé");
        }
        int idUser = ActionHelper.getIdUser(request);
        Question question = QuestionDAO.getById(idQuestion);
        if(idUser != question.getIdUser()){
            throw new UnauthorizedActionException("Vous ne pouvez pas modifier cette question car vous n'êtes pas son créateur");
        }
        if(!question.estModifiable()){
             throw new UnauthorizedActionException("Cette question n'est pas modifiable car elle appartient à un questionnaire déjà passé.");
        }
        request.setAttribute("question",question);
        setView("/mesQuestionnaires/modifierQuestion.jsp");
    }

}
