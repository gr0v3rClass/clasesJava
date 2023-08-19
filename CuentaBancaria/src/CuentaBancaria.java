public class CuentaBancaria {
    public double saldo;
    public Persona titular;

    public CuentaBancaria(Persona titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar (double cantida){
        if (cantida > 0) {
            saldo += cantida;
            System.out.println("Deposito realizado. nuevo saldo: "+ saldo);
        }
    }

    public void retirar (double cantidad){
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Retiro realizado. Nuevo salo: "+saldo);
        }else {
            System.out.println("Saldo insuficinte para el retiro...");
        }
    }
}
