public class Main {
    public static void main(String[] args) {

        int dividendo = 30, divisor = 0, consinte;

        try {
            System.out.println("mensaje");
            consinte = dividendo / divisor;
            System.out.println("Resultad: "+consinte);
        }catch (Exception e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
}