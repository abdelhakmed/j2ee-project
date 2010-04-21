/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.actions;

import java.util.List;

/**
 *
 * @author marya
 */
public interface Action {

    /**
     * Execute l'action
     */
    public void execute();

    /**
     * renvoie la page
     * @return
     */
    public String getPageToForward();


    public List<String> getErrorMessages();

}
