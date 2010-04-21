/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.router;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import qcm.actions.Action;

/**
 *
 * @author marya
 */
public class Router {
    private static Map<String, Class> uriToAction ;
    private static Map<Class, String> actionToUri ;

    static {
        uriToAction = new HashMap<String, Class>();
        actionToUri = new HashMap<Class, String>();
    }


    public static Action getActionByUri(String uri){
        Action action = null;
        try {
            action = (Action) uriToAction.get(uri).newInstance();
        } catch (InstantiationException ex) {
            Logger.getLogger(Router.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Router.class.getName()).log(Level.SEVERE, null, ex);
        }
        return action;
    }


    public static String getUriByAction(Class T){
        return actionToUri.get(T);
    }

}
