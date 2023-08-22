import javax.swing.plaf.synth.SynthTextAreaUI;

public class Perro extends Animal{
    private String raza;
    public Perro(String nombreAnimal, int edadAnimal, double pesoAnimal, int numeroPatasAnimal) {
        super(nombreAnimal, edadAnimal, pesoAnimal, numeroPatasAnimal);
    }

    public Perro(String nombreAnimal, int edadAnimal, double pesoAnimal, int numeroPatasAnimal, String raza) {
        super(nombreAnimal, edadAnimal, pesoAnimal, numeroPatasAnimal);
        this.raza = raza;
    }

    public void ladrar(){
        jugarConAnima();
        //System.out.println(nombreAnimal+" esta ladrando...");
    }

    @Override
    protected void finalize() throws Throwable{
        try {
            System.out.println("el metodo finalizer() se esta ejecutando");
        }finally {
            super.finalize();
        }
    }


}
