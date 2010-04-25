package qcm.actions.mesQuestionnaires;

import java.util.List;
import qcm.actions.EnseignantAction;
import qcm.models.QuestionnairePasse;
import qcm.persistences.QuestionnairePasseDAO;

/**
 *
 * @author marya
 */
public class MesQuestionnairesStatistiquesAction extends EnseignantAction {

    @Override
    public void execute() throws Exception {
        Integer idQuestionnaire = Integer.parseInt(request.getParameter("questionnaire"));
        List<QuestionnairePasse> usages = QuestionnairePasseDAO.findUsageById(idQuestionnaire);
        request.setAttribute("usages", usages);
        setView("/mesQuestionnaires/statistiques.jsp");
    }

}
