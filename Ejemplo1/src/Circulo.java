public class Circulo implements MetodosFormas{
    private  double radio;

    public Circulo(double radio){
        this.radio = radio;
    }
    @Override
    public double calcularArea(){
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro(){
        return  2*Math.PI*radio;
    }
    /*Circulo(double radio, double area){
        super(area);
        this.radio = radio;
    }
    @Override
    void dibujar(){
        System.out.println("Dibujar un circulo");
    }*/
}
