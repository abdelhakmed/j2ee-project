/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.models;

import java.util.List;
import java.util.Map;
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
public class QcmTest {

    public QcmTest() {
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
     * Test of getQuestionnaire method, of class Qcm.
     */
    @Test
    public void testGetQuestionnaire() {
        System.out.println("getQuestionnaire");
        Qcm instance = null;
        Questionnaire expResult = null;
        Questionnaire result = instance.getQuestionnaire();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdUser method, of class Qcm.
     */
    @Test
    public void testGetIdUser() {
        System.out.println("getIdUser");
        Qcm instance = null;
        int expResult = 0;
        int result = instance.getIdUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNote method, of class Qcm.
     */
    @Test
    public void testGetNote() throws Exception {
        System.out.println("getNote");
        Qcm instance = null;
        int expResult = 0;
        int result = instance.getNote();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estFini method, of class Qcm.
     */
    @Test
    public void testEstFini() {
        System.out.println("estFini");
        Qcm instance = null;
        boolean expResult = false;
        boolean result = instance.estFini();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstFini method, of class Qcm.
     */
    @Test
    public void testSetEstFini() {
        System.out.println("setEstFini");
        boolean estFini = false;
        Qcm instance = null;
        instance.setEstFini(estFini);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuestionSuivante method, of class Qcm.
     */
    @Test
    public void testGetQuestionSuivante() {
        System.out.println("getQuestionSuivante");
        Qcm instance = null;
        Integer expResult = null;
        Integer result = instance.getQuestionSuivante();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserReponses method, of class Qcm.
     */
    @Test
    public void testGetUserReponses() {
        System.out.println("getUserReponses");
        Qcm instance = null;
        Map expResult = null;
        Map result = instance.getUserReponses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserReponses method, of class Qcm.
     */
    @Test
    public void testSetUserReponses() {
        System.out.println("setUserReponses");
        Integer idQuestion = null;
        List<Integer> reponses = null;
        Qcm instance = null;
        instance.setUserReponses(idQuestion, reponses);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Qcm.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Qcm instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Qcm.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Qcm instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of invariant method, of class Qcm.
     */
    @Test
    public void testInvariant() {
        System.out.println("invariant");
        Qcm instance = null;
        boolean expResult = false;
        boolean result = instance.invariant();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class Qcm.
     */
    @Test
    public void testSave() throws Exception {
        System.out.println("save");
        Qcm instance = null;
        instance.save();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reset method, of class Qcm.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        Qcm instance = null;
        instance.reset();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}