package org.apache.jsp.Vistas_002dCategorias;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class crearCategoria_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/Vistas-Categorias/../WEB-INF/Vistas-Parciales/css-js.jspf");
    _jspx_dependants.add("/Vistas-Categorias/../WEB-INF/Vistas-Parciales/encabezado.jspf");
    _jspx_dependants.add("/Vistas-Categorias/../WEB-INF/Vistas-Parciales/pie.jspf");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!-- Para importar los datos de la clase Categoria -->\n");
      Model.Categoria categoria = null;
      synchronized (session) {
        categoria = (Model.Categoria) _jspx_page_context.getAttribute("categoria", PageContext.SESSION_SCOPE);
        if (categoria == null){
          categoria = new Model.Categoria();
          _jspx_page_context.setAttribute("categoria", categoria, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      out.write('\n');

    String id = "";
    String nombre_cat = "";
    String estado_cat = "";
    if(request.getParameter("senal")!=null){
        /*String id = request.getParameter("id_c");
        String nombre_cat = request.getParameter("nombre_c");
        String estado_cat = request.getParameter("estado_c");*/
        id = request.getParameter("id_c");
        nombre_cat = request.getParameter("nombre_c");
        estado_cat = request.getParameter("estado_c");
    }else{
        id = String.valueOf(categoria.getId_categoria());    //Id predeterminado cero definido en el constructor
        nombre_cat = categoria.getNom_categoria();
        estado_cat = String.valueOf(categoria.getEstado_categoria());
    }

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Control de Inventario</title>\n");
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
      out.write("\n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            //Función para el botón regresar.\n");
      out.write("            function regresar(url){\n");
      out.write("                location.href = url;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
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
      out.write("           \n");
      out.write("        <h3>Mantenimiento Categorias</h3>\n");
      out.write("        <form class=\"form-horizontal\" id=\"frmCategoria\" name=\"frmCategoria\" action=\"");
      out.print( request.getContextPath() );
      out.write("/categorias\" method=\"post\">\n");
      out.write("            <input type=\"hidden\" name=\"id_categoria\" value=\"");
      out.print( id );
      out.write("\" >\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"txtNomCategoria\" class=\"col-sm-2 control-label\">Nombre:</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"txtNomCategoria\" value=\"");
      out.print( nombre_cat );
      out.write("\" required>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("           <div class=\"form-group\">\n");
      out.write("                <label for=\"txtEstadoCategoria\" class=\"col-sm-2 control-label\">Estado:</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"txtEstadoCategoria\" value=\"");
      out.print( estado_cat );
      out.write("\" required>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("                    ");

                        if(request.getParameter("senal")!=null){
                    
      out.write("\n");
      out.write("                    <input type=\"submit\" class=\"btn btn-default btn-sm\" name=\"btnModificar\" value=\"Actualizar\" />\n");
      out.write("                    ");

                        }else{   
                    
      out.write("    \n");
      out.write("                    <input type=\"submit\" class=\"btn btn-success btn-sm\" name=\"btnGuardar\" value=\"Guardar\" />\n");
      out.write("                    ");

                        }  
                    
      out.write(" \n");
      out.write("                    <input type=\"button\" class=\"btn btn-info btn-sm\" onclick=\"regresar('");
      out.print( request.getContextPath() );
      out.write("/categorias?opcion=listar')\" \n");
      out.write("                           name=\"btnRegresar\" value=\"Regresar\" />\n");
      out.write("                </div>\n");
      out.write("            </div>   \n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("         ");
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
      out.write("\n");
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
