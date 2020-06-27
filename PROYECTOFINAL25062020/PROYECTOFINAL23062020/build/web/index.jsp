<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="bootstrap/css/estiloslogin.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>INICIO DE SESSION</title>
    </head>
    <body>
        <div align="center" class="container col-lg-3 ">
             <div class="form-group text-center">
                     <img src="bootstrap/img/iconfinder_Technology_Mix_-_Final-40_998693.png" width="80" height="80" alt=""/>
                 <p>Welcome </p> 
                 </div>
            <form action="SERVLOGIN" method="POST">
                <div class="form-group">
                <label>Usuario:      <img src="bootstrap/img/iconfinder_user_male2_172626.png" width="30" height="30" alt=""/>  </label>
                <input type="text" name="txtusuario" placeholder="NOMBRE USUARIO"><br>
                </div>
                
                  <div class="form-group">
                 <label>Password:<img src="bootstrap/img/iconfinder_key_1055040.png" width="30" height="30" alt=""/></label>
                <input type="password" name="txtcontra" placeholder="CONTRASEÑA"><br><br>
                  </div>
                
                <input class="btn btn-lg btn-danger" type="submit" name="btnIniciar" value="INICIAR SESION">
            </form>
        </div>
           
        <%
            HttpSession sesion = request.getSession();
            int tipo = 0;
            if(request.getAttribute("tipo")!=null){
                tipo = (Integer)request.getAttribute("tipo");
                if(tipo==1){
                    sesion.setAttribute("nombre",request.getAttribute("nombre"));
                    sesion.setAttribute("tipo", tipo);
                    response.sendRedirect("index1.jsp");
                }
            }
            if(request.getParameter("cerrar")!=null){
               session.invalidate();
            }
        %>
    </body>
</html>
