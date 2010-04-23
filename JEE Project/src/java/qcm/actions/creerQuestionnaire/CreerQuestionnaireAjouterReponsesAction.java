/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.actions.creerQuestionnaire;

import java.util.ArrayList;
import qcm.actions.EnseignantAction;
import qcm.exceptions.UnauthorizedActionException;
import qcm.models.Question;
import qcm.models.Questionnaire;
import qcm.models.Reponse;
import qcm.services.ActionHelper;

/**
 *
 * @author marya
 */
public class CreerQuestionnaireAjouterReponsesAction extends EnseignantAction{

    public void execute() throws Exception {
        String libelleQuestion = request.getParameter("libelleQuestion").toString();
        int nbReponses = Integer.parseInt(request.getParameter("nbReponses"));
        if (libelleQuestion == null || libelleQuestion.trim().isEmpty()) {
            throw new UnauthorizedActionException("Merci d'entrer le libellé de votre question");
        } else if (nbReponses <= 0) {
            throw new UnauthorizedActionException("Merci d'entrer un nombre correct de réponses");
        }
        Questionnaire newQuestionnaire = (Questionnaire) request.getSession().getAttribute("newQuestionnaire");
        request.setAttribute("nbReponses", nbReponses);
        request.setAttribute("question", new Question(null, libelleQuestion, newQuestionnaire.getIdTheme(), ActionHelper.getIdUser(request), 0, new ArrayList<Reponse>()));
        setView("/creerQuestionnaire/ajouterReponses.jsp");
    }

}
