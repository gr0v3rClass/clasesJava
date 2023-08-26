public class Serie extends Netflix{
    private int numTemporada = 1;

    public Serie() {
        super();
    }

    public Serie(String titulo, String creador) {
        super(titulo, creador);
    }

    public Serie(String titulo, String genero, String creador, double duracion, int numTemporada) {
        super(titulo, genero, creador, duracion);
        this.numTemporada = numTemporada;
    }

    public int getNumTemporada(){
        return numTemporada;
    }

    public void setNumTemporada( int numeroTemporada){
        this.numTemporada = numeroTemporada;
    }
}
