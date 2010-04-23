package qcm.persistences;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import qcm.models.Niveau;
import tools.QCMTestCase;

/**
 *
 * @author marya
 */
public class NiveauDAOTest extends QCMTestCase {

    /**
     * Test of getAll method, of class NiveauDAO.
     */
    @Test
    public void testGetAll() throws Exception {
        System.out.println("getAll");
        List<Niveau> expResult = new ArrayList<Niveau>();
        expResult.add(NiveauDAO.getById(1));
        expResult.add(NiveauDAO.getById(2));
        expResult.add(NiveauDAO.getById(3));
        expResult.add(NiveauDAO.getById(4));
        List<Niveau> result = NiveauDAO.getAll();
        assertEquals(expResult.get(0), result.get(0));
        assertEquals(expResult.get(1), result.get(1));
        assertEquals(expResult.get(2), result.get(2));
        assertEquals(expResult.get(3), result.get(3));
    }

    /**
     * Test of getById method, of class NiveauDAO.
     */
    @Test
    public void testGetById() throws Exception {
        System.out.println("getById");
        Niveau expResult = new Niveau(1, "Débutant", 3, true);
        Niveau result = NiveauDAO.getById(1);
        assertEquals(expResult, result);
    }

    /**
     * Test of update method, of class NiveauDAO.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        Niveau niveau = new Niveau(1, "Débutant", 3, true);
        String nouveauLibelleTheme = "Nouveau libelle";
        niveau.setLibelle(nouveauLibelleTheme);
        NiveauDAO.update(niveau);
        assertTrue(NiveauDAO.getById(1).getLibelle().equals(nouveauLibelleTheme));
    }

}
