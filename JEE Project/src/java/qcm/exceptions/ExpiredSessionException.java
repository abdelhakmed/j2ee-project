package qcm.exceptions;

/**
 * Exception utilisée pour les sessions expirées
 * @author Maria Rabarison et Lou Ferrand
 */
public class ExpiredSessionException extends Exception {

    public ExpiredSessionException(String error) {
        super(error);
    }

   
}
