- Administracio MMC
- Apagada i reinici d'equips remots
- Gestió de processos
- Configuració de la sessió d'usuari

### Pasos

- Ir a: Usuarios y equipos de active directory

Crear grups
```powershell
New-ADGroup -Name professor `
	-GroupScope DomainLocal `
	-Path "CN=Users,DC=rpla,DC=cat`
```

```powershell
New-ADGroup -Name alumne `
	-GroupScope DomainLocal `
	-Path "CN=Users,DC=rpla,DC=cat`
```

Afegir usuaris a grup professor
```powershell
Add-ADGroupMember -Identity professor `
	-Members slopez,rtechos,pgotera,fpi
```

Afegir usuaris a grup alumne
```powershell
Add-ADGroupMember -Identity alumne `
	-Members bboniato,pgotera
```

Afegir usuari a administradores del dominio
```powershell
Add-ADPrincipalGroupMembership -Identity fpi `
	-MemberOf 'admins. del dominio'
```

### Pregunta 3
Primer creem estructura de OU
```powershell
New-ADOrganizationalUnit -Name sesamo `
	-ProtectedFromAccidentalDeletion $true `
	-Path "DC=rpla,DC=cat"
```

```powershell
New-ADOrganizationalUnit -Name epihouse `
	-ProtectedFromAccidentalDeletion $true `
	-Path "OU=sesamo,DC=rpla,DC=cat"
```

```powershell
New-ADOrganizationalUnit -Name carrer `
	-ProtectedFromAccidentalDeletion $true `
	-Path "OU=sesamo,DC=rpla,DC=cat"
```

```powershell
New-ADOrganizationalUnit -Name barri `
	-ProtectedFromAccidentalDeletion $true `
	-Path "OU=sesamo,DC=rpla,DC=cat"
```

Ara creem els grups
```powershell
New-ADGroup -Name pelut `
	-GroupScope DomainLocal `
	-Path "OU=sesamo,DC=rpla,DC=cat"
```

```powershell
New-ADGroup -Name pelat `
	-GroupScope DomainLocal `
	-Path "OU=sesamo,DC=rpla,DC=cat"
```

```powershell
New-ADGroup -Name alt `
	-GroupScope DomainLocal `
	-Path "OU=sesamo,DC=rpla,DC=cat"
```

Ara creem els usuaris
```powershell
New-ADUser -Name espinete `
	-SamAccountName espinete `
	-UserPrincipalName espinete@rpla.cat `
	-GivenName espi `
	-Surname nete `
	-Initials EN `
	-DisplayName "Espi Nete" `
	-AccountPassword (ConvertTo-SecureString "P@ssw0rd" -AsPlainText -Force) `
	-Enabled $true `
	-Path "OU=carrer,OU=sesamo,DC=rpla,DC=cat" `
```

```powershell
New-ADUser -Name epi `
	-SamAccountName epi `
	-UserPrincipalName epi@rpla.cat `
	-GivenName epi `
	-Surname dural `
	-Initials ED `
	-DisplayName "Epi Dural" `
	-AccountPassword (ConvertTo-SecureString "P@ssw0rd" -AsPlainText -Force) `
	-Enabled $true `
	-Path "OU=epihouse,OU=sesamo,DC=rpla,DC=cat" `
```

```powershell
New-ADUser -Name blas `
	-SamAccountName blas `
	-UserPrincipalName blas@rpla.cat `
	-GivenName blas `
	-Surname femio `
	-Initials BF `
	-DisplayName "Blas Femio" `
	-AccountPassword (ConvertTo-SecureString "P@ssw0rd" -AsPlainText -Force) `
	-Enabled $true `
	-Path "OU=epihouse,OU=sesamo,DC=rpla,DC=cat" `
```

```powershell
New-ADUser -Name caponata `
	-SamAccountName caponata `
	-UserPrincipalName caponata@rpla.cat `
	-GivenName capo `
	-Surname nata `
	-Initials CN `
	-DisplayName "Capo Nata" `
	-AccountPassword (ConvertTo-SecureString "P@ssw0rd" -AsPlainText -Force) `
	-Enabled $true `
	-Path "OU=carrer,OU=sesamo,DC=rpla,DC=cat" `
```

```powershell
New-ADUser -Name gustavo `
	-SamAccountName gustavo `
	-UserPrincipalName gustavo@rpla.cat `
	-GivenName gustavo `
	-Surname llicao `
	-Initials GL `
	-DisplayName "Gustavo Llicao" `
	-AccountPassword (ConvertTo-SecureString "P@ssw0rd" -AsPlainText -Force) `
	-Enabled $true `
	-Path "OU=sesamo,DC=rpla,DC=cat" `
```

```powershell
New-ADUser -Name triki `
	-SamAccountName triki `
	-UserPrincipalName triki@rpla.cat `
	-GivenName triki `
	-Surname nosis `
	-Initials TN `
	-DisplayName "Triki Nosis" `
	-AccountPassword (ConvertTo-SecureString "P@ssw0rd" -AsPlainText -Force) `
	-Enabled $true `
	-Path "OU=sesamo,DC=rpla,DC=cat" `
```

Ara hem d'afegir els usuaris als grups que pertanyen:
```powershell
Add-ADGroupMember -Identity pelut `
	-Members espinete,caponata,triki 
```

```powershell
Add-ADGroupMember -Identity pelat `
	-Members epi,blas,gustavo
```

