package qcm.actions;

/**
 *
 * @author marya
 */
public class LogoutAction extends AbstractAction {

    @Override
    public void execute() throws Exception {
        if(isUserAuthenticated()){
            request.getSession().invalidate();
        }
        
        setView("/user/logout.jsp");
    }
}
