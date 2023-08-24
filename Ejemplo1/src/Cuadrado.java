public class Cuadrado extends Forma{
    int base;
    int altura;

    Cuadrado(int base, int altura, double area){
        super(area);
        this.base = base;
        this.altura = altura;
    }
    @Override
    void dibujar(){
        System.out.println("Dibujar cuadrado");
    }
}
