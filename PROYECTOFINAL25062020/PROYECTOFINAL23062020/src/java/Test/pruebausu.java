/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import DAO.UsuarioDAO;
import DAO.UsuarioDAOImplementar;
import Model.Usuario;
import java.util.List;



/**
 *
 * @author alex
 */
public class pruebausu {
    public static void main(String[] args) {
       pruebausu evaluar = new pruebausu();
     evaluar.guardarUsuario();
      // evaluar.listarUsuarios();
       //evaluar.editarUsuario();
        
       
    }
    
    
    public void listarUsuarios(){
        UsuarioDAO usuario = new UsuarioDAOImplementar();
        List<Usuario> listar = usuario.Listar();
        System.out.println("LISTADO DE CATEGORIAS");
        for(Usuario usuarioListar: listar){
            System.out.println("ID: "+ usuarioListar.getId() +
                    "   NOMBRE: " + usuarioListar.getNombre() +
                    "   Apellido: " + usuarioListar.getApellido()+
                    "   Correo: "+ usuarioListar.getCorreo()+
                    "   Clave: "+ usuarioListar.getClave()+
                    "   Tipo: "+ usuarioListar.getTipo()+
                    "   Estado: "+ usuarioListar.getEstado()+
                    "   Pregunta: "+ usuarioListar.getPregunta()+
                    "   Respuesta: "+ usuarioListar.getRespuesta()+
                    "   Fecha de registro : "+ usuarioListar.getFecha_registro()
                    
            );
        }
    
}
     public void editarUsuario(){
        UsuarioDAO usuario = new UsuarioDAOImplementar();
        Usuario usu_edit = usuario.editarUsu(1);
        System.out.println("CATEGORIA A MODIFICAR");
        System.out.println("ID: "+ usu_edit.getId() +
                 " NOMBRE: " + usu_edit.getNombre() +
                " Apellido: " + usu_edit.getApellido()+
                  " Corre: " + usu_edit.getCorreo()+
                  " Clave: " + usu_edit.getClave()+
                  " Tipo: " + usu_edit.getTipo()+
                  " Estado: " + usu_edit.getEstado()+
                  " Pregunta: " + usu_edit.getPregunta()+
                  " Respuesta: " + usu_edit.getRespuesta()+
                  " fecha de registro: " + usu_edit.getFecha_registro()
        
        
        
        
        );
    } 
    
     
     public void guardarUsuario(){
        UsuarioDAO usuario = new UsuarioDAOImplementar();
        Usuario guardar_usu = new Usuario();
      //guardar_usu.setId(0);
        guardar_usu.setNombre("Usuario prueba");               //Modificar la categoria registrada anteriormente.
        guardar_usu.setApellido("Mandela"); 
         guardar_usu.setCorreo("Prueba23@gmail.com"); 
          guardar_usu.setClave("4321"); 
           guardar_usu.setTipo(2); 
            guardar_usu.setEstado(1); 
             guardar_usu.setPregunta("hola que hace?"); 
              guardar_usu.setRespuesta("nada"); 
               guardar_usu.setFecha_registro("ahora"); 
       
        usuario.guardarUsu(guardar_usu);
    }
    
    
    
    
    
}
    
    
    


