<%-- 
    Document   : crearProducto
    Created on : 25/06/2020, 06:31:11 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="producto" scope="session" class="Model.Producto"/>
<%
    String id ="";
    String nombre_pro="";
    if(request.getParameter("senal")!=null){
        id = request.getParameter("id_p");
        nombre_pro = request.getParameter("nombre_p");
    } else{
        id = String.valueOf(producto.getId_producto());
        nombre_pro = request.getParameter("nombre_pro");
    }
    
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CREAR PRODUCTO</title>
    </head>
    <body>
        <h1>Crear PRODUCTOS</h1>
        <%@include  file="../WEB-INF/Vistas-Parciales/encabezado.jspf" %>
        <form class="form-horizontal" id="frmProducto" name="frmProducto" action="<%=request.getContextPath()%> /productos" method="post">
            <input type="hidden" name="id_producto" value="<%= id %>">
            <div class="form-group">
                <label for="txtNomProducto" class="col-sm-2 control-label">Nombre</label>
                <input type="text" class="form-control"/>
            </div>
        </form>
    </body>
</html>
