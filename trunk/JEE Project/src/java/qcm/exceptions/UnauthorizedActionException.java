package qcm.exceptions;

/**
 * Exception utilisée pour les actions non autorisées (droits d'accès)
 * @author Maria Rabarison et Lou Ferrand
 */
public class UnauthorizedActionException extends Exception {

    public UnauthorizedActionException(String message) {
        super(message);
    }
}
