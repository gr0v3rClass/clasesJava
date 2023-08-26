public class Circulo extends Figura{
    double radio;
    Integer a;

    Circulo(double radio){
        this.radio = radio;
    }
    @Override
    double calcularArea(){
        return Math.PI * radio * radio;
    }
}
