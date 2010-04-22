/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.services;

import java.sql.SQLException;
import qcm.models.User;
import qcm.persistences.UserDAO;

/**
 *
 * @author marya
 */
public class UserService {

    public UserService() {
    }

    public User checkUserByLoginAndPassWord(String login, String passw) throws SQLException{
        return UserDAO.getByLoginAndPassword(login, passw);
    }
}
