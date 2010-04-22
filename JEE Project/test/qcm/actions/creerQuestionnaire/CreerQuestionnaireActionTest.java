/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.actions.creerQuestionnaire;

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
public class CreerQuestionnaireActionTest {

    public CreerQuestionnaireActionTest() {
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
     * Test of setRequest method, of class CreerQuestionnaireAction.
     */
    @Test
    public void testSetRequest() throws Exception {
        System.out.println("setRequest");
        HttpServletRequest request = null;
        CreerQuestionnaireAction instance = new CreerQuestionnaireActionImpl();
        instance.setRequest(request);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of execute method, of class CreerQuestionnaireAction.
     */
    @Test
    public void testExecute() {
        System.out.println("execute");
        CreerQuestionnaireAction instance = new CreerQuestionnaireActionImpl();
        instance.execute();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class CreerQuestionnaireActionImpl extends CreerQuestionnaireAction {

        public void execute() {
        }
    }

}