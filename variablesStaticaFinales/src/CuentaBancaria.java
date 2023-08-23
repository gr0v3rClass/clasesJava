public class CuentaBancaria {
    private static int contadorCuenta = 0;
    public CuentaBancaria(){
        contadorCuenta++;
    }

    public static int getTotalCuenta(){
        return contadorCuenta;
    }
}
