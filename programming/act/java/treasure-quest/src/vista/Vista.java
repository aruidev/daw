package vista;

import java.util.Scanner;

/**
 * Classe Vista que gestiona la interacció amb l'usuari.
 */
public class Vista {
    private static final Scanner scan = new Scanner(System.in);

    /**
     * Menú principal que permet entrar al joc o sortir.
     * @return boolean. True si vol jugar, false si vol sortir.
     */
    public static boolean menuPrincipal() {
        System.out.println("Cerca del tresor!");
        System.out.println("1. Jugar");
        System.out.println("2. Sortir");
        System.out.print("Escull una opció: ");
        String r = scan.nextLine();
        return r.equals("1");
    }

    /**
     * Mostra el tauler del jugador.
     * @param tauler char[][]. Tauler del jugador.
     */
    public static void mostrarTauler(char[][] tauler) {
        System.out.println("  A B C D E F G H I J");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 10; j++) {
                System.out.print(tauler[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Demana les coordenades al jugador.
     * @return String. Coordenades introduïdes pel jugador.
     */
    public static String demanarCoordenades() {
        System.out.print("Introdueix les coordenades (per exemple C6): ");
        return scan.nextLine();
    }

    /**
     * Mostra un missatge al jugador.
     * @param missatge String. Missatge a mostrar.
     */
    public static void mostrarMissatge(String missatge) {
        System.out.println(missatge);
    }
}