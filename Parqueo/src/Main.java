import java.util.Scanner;

public class Main {

    static Parque parque = new Parque("centro",10);
    static int opcion;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            menu();
            acciones();
        }while (opcion!=4);
    }

    public static void acciones(){
        switch (opcion){
            case 1: entradaCoche();
            case 2: salidaCoche();
            case 3: System.out.println(parque+"\n\n");
            case 4: System.out.println("Fin del programa");
            default: System.out.println("Error en las opciones");
        }
    }

    public static void entradaCoche(){
        boolean correcto = false;
        try {
            System.out.println("introduzca una matricula");
            String matricula = scanner.nextLine();
            System.out.println("Introduzca una plaza");
            int plaza = Integer.parseInt(scanner.nextLine());
            parque.entrada(matricula,plaza);
            correcto = true;
        }catch (parqueoException pex){
            System.out.println("Error "+ pex.getMensaje());
            System.out.println("No se realizo la entrada del coche con matricula "+ pex.getMensaje()+"en el parqueo");
        }catch (NumberFormatException nex){
            System.out.println("formato de numero incorrecto");
        }catch (Exception ex){
            System.out.println("Error desconocido");
        }finally {
            if (!correcto) {
                System.out.println("Se produjo un error");
            }
        }
    }

    public static void salidaCoche(){
        boolean correcto = false;
        try {
            System.out.println("introduzca la matricula: ");
            String matricula = scanner.nextLine();

            int plaza = parque.salida(matricula);
            System.out.println("El coche "+ matricula +" salio de la plaza "+plaza+ "\n\n");
            System.out.println("Plazas totales: "+ parque.getPalzasTotales()+"\n");
            System.out.println("Plazas ocupada "+ parque.getPlazasOcupadas()+"\n");
            System.out.println("Plazas Libres: "+ parque.getPlazasLibres()+"\n\n");
            correcto = true;
        }catch (parqueoException pex){
            System.out.println("Error "+pex.getMensaje());
            System.out.println("No se realizo la salida del coche con matricula "+ pex.getMatricula()+ "del parqueo");
        }catch (Exception e){
            System.out.println("Error desconocido..");
        }finally {
            if(!correcto) System.out.println("Se produjo un error");
        }
    }

    public static void menu(){
        System.out.println("1) entrada de coche\n2) salida de coche\n3) mostrar parqueo\n4)Salir del parquei");

        try {
            opcion = Integer.parseInt(scanner.nextLine());
        }catch (Exception e){
            opcion = 0;
        }
    }
}