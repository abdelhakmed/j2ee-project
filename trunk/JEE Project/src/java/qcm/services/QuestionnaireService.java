/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.services;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import qcm.models.Questionnaire;
import qcm.persistences.QuestionnaireDAO;

/**
 *
 * @author marya
 */
public class QuestionnaireService {

    public QuestionnaireService(){
        
    }

    public void save(Questionnaire questionnaire) throws SQLException{
        assert QuestionnaireDAO.search(questionnaire.getIdTheme(), questionnaire.getIdNiveau(), questionnaire.getLibelle()) == null;
        if (questionnaire.getIdQuestionnaire() == null) {
            QuestionnaireDAO.insert(questionnaire);
        } else {
            QuestionnaireDAO.update(questionnaire);
        }
    }

    public Questionnaire getQuestionnaireById(int id){
        Questionnaire quest = null;
        try {
             quest = QuestionnaireDAO.getById(id);
        } catch (SQLException ex) {
            Logger.getLogger(QuestionnaireService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return quest;
    }

}
