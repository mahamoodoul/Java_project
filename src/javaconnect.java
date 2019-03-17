
import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect {
    Connection conn =null;
    public static Connection ConnecrDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Md Mahamodul Islam\\Documents\\NetBeansProjects\\BankManagementSystem\\bank.sqlite");
            return conn;
        }
        
       catch(ClassNotFoundException | SQLException e){
           JOptionPane.showMessageDialog(null, e);  
       }
        return null;
    }
    
}
 