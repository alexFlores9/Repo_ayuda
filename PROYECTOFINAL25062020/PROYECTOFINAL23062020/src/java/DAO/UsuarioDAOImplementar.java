/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Usuario;
import java.util.List;

import Factory.ConexionBD;
import Factory.FactoryConexionBD;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author alex
 */
public class UsuarioDAOImplementar implements UsuarioDAO{

    ConexionBD conn;
    
    public UsuarioDAOImplementar(){
        
    }
    
    
    
    @Override
    public List<Usuario> Listar() {
       
        this.conn = FactoryConexionBD.open(FactoryConexionBD.MySQL);
        StringBuilder miSQL = new StringBuilder();
        miSQL.append("SELECT * FROM tb_usuario;");
        List<Usuario> lista = new ArrayList<Usuario>();
        try{
            //Se crea el objeto ResultSet implementando el método (consultaSQL) creado para la consulta.
            ResultSet resultadoSQL = this.conn.consultaSQL(miSQL.toString());
            while(resultadoSQL.next()){
                Usuario usuario = new Usuario();
                //Asignar cada campo consultado al atributo en la clase.
                
                usuario.setId(resultadoSQL.getInt("id"));
                usuario.setNombre(resultadoSQL.getString("nombre"));
                usuario.setApellido(resultadoSQL.getString("apellido"));
                usuario.setCorreo(resultadoSQL.getString("correo"));
                usuario.setClave(resultadoSQL.getString("clave"));
                usuario.setTipo(resultadoSQL.getInt("tipo"));
                usuario.setEstado(resultadoSQL.getInt("estado"));
                usuario.setPregunta(resultadoSQL.getString("pregunta"));
                usuario.setRespuesta(resultadoSQL.getString("respuesta"));
                usuario.setFecha_registro(resultadoSQL.getString("fecha_registro"));
            
                lista.add(usuario); //Agregar al array cada registro encontrado.
            }
        }catch(Exception ex){
            
        }finally{
            this.conn.cerrarConexion();
        }
        
        return lista;
    }

    @Override
    public List<Usuario> Listar2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario editarUsu(int id_usu_edit ) {
       
        this.conn = FactoryConexionBD.open(FactoryConexionBD.MySQL);
        Usuario usuario = new Usuario();
        StringBuilder miSQL = new StringBuilder();
        //Agregar la consulta SQL.
        miSQL.append("SELECT * FROM tb_usuario WHERE id = ").append(id_usu_edit);
        //Realizar la consulta.
        try{
            ResultSet resultadoSQL = this.conn.consultaSQL(miSQL.toString());
            while(resultadoSQL.next()){
                usuario.setId(resultadoSQL.getInt("id"));
                usuario.setNombre(resultadoSQL.getString("nombre"));
                usuario.setApellido(resultadoSQL.getString("apellido"));
                usuario.setCorreo(resultadoSQL.getString("correo"));
                usuario.setClave(resultadoSQL.getString("clave"));
                usuario.setTipo(resultadoSQL.getInt("tipo"));
                usuario.setEstado(resultadoSQL.getInt("estado"));
                usuario.setPregunta(resultadoSQL.getString("pregunta"));
                usuario.setRespuesta(resultadoSQL.getString("respuesta"));
                usuario.setFecha_registro(resultadoSQL.getString("fecha_registro"));
            }
        }catch(Exception e){
        }finally{
            this.conn.cerrarConexion();
        }
        
        return usuario;
    }

    @Override
    public boolean guardarUsu(Usuario usuario ) {
        this.conn = FactoryConexionBD.open(FactoryConexionBD.MySQL);
        boolean guardar = false;
        try{
            if(usuario.getId() == 0){
                StringBuilder miSQL = new StringBuilder();
                //Agregar consulta SQL; el id_categoria es autoincrementable.
                miSQL.append("INSERT INTO tb_usuario(nombre, apellido, correo, clave, tipo, estado, pregunta, respuesta, fecha_registro) VALUES ('");
                miSQL.append(usuario.getNombre()+"',").append(usuario.getApellido()+ "',  " ).append(usuario.getApellido()+ "',  " )
                .append(usuario.getCorreo()+ "',  " ).append(usuario.getClave() + "',  " ).append(usuario.getTipo()+ "," )
                .append(usuario.getEstado()+ ", " ).append(usuario.getPregunta()+ "',  " ).append(usuario.getRespuesta()+ "', " )
                .append(usuario.getFecha_registro()+ " ' " );
                miSQL.append(");");
                //Invocar método para ejecutar la consulta.
                this.conn.ejecutarSQL(miSQL.toString());
                System.out.println("Registro Guardado...");
            }//else if(usuario.getId()>0){   
               // Comprobación para actualizar...
              //  System.out.println("Entramos...");
              //  StringBuilder miSQL = new StringBuilder();
               // miSQL.append("UPDATE tb_categoria SET id_categoria = ").append(usuario.getId());
               // miSQL.append(", nom_categoria =  '").append(usuario.getNombre());
              //  miSQL.append("', estado_categoria =  ").append(usuario.getTipo());
             //   miSQL.append(" WHERE id_categoria = ").append(usuario.getId()).append(";");
                //Invocar método para ejecutar la consulta.
             //   this.conn.ejecutarSQL(miSQL.toString());
               // System.out.println("Registro modificado correctamente!");
                //    System.out.println("este es mi error"+ e.getMessage());
              //    }
//            
          return guardar;
        }catch(Exception e){
            
            System.out.println("este es mi error"+ e.getMessage());
            
        }finally{
            this.conn.cerrarConexion();
        }
        return guardar;
    }

    @Override
    public boolean borrarUsu(int id_usu_borrar) {
        this.conn = FactoryConexionBD.open(FactoryConexionBD.MySQL);
        boolean borrar = false;           //Bandera de resultados
        try{
            StringBuilder miSQL = new StringBuilder();
            miSQL.append("DELETE FROM tb_usuario WHERE id = ").append(id_usu_borrar);
            this.conn.ejecutarSQL(miSQL.toString());
            borrar = true;
        }catch(Exception e){
            
        }finally{
            this.conn.cerrarConexion();  //Cerrar la conexión.
        }
        return borrar;
    }
    
    //Autor: Prof. Manuel de Jesús Gámez López
    

    
    
}
