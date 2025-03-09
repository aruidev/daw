import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Llapis> caixa1 = new ArrayList<>();
        List<Llapis> caixa2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            caixa1.add(new Llapis((int) Math.floor(Math.random() * 7))); // ex3
            caixa2.add(new Llapis((int) Math.floor(Math.random() * 7), (float) Math.floor(Math.random() * 3)));// ex4
        }

        System.out.println("Caixa 1"); //exer5
        for (Llapis llapis : caixa1) System.out.println(llapis);
        System.out.println("Caixa 2");
        caixa2.forEach(System.out::println);

        Collections.sort(caixa1); // exer6
        System.out.println("Caixa 1 per color");
        caixa1.forEach(System.out::println);

        // exercici7
        Collections.sort(caixa2, new Comparator<Llapis>() {
            @Override
            public int compare(Llapis o1, Llapis o2) {
                //opcio Classe Anonima
                return Float.compare(o2.getGruix(), o1.getGruix());
            }
        });

        System.out.println("Caixa 1 per gruix");
        caixa2.forEach(System.out::println);

        List<Llapis> caixa3 = new LinkedList<>(caixa2); //exer8
        caixa3.addAll(caixa1); // Afegir llapisos de caixa1 a caixa3

        System.out.println("Caixa 3 (linkedList):" + caixa3.size());
        caixa3.forEach(System.out::println);

        Set<Llapis> caixa4 = new HashSet<>(caixa3); //exer10
        System.out.println("Caixa 4 (sense repetits):" + caixa4.size());
        caixa4.forEach(System.out::println);

        // exercici12
        Map<Integer, String> map_colors = new HashMap<>();
        map_colors.put(0, "Negre");
        map_colors.put(1, "Vermell");
        map_colors.put(2, "Groc");
        map_colors.put(3, "Verd");
        map_colors.put(4, "Verd");
        map_colors.put(3, "Blanc");
        System.out.println("numero 12: " + map_colors.values());

    }
}