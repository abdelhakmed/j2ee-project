/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qcm.router;

import java.util.HashMap;
import java.util.Map;
import qcm.actions.IndexAction;
import qcm.actions.creerQuestionnaire.CreerQuestionnaireIndexAction;
import qcm.actions.mesQuestionnaires.MesQuestionnairesEditerAction;
import qcm.actions.mesQuestionnaires.MesQuestionnairesIndexAction;
import qcm.actions.mesResultats.MesResultatsCorrectionAction;
import qcm.actions.mesResultats.MesResultatsIndexAction;
import qcm.actions.passerQuestionnaire.PasserQuestionnaireChoixAction;
import qcm.actions.passerQuestionnaire.PasserQuestionnaireCommencerAction;
import qcm.actions.passerQuestionnaire.PasserQuestionnaireIndexAction;
import qcm.actions.passerQuestionnaire.PasserQuestionnaireListeQuestionnairesAction;
import qcm.actions.passerQuestionnaire.PasserQuestionnaireModifierReponsesAction;
import qcm.actions.passerQuestionnaire.PasserQuestionnaireQuestionSuivanteAction;
import qcm.actions.passerQuestionnaire.PasserQuestionnaireTerminerAction;

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

        //Créer un questionnaire
        uriToAction.put("/creerQuestionnaire/index.html", CreerQuestionnaireIndexAction.class);

        //Administration
    }

    public static Class getActionByUri(String uri) {
        return uriToAction.get(uri);
    }

    public static String getUriByAction(Class T) {
        return actionToUri.get(T);
    }
}