```powershell
Add-ADGroupMember -Identity alt `
	-Members espinete,caponata
```

Hem de afegir un usuari a Administrador de domini
```powershell
Add-ADPrinciapGroupMembership -Identity blas `
	-MemberOf "Admins. del dominio"
```

### Pregunta 4
```powershell
Move-ADObject -Identity "CN=alt,OU=sesamo,DC=rpla,DC=cat" `
	-TargetPath "OU=barri,OU=sesamo,DC=rpla,DC=cat"
```

```powershell
Move-ADObject -Identity "CN=pelat,OU=sesamo,DC=rpla,DC=cat" `
	-TargetPath "OU=barri,OU=sesamo,DC=rpla,DC=cat"
```

```powershell
Move-ADObject -Identity "CN=pelut,OU=sesamo,DC=rpla,DC=cat" `
	-TargetPath "OU=barri,OU=sesamo,DC=rpla,DC=cat"
```


### Pregunta 5

```powershell
Set-ADOrganizationalUnit -Identity "OU=carrer,OU=sesamo,DC=rpla,DC=cat"
	-ProtectedFromAccidentalDeletion $false
```

```powershell
Move-ADObject -Identity "OU=carrer,OU=sesamo,DC=rpla,DC=cat" `
	-TargetPath "OU=barri,OU=sesamo,DC=rpla,DC=cat"
```

```powershell
Set-ADOrganizationalUnit -Identity "OU=carrer,OU=barri,OU=sesamo,DC=rpla,DC=cat" `
	-ProtectedFromAccidentalDeletion $true
```

```powershell
Set-ADOrganizationalUnit -Identity "OU=epihouse,OU=sesamo,DC=rpla,DC=cat"
	-ProtectedFromAccidentalDeletion $false
```

```powershell
Move-ADObject -Identity "OU=epihouse,OU=sesamo,DC=rpla,DC=cat" `
	-TargetPath "OU=barri,OU=sesamo,DC=rpla,DC=cat"
```

```powershell
Set-ADOrganizationalUnit -Identity "OU=epihouse,OU=barri,OU=sesamo,DC=rpla,DC=cat" `
	-ProtectedFromAccidentalDeletion $true
```


### Pregunta 6

```powershell
Set-ADUser -Identity slopez `
    -City Barcelona `
    -PostalCode '08002' `
    -Company "Llauna Films" `
    -Department Comptabilitat `
    -Office 4A `
    -EmailAddress slopez@llauna.cat
```

```powershell
Set-ADUser -Identity bboniato `
    -City Soria `
    -Country es `
    -PostalCode 42002 `
    -EmailAddress bboniato@soria.que.hermosa.es
```

```powershell
Set-ADUser -Identity rtechos `
    -City "Lloret de Mar" `
    -State Girona `
    -StreetAddress "Avinguda Las Vegas, número 2" `
    -PostalCode 17310 `
    -EmailAddress vigilante.de.la.playa@lloret.com
```

```powershell
Set-ADUser -Identity pgotera `
    -City Palafolls `
    -Company "Capuzas a domicilio, SL" `
    -Office Central `
    -MobilePhone 666.777.888 `
    -PostalCode 08389 `
    -EmailAddress pepe@chapuzas_q3.net
```

```powershell
Set-ADUser -Identity fpi `
    -City Blanes `
    -Company "T.I.A" `
    -OfficePhone 972350909 `
    -EmailAddress fpi@tia.org
```


### Pregunta 7 
Modificar password a pgotera
```powershell
Set-ADAccountPassword -Identity pgotera
	-NewPassword (ConvertTo-SecureString "Ch@puz@$" -AsPlainText -Force) `
	-OldPassword (ConvertTo-SecureString "P@sw0rd" -AsPlainText -Force)
```

### Pregunta 8
Afegir descripcio als grups de P1
```powershell
Set-ADGroup -Identity alumne
	-Description "grup de sesamo"
```

### Pregunta 9

```powershell
Set-ADUser -Identity bboniato `
	-AccountExpirationDate 31-12-2025
```

### Pregunta 10

1. Usuarios y equipos de Active Directory
2. Click derecho en dominio (rpla.cat)
3. Buscar...
4. Nombre: e (buscar todos los que comienzan por e)

### Pregunta 17
Configurar sufijos UPN:
Administrador del servidor -> click derecho en el dominio -> Dominios y confianza de Active Directory -> click derecho -> Propiedades... -> Sufijos UPN

Aplicar UPN a usuarios
Usuarios y equipos de AD -> click derecho usuario -> Propiedades... -> Cuenta -> Cambiar el UPN al especificado en la pregunta

### Pregunta 18

Crear lista de usuarios
```powershell
Get-ADUser -Filter {UserPrincipalName -notlike "*@rpla.cat"} `
	| Select-Object -Property Name,SamAccountName,UserPrincipalName
```

### Pregunta 19 

Usuarios que pertenecen a grupo alumne
```powershell
Get-ADGroupMember -Identity alumne
```

A estos usuarios, aplicar la fecha de caducidad a la cuenta
```powershell
Get-ADGroupMember -Identity alumne `
	| Set-ADUser -AccountExpirationDate 2025-05-31
```

### Pregunta

```powershell

```

```powershell

```

```powershell

```

```powershell

```

```powershell

```

```powershell

```

```powershell

```

