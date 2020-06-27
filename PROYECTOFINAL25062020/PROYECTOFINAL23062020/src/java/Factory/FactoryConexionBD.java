package Factory;

public class FactoryConexionBD {
    //Podemos definir la configuración para diferentes BD;
    public static final int MySQL = 1;     //Para conectar a MySQL.
    public static String[] configMySQL = {"bd_inventario","root",""};
    
    public static ConexionBD open(int tipoBD){
        switch(tipoBD){
            case FactoryConexionBD.MySQL:
                return new MySQLConexionFactory(configMySQL);
            default:
                return null;
        }
    }
    
     //Autor: Prof. Manuel de Jesús Gámez López
}
