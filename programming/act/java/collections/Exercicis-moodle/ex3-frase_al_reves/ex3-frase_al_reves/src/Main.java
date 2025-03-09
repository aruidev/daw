import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* 3 - La frase al revés
        Utilitzant una pila, fes un programa que demani paraules a l'usuari fins que aquest introdueixi un punt.

        Després, escriu les paraules introduïdes per l'usuari en ordre invers. */

        // Creem una pila
        Deque<String> pila = new LinkedList<>();

        // Demanem paraules a l'usuari
        System.out.println("Introdueix paraules. Per acabar, introdueix un punt.");

        String paraula = "";

        Scanner scan = new Scanner(System.in);

        // Llegim les paraules de l'usuari
        while (!paraula.equals(".")) {
            paraula = scan.next();
            if (!paraula.equals(".")) {
                pila.push(paraula);
            }
        }

        // Mostrem les paraules en ordre invers
        System.out.println("Les paraules introduïdes en ordre invers són:");

        while (!pila.isEmpty()) {
            System.out.print(pila.pop() + " ");
        }
    }
}