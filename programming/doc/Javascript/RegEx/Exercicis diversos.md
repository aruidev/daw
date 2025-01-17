### **NIF de persones**

1. **Senzill:**
    
    - **Patró:** `^\d{8}[A-Z]$`
    - **Explicació:**
        - `^\d{8}`: 8 dígits al principi.
        - `[A-Z]$`: Una lletra majúscula al final.
2. **Amb K, L, M, X, Y o Z:**
    
    - **Patró:** `^[KLMXYZ]\d{7}[A-HJ-NP-TV-Z]$`
    - **Explicació:**
        - `^[KLMXYZ]`: Comença amb una de les lletres K, L, M, X, Y o Z.
        - `\d{7}`: 7 dígits.
        - `[A-HJ-NP-TV-Z]$`: Una lletra majúscula al final, excloent I, O i U.

---

### **Matrícula d'un cotxe**

1. **Senzill:**
    
    - **Patró:** `^\d{4}-[A-Z]{3}$`
    - **Explicació:**
        - `^\d{4}`: 4 dígits al principi.
        - `-[A-Z]{3}$`: Un guió seguit de 3 lletres majúscules.
2. **Formats alternatius:**
    
    - **Patró:** `^([A-Z]{1,2}-\d{4}-[A-Z]{1,2})|(\d{4}-[A-Z]{3})$`
    - **Explicació:**
        - Primer grup: `[A-Z]{1,2}-\d{4}-[A-Z]{1,2}` (1 o 2 lletres, un guió, 4 dígits, un guió, i 1 o 2 lletres).
        - Segon grup: `\d{4}-[A-Z]{3}` (format actual).

---

### **Adreça de correu electrònic**

1. **Del professorat (una paraula amb minúscules, números opcionals al final):**
    
    - **Patró:** `^[a-z]+[0-9]*$`
    - **Explicació:**
        - `^[a-z]+`: Una o més lletres minúscules.
        - `[0-9]*$`: Zero o més dígits al final.
2. **Dels alumnes (punt i lletra minúscula al principi):**
    
    - **Patró:** `^[a-z]\.[a-z]+[0-9]*$`
    - **Explicació:**
        - `^[a-z]\.`: Una lletra minúscula seguida d’un punt al principi.
        - `[a-z]+[0-9]*$`: Una o més lletres minúscules seguides de zero o més dígits.
3. **Un qualsevol:**
    
    - **Patró:** `^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$`
    - **Explicació:** Format general per correus electrònics.

---

### **Número**

1. **Enter positiu o negatiu:**
    
    - **Patró:** `^-?\d+$`
    - **Explicació:**
        - `^-?`: Opcionalment un signe negatiu.
        - `\d+`: Un o més dígits.
2. **Amb decimals (positiu o negatiu):**
    
    - **Patró:** `^-?\d+(\.\d+)?$`
    - **Explicació:**
        - `^-?`: Opcionalment un signe negatiu.
        - `\d+`: Un o més dígits.
        - `(\.\d+)?`: Un punt seguit de dígits opcionals.

---

### **Data**

1. **Senzill:**
    
    - **Patró:** `^[0-3]?\d-[01]?\d-(\d{2}|\d{4})$`
    - **Explicació:**
        - `[0-3]?\d`: Un o dos dígits pel dia.
        - `-[01]?\d`: Un o dos dígits pel mes.
        - `-(\d{2}|\d{4})$`: Dos o quatre dígits per l’any.
2. **Separant amb `\`:**
    
    - **Patró:** `^[0-3]?\d\\[01]?\d\\(\d{2}|\d{4})$`
3. **Amb text del dia i del mes:**
    
    - **Patró:** `^(Dilluns|Dimarts|Dimecres|Dijous|Divendres|Dissabte|Diumenge), \s[0-3]?\d de (Gener|Febrer|Març|Abril|Maig|Juny|Juliol|Agost|Setembre|Octubre|Novembre|Desembre) de \d{4}$`
    - **Explicació:** Verifica que el dia de la setmana i el mes siguin correctes.

---

### **Definició d'un array**

- **Patró:** `^[a-zA-Z_][a-zA-Z0-9_]*\[\]\s+[a-zA-Z_][a-zA-Z0-9_]*\s*=\s*new\s+[a-zA-Z_][a-zA-Z0-9_]*\[\d*\];$`
- **Explicació:**
    - `[a-zA-Z_][a-zA-Z0-9_]*`: Nom de variable vàlid.
    - `\[\]`: Indica que és un array.
    - `=\s*new`: Assignació de memòria.
    - `\[\d*\]`: Dimensió de l’array (pot estar buida).

---

### **Text**

1. **Comença amb `ABC` i acaba amb `789`:**
    
    - **Patró:** `^ABC.*789$`
2. **Comença amb A, B o C i acaba amb 7, 8 o 9:**
    
    - **Patró:** `^[ABC].*[789]$`