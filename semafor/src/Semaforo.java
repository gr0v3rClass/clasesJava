
enum ColorSemaforo{ROJO, AMARILLO, VERDE};
public class Semaforo {
    ColorSemaforo color;
    boolean parpadeando;

    public Semaforo() {
        this.color = ColorSemaforo.ROJO;
        this.parpadeando = false;
    }

    public Semaforo(ColorSemaforo color, boolean parpadeando) {
        this.color = color;
        this.parpadeando = parpadeando;
    }

    public ColorSemaforo getColor() {
        return color;
    }

    public void setColor(ColorSemaforo color) {
        this.color = color;
    }

    public boolean isParpadeando() {
        return parpadeando;
    }

    public void setParpadeando(boolean parpadeando) {
        this.parpadeando = parpadeando;
    }
}
