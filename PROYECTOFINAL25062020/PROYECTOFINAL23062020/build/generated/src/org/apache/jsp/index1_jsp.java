package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/WEB-INF/Vistas-Parciales/css-js.jspf");
    _jspx_dependants.add("/WEB-INF/Vistas-Parciales/encabezado.jspf");
    _jspx_dependants.add("/WEB-INF/Vistas-Parciales/pie.jspf");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    HttpSession sesion = request.getSession();
    if(sesion.getAttribute("tipo")== null){
    response.sendRedirect("index.jsp");
    }
    else{
        String tipo = session.getAttribute("tipo").toString();
        if(!tipo.equals("1")){
             response.sendRedirect("index.jsp");
        }
    }


      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Control de Inventario</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <!-- Incluimos la vista parcial la cual contiene las url de las librerias \r\n");
      out.write("             correspondientes a estilos y js\r\n");
      out.write("        -->\r\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Estilo personalizado -->\n");
      out.write("<link href=\"bootstrap/css/estilo-base.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Estilos bootstrap -->\n");
      out.write("<link href=\"bootstrap/css/bootstrap-theme.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"bootstrap/css/bootstrap-theme.min.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<link href=\"bootstrap/css/bootstrap.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"bootstrap/css/bootstrap.min.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Script js de bootstrap -->\n");
      out.write("<script src=\"bootstrap/js/bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<!-- Script librería de jquery -->\n");
      out.write("<script src=\"bootstrap/js/jquery-3.2.1.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"bootstrap/js/jquery-3.2.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- Vistar parciales de la parte superior de nuestra aplicación -->\r\n");
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
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <!-- Todo el contenido de la aplicación -->\r\n");
      out.write("        <div align=\"rigtht\">\r\n");
      out.write("            Bienvenido maje ");
      out.print( sesion.getAttribute("nombre"));
      out.write("\r\n");
      out.write("            <a href=\"index.jsp?cerrar=true\">Cerrar session</a>\r\n");
      out.write("            <hr>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <h3>¡BIENVENID@S!</h3>\r\n");
      out.write("      \r\n");
      out.write("        \r\n");
      out.write("        <div class=\"container mt-4\">\r\n");
      out.write("            <h1>BIENVENIDO <strong></strong>    </h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <!-- Vistar parciales de la parte inferior de nuestra aplicación -->\r\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Aquí se deben cerrar los div abiertos en encabezado.jspf -->\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <div class=\"pie\">\n");
      out.write("        @COPY; ITCA-FEPADE\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("        <link href=\"bootstrap/css/bootstrap-theme.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"bootstrap/css/bootstrap-theme.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
