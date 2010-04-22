/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.actions;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author marya
 */
public interface Action {

    /**
     * Execute l'action
     */
    public void execute() throws Exception;

    /**
     * Attribue la requete sur laquelle on demande l'action
     * @param request
     * @throws Exception
     */
    public void setRequest(HttpServletRequest request) throws Exception;

    /**
     * renvoie la vue à inclure
     * @return
     */
    public String getView();



}
