package qcm.exceptions;

/**
 * Classe d'exception qui gère les exceptions liées à l'utilisateur
 * @author Maria Rabarison et Lou Ferrand
 */
public class UnknownUserException extends Exception {

   

    public UnknownUserException(String error) {
        super(error);
    }

}
