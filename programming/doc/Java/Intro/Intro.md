La función principal siempre se llama `Main` y siempre tendrá el elemento `(final String [] args)`

Todo el código debe ir dentro de una clase.
En cada archivo sólo pondremos una clase (de momento).

Todas las funciones las declararemos como `public static` (de momento).

Las variables globales las declaramos entre la clase y la función principal.


### Introducción a Java por ChatGPT:
### **¿Qué es Java?**

Java es un lenguaje de programación de propósito general, orientado a objetos y diseñado para ser portable, seguro y eficiente. Fue desarrollado en 1995 por Sun Microsystems (ahora parte de Oracle). Es muy popular para aplicaciones de escritorio, web, móviles (Android) y sistemas empresariales.

**Características clave:**

1. **Orientado a objetos:** Todo se basa en clases y objetos.
2. **Portabilidad:** Usa la Máquina Virtual de Java (JVM), lo que permite que el código sea "escribe una vez, corre en cualquier lugar".
3. **Sintaxis similar a C/C++:** Lo hace relativamente fácil de aprender si tienes experiencia previa con lenguajes similares.
4. **Gestión automática de memoria:** A través del recolector de basura (_Garbage Collector_).
5. **Amplia comunidad y bibliotecas:** Hay una gran cantidad de recursos, frameworks y herramientas disponibles.

---

### **Primeros pasos para aprender Java**

#### 1. **Instalar el entorno de desarrollo**

- **Descargar JDK (Java Development Kit):** Este es el kit necesario para compilar y ejecutar programas Java.
    - Descarga desde: [Oracle](https://www.oracle.com/java/technologies/javase-downloads.html) o usa [OpenJDK](https://openjdk.org/).
- **Configurar un IDE (Entorno de desarrollo integrado):**
    - **Recomendado:** [IntelliJ IDEA](https://www.jetbrains.com/idea/), [Eclipse](https://www.eclipse.org/), o [VS Code](https://code.visualstudio.com/) con la extensión de Java.

#### 2. **Comprender los conceptos básicos**

Familiarízate con la sintaxis básica de Java y conceptos iniciales:

- **Estructura de un programa Java:**
    
    java
    
    Copiar código
    
    `public class HolaMundo {     public static void main(String[] args) {         System.out.println("¡Hola, mundo!");     } }`
    
- **Palabras clave:** `class`, `public`, `static`, `void`.
- **Impresión por consola:** Usa `System.out.println`.

#### 3. **Aprender los fundamentos**

Comienza con estos conceptos:

- **Tipos de datos:**
    - Primitivos: `int`, `double`, `boolean`, `char`, etc.
    - Referenciados: `String`, arrays, objetos.
- **Variables y operadores.**
- **Estructuras de control:**
    - Condicionales: `if`, `else`, `switch`.
    - Bucles: `for`, `while`, `do-while`.
- **Métodos:** Cómo definir y usar funciones en Java.

#### 4. **Orientación a objetos (OOP)**

Java es un lenguaje orientado a objetos. Debes comprender:

- **Clases y objetos:**
```
`class Persona {     String nombre;     int edad; }`
```
- **Encapsulamiento:** Uso de modificadores como `private` y métodos `getter`/`setter`.
- **Herencia:** Clases que heredan de otras (`extends`).
- **Polimorfismo:** Sobrecarga y sobreescritura de métodos.

#### 5. **Practicar con proyectos básicos**

La práctica es clave. Comienza con pequeños programas como:

- Calculadora básica.
- Gestión de estudiantes o empleados usando arrays o listas.
- Conversor de unidades.

#### 6. **Explorar la librería estándar de Java**

Aprende a usar clases comunes de la biblioteca estándar:

- **Colecciones:** `ArrayList`, `HashMap`, `HashSet`.
- **Manipulación de cadenas:** Métodos en la clase `String`.
- **Archivos:** Leer y escribir archivos con `java.io` o `java.nio`.

#### 7. **Entender la Máquina Virtual de Java (JVM)**

- Cómo funciona la compilación y ejecución en Java:
    1. Escribes el código fuente (`.java`).
    2. El compilador (`javac`) lo traduce a bytecode (`.class`).
    3. La JVM ejecuta el bytecode.

#### 8. **Profundizar en conceptos avanzados**

Cuando tengas una buena base, explora:

- Excepciones y manejo de errores (`try-catch`).
- Interfaces y clases abstractas.
- Concurrencia y multithreading.
- Frameworks populares como Spring o Hibernate.

---

### **Consejos para aprender Java**

1. **Practica constantemente:** La teoría importa, pero escribir código es esencial.
2. **Resuelve problemas:** Usa plataformas como [HackerRank](https://www.hackerrank.com/), [LeetCode](https://leetcode.com/) o [Codewars](https://www.codewars.com/) para afianzar tus habilidades.
3. **Busca documentación oficial:** La [Documentación de Java](https://docs.oracle.com/en/java/) es excelente.
4. **Construye proyectos pequeños:** Esto te ayudará a aplicar lo aprendido y a ganar confianza.
5. **Únete a comunidades:** En foros como Stack Overflow o grupos de Java en redes sociales podrás resolver dudas y aprender de otros.

