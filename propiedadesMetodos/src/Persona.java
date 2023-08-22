public class Persona {
    public String nombrePersona;
    private int edadPersona;

    public Persona(){

    }
    public Persona(String nombre, int edad){
        nombrePersona=nombre;
        edadPersona = edad;
    }

    public Persona(String nombre){
        nombrePersona = nombre;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public int getEdadPersona() {
        return edadPersona;
    }

    public void setEdadPersona(int edadPersona) {
        this.edadPersona = edadPersona;
    }

    public int obtenerEdad(){
        return edadPersona;
    }

    public void establecerEdad(int edad){
        if (edad >= 0) {
            int numero = this.sumaedad();
            edadPersona = edad + numero;
        }
    }

    public void imprimirDatos(){
        System.out.println("Nombre: "+nombrePersona);
        System.out.println("Edad: "+edadPersona);
    }

    private int sumaedad(){
        return 2;
    }
}
