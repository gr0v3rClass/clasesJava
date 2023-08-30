public class Detergente implements EsLiquido, ConDescuento{
    private String marca;
    private double precio;
    private double volumen;
    private String tipoEnvase;
    private double descuento;

    public Detergente(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public void setVolumen(double v){
        volumen = v;
    }

    @Override
    public double getVolumen(){
        return volumen;
    }

    @Override
    public String getTipoEnvase(){
        return tipoEnvase;
    }

    @Override
    public void setTipoEnvase(String envase){
        tipoEnvase = envase;
    }

    @Override
    public void setDescuento(double descuento){
        descuento = descuento;
    }

    @Override
    public double getDescuento(){
        return descuento;
    }

    @Override
    public double getPrecioDescuento(){
        return precio - (precio * (descuento/100.0));
    }

    @Override
    public  String toString(){
        return "Detergente { "+ "marca= "+ marca +", precio= "+ precio+
                ", volumen= "+ volumen + ", tipopEnvase = "+ tipoEnvase+
                ", descuento = "+ descuento + ", precio con descuento = "+ getPrecioDescuento()+" } ";
    }
}
