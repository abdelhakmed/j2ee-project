/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.persistences;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import qcm.models.Qcm;

/**
 *
 * @author marya
 */
public class QcmDAOTest {

    public QcmDAOTest() {
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
     * Test of insert method, of class QcmDAO.
     */
    @Test
    public void testInsert() throws Exception {
        System.out.println("insert");
        Qcm qcm = null;
        QcmDAO.insert(qcm);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdContenu method, of class QcmDAO.
     */
    @Test
    public void testGetIdContenu() throws Exception {
        System.out.println("getIdContenu");
        int idQuestionnaire = 0;
        int idQuestion = 0;
        Integer expResult = null;
        Integer result = QcmDAO.getIdContenu(idQuestionnaire, idQuestion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}