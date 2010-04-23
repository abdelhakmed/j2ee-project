package qcm.actions;

import javax.servlet.http.HttpServletRequest;

/**
 * Interface Action
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
    public void setRequestAndCheckAuthorization(HttpServletRequest request) throws Exception;

    /**
     * renvoie la vue à inclure
     * @return
     */
    public String getView();



}
