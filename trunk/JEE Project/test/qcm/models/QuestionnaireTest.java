package qcm.models;

import java.sql.SQLException;
import org.junit.Test;
import qcm.persistences.QuestionnaireDAO;
import tools.QCMTestCase;

/**
 *
 * @author marya
 */
public class QuestionnaireTest extends QCMTestCase {

    /**
     * Test of getNoteMax method, of class Questionnaire.
     */
    @Test
    public void testGetNoteMax() throws SQLException {
        System.out.println("getNoteMax");
        Questionnaire instance = QuestionnaireDAO.getById(4);
        int expResult = 6;
        int result = instance.getNoteMax();
        assertEquals(expResult, result);
    }
}
