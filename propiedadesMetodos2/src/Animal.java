public class Animal {
    public String nombreAnimal;
    private int edadAnimal;
    protected  double pesoAnimal;
    int numeroPatasAnimal;

    public Animal(String nombreAnimal, int edadAnimal, double pesoAnimal, int numeroPatasAnimal) {
        this.nombreAnimal = nombreAnimal;
        this.edadAnimal = edadAnimal;
        this.pesoAnimal = pesoAnimal;
        this.numeroPatasAnimal = numeroPatasAnimal;
    }

    public  int obtenrEdad(){
        return edadAnimal;
    }

    public void hacerSonidoAnimal(){
        System.out.println("Sonido de animal..");
    }

    protected void jugarConAnima(){
        System.out.println(
                "jugando con el animal"
        );
    }

    private void verEdad(){
        if (edadAnimal >= 0) {
            System.out.println("es mayor");
        }
    }
}
