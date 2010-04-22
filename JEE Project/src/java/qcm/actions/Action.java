/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.actions;

import java.util.List;
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


    public void setRequest(HttpServletRequest request) throws Exception;

    /**
     * renvoie la page
     * @return
     */
    public String getView();



}
