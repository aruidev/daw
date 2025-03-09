import java.util.*;

public class Main {
    public static void main(String[] args) {
        /* Fes un programa que afegeixi els mateixos elements a una pila i a una cua.

                Mostra quin és el primer element de la pila i de la cua.

        Mostra els elements de la pila traient-los d'un en un.
        Mostra els elements de la cua traient-los d'un en un. */

        Deque<Integer> pila = new LinkedList<Integer>();
        Queue<Integer> cua = new LinkedList<Integer>();

        ArrayList<Integer> elements = new ArrayList<>();
        elements.add(1);
        elements.add(2);
        elements.add(3);
        elements.add(4);
        elements.add(5);

        for (Integer element : elements) {
            pila.push(element);
        }

        for (Integer element : elements) {
            cua.add(element);
        }

        System.out.println("Primer element de la pila: " + pila.peek());
        System.out.println("Primer element de la cua: " + cua.peek());
        System.out.println();

        System.out.println("Últim element de la pila: " + pila.peekLast());

        Integer lastElement = null;
        for (Integer num : cua) {
            lastElement = num;
        }
        System.out.println("Últim element de la cua: " + lastElement);
        System.out.println();

        System.out.println("Elements de la pila:");
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }

        System.out.println("Elements de la cua:");
        while (!cua.isEmpty()) {
            System.out.println(cua.poll());
        }
    }
}