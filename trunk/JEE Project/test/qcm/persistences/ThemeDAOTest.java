/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.persistences;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import qcm.models.Theme;

/**
 *
 * @author marya
 */
public class ThemeDAOTest {

    public ThemeDAOTest() {
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
     * Test of getAll method, of class ThemeDAO.
     */
    @Test
    public void testGetAll() throws Exception {
        System.out.println("getAll");
        List expResult = null;
        List result = ThemeDAO.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getById method, of class ThemeDAO.
     */
    @Test
    public void testGetById() throws Exception {
        System.out.println("getById");
        int idTheme = 0;
        Theme expResult = null;
        Theme result = ThemeDAO.getById(idTheme);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class ThemeDAO.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        Theme theme = null;
        ThemeDAO.update(theme);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}