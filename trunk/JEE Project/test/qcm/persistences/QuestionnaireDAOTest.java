/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.persistences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import qcm.models.Questionnaire;

/**
 *
 * @author marya
 */
public class QuestionnaireDAOTest {

    public QuestionnaireDAOTest() {
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
     * Test of getById method, of class QuestionnaireDAO.
     */
    @Test
    public void testGetById() throws Exception {
        System.out.println("getById");
        int idQuestionnaire = 0;
        Questionnaire expResult = null;
        Questionnaire result = QuestionnaireDAO.getById(idQuestionnaire);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuestionsById method, of class QuestionnaireDAO.
     */
    @Test
    public void testGetQuestionsById() throws Exception {
        System.out.println("getQuestionsById");
        int idQuestionnaire = 0;
        ArrayList expResult = null;
        ArrayList result = QuestionnaireDAO.getQuestionsById(idQuestionnaire);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuestionnairesByTheme method, of class QuestionnaireDAO.
     */
    @Test
    public void testGetQuestionnairesByTheme() throws Exception {
        System.out.println("getQuestionnairesByTheme");
        int idTheme = 0;
        HashMap expResult = null;
        HashMap result = QuestionnaireDAO.getQuestionnairesByTheme(idTheme);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuestionnairesByNiveau method, of class QuestionnaireDAO.
     */
    @Test
    public void testGetQuestionnairesByNiveau() throws Exception {
        System.out.println("getQuestionnairesByNiveau");
        int idNiveau = 0;
        HashMap expResult = null;
        HashMap result = QuestionnaireDAO.getQuestionnairesByNiveau(idNiveau);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuestionnairesByThemeAndNiveau method, of class QuestionnaireDAO.
     */
    @Test
    public void testGetQuestionnairesByThemeAndNiveau() throws Exception {
        System.out.println("getQuestionnairesByThemeAndNiveau");
        int idTheme = 0;
        int idNiveau = 0;
        HashMap expResult = null;
        HashMap result = QuestionnaireDAO.getQuestionnairesByThemeAndNiveau(idTheme, idNiveau);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class QuestionnaireDAO.
     */
    @Test
    public void testSearch() throws Exception {
        System.out.println("search");
        int idTheme = 0;
        int idNiveau = 0;
        String libelle = "";
        Questionnaire expResult = null;
        Questionnaire result = QuestionnaireDAO.search(idTheme, idNiveau, libelle);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class QuestionnaireDAO.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        Questionnaire q = null;
        QuestionnaireDAO.update(q);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class QuestionnaireDAO.
     */
    @Test
    public void testInsert() throws Exception {
        System.out.println("insert");
        Questionnaire questionnaire = null;
        QuestionnaireDAO.insert(questionnaire);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCreatedByUser method, of class QuestionnaireDAO.
     */
    @Test
    public void testGetCreatedByUser() throws Exception {
        System.out.println("getCreatedByUser");
        int idUser = 0;
        List expResult = null;
        List result = QuestionnaireDAO.getCreatedByUser(idUser);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class QuestionnaireDAO.
     */
    @Test
    public void testGetAll() throws Exception {
        System.out.println("getAll");
        HashMap expResult = null;
        HashMap result = QuestionnaireDAO.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllActives method, of class QuestionnaireDAO.
     */
    @Test
    public void testGetAllActives() throws Exception {
        System.out.println("getAllActives");
        HashMap expResult = null;
        HashMap result = QuestionnaireDAO.getAllActives();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}