/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm.application;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import qcm.actions.Action;
import qcm.router.Router;

/**
 *
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
        String uri="";
        try {
            
            uri = request.getRequestURI();
            uri = uri.substring(12,uri.length());
            Action action= getActionByUri(uri);
            action.setRequest(request);
            action.execute();
            request.setAttribute("view", action.getView() );
            forward = "/view.jsp";
        }catch(NullPointerException e){
            request.setAttribute("errorMessage","Cette page n'existe pas : "+uri);
        } finally { 
            request.getRequestDispatcher(forward).forward(request, response);
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
    }// </editor-fold>














    private Action getActionByUri(String uri){
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
