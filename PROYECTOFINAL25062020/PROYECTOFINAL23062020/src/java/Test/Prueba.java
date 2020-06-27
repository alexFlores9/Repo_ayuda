package Test;

import DAO.CategoriaDAO;
import DAO.CategoriaDAOImplementar;
import Model.Categoria;
import java.util.List;


public class Prueba {
    public static void main(String[] args) {
        Prueba evaluar = new Prueba();
        
        //evaluar.listarCategorias();
        //evaluar.editarCategoria();
        //evaluar.guardarCategoria();
        evaluar.listarCategorias();
        evaluar.eliminarCategoria();
        evaluar.listarCategorias();
    }
    
    public void listarCategorias(){
        CategoriaDAO categoria = new CategoriaDAOImplementar();
        List<Categoria> listar = categoria.Listar();
        System.out.println("LISTADO DE CATEGORIAS");
        for(Categoria categoriaListar: listar){
            System.out.println("ID: "+ categoriaListar.getId_categoria() +
                    " NOMBRE: " + categoriaListar.getNom_categoria() +
                    " ESTADO: " + categoriaListar.getEstado_categoria());
        }
    }
    
    public void editarCategoria(){
        CategoriaDAO categoria = new CategoriaDAOImplementar();
        Categoria cat_edit = categoria.editarCat(1);
        System.out.println("CATEGORIA A MODIFICAR");
        System.out.println("ID: "+ cat_edit.getId_categoria() +
                 " NOMBRE: " + cat_edit.getNom_categoria() +
                " ESTADO: " + cat_edit.getEstado_categoria());
    }
    
    /*public void guardarCategoria(){
        CategoriaDAO categoria = new CategoriaDAOImplementar();
        Categoria guardar_cat = new Categoria();
        guardar_cat.setNom_categoria("Churro");
        guardar_cat.setEstado_categoria(1);
        categoria.guardarCat(guardar_cat);
        
    }*/
    
    public void guardarCategoria(){
        CategoriaDAO categoria = new CategoriaDAOImplementar();
        Categoria guardar_cat = new Categoria();
        guardar_cat.setNom_categoria("Bebidas Naturales");
        guardar_cat.setId_categoria(5);               //Modificar la categoria registrada anteriormente.
        guardar_cat.setEstado_categoria(1);           //Estado 1.
        categoria.guardarCat(guardar_cat);
        
    }
    
    
    public void eliminarCategoria(){
         CategoriaDAO categoria = new CategoriaDAOImplementar();
         categoria.borrarCat(2);    //Se eliminará la categoria con id_categoria = 2;
    }
    
    //Autor: Prof. Manuel de Jesús Gámez López
}
