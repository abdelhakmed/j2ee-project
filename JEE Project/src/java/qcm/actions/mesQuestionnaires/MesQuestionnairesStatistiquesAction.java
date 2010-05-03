package qcm.actions.mesQuestionnaires;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import qcm.actions.EnseignantAction;
import qcm.exceptions.UnauthorizedActionException;
import qcm.models.QuestionnairePasse;
import qcm.models.User;
import qcm.persistences.QuestionnaireDAO;
import qcm.persistences.QuestionnairePasseDAO;
import qcm.persistences.UserDAO;
import qcm.services.ActionHelper;

/**
 *
 * @author marya
 */
public class MesQuestionnairesStatistiquesAction extends EnseignantAction {

    @Override
    public void execute() throws Exception {
        Integer idQuestionnaire = Integer.parseInt(request.getParameter("questionnaire"));
        if (idQuestionnaire == null) {
            throw new UnauthorizedActionException("Merci de renseigner le questionnaire");
        }
        if (QuestionnaireDAO.getById(idQuestionnaire).getIdUser() != ActionHelper.getIdUser(request)) {
            throw new UnauthorizedActionException("Vous n'avez pas le droit de visualiser le statistique de ce questionnaire car vous n'êtes pas son créateur");
        }
        List<QuestionnairePasse> usages = QuestionnairePasseDAO.getByQuestionnaire(idQuestionnaire);
        Map<Integer, String> users = new HashMap<Integer, String>();
        for (QuestionnairePasse qP : usages) {
            User u = UserDAO.getById(qP.getIdUser());
            users.put(u.getIdUser(), u.getPrenom() + " " + u.getNom());
        }
        int noteMax = 0;
        int noteMin = Integer.MAX_VALUE;
        int moyenne = 0;
        if (usages.size() > 0) {
            for (QuestionnairePasse q : usages) {
                int noteCourante = q.getNote();
                moyenne += noteCourante;
                if (noteCourante < noteMax) {
                    noteMax = noteCourante;
                }
                if (noteCourante > noteMin) {
                    noteMax = noteCourante;
                }
            }
            moyenne = moyenne / usages.size();
        }
        int mediane = (noteMax + noteMin) / 2;
        request.setAttribute("moyenne", moyenne);
        request.setAttribute("mediane", mediane);

        request.setAttribute("usages", usages);
        request.setAttribute("users", users);
        setView("/mesQuestionnaires/statistiques.jsp");
    }
}
