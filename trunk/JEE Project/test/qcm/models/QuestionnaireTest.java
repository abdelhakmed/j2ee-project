/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.models;

import java.sql.Date;
import java.util.List;
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
public class QuestionnaireTest {

    public QuestionnaireTest() {
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
     * Test of getDateCreation method, of class Questionnaire.
     */
    @Test
    public void testGetDateCreation() {
        System.out.println("getDateCreation");
        Questionnaire instance = null;
        Date expResult = null;
        Date result = instance.getDateCreation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateCreation method, of class Questionnaire.
     */
    @Test
    public void testSetDateCreation() {
        System.out.println("setDateCreation");
        Date dateCreation = null;
        Questionnaire instance = null;
        instance.setDateCreation(dateCreation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estActif method, of class Questionnaire.
     */
    @Test
    public void testEstActif() {
        System.out.println("estActif");
        Questionnaire instance = null;
        boolean expResult = false;
        boolean result = instance.estActif();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstActif method, of class Questionnaire.
     */
    @Test
    public void testSetEstActif() {
        System.out.println("setEstActif");
        boolean estActif = false;
        Questionnaire instance = null;
        instance.setEstActif(estActif);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estPasse method, of class Questionnaire.
     */
    @Test
    public void testEstPasse() {
        System.out.println("estPasse");
        Questionnaire instance = null;
        boolean expResult = false;
        boolean result = instance.estPasse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdNiveau method, of class Questionnaire.
     */
    @Test
    public void testGetIdNiveau() {
        System.out.println("getIdNiveau");
        Questionnaire instance = null;
        int expResult = 0;
        int result = instance.getIdNiveau();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdNiveau method, of class Questionnaire.
     */
    @Test
    public void testSetIdNiveau() {
        System.out.println("setIdNiveau");
        int idNiveau = 0;
        Questionnaire instance = null;
        instance.setIdNiveau(idNiveau);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdQuestionnaire method, of class Questionnaire.
     */
    @Test
    public void testGetIdQuestionnaire() {
        System.out.println("getIdQuestionnaire");
        Questionnaire instance = null;
        Integer expResult = null;
        Integer result = instance.getIdQuestionnaire();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdQuestionnaire method, of class Questionnaire.
     */
    @Test
    public void testSetIdQuestionnaire() {
        System.out.println("setIdQuestionnaire");
        Integer idQuestionnaire = null;
        Questionnaire instance = null;
        instance.setIdQuestionnaire(idQuestionnaire);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdTheme method, of class Questionnaire.
     */
    @Test
    public void testGetIdTheme() {
        System.out.println("getIdTheme");
        Questionnaire instance = null;
        int expResult = 0;
        int result = instance.getIdTheme();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdTheme method, of class Questionnaire.
     */
    @Test
    public void testSetIdTheme() {
        System.out.println("setIdTheme");
        int idTheme = 0;
        Questionnaire instance = null;
        instance.setIdTheme(idTheme);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdUser method, of class Questionnaire.
     */
    @Test
    public void testGetIdUser() {
        System.out.println("getIdUser");
        Questionnaire instance = null;
        int expResult = 0;
        int result = instance.getIdUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdUser method, of class Questionnaire.
     */
    @Test
    public void testSetIdUser() {
        System.out.println("setIdUser");
        int idUser = 0;
        Questionnaire instance = null;
        instance.setIdUser(idUser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLibelle method, of class Questionnaire.
     */
    @Test
    public void testGetLibelle() {
        System.out.println("getLibelle");
        Questionnaire instance = null;
        String expResult = "";
        String result = instance.getLibelle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLibelle method, of class Questionnaire.
     */
    @Test
    public void testSetLibelle() {
        System.out.println("setLibelle");
        String libelle = "";
        Questionnaire instance = null;
        instance.setLibelle(libelle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLimiteTemps method, of class Questionnaire.
     */
    @Test
    public void testGetLimiteTemps() {
        System.out.println("getLimiteTemps");
        Questionnaire instance = null;
        Integer expResult = null;
        Integer result = instance.getLimiteTemps();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLimiteTemps method, of class Questionnaire.
     */
    @Test
    public void testSetLimiteTemps() {
        System.out.println("setLimiteTemps");
        Integer limiteTemps = null;
        Questionnaire instance = null;
        instance.setLimiteTemps(limiteTemps);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuestions method, of class Questionnaire.
     */
    @Test
    public void testGetQuestions() {
        System.out.println("getQuestions");
        Questionnaire instance = null;
        List expResult = null;
        List result = instance.getQuestions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuestions method, of class Questionnaire.
     */
    @Test
    public void testSetQuestions() {
        System.out.println("setQuestions");
        List<Question> questions = null;
        Questionnaire instance = null;
        instance.setQuestions(questions);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addQuestion method, of class Questionnaire.
     */
    @Test
    public void testAddQuestion() {
        System.out.println("addQuestion");
        Question q = null;
        Questionnaire instance = null;
        instance.addQuestion(q);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeQuestion method, of class Questionnaire.
     */
    @Test
    public void testRemoveQuestion() {
        System.out.println("removeQuestion");
        Question q = null;
        Questionnaire instance = null;
        instance.removeQuestion(q);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Questionnaire.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Questionnaire instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Questionnaire.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Questionnaire instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Questionnaire.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Questionnaire instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class Questionnaire.
     */
    @Test
    public void testSave() throws Exception {
        System.out.println("save");
        Questionnaire instance = null;
        instance.save();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNoteMax method, of class Questionnaire.
     */
    @Test
    public void testGetNoteMax() {
        System.out.println("getNoteMax");
        Questionnaire instance = null;
        int expResult = 0;
        int result = instance.getNoteMax();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of invariant method, of class Questionnaire.
     */
    @Test
    public void testInvariant() {
        System.out.println("invariant");
        Questionnaire instance = null;
        boolean expResult = false;
        boolean result = instance.invariant();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}