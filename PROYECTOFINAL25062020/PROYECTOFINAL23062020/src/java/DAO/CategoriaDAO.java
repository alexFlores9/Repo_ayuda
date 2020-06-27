package DAO;

import Model.Categoria;
import java.util.List;

public interface CategoriaDAO {
    //Definir los métodos, como la clase en interface. Los métodos no se implementan 
    //aqui, los métodos son de tipo abstractos.
    public List<Categoria> Listar();
    public List<Categoria> Listar2();
    public Categoria editarCat(int id_cat_edit);
    public boolean guardarCat(Categoria categoria);
    public boolean borrarCat(int id_cat_borrar);
    
     //Autor: Prof. Manuel de Jesús Gámez López
}
