/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.actions.passerQuestionnaire;

import java.sql.SQLException;
import qcm.actions.AbstractAction;
import qcm.exceptions.ExpiredSessionException;
import qcm.models.Qcm;
import qcm.persistences.NiveauDAO;
import qcm.persistences.ThemeDAO;
import qcm.services.ActionHelper;

/**
 *
 * @author marya
 */
public class PasserQuestionnaireTerminerAction extends AbstractAction {


    public void execute() throws SQLException , ExpiredSessionException {
        if(!isUserAuthentificated()){
            throw new ExpiredSessionException("Merci de vous authentifier");
        }
        Qcm qcm = (Qcm) request.getSession().getAttribute("qcm");
        request.setAttribute("theme", ThemeDAO.getById(qcm.getQuestionnaire().getIdTheme()).getLibelle());
        request.setAttribute("niveau", NiveauDAO.getById(qcm.getQuestionnaire().getIdNiveau()).getLibelle());
        if(!qcm.estFini() && !ActionHelper.userHasAlreadyPassedQuestionnaire(ActionHelper.getIdUser(request), qcm.getQuestionnaire())){
            qcm.save();
            request.getSession().setAttribute("qcm", qcm);
        }
        request.setAttribute("note", qcm.getNote());
        setView("/passerQuestionnaire/resultat.jsp");
    }
}
