Similar a un array pero pot creixer a mida que es van afegint elements.

```
import java.util.ArrayList;

public class EjemploArrayListCoches {
    public static void main(String[] args) {
        // Crear un ArrayList para almacenar nombres de coches
        ArrayList<String> coches = new ArrayList<>();

        // Agregar coches al ArrayList
        coches.add("BMW");
        coches.add("Mercedes");
        coches.add("Toyota");
        coches.add("Ford");

        // Imprimir todos los coches
        System.out.println("Lista de coches:");
        for (String coche : coches) {
            System.out.println(coche);
        }

        // Acceder a un coche específico por índice
        String primerCoche = coches.get(0);
        System.out.println("El primer coche es: " + primerCoche);

        // Modificar un coche
        coches.set(1, "Audi");
        System.out.println("La lista actualizada es:");
        for (String coche : coches) {
            System.out.println(coche);
        }
    }
}
```

https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html

