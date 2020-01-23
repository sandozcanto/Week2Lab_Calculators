/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 779137
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet ArithmeticCalculatorServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet ArithmeticCalculatorServlet at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }

        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String calculation = "";
        String add = request.getParameter("add");
        String sub = request.getParameter("sub");
        String divide = request.getParameter("divide");
        String multi = request.getParameter("multi");

        if (first != null && second != null) {

            if (first != "" || second != "") {

                try {

                    int firstVal = Integer.parseInt(first);
                    int secondVal = Integer.parseInt(second);

                    if (add != null) {
                        calculation = "" + (firstVal + secondVal);
                        request.setAttribute("firstValue", first);
                        request.setAttribute("secondValue", second);

                    } else if (sub != null) {
                        calculation = "" + (firstVal - secondVal);
                        request.setAttribute("firstValue", first);
                        request.setAttribute("secondValue", second);
                    } else if (multi != null) {
                        calculation = "" + (firstVal * secondVal);
                        request.setAttribute("firstValue", first);
                        request.setAttribute("secondValue", second);
                    } else {
                        calculation = "" + (firstVal / secondVal);
                        request.setAttribute("firstValue", first);
                        request.setAttribute("secondValue", second);
                    }
                    request.setAttribute("calculation", calculation);

                } catch (Exception e) {
                    calculation = "Invalid";
                    request.setAttribute("calculation", calculation);
                }
            }
        } else if (first == null && second == null) {
            calculation = "----";
            request.setAttribute("calculation", calculation);
        }
        getServletContext().getRequestDispatcher("/arithmeticcalculator.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
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
     *
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
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
