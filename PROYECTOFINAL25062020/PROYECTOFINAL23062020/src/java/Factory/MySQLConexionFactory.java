package Factory;

import java.sql.Connection;
import java.sql.DriverManager;

public final class MySQLConexionFactory extends ConexionBD{

    public MySQLConexionFactory(String[] criterios) {
        //Pasar los criterios al array de la clase padre, parámetros.
        this.parametros = criterios;
        //Llamar al método open.
        this.open();
    }

    //Implementar el método open.
    @Override
    Connection open() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //En this.parametros[] iran los datos respectivos de nombre de la BD, usuario y clave.
            this.conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + this.parametros[0], this.parametros[1], this.parametros[2]);
        }catch(Exception ex){
          ex.printStackTrace();
        }
        return this.conexion;
    }
    
     //Autor: Prof. Manuel de Jesús Gámez López
}
