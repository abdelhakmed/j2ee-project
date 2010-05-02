package qcm.persistences;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import qcm.models.Statut;

/**
 *
 * @author Lou
 */
public class StatutDAO extends ModeleDAO {
    
    public static List<Statut> getAll() throws SQLException {
        List<Statut> statuts = new ArrayList<Statut>();
        String sql = "SELECT statut.id_statut, statut.libelle"
                + "FROM statut "
                + "GROUP BY statut.id_statut "
                + "ORDER BY statut.id_statut ASC";
        ResultSet rs = execute(sql);
        while (rs.next()) {
            Statut statut = new Statut(
                    rs.getInt("id_statut"),
                    rs.getString("libelle"));
            statuts.add(statut);
        }
        rs.close();
        return statuts;
    }

}
