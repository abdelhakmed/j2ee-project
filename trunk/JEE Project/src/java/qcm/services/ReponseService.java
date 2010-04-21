/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.services;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import qcm.persistences.ReponseDAO;

/**
 *
 * @author marya
 */
public class ReponseService {

    public ReponseService() {
    }

    public int getNoteByReponse(int idReponse){
        int note = 0;
        try {

            note = ReponseDAO.getById(idReponse).getNote();

        } catch (SQLException ex) {
            Logger.getLogger(ReponseService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return note;
    }
}
