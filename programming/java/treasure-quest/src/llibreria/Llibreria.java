package llibreria;

/**
 * Classe Llibreria que conté funcions auxiliars.
 */
public class Llibreria {

    // Calcular distància al tresor:
    /**
     * Calcula la distància entre dos punts
     * @param f1 Coordenada horitzontal del primer punt
     * @param c1 Coordenada vertical del primer punt
     * @param f2 Coordenada horitzontal del segon punt
     * @param c2 Coordenada vertical del segon punt
     * @return Distància entre els dos punts
     */
    public static double calcularDistancia(int f1, int c1, int f2, int c2) {
        int distH = f2 - f1;
        int distV = c2 - c1;
        return Math.sqrt(distH * distH + distV * distV);
    }


    // Convertir lletra o dígit a valor numèric:
    /**
     * Retorna un número a partir d'una lletra entre A i Z o un dígit entre 0 i 9
     * Si no és una lletra ni un dígit, retorna el valor ASCII del caràcter
     * @param c Lletra o dígit
     * @return Valor entre 0 i 25 (si és una lletra) o entre 0 i 9 si és un dígit
     */
    public static int charToInt(char c) {
        c = Character.toUpperCase(c);
        if (c >= 'A' && c <= 'Z') return c - 'A';
        if (c >= '0' && c <= '9') return c - '0';
        return c;
    }

    /**
     * Genera un número enter aleatori entre dos valors
     * @param min int
     * @param max int
     * @return int
     */
    public static int randomInt(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
