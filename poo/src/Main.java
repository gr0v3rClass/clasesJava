public class Main {
    public static void main(String[] args) {

        vehiculo vehiculo = new vehiculo("ford","ford ultimate", "rojo", 280);

        vehiculo.acelerar(120);
        vehiculo.frenar(20);
        vehiculo.mostrarInformacion();
    }
}