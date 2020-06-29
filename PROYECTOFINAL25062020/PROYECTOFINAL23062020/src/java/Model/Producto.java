package Model;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author PC
 */
public class Producto {
    java.util.Date utilDate = new java.util.Date(); //fecha actual
    long lnMilisegundos = utilDate.getTime();
    java.sql.Date sqlDate = new java.sql.Date(lnMilisegundos);
    java.sql.Time sqlTime = new java.sql.Time(lnMilisegundos);
    java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(lnMilisegundos);
    
    private int id_producto;
    private String nom_producto;
    private double stock;
    private double precio;
    private String unidad_de_medida;
    private int estado_producto;
    private Categoria categoria;
    private String des_producto;
    private Date fecha_entrada;

    public Producto() {
        this.id_producto = 0;
        this.nom_producto="";
        this.stock=0.0;
        this.precio=0.0;
        this.unidad_de_medida="";
        this.estado_producto=0;
        this.categoria = new Categoria();
        this.des_producto="";
        //this.fecha_entrada;
        
    }

    public Producto(int id_producto, String nom_producto, double stock, double precio, String unidad_de_medida, int estado_producto, Categoria categoria, String des_producto, Date fecha_entrada) {
        this.id_producto = id_producto;
        this.nom_producto = nom_producto;
        this.stock = stock;
        this.precio = precio;
        this.unidad_de_medida = unidad_de_medida;
        this.estado_producto = estado_producto;
        this.categoria = categoria;
        this.des_producto = des_producto;
        this.fecha_entrada = fecha_entrada;
    }

    public Date getUtilDate() {
        return utilDate;
    }

    public void setUtilDate(Date utilDate) {
        this.utilDate = utilDate;
    }

    public long getLnMilisegundos() {
        return lnMilisegundos;
    }

    public void setLnMilisegundos(long lnMilisegundos) {
        this.lnMilisegundos = lnMilisegundos;
    }

    public java.sql.Date getSqlDate() {
        return sqlDate;
    }

    public void setSqlDate(java.sql.Date sqlDate) {
        this.sqlDate = sqlDate;
    }

    public Time getSqlTime() {
        return sqlTime;
    }

    public void setSqlTime(Time sqlTime) {
        this.sqlTime = sqlTime;
    }

    public Timestamp getSqlTimestamp() {
        return sqlTimestamp;
    }

    public void setSqlTimestamp(Timestamp sqlTimestamp) {
        this.sqlTimestamp = sqlTimestamp;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNom_producto() {
        return nom_producto;
    }

    public void setNom_producto(String nom_producto) {
        this.nom_producto = nom_producto;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getUnidad_de_medida() {
        return unidad_de_medida;
    }

    public void setUnidad_de_medida(String unidad_de_medida) {
        this.unidad_de_medida = unidad_de_medida;
    }

    public int getEstado_producto() {
        return estado_producto;
    }

    public void setEstado_producto(int estado_producto) {
        this.estado_producto = estado_producto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getDes_producto() {
        return des_producto;
    }

    public void setDes_producto(String des_producto) {
        this.des_producto = des_producto;
    }

    public Date getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(Date fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }
    
    
    
}
