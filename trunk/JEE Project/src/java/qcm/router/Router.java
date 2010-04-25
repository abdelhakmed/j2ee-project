package qcm.router;

import java.util.HashMap;
import java.util.Map;
import qcm.actions.*;
import qcm.actions.admin.*;
import qcm.actions.passerQuestionnaire.*;
import qcm.actions.creerQuestionnaire.*;
import qcm.actions.mesResultats.*;
import qcm.actions.mesQuestionnaires.*;

/**
 * Permet de relier chaque URI avec une classe d'action
 * @author marya
 */
public class Router {

    private static Map<String, Class> uriToAction;
    private static Map<Class, String> actionToUri;

    static {
        uriToAction = new HashMap<String, Class>();
        actionToUri = new HashMap<Class, String>();

        uriToAction.put("/index.html", IndexAction.class);
        uriToAction.put("/logout.html", LogoutAction.class);

        //Passer un questionnaire
        uriToAction.put("/passerQuestionnaire/index.html", PasserQuestionnaireIndexAction.class);
        uriToAction.put("/passerQuestionnaire/listeQuestionnaires.html", PasserQuestionnaireListeQuestionnairesAction.class);
        uriToAction.put("/passerQuestionnaire/choix.html", PasserQuestionnaireChoixAction.class);
        uriToAction.put("/passerQuestionnaire/commencer.html", PasserQuestionnaireCommencerAction.class);
        uriToAction.put("/passerQuestionnaire/questionSuivante.html", PasserQuestionnaireQuestionSuivanteAction.class);
        uriToAction.put("/passerQuestionnaire/modifierReponses.html", PasserQuestionnaireModifierReponsesAction.class);
        uriToAction.put("/passerQuestionnaire/terminer.html", PasserQuestionnaireTerminerAction.class);

        //Consultation des résultats
        uriToAction.put("/mesResultats/index.html", MesResultatsIndexAction.class);
        uriToAction.put("/mesResultats/correction.html", MesResultatsCorrectionAction.class);

        //Consultation des questionnaires
        uriToAction.put("/mesQuestionnaires/index.html", MesQuestionnairesIndexAction.class);
        uriToAction.put("/mesQuestionnaires/editer.html", MesQuestionnairesEditerAction.class);
        uriToAction.put("/mesQuestionnaires/modifierQuestionnaire.html", MesQuestionnairesModificationAction.class);
        uriToAction.put("/mesQuestionnaires/enregistrementQuestionnaire.html", MesQuestionnairesEnregistrementQuestionnaireAction.class);
        uriToAction.put("/mesQuestionnaires/modifierQuestion.html", MesQuestionnairesModificationQuestionAction.class);
        uriToAction.put("/mesQuestionnaires/enregistrementQuestion.html", MesQuestionnairesEnregistrementQuestionAction.class);
        uriToAction.put("/mesQuestionnaires/suppressionQuestion.html", MesQuestionnairesSuppressionQuestionAction.class);
        uriToAction.put("/mesQuestionnaires/ajoutsQuestions.html", MesQuestionnairesAjoutsQuestionsAction.class);


        //Créer un questionnaire
        uriToAction.put("/creerQuestionnaire/index.html", CreerQuestionnaireIndexAction.class);
        uriToAction.put("/creerQuestionnaire/nouveau.html", CreerQuestionnaireNouveauAction.class);
        uriToAction.put("/creerQuestionnaire/ajouterQuestion.html", CreerQuestionnaireAjouterQuestionAction.class);
        uriToAction.put("/creerQuestionnaire/ajouterReponses.html", CreerQuestionnaireAjouterReponsesAction.class);
        uriToAction.put("/creerQuestionnaire/creerQuestion.html", CreerQuestionnaireCreerQuestionAction.class);
        uriToAction.put("/creerQuestionnaire/enregistrement.html", CreerQuestionnaireEnregistrerAction.class);

        //Administration
        uriToAction.put("/admin/users/index.html", AdminUsersIndexAction.class);
        uriToAction.put("/admin/themes/index.html", AdminThemesIndexAction.class);
        uriToAction.put("/admin/niveaux/index.html", AdminNiveauxIndexAction.class);
        uriToAction.put("/admin/questionnaires/index.html", AdminQuestionnairesIndexAction.class);

        uriToAction.put("/admin/users/controle.html", AdminUsersControleAction.class);
        uriToAction.put("/admin/themes/controle.html", AdminThemesControleAction.class);
        uriToAction.put("/admin/niveaux/controle.html", AdminNiveauxControleAction.class);
        uriToAction.put("/admin/questionnaires/controle.html", AdminQuestionnairesControleAction.class);

        uriToAction.put("/admin/users/editer.html", AdminUsersEditAction.class); // Pas encore implémenté
        uriToAction.put("/admin/themes/editer.html", AdminThemesEditAction.class);
        uriToAction.put("/admin/niveaux/editer.html", AdminNiveauxEditAction.class);
        uriToAction.put("/admin/questionnaires/editer.html", AdminQuestionnairesEditAction.class); // Pas encore implémenté
    }

    public static Class getActionByUri(String uri) {
        return uriToAction.get(uri);
    }

    public static String getUriByAction(Class T) {
        return actionToUri.get(T);
    }
}
