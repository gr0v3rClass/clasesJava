import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class main {
    public static void main (String[] args){
        String jdbUrl = "jdbc:mysql://127.0.0.1:3306/javaclassdb";
        String usuario = "root";
        String contasena = "123456";

        try {
            Connection conexion = DriverManager.getConnection(jdbUrl,usuario,contasena);
            System.out.println("conexion exitosa....");
            conexion.close();
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
