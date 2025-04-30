5.

admin servidor => servidor local 

bandera => promover este servidor a dominio
  - selec: Agregar un nuevo bosque.

nombre dominio raiz: aruiz7.cat

Nivel funcional bosque / dominio:
Windows Server 2016.

servidor sistema de nombres de dominio (DNS) CHECK
catalogo global CHECK
controlador solo lectura (RODC) UNCHECK

Escribir contrasenya para restauracion (DSRM)
P@ssw0rd

nombre dominio netBIOS:
por defecto

Rutas de acceso:
por defecto

Revisar opciones:
ver script (guardar archivo como script-domini.txt)

Comprobación de requisitos:
Instalar

Aplicando la configuracion de equipo...


6.

Si no tiene SAM tiene Active Directory.

Panel de control => Herramientas administrativas. 

> Usuarios y equipos de Active Directory (está en la lista)

carpeta "users"

propiedades...

(Administrador de empresas == administrador del bosque)

Al promover dominio los usuarios existentes (incluido administradores) no tienen nombre de usuario en el dominio. Hay que entrar en propiedades, cuenta y escribir:
nombre_de_usuario + @dominio.cat


7. Instalar windows 8

SERV = AD
T1 = SAM

W8:
Administracion de equipos => 

DOMINI
SERV / T1
- IP = 192.168.X.1 / 192.168.X.10
- MASK = 255.255.255.0 / =
- DNS = 192.168.3.1 / =

Centro de redes y recursos => Internet => Propiedades => Cambiar IP.

W8 y WS:
CMD => ping IP de la otra máquina. (o ping server-pri / t1)

W8: 
Sistema => Windows Pause => Propiedades del sistema => Nombre de equipo - Cambiar... => Dominio @aruiz7.cat => iniciar sesion con administrador. 










