import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        //Error de sintaxis
        //int numero = 5 //falta el punto y coma al final de la linea
        // Error de tiempo de compilacion
        //int numero = a // "a" no esta declarado previamente
        //Excepciones en Tiempo de Ejecucion
        /*int a = 10;
        int b = 0;
        int resultado = a/b;*/  //Division por cero, que produce una execpcion aritmetica
        // Error llogico
        int tiempo = 10;
        /*if (tiempo < 0){
            System.out.println("Es mayor");
        } else if (tiempo < 10) {
            System.out.println("es el limite");
        }*/  //Error
        /*if (tiempo < 0){
            System.out.println("Es mayor");
        } else if (tiempo>=0 && tiempo <= 10) {
            System.out.println("es el limite");
        }*/ //Correcto

        // Errores logicos de algoritmo

       /* int[] numeros = {1,2,3,4,5};
        int suma = 0;
        for (int i = 0; i <= numeros.length ; i++) {
            suma += numeros[i];
            System.out.println("i = "+ i);
        }*/

        // error en tiempo de ejecucion del Systema

        FileInputStream file = new FileInputStream("archivo.txt");


    }
}