public class Main {
    public static void main(String[] args) {

        Semaforo semaforo1, semaforo2;

        semaforo1 = new Semaforo();
        semaforo2 = new Semaforo(ColorSemaforo.VERDE, false);

        semaforo1.setColor(ColorSemaforo.AMARILLO);

        System.out.println("El semaforo 1 esta con color: "+ semaforo1.getColor().toString());
        System.out.println("El semaforo 2 esta con color: "+ semaforo2.getColor().toString());
    }
}