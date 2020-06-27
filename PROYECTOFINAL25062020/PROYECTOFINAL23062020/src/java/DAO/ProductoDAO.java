
package DAO;

import Model.Producto;
import java.util.List;

/**
 *
 * @author PC
 */
public interface ProductoDAO {
    public List<Producto> Listar();
    public List<Producto> Listar2();
    public Producto editarPro(int id_pro_edit);
    public boolean guardarPro(Producto producto);
    public boolean borrarPro(int id_pro_borrar);
    
}
