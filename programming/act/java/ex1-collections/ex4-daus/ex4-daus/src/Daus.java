import java.util.*;

public class Daus {
    public static void main(String[] args) {
        int d1,d2, numTirades;
        Map<Integer, Integer> llistaTirades = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantes vegades vols llançar els daus? ");
        numTirades = sc.nextInt();

        System.out.println("Llançament...");
        for(int i=0; i<numTirades; i++) {
            d1 = (int) (Math.random()*6) + 1;
            d2 = (int) (Math.random()*6) + 1;
            System.out.println("Dau 1: " + d1);
            System.out.println("Dau 2: " + d2);

            if (llistaTirades.containsKey(d1 + d2)) {
                llistaTirades.put(d1 + d2, llistaTirades.get(d1 + d2) + 1);
            } else {
                llistaTirades.put(d1 + d2, 1);
            }
        }


        for (Map.Entry<Integer, Integer> entry : llistaTirades.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}