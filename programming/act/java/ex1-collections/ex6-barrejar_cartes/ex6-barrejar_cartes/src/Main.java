import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        /* Posa en un ArrayList totes les cartes d'una baralla de poker.
        Ves traient cartes aleatòriament fins que no en quedi cap i afegeix-les a una cua.
        Ves traient i mostrant les cartes de la cua una a una. */

        ArrayList<String> cartes = new ArrayList<String>();

        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                String pal = "";
                switch (i) {
                    case 0:
                        pal = "♠️";
                        break;
                    case 1:
                        pal = "♥️";
                        break;
                    case 2:
                        pal = "♦️";
                        break;
                    case 3:
                        pal = "♣️";
                        break;
                }
                cartes.add(j + " de " + pal);
            }
        }

        Queue<String> cua = new LinkedList<String>();

        while (!cartes.isEmpty()) {
            int random = (int) (Math.random() * cartes.size());
            cua.add(cartes.remove(random));
        }

        for (String carta : cua) {
            System.out.println(carta);
        }
    }
}