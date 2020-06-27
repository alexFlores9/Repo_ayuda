package org.apache.jsp.Vistas_002dProductos;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class crearProducto_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Vistas-Productos/../WEB-INF/Vistas-Parciales/encabezado.jspf");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      Model.Producto producto = null;
      synchronized (session) {
        producto = (Model.Producto) _jspx_page_context.getAttribute("producto", PageContext.SESSION_SCOPE);
        if (producto == null){
          producto = new Model.Producto();
          _jspx_page_context.setAttribute("producto", producto, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');

    String id ="";
    String nombre_pro="";
    if(request.getParameter("senal")!=null){
        id = request.getParameter("id_p");
        nombre_pro = request.getParameter("nombre_p");
    } else{
        id = String.valueOf(producto.getId_producto());
        nombre_pro = request.getParameter("nombre_pro");
    }
    

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>CREAR PRODUCTO</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Crear PRODUCTOS</h1>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  <link href=\"bootstrap/css/propio.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<div>\n");
      out.write("   \n");
      out.write("      <div class=\"encabezado \" id=\"menu\">\n");
      out.write("       \n");
      out.write("        <!-- Los href aca apuntan a los servlets creados dentro del controlador -->\n");
      out.write("        \n");
      out.write("        <!--<a href=\"categorias\" class=\"btn btn-primary btn-sm\" role=\"button\">Categorias</a>-->\n");
      out.write("   \n");
      out.write("        \n");
      out.write("           \n");
      out.write("           \n");
      out.write("          \n");
      out.write("<ul >\n");
      out.write("    <li><h4> SISTEMA DE CONTROL DE INVENTARIO</h4></li>\n");
      out.write("    <li><a href=\"index1.jsp\"  role=\"button\">Inicio</a> </li>\n");
      out.write("    <li>     <a href=\"categorias?opcion=listar\"  role=\"button\">Categorias</a> </li>\n");
      out.write("  <li><a href=\"#\">Usuario</a>\n");
      out.write("    <ul>\n");
      out.write("      <li><a href=\"index.jsp?cerrar=true\">Cerrar sesion</a></li>\n");
      out.write("      <li><a href=\"#\">  Usuario: sesion.getAttribute(\"nombre\")  </a></li>\n");
      out.write("      \n");
      out.write("    \n");
      out.write("    </ul>\n");
      out.write("  </li>\n");
      out.write("\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("  \n");
      out.write("       \n");
      out.write("    </div>\n");
      out.write("    <div class=\"contenido\">\n");
      out.write("   <!--Este div no se cierra aquí, se cierra en el pie.jspf -->\n");
      out.write("\n");
      out.write("        <form class=\"form-horizontal\" id=\"frmProducto\" name=\"frmProducto\" action=\"");
      out.print(request.getContextPath());
      out.write(" /productos\" method=\"post\">\n");
      out.write("            <input type=\"hidden\" name=\"id_producto\" value=\"");
      out.print( id );
      out.write("\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"txtNomProducto\" class=\"col-sm-2 control-label\">Nombre</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\"/>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
