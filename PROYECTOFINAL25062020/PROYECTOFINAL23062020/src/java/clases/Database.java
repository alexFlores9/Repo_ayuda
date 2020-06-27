
package clases;

/**
 *
 * @author PC
 */
public class Database {
    private String url;
    private String user;
    private String contra;
    private String diver;

    public Database() {
        this.url = "jdbc:mysql://localhost:3306/bd_inventario?zeroDateTimeBehavior=convertToNull";
        this.user = "root";
        this.contra = "";
        this.diver = "com.mysql.jdbc.Driver";
    }

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getContra() {
        return contra;
    }

    public String getDiver() {
        return diver;
    }
    
    
}
