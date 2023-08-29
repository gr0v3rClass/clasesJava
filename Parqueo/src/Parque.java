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

    public int salida(String matricula) throws parqueoException{

        if (!matriculas.contains(matricula)) throw new parqueoException("matricula no existente ",matricula);
        int plaza = matriculas.indexOf(matricula);
        matriculas.set(plaza, null);
        return plaza;
    }

    public int getPalzasTotales(){
        return matriculas.size();
    }

    public int getPlazasLibres(){
        return Collections.frequency(matriculas,null);
    }
    public int getPlazasOcupadas(){
        return getPalzasTotales() - getPlazasLibres();
    }

    @Override
    public String toString(){
        String cadena = "Parquieado "+ nombre + "\n";
        cadena+="----------------------------\n";

        for (int i = 0; i < matriculas.size(); i++) {
            cadena += "Plaza "+i+": ";
            cadena += (matriculas.get(i)==null)? " vacio ":matriculas.get(i);
            cadena += "\n";
        }
        cadena += "-----------------------\n";
        return cadena;
    }
}













