
import javax.swing.*;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();
        JFrame ventana = new JFrame("Ejemplo de ventana");

        ventana.setSize(400,300);

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel etiqueta = new JLabel(fechaActual+"");
        ventana.add(etiqueta);

        ventana.setVisible(true);
    }
}