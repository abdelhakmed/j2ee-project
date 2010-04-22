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
public class ActionTest {

    public ActionTest() {
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
     * Test of setRequest method, of class Action.
     */
    @Test
    public void testSetRequest() throws Exception {
        System.out.println("setRequest");
        HttpServletRequest request = null;
        Action instance = new ActionImpl();
        instance.setRequest(request);
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

        public void setRequest(HttpServletRequest request) throws Exception {
        }

        public String getView() {
            return "";
        }
    }

}