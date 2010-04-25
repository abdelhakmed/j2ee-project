/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.actions.mesQuestionnaires;

import qcm.actions.EnseignantAction;
import qcm.exceptions.UnauthorizedActionException;
import qcm.persistences.QcmDAO;
import qcm.persistences.QuestionnaireDAO;
import qcm.services.ActionHelper;

/**
 *
 * @author marya
 */
public class MesQuestionnairesSuppressionQuestionAction extends EnseignantAction{

    public void execute() throws Exception {
        Integer idQuestionnaire = Integer.parseInt(request.getParameter("idQuestionnaire"));
        Integer idQuestion  = Integer.parseInt(request.getParameter("idQuestion"));
        if(idQuestion == null){
            throw  new UnauthorizedActionException("Merci de spécifier la question à supprimer");
        }
        if(idQuestionnaire == null){
            throw  new UnauthorizedActionException("Merci de spécifier la question à supprimer");
        }
        QcmDAO.delete(idQuestionnaire, idQuestion);
        request.setAttribute("questionnaire", idQuestionnaire);
        setView("/mesQuestionnaires/actionEffectue.jsp");


    }

}
