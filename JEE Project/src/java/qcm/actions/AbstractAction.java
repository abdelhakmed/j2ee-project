package qcm.actions;
import javax.servlet.http.HttpServletRequest;

/**
 * Classe abstraite qui définit une action (implémente l'interface Action)
 * @author marya
 */
public abstract class AbstractAction implements Action{


    protected HttpServletRequest request;
    private String view;



    protected AbstractAction(){
    }

    /**
     * Attribue la requete sur laquelle on demande l'action
     * @param request
     * @throws Exception
     */
    public void setRequest(HttpServletRequest request) throws Exception{
        this.request = request;
    }



    public String getView(){
        return view;
    }

    protected void setView(String forward){
        this.view = forward;
    }



    /**
     * Vérifie si la session de l'utilisateur a été initialisée
     * @param request, Request sur laquelle on va testé l'existence de la session
     * @return true si la session n'est pas null, false sinon
     */
    public boolean isUserAuthentificated() {
        return request.getSession().getAttribute("user") != null;
    }

    public abstract void execute() throws Exception;

}
