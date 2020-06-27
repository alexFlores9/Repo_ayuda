package Factory;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class ConexionBD {
    protected String[] parametros;
    protected Connection conexion;
    
    //El siguiente método abstracto no se implementa solamente se declara, se
    //implementará en la subclase.
    
    abstract Connection open(); //Método abstracto que devuelve un objeto connection.
    
    //Método que se encarga de ejecutar la consulta.
    public ResultSet consultaSQL(String consulta){
        //Objeto Statement es el encargado de ejecutar las consultas.
        Statement st;
        //Tabla temporal donde se almacenan los datos.
        ResultSet rs = null;
        try{
            st = conexion.createStatement();
            rs = st.executeQuery(consulta);
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
        return rs;        
    }
    
    
    //Método para ejecutar.
    public boolean ejecutarSQL(String consulta){
        //Objeto Statement es el encargado de ejecutar las consultas.
        Statement st;
        boolean guardar = true;
        
        try{
            st = conexion.createStatement();
            st.executeUpdate(consulta);
            
        }catch(SQLException ex){
            guardar = false;
            ex.printStackTrace();
        }
        return guardar;        
    }
    
    
    //Método para cerrar la conexión.
    public boolean cerrarConexion(){
        boolean ok = true;
        try{
            conexion.close();
        }catch(Exception ex){
            ok = false;
            ex.printStackTrace();
        }
        return ok;  
    }
    
    
    
     //Autor: Prof. Manuel de Jesús Gámez López
    
}
