public class Perro implements Animal{
    @Override
    public void hacerSonido(){
        System.out.println("El perro hace: ¡Guau!");
    }

    @Override
    public void moverse(){
        System.out.println("El perro corre por el jardin...");
    }
}
