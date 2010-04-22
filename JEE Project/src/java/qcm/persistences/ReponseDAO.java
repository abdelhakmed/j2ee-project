package qcm.persistences;

import java.sql.ResultSet;
import java.sql.SQLException;
import qcm.models.Reponse;

/**
 * Gère les accès à la base de données pour les réponses
 * @author Maria Rabarison et Lou Ferrand
 */
public class ReponseDAO extends ModeleDAO {

    public static Reponse getById(int idReponse) throws SQLException {
        Reponse reponse = null;
        String sql = "SELECT id_reponse, libelle, descriptif, est_correcte, note, id_question FROM reponse WHERE id_reponse = ?";
        ResultSet rs = selectById(sql, idReponse);
        if (rs.next()) {
            reponse = new Reponse(
                    rs.getInt("id_reponse"),
                    rs.getString("libelle"),
                    rs.getString("descriptif"),
                    rs.getBoolean("est_correcte"),
                    rs.getInt("note"),
                    rs.getInt("id_question"));
        }
        rs.close();
        return reponse;
    }
}
