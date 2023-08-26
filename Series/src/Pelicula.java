public class Pelicula extends Netflix {

    private int año;

    public Pelicula(){
        super();
    }

    public Pelicula(String titulo, String creador){
        super(titulo,creador);
    }

    public Pelicula(String titulo, String genero, String creador, double duracion, int año) {
        super(titulo, genero, creador, duracion);
        this.año = año;
    }

    public int getAño(){
        return año;
    }

    public void setAño(int año){
        this.año = año;
    }

    @Override
    public java.lang.String toString() {
        String informacionNetflex = super.toString();
        return informacionNetflex+ "\n"+
                "Año: "+this.año;
    }
}
