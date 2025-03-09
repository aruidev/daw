import java.util.Objects;

public class Estudiant implements Comparable<Estudiant> {
    String id;
    String nom;
    int edat;

    public Estudiant(String id, String nom, int edat) {
        this.id = id;
        this.nom = nom;
        this.edat = edat;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null) {
            throw new IllegalArgumentException("L'id no pot ser null");
        }
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if (nom == null) {
            throw new IllegalArgumentException("El nom no pot ser null");
        }
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        if (edat < 0) {
            throw new IllegalArgumentException("L'edat no pot ser negativa");
        }
        this.edat = edat;
    }

    @Override
    public String toString() {
        return "Estudiant{" +
                "id='" + id + '\'' +
                ", nom='" + nom + '\'' +
                ", edat=" + edat +
                '}';
    }

    @Override
    public int compareTo(Estudiant estudiant) {
        int idComparison = this.id.compareTo(estudiant.id);
        if (idComparison == 0) {
            return this.nom.compareTo(estudiant.nom);
        }
        return idComparison;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Estudiant estudiant = (Estudiant) o;
        return edat == estudiant.edat && Objects.equals(id, estudiant.id) && Objects.equals(nom, estudiant.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, edat);
    }
}
