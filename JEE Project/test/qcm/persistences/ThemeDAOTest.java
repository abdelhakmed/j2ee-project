package qcm.persistences;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import qcm.models.Theme;
import tools.QCMTestCase;

/**
 *
 * @author marya
 */
public class ThemeDAOTest extends QCMTestCase {

    /**
     * Test of getAll method, of class ThemeDAO.
     */
    @Test
    public void testGetAll() throws Exception {
        System.out.println("getAll");
        List<Theme> expResult = new ArrayList<Theme>();
        expResult.add(ThemeDAO.getById(1));
        expResult.add(ThemeDAO.getById(2));
        expResult.add(ThemeDAO.getById(3));
        expResult.add(ThemeDAO.getById(4));
        expResult.add(ThemeDAO.getById(5));
        expResult.add(ThemeDAO.getById(6));
        List<Theme> result = ThemeDAO.getAll();
        assertEquals(expResult.get(0), result.get(0));
        assertEquals(expResult.get(1), result.get(1));
        assertEquals(expResult.get(2), result.get(2));
        assertEquals(expResult.get(3), result.get(3));
        assertEquals(expResult.get(4), result.get(4));
        assertEquals(expResult.get(5), result.get(5));
    }

    /**
     * Test of getById method, of class ThemeDAO.
     */
    @Test
    public void testGetById() throws Exception {
        System.out.println("getById");
        Theme expResult = new Theme(1, 1, "Java", 1, true);
        Theme result = ThemeDAO.getById(1);
        assertEquals(expResult, result);
    }

    /**
     * Test of update method, of class ThemeDAO.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        Theme theme = new Theme(1, 1, "Java", 1, true);
        String nouveauLibelleTheme = "Le Java";
        theme.setLibelle(nouveauLibelleTheme);
        ThemeDAO.update(theme);
        assertTrue(ThemeDAO.getById(1).getLibelle().equals(nouveauLibelleTheme));
    }
}
