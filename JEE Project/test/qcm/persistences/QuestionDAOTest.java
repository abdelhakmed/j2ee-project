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
import qcm.models.Question;

/**
 *
 * @author marya
 */
public class QuestionDAOTest {

    public QuestionDAOTest() {
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
     * Test of getById method, of class QuestionDAO.
     */
    @Test
    public void testGetById() throws Exception {
        System.out.println("getById");
        int idQuestion = 0;
        Question expResult = null;
        Question result = QuestionDAO.getById(idQuestion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReponsesById method, of class QuestionDAO.
     */
    @Test
    public void testGetReponsesById() throws Exception {
        System.out.println("getReponsesById");
        int idQuestion = 0;
        List expResult = null;
        List result = QuestionDAO.getReponsesById(idQuestion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getByTheme method, of class QuestionDAO.
     */
    @Test
    public void testGetByTheme() throws Exception {
        System.out.println("getByTheme");
        int idTheme = 0;
        List expResult = null;
        List result = QuestionDAO.getByTheme(idTheme);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class QuestionDAO.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Question question = null;
        QuestionDAO.insert(question);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}