import java.util.HashMap;

public class GestorEstudiants {
    HashMap<String, Estudiant> estudiants = new HashMap<>();

    void afegirEstudiants (Estudiant estudiant) {
        if (estudiants.containsKey(estudiant.getId())) {
            throw new IllegalArgumentException("L'estudiant ja existeix");
        }
        estudiants.put(estudiant.getId(), estudiant);
    }

    Estudiant getEstudiant(String id) {
        return estudiants.get(id);
    }

    void esborrarEstudiant(String id) {
        estudiants.remove(id);
    }

    void llistarEstudiants() {
        for (Estudiant estudiant : estudiants.values()) {
            System.out.println(estudiant);
        }
    }
}
