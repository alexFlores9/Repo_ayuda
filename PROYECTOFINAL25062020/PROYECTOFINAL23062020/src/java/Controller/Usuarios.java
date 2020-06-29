/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.UsuarioDAO;
import DAO.UsuarioDAOImplementar;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author alex
 */
public class Usuarios extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Usuarios</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Usuarios at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
        
    protected void listaUsuarios(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
      response.setContentType("text/html;charset=UTF-8");
       UsuarioDAO usuario = new UsuarioDAOImplementar();
       
       HttpSession sesion= request.getSession(true);
       sesion.setAttribute("listaa", usuario.Listar());
       RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Usuarios/listarUsuarios.jsp");
       dispatcher.forward(request, response);
      
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
        //processRequest(request, response);
        //Se captura el parámetro que se esta enviando.
        String parametro = request.getParameter("opcion");
        //System.out.println(parametro);
        
        //Evaluar si el parámetro es crear o listar o cualquier otro.
        if(parametro.equals("crear")){
           //Vista o formulario para registrar nueva categoria.
            String pagina = "/Vistas-Usuarios/crearUsuario.jsp";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
            dispatcher.forward(request, response);
            
        }else if(parametro.equals("listar")){
            this.listaUsuarios(request, response);
            
        }else if(parametro.equals("modificar")){
            //Se efectua el casting o conversión de datos porque lo ingresado en el formulario es texto.
            int id = Integer.parseInt(request.getParameter("id_u"));
            String nombre = request.getParameter("nombre_u");
             String apellido = request.getParameter("apellido_u");
              String correo = request.getParameter("correo_u");
               String clave= request.getParameter("clave_u");
            int tipo= Integer.parseInt(request.getParameter("tipo_u"));
            int estado = Integer.parseInt(request.getParameter("estado_u"));
              String pregunta= request.getParameter("pregunta_u");
                String respuesta = request.getParameter("respuesta_u");
                
            //    Date jdjdjd=request.getParameter("respuesta");
            
           String pagina = "/Vistas-Usuarios/crearUsuario.jsp?id_u="+id+"&&nombre_u="+nombre+"&&apellido_u="+apellido+"&&acorreo_u="+correo+"&&clave_u="+clave+"&&tipo_u="+tipo
                   +"&&estado_u="+estado+"&&pregunta_u="+pregunta+"&&respuesta_u="+respuesta+"&&senal=1";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
            dispatcher.forward(request, response);
            
        }else if(parametro.equals("eliminar")){
            int del_id = Integer.parseInt(request.getParameter("id"));
           UsuarioDAO usuario = new UsuarioDAOImplementar();
           usuario. borrarUsu(del_id);
       this.listaUsuarios(request, response);
        }
        
    }
    //this.listaUsuarios(request, response);
    

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
