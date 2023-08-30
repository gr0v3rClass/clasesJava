import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Vino implements EsLiquido, EsAlimento, ConDescuento{
    private String marca;
    private String tipoVino;
    private String tipoEnvase;
    private double grados;
    private double precio;
    private double volumen;
    private double descuento;
    private LocalDate caducidad;

    public Vino(String marca, String tipoVino, double grados, double precio) {
        this.marca = marca;
        this.tipoVino = tipoVino;
        this.grados = grados;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoVino() {
        return tipoVino;
    }

    public void setTipoVino(String tipoVino) {
        this.tipoVino = tipoVino;
    }

    public double getGrados() {
        return grados;
    }

    public void setGrados(double grados) {
        this.grados = grados;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String getTipoEnvase() {
        return tipoEnvase;
    }

    @Override
    public int getCalorias(){
        return (int)(grados*10);
    }

    @Override
    public void setTipoEnvase(String tipoEnvase) {
        this.tipoEnvase = tipoEnvase;
    }

    @Override
    public double getVolumen() {
        return volumen;
    }

    @Override
    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    @Override
    public double getDescuento() {
        return descuento;
    }

    @Override
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public LocalDate getCaducidad() {
        return caducidad;
    }

    @Override
    public void setCaducidad(LocalDate caducidad) {
        this.caducidad = caducidad;
    }

    @Override
    public double getPrecioDescuento(){
        return precio - (precio * (descuento/100.0));
    }

    @Override
    public String toString(){
        return "vino { "+ "marca = "+marca + ", precio= "+ precio+ ", tipoVino= "+ tipoVino+
                ", grados= "+grados+"\nvolumen = "+volumen+", tipoEnvase= "+ tipoEnvase+
                ", caducidad= "+ caducidad.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+
                " \ndescunto= "+descuento+ ", preciocon descuento = "+ getPrecioDescuento()+
                ", calorias = "+ getCalorias()+" }";
    }
}
