import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Detergente det1 = new Detergente("omo",2.5);
        det1.setVolumen(33);
        det1.setDescuento(1);
        det1.setTipoEnvase("bolsa");

        System.out.println(det1);

        Vino vino1 = new Vino("campos de solana","tinto",12,20);
        vino1.setVolumen(300);
        vino1.setTipoEnvase("botella de cristal");
        vino1.setCaducidad(LocalDate.of(2023,8,29));
        vino1.setDescuento(5);

        System.out.println(vino1);

        Cereales cer1 = new Cereales("cereal patito", "trigo", 10);
        cer1.setCaducidad(LocalDate.of(2023,8,31));
        System.out.println("Calorias: "+cer1.getCalorias());
        System.out.println(cer1);

        ArrayList<EsAlimento> list = new ArrayList<>();
        list.add(vino1);
        list.add(cer1);

        int totalcalorias = 0;
        for (EsAlimento alimento:list) {
            totalcalorias += alimento.getCalorias();
        }
        System.out.println("total calorias..."+ totalcalorias);
    }
}