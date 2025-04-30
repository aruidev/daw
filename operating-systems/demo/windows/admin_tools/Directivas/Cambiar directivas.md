### Cambio de vigencia de contraseñas:

Desde "Herramientas administrativas" abrir como administrador de dominio el complemento "Administración de directivas de grupo".
Una vez dentro de la administración...
- Desplegar el arbol hasta llegar al nombre de nuestro dominio.
- Click derecho sobre nombre de nuestro dominio: "Crear un GPO en este dominio y vincularlo aquí..."
- Poner un nombre descriptivo al nuevo GPO que estamos creando. Es muy importante que el nombre haga referencia a la tarea que hará.
- Localizar el GPO dentro del nombre de nuestro dominio: Click derecho y "Editar..."
- Localizar la rama:
  1. Configuración de equipo.
  2. Directivas.
  3. Configuración de Windows.
  4. Configuración de Seguridad.
  5. Directivas de cuenta.
  6. Directivas de contraseñas.
- Modificar los siguientes valores haciendo doble click sobre el nombre de la directiva que queremos cambiar: "Vigencia mínima de la contraseña", valor a "0 días"
- Volver a la ventana de la Administración de directivas
- Hacer click sobre el nombre del dominio.
- A la derecha marcar "Objetos de directiva de grupos vinculados".
- Haciendo uso de las flechas laterales, cambiar el orden de prioridad de las directivas y dejar nuestra directiva en el primer puesto de la lista.
Se aplicará el cambio de nuestra directiva, y los demás valores que no hemos tocado se aplicará la siguiente directiva de la lista.