package model;

import static llibreria.Llibreria.randomInt;

/**
 * Classe Model que gestiona les dades del joc.
 */
public class Model {
    public static char[][] taulerDades;
    public static char[][] taulerJugador;
    public static int tresorFila;
    public static int tresorColumna;

    /**
     * Reinicia els taulers i col·loca trampes i tresor.
     */
    public static void reiniciarTaulers() {
        taulerDades = new char[10][10];
        taulerJugador = new char[10][10];

        // Inicialitzar taulers
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                taulerDades[i][j] = '·';
                taulerJugador[i][j] = '·';
            }
        }

        // Posar trampes
        for (int i = 0; i < 10; i++) {
            int fila = randomInt(0, 9);
            int columna = randomInt(0, 9);
            taulerDades[fila][columna] = 'T';
        }

        // Posar tresor
        tresorFila = randomInt(0, 9);
        tresorColumna = randomInt(0, 9);
        taulerDades[tresorFila][tresorColumna] = 'X';
    }
}