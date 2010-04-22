/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.persistences;

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
@Suite.SuiteClasses({qcm.persistences.ThemeDAOTest.class,qcm.persistences.NiveauDAOTest.class,qcm.persistences.DatabaseTest.class,qcm.persistences.QuestionnairePasseDAOTest.class,qcm.persistences.QuestionnaireDAOTest.class,qcm.persistences.ReponseDAOTest.class,qcm.persistences.UserDAOTest.class,qcm.persistences.QuestionDAOTest.class,qcm.persistences.QcmDAOTest.class,qcm.persistences.ModeleDAOTest.class})
public class PersistencesSuite {

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