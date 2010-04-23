/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.actions;

import javax.servlet.http.HttpServletRequest;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marya
 */
public class AbstractActionTest {

    public AbstractActionTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of setRequest method, of class AbstractAction.
     */
    @Test
    public void testSetRequest() throws Exception {
        System.out.println("setRequest");
        HttpServletRequest request = null;
        AbstractAction instance = new AbstractActionImpl();
        instance.setRequest(request);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getView method, of class AbstractAction.
     */
    @Test
    public void testGetView() {
        System.out.println("getView");
        AbstractAction instance = new AbstractActionImpl();
        String expResult = "";
        String result = instance.getView();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setView method, of class AbstractAction.
     */
    @Test
    public void testSetView() {
        System.out.println("setView");
        String forward = "";
        AbstractAction instance = new AbstractActionImpl();
        instance.setView(forward);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isUserAuthenticated method, of class AbstractAction.
     */
    @Test
    public void testIsUserAuthentificated() {
        System.out.println("isUserAuthentificated");
        AbstractAction instance = new AbstractActionImpl();
        boolean expResult = false;
        boolean result = instance.isUserAuthenticated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of execute method, of class AbstractAction.
     */
    @Test
    public void testExecute() throws Exception {
        System.out.println("execute");
        AbstractAction instance = new AbstractActionImpl();
        instance.execute();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AbstractActionImpl extends AbstractAction {

        public void execute() throws Exception {
        }
    }

}