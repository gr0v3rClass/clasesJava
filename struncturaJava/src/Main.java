import javax.swing.plaf.synth.SynthTextAreaUI;

public class Main {
    public static void main(String[] args) {

        // ciclos for
        int[] numeros = {1,3,5,7,9};
        for (int i = 0; i<=numeros.length; i++){
           // System.out.println("el numero es:  "+ numeros[i]);
        }

        for (int i = 10; i >= 1 ; i--) {
            //System.out.println("El numero es:  "+i);
        }

        for (int i = 0; i <= 20 ; i += 2) {
            //System.out.println("el numero es: "+i);
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i ; j++) {
                //System.out.print("*");
            }
            //System.out.println();
        }

        int numeroBuscado = -1;
        for (int i = 1; i <= 100 ; i++) {
            if (i % 7 == 0) {
                numeroBuscado = i;
                break;
            }
        }
        //System.out.println("el numero buscado es: "+ numeroBuscado);

        for (int i = 1; i <=10 ; i++) {
            if (i == 6) {
                continue;
            }
            //System.out.println("los numeros son:  "+i);
        }

        int[] numeros1 = {1,2,3,4,5,6};
        for (int numero: numeros1){
            //System.out.println("los numeros son:  "+numero);
        }
        String[] aux = {"a","b","c","d"};
        for (String dato:aux) {
            //System.out.println("las letras son:  "+dato);
        }

        for (int i = 0; i < 5; i++) System.out.println(i);




        // condicionea
        /*int edad = 20;

        if (edad > 18){
            System.out.println("es mayor...");
        }
        if (edad == 17){
            System.out.println("la edad es igual a 17");
        }else {
            System.out.println("la edad no es igual a 17");
        }*/

        /*boolean esDiaFestivo = true;
        boolean esDiaSoleado = false;

        if (esDiaFestivo == true && esDiaSoleado == false){
            System.out.println("Se sale de paceo...");
        }else{
            System.out.println("se queda en casa....");
        }*/

        //int edad1 = 18;
        //int edad2 = 8;

        //String mensaje = (edad1 >= 18)? "Es mayor de edad":"No es mayor de edad";
        //System.out.println(mensaje);
        //System.out.println((edad2 >= 18)? "Es mayor de edad desde la impresion":"No es mayor de edad desde la impresion");

        /*boolean expresion = false;
        if (!!expresion){
            System.out.println("es verdadero....");
        }else{
            System.out.println("es falso....");
        }*/

        /*switch (edad1){
            case 18:
                System.out.println("la edad es 18");
                break;
            case 20:
                System.out.println("la edad es 20");
                break;
            default:
                System.out.println("no se encontro la edad...");
        }*/

        //if (true) System.out.println("saludo...");
    }
}