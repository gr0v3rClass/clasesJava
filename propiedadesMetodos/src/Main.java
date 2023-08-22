public class Main {
    public static void main(String[] args) {

        Persona persona0 = new Persona();
        Persona persona1 = new Persona("juan",30);
        Persona persona2 = new Persona("ana");

        persona0.setNombrePersona("carlos");
        persona0.establecerEdad(25);

        persona0.imprimirDatos();
        persona1.imprimirDatos();
        persona2.imprimirDatos();






    }
}