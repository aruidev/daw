import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GestorEstudiantsTest {
    public static void main(String[] args) {
        GestorEstudiants gestor = new GestorEstudiants();
    }

    public static void menu() {
        System.out.println("1) Afegir estudiant");
        System.out.println("2) Esborrar estudiant");
        System.out.println("3) Llistar estudiants");
        System.out.println("4) Buscar estudiant");
        System.out.println("0) Sortir");
    }

    public static void afegirEstudiant(GestorEstudiants gestor) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introdueix l'id de l'estudiant:");
        String id = scan.nextLine();
        System.out.println("Introdueix el nom de l'estudiant:");
        String nom = scan.nextLine();
        System.out.println("Introdueix l'edat de l'estudiant:");
        int edat = scan.nextInt();
        scan.nextLine();
        Estudiant estudiant = new Estudiant(id, nom, edat);
        gestor.afegirEstudiants(estudiant);
    }

    public static void esborrarEstudiant(GestorEstudiants gestor) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introdueix l'id de l'estudiant:");
        String id = scan.nextLine();
        gestor.esborrarEstudiant(id);
    }

    public static void llistarEstudiants(GestorEstudiants gestor) {
        gestor.llistarEstudiants();
    }

    public static void buscarEstudiant(GestorEstudiants gestor) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introdueix l'id de l'estudiant:");
        String id = scan.nextLine();
        Estudiant estudiant = gestor.getEstudiant(id);
        System.out.println(estudiant);
    }

    Map<String, Estudiant> estudiants = new HashMap<>();



}