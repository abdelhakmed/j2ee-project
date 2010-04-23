package qcm.application;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import qcm.exceptions.UnknownUserException;
import qcm.actions.Action;
import qcm.exceptions.ExpiredSessionException;
import qcm.router.Router;

/**
 * Controleur frontal de l'application, s'occupe de demander le mapping entre les
 * URI et les actions
 * @author marya
 */
public class Application extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String forward = "/index.jsp";
        String uri = "";
        try {

            uri = request.getRequestURI();
            uri = uri.substring(12, uri.length());
            Action action = getActionByUri(uri);
            action.setRequest(request);
            action.execute();
            request.setAttribute("view", action.getView());
            forward = "/view.jsp";
        } catch (NullPointerException e) {
            request.setAttribute("errorMessage", "Cette page n'existe pas : " + uri);
        } catch (SQLException e) {
            request.setAttribute("errorMessage", "Erreur interne  :"+e.getMessage());
        } catch (UnknownUserException e) {
            request.setAttribute("errorMessage", "Erreur interne : "+e.getMessage());
        } catch (IllegalArgumentException e) {
            request.setAttribute("errorMessage", e.getMessage());
        } catch (ExpiredSessionException e) {
            request.setAttribute("errorMessage", e.getMessage());
        } catch (Exception e) {
            request.setAttribute("errorMessage", "Unknown Exception : "+e.getMessage());
        } finally {
            request.getRequestDispatcher(forward).forward(request, response);
        }
    }

    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }
    
    private Action getActionByUri(String uri) {
        Action action = null;
        try {
            action = (Action) Router.getActionByUri(uri).newInstance();
        } catch (InstantiationException ex) {
            Logger.getLogger(Router.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Router.class.getName()).log(Level.SEVERE, null, ex);
        }
        return action;
    }
}
