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
import qcm.models.User;

/**
 *
 * @author marya
 */
public class UserDAOTest {

    public UserDAOTest() {
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
     * Test of getByLoginAndPassword method, of class UserDAO.
     */
    @Test
    public void testGetByLoginAndPassword() throws Exception {
        System.out.println("getByLoginAndPassword");
        String login = "";
        String password = "";
        User expResult = null;
        User result = UserDAO.getByLoginAndPassword(login, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getById method, of class UserDAO.
     */
    @Test
    public void testGetById() throws Exception {
        System.out.println("getById");
        int idUser = 0;
        User expResult = null;
        User result = UserDAO.getById(idUser);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class UserDAO.
     */
    @Test
    public void testGetAll() throws Exception {
        System.out.println("getAll");
        HashMap expResult = null;
        HashMap result = UserDAO.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class UserDAO.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        User user = null;
        UserDAO.update(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}