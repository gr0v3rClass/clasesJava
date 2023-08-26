public class parqueoException extends Exception{
    private final String mensaje;
    private final String matricula;

    public parqueoException(String mensaje, String matricula){
        this.mensaje = mensaje;
        this.matricula = matricula;
    }

    public String getMensaje(){
        return mensaje;
    }

    public String getMatricula(){
        return matricula;
    }
}
