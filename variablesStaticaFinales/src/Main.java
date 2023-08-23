import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria();
        CuentaBancaria cuenta2 = new CuentaBancaria();

        int totalCuenta = CuentaBancaria.getTotalCuenta();
        System.out.println("Total de cuenta creada: " +totalCuenta);

        Conversiones convertir = new Conversiones();
        double pulgadas = 5.0;
        double centimetros = convertir.convertirPulgadasACentrimetros(pulgadas);
        System.out.println(pulgadas+" pulgadas son equivalentes a "+centimetros +" centimetros");

        Contador.metodoContador();


        String nom1 = "juan";
        String nom2 = "juan";

        if (nom1 == new String("juan") ) {
            System.out.println("son iguales");
        }

        double[] data = {10.5,8.2, 5.7, 9.1,6.4};

        double promedio = Promedi.calcularPromedio(data);
        System.out.println("El promedio es: "+ promedio);

        CaseAnidad.ClaseHija claseanidad = new CaseAnidad.ClaseHija();

        claseanidad.run();

        ArrayList<CuentaBancaria> arrayCuentaBancaria = new ArrayList<CuentaBancaria>();
        arrayCuentaBancaria.set(1, cuenta1);
        arrayCuentaBancaria.set(2, cuenta2);


    }
}