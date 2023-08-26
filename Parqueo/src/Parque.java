import java.util.ArrayList;
import java.util.Collections;

public class Parque {
    private final ArrayList<String> matriculas;
    private final String nombre;

    public Parque(String nombre, int plazas){
        this.nombre = nombre;
        matriculas = new ArrayList<>(Collections.nCopies(plazas, null));
    }
    public String getNombre(){
        return nombre;
    }

    public void entrada(String matricula, int plaza) throws parqueoException{
        if (plaza >= matriculas.size() || plaza < 0) {
            throw  new parqueoException("plaza inexistente",matricula);
        }
        if (matricula == null || matricula.length() < 4) {
            throw new parqueoException("matricula incorrecta", matricula);
        }
        if (matriculas.get(plaza) != null) {
            throw new parqueoException("plaza ocupada: ", matricula);
        }
        if (matriculas.contains(matricula)) {
            throw new parqueoException("Matricula duplicada", matricula);
        }

        matriculas.set(plaza, matricula);
    }

}













