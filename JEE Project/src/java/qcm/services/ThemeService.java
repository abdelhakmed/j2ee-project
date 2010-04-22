/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import qcm.models.Theme;
import qcm.persistences.ThemeDAO;

/**
 *
 * @author marya
 */
public class ThemeService {

    public ThemeService() {
    }


    public List<Theme> getAllTheme(){
        List<Theme> themes = new ArrayList<Theme>();
        try {
            List<Theme> themesDAO = ThemeDAO.getAll();
            for (Theme theme : themesDAO) {
                themes.add(theme);
            }    
        } catch (SQLException ex) {
            Logger.getLogger(ThemeService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return themes;
    }



    public Theme getThemeById(int idTheme){
        Theme theme = null;
        return theme;
    }
}
