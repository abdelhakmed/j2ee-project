package qcm.actions;

import javax.servlet.http.HttpServletRequest;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marya
 */
public class ActionTest {

    public ActionTest() {
    }

    /**
     * Test of execute method, of class Action.
     */
    @Test
    public void testExecute() throws Exception {
        System.out.println("execute");
        Action instance = new ActionImpl();
        instance.execute();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRequestAndCheckAuthorization method, of class Action.
     */
    @Test
    public void testSetRequest() throws Exception {
        System.out.println("setRequest");
        HttpServletRequest request = null;
        Action instance = new ActionImpl();
        instance.setRequestAndCheckAuthorization(request);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getView method, of class Action.
     */
    @Test
    public void testGetView() {
        System.out.println("getView");
        Action instance = new ActionImpl();
        String expResult = "";
        String result = instance.getView();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ActionImpl implements Action {

        public void execute() throws Exception {
        }

        public void setRequestAndCheckAuthorization(HttpServletRequest request) throws Exception {
        }

        public String getView() {
            return "";
        }
    }

}