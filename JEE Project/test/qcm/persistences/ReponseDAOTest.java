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
import qcm.models.Reponse;

/**
 *
 * @author marya
 */
public class ReponseDAOTest {

    public ReponseDAOTest() {
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
     * Test of getById method, of class ReponseDAO.
     */
    @Test
    public void testGetById() throws Exception {
        System.out.println("getById");
        int idReponse = 0;
        Reponse expResult = null;
        Reponse result = ReponseDAO.getById(idReponse);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}