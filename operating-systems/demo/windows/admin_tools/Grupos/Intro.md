## Objectes del nostre domini

- BuiltIn: Són grups que el sistema concedeix certs privilegis per poder controlar la màquina localment (perque un DC no po tenir ni grups ni usuaris locals)

- Computer:

- Domain Controller

- ForeignSecurityPrincipals: Controladors amb relacions de confiança amb el DC.

- Managed Service Accounts: Comptes que estan associats a serveis d'un equip.

- Users: Tot el que no està a les altres carpetes, normalment els usuaris i grups que creem.

### Grups de seguretat especials

#### Dins de la carpeta Users tenim els següents grups (entre altres):

- Administradores de empresas = Administradores de organizacion
- Administradores de esquema
- Admins. del dominio

#### Dins de BuiltIn:

- Administradores: accés complet al domini i a administrar equips.
- Duplicadores: poden replicar arxius en un domini.
- Opers. de cuentas: administren usuaris i grups del domini.
- Opers. de impresión: administren impresores del domini.
- Opers. de servidores: administren els servidors del domini.
- Operadores de copia de seguridad: administren les còpies de seguretat, però no poden canviar la configuració de seguretat.

#### Dins de grup Usuarios avanzados

Sí pot fer:
- Administrar usuaris i grups locals
- Administrar recursos compartits
- Canviar l'hora del sistema
- Instalar i desinstalar programes

No pot fer:
- Administrar la propietat d'arxius
- Fer copies de seguretat
- Administrar drivers
- Administrar registres d'auditories


## Ambits i tipus dels grups

### Ambits

Quan creem un grup:

	Alerta: Grup local != Grup de domini local

- Domini local: els seus membres poden ser de qualsevol domini, pero únicament tenen drets sobre aquell domini.

- Global: els membres son del domini on es troba el grup i tenen permisos a nivell de tot el bosc.

- Universal: els seus membres poden ser de qualsevol domini del bosc i tenen permisos a nivell del bosc


### Tipus

- Grup de seguretat: per assignar permisos d'accés als recursos en Active Directory.

- Grups de distribució: per crear correus electronics i enviar als usuaris.

### Ambit i tipus dels diferents grups

Els grups de BuiltIn tenen àmbit de grup integrat local. Són predefinits pel sistema.

Grups del domini integrats:

- Administradores
- Operadores de copia
- Operadores de servidores
- ...

Els grups de Users tenen ambit de grup global o universal.

Canviar l'ambit d'un grup
- Un grup Universal sol es pot canviar a grup de Domini Local des d'un GC.


