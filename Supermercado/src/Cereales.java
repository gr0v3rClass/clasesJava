import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cereales implements EsAlimento{
    private String marca;
    private String tipocereal;
    private double precio;
    private LocalDate caducidad;

    public Cereales(String marca, String tipocereal, double precio) {
        this.marca = marca;
        this.tipocereal = tipocereal;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipocereal() {
        return tipocereal;
    }

    public void setTipocereal(String tipocereal) {
        this.tipocereal = tipocereal;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public void setCaducidad(LocalDate fechVencimiento){
        caducidad = fechVencimiento;
    }

    @Override
    public LocalDate getCaducidad(){
        return caducidad;
    }

    @Override
    public int getCalorias(){
        if (tipocereal.equalsIgnoreCase("espalta")) {
            return 5;
        } else if (tipocereal.equalsIgnoreCase("maiz")) {
            return 8;
        } else if (tipocereal.equalsIgnoreCase("trigo")) {
            return 12;
        }else {
            return 15;
        }
    }

    public String toString(){
        return "Cereales{ "+ "marca ="+marca+ " , tipoCereal = "+ tipocereal+ " , precio = "+precio+
                " , caducidad "+caducidad.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+
                " , calorias = " + getCalorias() + "}";
    }

}
