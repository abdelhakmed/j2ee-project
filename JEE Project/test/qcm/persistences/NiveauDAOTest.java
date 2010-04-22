/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.persistences;

import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import qcm.models.Niveau;

/**
 *
 * @author marya
 */
public class NiveauDAOTest {

    public NiveauDAOTest() {
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
     * Test of getAll method, of class NiveauDAO.
     */
    @Test
    public void testGetAll() throws Exception {
        System.out.println("getAll");
        HashMap expResult = null;
        HashMap result = NiveauDAO.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getById method, of class NiveauDAO.
     */
    @Test
    public void testGetById() throws Exception {
        System.out.println("getById");
        int idNiveau = 0;
        Niveau expResult = null;
        Niveau result = NiveauDAO.getById(idNiveau);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class NiveauDAO.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        Niveau niveau = null;
        NiveauDAO.update(niveau);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}