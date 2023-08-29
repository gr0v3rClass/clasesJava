import java.time.LocalDate;

public interface EsAlimento {
    public void setCaducidad(LocalDate fechacaducida);
    public LocalDate getCaducidad();
    public int getCalorias();
}
