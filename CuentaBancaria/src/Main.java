public class Main {
    public static void main(String[] args) {

        //crear a la persona

        Persona persona = new Persona("Juan",30);

        //instancia de cuenta bancaria
        CuentaBancaria cuenta = new CuentaBancaria(persona);

        //realizar las operaciones
        cuenta.depositar(500);
        cuenta.retirar(200);
    }
}