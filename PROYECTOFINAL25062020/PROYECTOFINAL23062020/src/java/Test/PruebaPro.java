
package Test;
import DAO.*;
import Model.*;
import java.util.List;
/**
 *
 * @author PC
 */
public class PruebaPro {
    public static void main(String[] args) {
        PruebaPro evaluar = new PruebaPro();
        evaluar.listarProductos();
    }
    
    public void listarProductos(){
        ProductoDAO producto = new ProductoDAOImplementar();
        //Aun no se si funcionará esto XD
        List<Producto> listar = producto.Listar();
         System.out.println("LISTADO DE PRODUCTOS: ");
         
         for(Producto productoListar : listar){
             System.out.println("ID: "+productoListar.getId_producto()+
                                " NOMBRE: "+productoListar.getNom_producto()+
                                " STOCK: "+productoListar.getStock()+
                                " PRECIO: "+productoListar.getPrecio()+
                                " ESTADO DEL PRODUCTO:"+productoListar.getEstado_producto()+
                                " CATEGORIA: "+productoListar.getCategoria()+
                                " DESCRIPCION DEL PRODUCTO: "+productoListar.getDes_producto()+
                                " FECHA DE ENTRADA: "+productoListar.getFecha_entrada()
                     
             ); 
             
         }
    }
}
