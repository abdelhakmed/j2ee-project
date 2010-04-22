/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.actions;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author marya
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({qcm.actions.IndexActionTest.class,qcm.actions.passerQuestionnaire.PasserQuestionnaireSuite.class,qcm.actions.creerQuestionnaire.CreerQuestionnaireSuite.class,qcm.actions.ActionTest.class,qcm.actions.AbstractActionTest.class})
public class ActionsSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

}