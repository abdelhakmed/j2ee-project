/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qcm.router;

import java.util.HashMap;
import java.util.Map;
import qcm.actions.IndexAction;
import qcm.actions.creerQuestionnaire.CreerQuestionnaireIndexAction;
import qcm.actions.passerQuestionnaire.PasserQuestionnaireIndexAction;

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
        uriToAction.put("/passerQuestionnaire/index.html", PasserQuestionnaireIndexAction.class);
        uriToAction.put("/creerQuestionnaire/index.html", CreerQuestionnaireIndexAction.class);
    }

    public static Class getActionByUri(String uri) {
        return uriToAction.get(uri);
    }

    public static String getUriByAction(Class T) {
        return actionToUri.get(T);
    }
}
