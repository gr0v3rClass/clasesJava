import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private JButton button1;
    private JPanel panel1;
public Ventana() {
    button1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println("hola mundo .....");
        }
    });
}
public static void main(String[] args){
    Ventana ventana = new Ventana();
    ventana.setContentPane(new Ventana().panel1);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setVisible(true);
    ventana.pack();
}
}
