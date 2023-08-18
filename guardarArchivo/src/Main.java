import java.io.IOException;
import java.io.FileWriter;
public class Main {
    public static void main(String[] args) {

        try {
            FileWriter escribir = new FileWriter("/var/www/html/java_clase_1/clasejava/archivo.txt");
            escribir.write("hola desde la libreria");
            escribir.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}