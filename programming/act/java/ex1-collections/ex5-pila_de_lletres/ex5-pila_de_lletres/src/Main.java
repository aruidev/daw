import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Fes un programa que demani repetidament una lletra a l'usuari.

        Si escriu qualsevol caràcter que no sigui - ni *, l'ha d'afegir a la pila.
        Si escriu -, ha de treure el primer caràcter de la pila.
        Si escriu *, ha de treure i mostrar un a un tots els caràcters de la pila. */

        // Crear una pila
        // while (next == '-') treure primer caracter
        // while (next == '*') mostrar tot

        Scanner scan = new Scanner(System.in);
        Deque<Character> pila = new ArrayDeque<Character>();

        System.out.println("Introdueix una lletra a la pila: ");
        System.out.println("('-' per treure el primer caràcter, '*' per sortir i mostrar tot)");

        while (true) {
            // Llegir la lletra dins del bucle
            char lletra = scan.next().charAt(0);

            if (lletra == '-') {
                // Treure el primer caràcter de la pila
                pila.pop();
            } else if (lletra == '*') {
                while (!pila.isEmpty()) {
                    // Treure i mostrar tot fins que la pila estigui buida
                    System.out.println(pila.pop());
                }
                break;
            } else {
                // Afegir a la pila
                pila.push(lletra);
            }
        }
    }
}