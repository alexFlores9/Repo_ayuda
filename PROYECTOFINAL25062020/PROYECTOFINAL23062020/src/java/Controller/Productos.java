    
package Controller;


import DAO.CategoriaDAO;
import DAO.CategoriaDAOImplementar;
import DAO.ProductoDAO;
import DAO.ProductoDAOImplementar;
import Model.Producto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author PC
 */
public class Productos extends HttpServlet {
    protected void listaProductos (HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        ProductoDAO producto = new ProductoDAOImplementar();
        
        HttpSession session = request.getSession(true);
        session.setAttribute("listar", producto.Listar());
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Productos/listarProductos.jsp");
        dispatcher.forward(request, response);
    }
    protected void borrarProductor (HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Productos/listarProductos.jsp");
        dispatcher.forward(request, response);
    }
     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

  
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
            String pagina = "/Vistas-Productos/crearProducto.jsp";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
            dispatcher.forward(request, response);
            
        }else if(parametro.equals("listar")){
            this.listaProductos(request, response);
            
        }else if(parametro.equals("modificar")){
            //Se efectua el casting o conversión de datos porque lo ingresado en el formulario es texto.
            int id_producto = Integer.parseInt(request.getParameter("id_pro"));
            String nom_producto = request.getParameter("nombre_pro");
            String des_producto = request.getParameter("des_pro");
            int categoria_id = Integer.parseInt(request.getParameter("categori_id"));
            float stock = Float.parseFloat(request.getParameter("stock_pro"));
            float precio = Float.parseFloat(request.getParameter("precio_pro"));
            String unidadMedida = request.getParameter("unidad_m_pro");
            int estado = Integer.parseInt(request.getParameter("estado_pro"));
            String categoria= request.getParameter("categoria_pro");
            String fecha_entrada= request.getParameter("fecha_pro");

            String pagina = "/Vistas-Productos/crearProducto.jsp?id_p="+id_producto+"&&nombre_p="+nom_producto+"&&estado_p="
                            +des_producto+"&&des_pro"+categoria_id+"categori_id"+stock+"&&stok=p"+precio+"precio_pro"
                            +unidadMedida+"unidad_m_pro"+estado+"estado_pro"+categoria+"categoria_pro"+fecha_entrada+"fecha_pro";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
            dispatcher.forward(request, response);
            
        }else if(parametro.equals("eliminar")){
            int del_id = Integer.parseInt(request.getParameter("id"));
            ProductoDAO producto = new ProductoDAOImplementar();
            producto.borrarPro(del_id);    
            this.listaProductos(request, response);
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Producto producto = new Producto();
        //Se efectua el casting o conversión de datos porque lo ingresado en el formulario es texto.
        int id_producto = Integer.parseInt(request.getParameter("id_producto"));
        String nom_producto = request.getParameter("txtNomProducto");
        String des_producto = request.getParameter("txtEstadoCategoria");
        int categoria_id= Integer.parseInt(request.getParameter("txtDesProducto"));
        float stock = Float.parseFloat(request.getParameter("txtStock"));
        float precio = Float.parseFloat(request.getParameter("txtPrecio"));
        String unidadMedida = request.getParameter("txtUnidadM");
        int estado = Integer.parseInt(request.getParameter("txtEstado"));
        //String categoria = request.getParameter();
        String fecha_entrada = request.getParameter("txtFecha");
        
        producto.setId_producto(id_producto);
        producto.setNom_producto(nom_producto);
        producto.setDes_producto(des_producto);
        producto.setCategoria_id(categoria_id);
        producto.setStock(stock);
        producto.setPrecio(precio);
        producto.setUnidadMedida(unidadMedida);
        producto.setEstado(estado);
        producto.setCategoria(null);
        producto.setFecha_entrada(fecha_entrada);
        
        ProductoDAO guardarProducto = new ProductoDAOImplementar();
        guardarProducto.guardarPro(producto);
        
        this.listaProductos(request, response);
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
