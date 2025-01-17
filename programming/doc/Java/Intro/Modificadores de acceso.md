- public
- protected => Es pot modificar desde altres clases. Queda protegit pero les subclases si poden accedir i modificar.
- - => (default/package) Totes les clases dins del paquet poden accedir. 
- private => Si tenim variables globals no es podran modificar desde altres clases. No es pot veure ni modificar desde fora. => Es pot obtenir amb `p s int getVariable() { return variable }`, es pot modificar amb `p s void setVariable(int n) { nota = n }`


GPT
- **`public`**: Acceso desde **cualquier lugar**.
- **`private`**: Acceso **solo dentro de la misma clase**.
- **`protected`**: Acceso desde:
    - La misma clase.
    - Subclases (incluso si están en otro paquete).
    - Otras clases del **mismo paquete**.
- **`default/package` (sin modificador)**: Acceso solo desde **el mismo paquete**.