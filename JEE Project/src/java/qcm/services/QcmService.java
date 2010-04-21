/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.services;

import java.sql.SQLException;
import qcm.models.Qcm;
import qcm.persistences.QcmDAO;

/**
 *
 * @author marya
 */
public class QcmService {

    public QcmService() {
    }

    public void save(Qcm qcm) throws SQLException{
       QcmDAO.insert(qcm);
    }

}
