import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> arrayDeStrings = new ArrayList<>();

        arrayDeStrings.add("hola mundo ");
        arrayDeStrings.size();
        arrayDeStrings.get(0);
        arrayDeStrings.set(0,"mundo hola..");
        arrayDeStrings.remove(0);

        //Forma forma1 = new Cuadrado(1,2,5.0);
        //Forma forma2 = new Circulo(1,5.0);
        //forma1.dibujar();
        //forma2.dibujar();

        MetodosFormas forma1 = new Circulo(5.0);
        double area =  forma1.calcularArea();
        double perimetro = forma1.calcularPerimetro();

        System.out.println("area: "+ area+ " perimetro: "+ perimetro);
    }
}