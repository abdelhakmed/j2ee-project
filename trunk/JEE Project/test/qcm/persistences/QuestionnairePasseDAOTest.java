package qcm.persistences;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import qcm.models.QuestionnairePasse;
import tools.QCMTestCase;
import static org.junit.Assert.*;

/**
 *
 * @author marya
 */
public class QuestionnairePasseDAOTest extends QCMTestCase {

    /**
     * Test of getByUser method, of class QuestionnairePasseDAO.
     */
    @Test
    public void testGetByUser() throws Exception {
        System.out.println("getByUser");
        int idUser = 1;
        List<QuestionnairePasse> expResult = new ArrayList<QuestionnairePasse>();
        expResult.add(new QuestionnairePasse(1, 1));
        expResult.add(new QuestionnairePasse(2, 1));
        expResult.add(new QuestionnairePasse(3, 1));
        List<QuestionnairePasse> result = QuestionnairePasseDAO.getByUser(idUser);
        assertEquals(expResult.get(0), result.get(0));
        assertEquals(expResult.get(1), result.get(1));
        assertEquals(expResult.get(2), result.get(2));
    }
}
