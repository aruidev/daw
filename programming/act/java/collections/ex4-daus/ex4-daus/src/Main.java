import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int d1,d2, numTirades;
        List<Integer> llistaTirades = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantes vegades vols llançar els daus? ");
        numTirades = sc.nextInt();

        System.out.println("Llançament...");
        for(int i=0; i<numTirades; i++) {
            d1 = (int) (Math.random()*6) + 1;
            d2 = (int) (Math.random()*6) + 1;
            llistaTirades.add(d1+d2);
        }

        for(int i=2; i<=12; i++) {
            System.out.printf(i + " -> %d%n", Collections.frequency(llistaTirades,i));
        }

        System.out.println("total:" + llistaTirades.size());
    }
}