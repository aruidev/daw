import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        /* Un supermercat té tres caixes (A, B i C).

        Els clients que van a pagar sempre es posen en la que hi ha menys cua, però no totes les cues avancen igual de ràpid: algunes caixeres són més lentes, alguns clients no troben la targeta per pagar...

        Fes un programa que simuli el funcionament de les cues:

        Un client va pagar (s'ha de posar a la cua més curta).
        El client d'una de les cues ja ha pagat.
        Mostra quants clients hi ha en cada cua. */

        ArrayList<String> clients = new ArrayList<String>();
        Queue<String> caixaA = new ArrayDeque<String>();
        Queue<String> caixaB = new ArrayDeque<String>();
        Queue<String> caixaC = new ArrayDeque<String>();

        // Afegim clients llestos per pagar
        for (int i = 0; i < 50; ++i) {
            clients.add("client " + i);
        }

        // Afegim clients a cada caixa
        for (int i = 0; i < 20; ++i) {
            addClientToShortestQueue(clients.get(i), caixaA, caixaB, caixaC);
        }

        // Simulem diferents velocitats de pagament
        // Les cues s'han fet més curtes aleatòriament, simulant els clients que s'han anat.
        for (int i = 0; i < 10; ++i) {
            randomPaid(caixaA, caixaB, caixaC);
        }

        // Tornem a afegir clients a cada caixa segons els criteris
        for (int i = 20; i < 40; ++i) {
            addClientToShortestQueue(clients.get(i), caixaA, caixaB, caixaC);
        }

        // Mostrem quants clients hi ha a cada caixa
        showQueueClients(caixaA, caixaB, caixaC);
    }

    /**
     * Afegim el client a la cua més curta.
     * @param caixaA
     * @param caixaB
     * @param caixaC
     */
    public static void addClientToShortestQueue(String client, Queue<String> caixaA, Queue<String> caixaB, Queue<String> caixaC) {
        if (caixaA.size() <= caixaB.size() && caixaA.size() <= caixaC.size()) {
            caixaA.add(client);
        } else if (caixaB.size() <= caixaA.size() && caixaB.size() <= caixaC.size()) {
            caixaB.add(client);
        } else {
            caixaC.add(client);
        }
    }

    /**
     * Treiem el client de la llista que ja ha pagat, hem de passar la cua del client com a paràmetre.
     * @param queue
     */
    public static void clientPaid(Queue<String> queue) {
        queue.poll();
    }

    public static void randomPaid(Queue<String> caixaA, Queue<String> caixaB, Queue<String> caixaC) {
        int random = (int) (Math.random() * 3);
        if (random == 0) {
            clientPaid(caixaA);
        }
        if (random == 1) {
            clientPaid(caixaB);
        }
        if (random == 2) {
            clientPaid(caixaC);
        }
    }

    /**
     * Mostrar clients de cada caixa
     * @param caixaA
     * @param caixaB
     * @param caixaC
     */
    public static void showQueueClients(Queue<String> caixaA, Queue<String> caixaB, Queue<String> caixaC) {
        System.out.println("\nCaixa A:");
        for (String client : caixaA) {
            System.out.println(client);
        }
        System.out.println("\nCaixa B:");
        for (String client : caixaB) {
            System.out.println(client);
        }
        System.out.println("\nCaixa C:");
        for (String client : caixaC) {
            System.out.println(client);
        }
    }
}