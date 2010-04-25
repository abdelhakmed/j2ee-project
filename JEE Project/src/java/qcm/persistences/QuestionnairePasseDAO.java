package qcm.persistences;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import qcm.models.QuestionnairePasse;

/**
 * Gère les accès à la base de données pour les questionnaires passés
 * @author marya
 */
public class QuestionnairePasseDAO extends ModeleDAO {

    public static List<QuestionnairePasse> getByUser(int idUser) throws SQLException {
        List<QuestionnairePasse> qP = new ArrayList<QuestionnairePasse>();
        String sql = "SELECT questionnaire_passe.id_questionnaire, questionnaire.libelle, questionnaire_passe.id_user, "
                + "questionnaire_passe.note, questionnaire_passe.date , questionnaire_passe.temps "
                + "FROM questionnaire_passe "
                + "INNER JOIN questionnaire "
                + "ON questionnaire.id_questionnaire = questionnaire_passe.id_questionnaire "
                + "WHERE questionnaire_passe.id_user = ? ORDER BY id_questionnaire";
        ResultSet rs = selectById(sql, idUser);
        while (rs.next()) {
            qP.add(new QuestionnairePasse(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getDate(5), rs.getInt(6)));
        }
        rs.close();
        return qP;
    }

    public static List<QuestionnairePasse> findUsageById(int idQuestionnaire) throws SQLException {
        List<QuestionnairePasse> qP = new ArrayList<QuestionnairePasse>();
        String sql = "SELECT questionnaire_passe.id_questionnaire, questionnaire.libelle, questionnaire_passe.id_user, "
                + "questionnaire_passe.note, questionnaire_passe.date , questionnaire_passe.temps "
                + "FROM questionnaire_passe "
                + "INNER JOIN questionnaire "
                + "ON questionnaire.id_questionnaire = questionnaire_passe.id_questionnaire "
                + "WHERE questionnaire_passe.id_questionnaire = ? ORDER BY date";
        ResultSet rs = selectById(sql, idQuestionnaire);
        while (rs.next()) {
            qP.add(new QuestionnairePasse(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getDate(5), rs.getInt(6)));
        }
        rs.close();
        return qP;
    }
}
