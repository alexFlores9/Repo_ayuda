
package DAO;

import Model.Usuario;
import java.util.List;

/**
 *
 * @author alex
 */
public interface UsuarioDAO {
    
    
    public List<Usuario> Listar();
    public List<Usuario> Listar2();
    public Usuario editarUsu(int id_usu_edit );
    public boolean guardarUsu(Usuario usuario);
    public boolean borrarUsu(int id_usu_borrar);
    
    
    
    
}
