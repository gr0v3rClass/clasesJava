public class Promedi {
    public static double calcularPromedio(double[] numeros){
        if(numeros.length==0){
            return 0.0;
        }
        double suma = 0.0;
        for (double num:numeros){
            suma+=num;
        }
        return suma / numeros.length;
    }
}
