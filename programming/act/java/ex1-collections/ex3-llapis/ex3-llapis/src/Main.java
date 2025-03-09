import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static final int maxCaixa = 10;
    public static void main(String[] args) {
        List<Llapis> caixa1 = new ArrayList<>();
        List<Llapis> caixa2 = new ArrayList<>();
    }

    public static int rand(double min, double max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void omplirCaixa(List<Llapis> caixa) {
        Llapis llapis = new Llapis(0, 0.0); // Crear un objeto Llapis para acceder a los métodos
        int minColor = llapis.getMinColor();
        int maxColor = llapis.getMaxColor();
        double minGruix = llapis.getMinGruix();
        double maxGruix = llapis.getMaxGruix();

        for (int i = 0; i < maxCaixa; i++) {
            caixa.add(new Llapis(rand(minColor, maxColor), rand(minGruix, maxGruix)));
        }
    }

    public static void mostrarCaixa(List<Llapis> caixa) {
        caixa.forEach(System.out::println);
    }

    public static void ordenarCaixa(List<Llapis> caixa) {
        Collections.sort(caixa);
        caixa.forEach(System.out::println);
    }

    public static void ordenarPerColor(List<Llapis> caixa) {
        Collections.sort(caixa, Llapis.compColor);
        caixa.forEach(System.out::println);
    }

    public static void ordenarPerGruix(List<Llapis> caixa) {
        Collections.sort(caixa, Llapis.compGruix);
        caixa.forEach(System.out::println);
    }
}