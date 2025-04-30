1. Instalar Core
2. Instalar VMware Tools
3. Config equipo:
   - Cambiar IP, Mask y DNS
   - Cambiar nombre de maquina
   - Firewalls, remote, admin remote
4. Promocionar server a DC
   - Instalar rol de servidor
   - Promocionar a controlador de dominio
5. Preparar un W8.1 y unirlo al dominio
6. instalar herramientas de administracion remota.


1. Instalar server
   - Server Datacenter (no escritorio)
   - Crear particion

### PowerShell Core

- `Get-PSDrive` - Ver unidades
- entrar a unitat D:
- Executar .\setup64.exe
- Minimitzar terminal i seguir wizard de vmware tools.
- 2, 7,
- 8 = powershell: 
- Ver config xarxa: `Get-NetIPAdress`
- Canviar IP: `New-NetIPAdress` 192.168.121.1 / AdressFamily IPv4 / PrefixLength 24 / InterfaceAlias ethernet0
-  `Set-NetIPAdress` 
- `Remove-NetIPAdress`
- `Set-DnsClientServerAddress` 192.168.121.1, 127.0.0.1
- Canviar nom Equip: `Rename-Computer -NewName` nou_nom 
- `Set-NetFirewallProfile`: domain, public, private / `-Enabled`: False

### Domini Core

- PowerShell `Get-WindowsFeature`
- Instal·lar el rol de servidor: `Install-WindowsFeature AD-Domain-Services` 
- Executar Script de creació de domini
- Conectar W8 a dominio
- Descargar RSAT
- Administració remota desde W8
- Administrar server: No login como admin, usuari normal i abrir administrador del servidor.
- Active Directory, sino buscar por ip o dns.
- click derecho, administrar como...

### ADMINISTRACIÓ REMOTA

- Entrar a terminal con cuenta Administrador. (DOMINI/administrador)
- (Desde Terminal de trabajo) Herramientas administrativas -> Usuarios y equipos de Active Directory. (Eso solo sale si se ha instalado el RSAT)
- Usuarios y equipos de AD -> Users -> Click derecho -> Nuevo... -> Usuario 
- Introducir datos de nuevo usuario (para la práctica Contraseña nunca expira y no hay que cambiarla). El usuario se crea en el dominio.
- Cerramos sesión de Administrador.
- Administrador del servidor -> Click derecho en Todos los servidores -> Agregar Servidor (deberia aparecer en Active Directory, sino, conectarse por DNS)
- Click derecho en Servidor con acceso denegado -> Administrar como...
- Introducir credenciales de administrador (Sin recordar credenciales)
- Ya tendriamos el dominio en linea. (Podemos quitar el mensaje de contadores de rendimiento en click derecho -> iniciar contadores de rendimiento).

#### Seguridad

El usuario normal (que no es administrador) no tiene acceso a ninguna configuración, deberá poner las credenciales de admin para entrar y cambiar configuraciones. 
Para entrar a Administrador del servidor, tendra que introducir credenciales. Click derecho en el servidor, y no tendra que introducir credenciales.

#### Administracion de equipos

- Click derecho en servidor -> Administración de equipos.
- Aquí podemos cambiar cosas del equipo Server en remoto.
- En el caso de la práctica, cambiar tamaño de partición.
- Administración de equipos -> Almacenamiento -> Administración de discos.
- Si tengo que introducir credenciales:
		Asegurarme de que estoy iniciando sesion como admin en el dominio y no en el equipo local.

- Si aparece "Administracion de equipos (local)" -> click derecho -> Conectarse a otro equipo...
