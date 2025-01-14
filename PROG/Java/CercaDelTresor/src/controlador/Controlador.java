package controlador;

import model.Model;
import vista.Vista;

import java.util.InputMismatchException;

import static llibreria.Llibreria.calcularDistancia;
import static llibreria.Llibreria.charToInt;
import static vista.Vista.menuPrincipal;

/**
 * Classe Controlador que gestiona la lògica del joc.
 */
public class Controlador {
    /**
     * Entra al menú principal del joc.
     */
    public static void joc() {
        boolean inici = menuPrincipal();
        if (inici) {
            iniciarJoc();
        } else {
            Vista.mostrarMissatge("Sortint...");
        }
    }

    /**
     * Inicia el joc.
     */
    public static void iniciarJoc() {
        Model.reiniciarTaulers();
        boolean jocAcabat = false;
        int intents = 0;

        while (!jocAcabat) {
            Vista.mostrarTauler(Model.taulerJugador);
            String coordenades = Vista.demanarCoordenades();

            // Try-catch amb excepcions si les entrades no son correctes.
            try {
                // Regex per verificar entrada de coordenades.
                if (coordenades.matches("[A-Ja-j][0-9]")) {
                    coordenades = coordenades.toUpperCase().trim();
                } else {
                    throw new InputMismatchException("Format incorrecte");
                }

                int fila = charToInt(coordenades.charAt(1));
                int columna = charToInt(coordenades.charAt(0));

                if (fila < 0 || fila >= 10 || columna < 0 || columna >= 10) {
                    throw new InputMismatchException("Coordenades fora de rang");
                }

                intents++;
                char resultat = Model.taulerDades[fila][columna];

                if (resultat == 'X') {
                    Model.taulerJugador[fila][columna] = 'X';
                    Vista.mostrarMissatge("Molt bé, has trobat el tresor en " + intents + " intents.");
                    Vista.mostrarTauler(Model.taulerJugador);
                    jocAcabat = true;
                } else if (resultat == 'T') {
                    Model.taulerJugador[fila][columna] = 'T';
                    Vista.mostrarMissatge("Has caigut en una trampa i has mort.");
                    Vista.mostrarTauler(Model.taulerJugador);
                    jocAcabat = true;
                } else {
                    double distancia = calcularDistancia(fila, columna, Model.tresorFila, Model.tresorColumna);
                    if (distancia <= 1.5) {
                        Vista.mostrarMissatge("T'estàs cremant!!!");
                    } else if (distancia < 3) {
                        Vista.mostrarMissatge("Molt calent!");
                    } else if (distancia < 5) {
                        Vista.mostrarMissatge("T'estàs acostant...");
                    } else if (distancia < 8) {
                        Vista.mostrarMissatge("Fred, fred...");
                    } else {
                        Vista.mostrarMissatge("Si t'allunyes més et congelaràs.");
                    }
                    Model.taulerJugador[fila][columna] = '*';
                }
            } catch (InputMismatchException err) {
                Vista.mostrarMissatge("Error: " + err);
            }
            // Condicional per mostrar el menú principal si el joc ha acabat.
            if (jocAcabat) {
                joc();
            }
        }
    }
}