import java.util.HashMap;

public class Diccionario {
    private HashMap<String, String> diccionario;

    public Diccionario() {
        diccionario = new HashMap<>();
    }

    public void nuevaPalabra(String palabraEsp, String palabraIng){
        diccionario.put(palabraEsp,palabraIng);
    }

    public String traducir(String palabraEsp){
        return diccionario.get(palabraEsp);
    }

    public String palabrasAleatorias(){
        int numPal = diccionario.size();
        int numAx = (int)(Math.random()*numPal);

        String palEsp = (String) diccionario.keySet().toArray()[numAx];

        return palEsp;
    }

    public String primeraLetraTraduccion(String palEsp){
        String palIng = diccionario.get(palEsp);
        return palIng.trim().substring(0,1).toUpperCase();
    }
}
