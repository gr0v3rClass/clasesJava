public class Main {
    public static void main(String[] args){
        int entero = 6;
        double decima = entero;

        double decimal1 = 5.7;
        int entero1 = (int)decimal1;

        String cadenaNumero = "12345";
        int numeroEntero = Integer.parseInt(cadenaNumero);
        double numeroDecimal = Double.parseDouble(cadenaNumero);
        //System.out.println("suma: "+ (cadenaNumero +1));
        //System.out.println("el entero: "+ (numeroEntero +1));
        //System.out.println("el decimal: "+ numeroDecimal);

        int entero2 = 11;
        String cadenaEntero = String.valueOf(entero2);
        String cadenaERntero1 = entero2 + "";

        System.out.println((cadenaEntero + 1) + "---" + cadenaERntero1);

        double decimal2 = 3.14;
        String cadenaDecimal = String.valueOf(decimal2);
        String cadenaDecimal1 = decimal2 + "";

        System.out.println(cadenaDecimal + "---" + cadenaDecimal1);
    }
}
