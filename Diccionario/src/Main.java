import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    private static Diccionario diccionarioEspIng = new Diccionario();
    private static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        rellenarDiccionario();
        juego();
    }

    private static void rellenarDiccionario(){
        try{
            File fichero = new File("/var/www/html/java_clase_1/repositorioClasesJava/Diccionario/src/palabras.txt");
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);
            String linea = "";
            while ((linea = br.readLine())!= null){
                String array[] = linea.split(";");
                diccionarioEspIng.nuevaPalabra(array[0],array[1]);
            }
            br.close();
        }catch (Exception e){
            System.out.println("Error en la lectura desde el archivo");
        }
    }

    private static void juego(){
        String palEsp;
        String palIng;
        String letraIng;
        String respuesta;

        int totalPregunta = 0;
        int totalAcirto =0;
        int totalErrors = 0;
        double porcentaje = 0.0;

        do{
            palEsp = diccionarioEspIng.palabrasAleatorias();
            letraIng = diccionarioEspIng.primeraLetraTraduccion(palEsp);
            System.out.println(palEsp+": "+letraIng+"...");
            System.out.println("Indique la respuesta: ");

            respuesta = lector.nextLine();

            if (!respuesta.equalsIgnoreCase("fin")) {
                totalPregunta++;
                palIng = diccionarioEspIng.traducir(palEsp);
                if (respuesta.equalsIgnoreCase(palIng)) {
                    System.out.println("¡CORRECTO...!");
                    totalAcirto++;
                }else {
                    System.out.println("¡No! La respuesta es :"+ palIng);
                    totalErrors++;
                }
            }

        }while (!respuesta.equalsIgnoreCase("fin"));

        porcentaje = ((double) totalAcirto / (double) totalPregunta)*100.0;

        System.out.println("Total de preguntas: " + totalPregunta);
        System.out.println("Totla de aciertos: "+ totalAcirto);
        System.out.println("Total de errores: "+totalErrors);
        System.out.println("Aciertos: "+porcentaje+"%");
        System.out.println();
    }
}















