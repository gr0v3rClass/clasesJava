import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();
        Map<Integer, String> linkHashMap = new LinkedHashMap<>();
        Pelicula[] peliculas = {new Pelicula("Pulp Fiction","drama","carlos molina",190.0,1978),
        new Pelicula("cards","infantil","fransisco Robledo",150.50,2000),
        new Pelicula(),
        new Pelicula("rambo","rambo"),
        new Pelicula("0007","accion","pablo marmol",200.02,2020)};

        Serie[] series = {new Serie("malcom","comedia","ana fernadez", 2000.23,7),
        new Serie("the 100","fixion","raul salas", 3000.4,11),
        new Serie()};

        peliculas[0].marcarVisto();
        peliculas[1].marcarVisto();
        peliculas[4].marcarVisto();

        series[0].marcarVisto();
        series[2].marcarVisto();

        System.out.println("Las peliculas vistas son: ");

        int contarPeliculas = 1;

        for (Pelicula pelicula: peliculas){
            if (pelicula.esVisto()) {
                System.out.println(contarPeliculas+". "+pelicula.getDuracion()+" minutos. de"+pelicula.getTitulo());
                contarPeliculas += 1;
            }
        }

        if (contarPeliculas == 1) {
            System.out.println("No se ha visto ninguna pelicula");
        }

        System.out.println();

        System.out.println("Las series visatas son");

        int contSeries= 1;
        for (Serie serie: series){
            if (serie.esVisto()) {
                System.out.println(contSeries+". "+serie.getDuracion()+" minutos. de "+serie.getTitulo());
                contSeries += 1;
            }
        }

        if (contSeries == 1){
            System.out.println("No se ha visto ninguna serie...");
        }

        System.out.println();

        System.out.println("la serie Con mas tiempo");
        int tiempoSerie = 0;
        Serie serieMNasLarga = null;
        for (Serie serie:series){
            int numtiempo = serie.getNumTemporada();
            if (tiempoSerie < numtiempo) {
                serieMNasLarga = serie;
                tiempoSerie = numtiempo;
            }
        }

        System.out.println("La serie mas larga es: "+ serieMNasLarga);

        System.out.println();

        System.out.println("La Pelicula mas reciente es: ");

        int auxAño = 0;
        Pelicula peliculaMasAntigua = null;
        for (Pelicula pelicula: peliculas) {
            int numAño = pelicula.getAño();
            if (auxAño < numAño) {
                peliculaMasAntigua = pelicula;
                auxAño = numAño;
            }
        }

        System.out.println("La pelicula es:" + peliculaMasAntigua);


    }
}