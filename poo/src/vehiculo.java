public class vehiculo {
    public String marca;
    public String modelo;
    public String color;
    public int velocidadMaxima;
    public int velocidadActual;

    /**
     * constructos de la calase vehiculo
     * @param marca String
     * @param modelo Strint
     * @param color String
     * @param velocidadMaxima int
     */
    public vehiculo (String marca, String modelo, String color, int velocidadMaxima){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = 0;
    }

    public void acelerar (int incremento){
        velocidadActual += incremento;
        if (velocidadActual > velocidadMaxima) {
            velocidadActual = velocidadMaxima;
        }
    }

    public void frenar(int decremento){
        velocidadActual -= decremento;
        if (velocidadActual < 0) {
            velocidadActual = 0;
        }
    }

    public void mostrarInformacion(){
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Color: "+color);
        System.out.println("velocidad Maxima: "+velocidadMaxima);
        System.out.println("velocidad Actual: "+velocidadActual);
    }
}
