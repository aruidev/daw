### Crear Usuarios, ejemplos

Crear Usuari
```powershell
New-ADUser -Name user3 `
-SamAccountName user3 `
-UserPrincipalName user3@ccandelaresi.cat `
-Enabled $true
```

Es crea l’usuari habilitat amb els seus paràmetres.
per no posar password.
```powershell
PasswordNotRequired $true `
```

Crear usuari demanant la contrasenya per pantalla
```powershell
New-ADUser -Name user4 `
		-SamAccountName user4 `
		-UserPrincipalName user4@ccandelaresi.cat `
		-AccountPassword (Read-Host -AsSecureString   “Introdueix el password”) `
		-Enabled $true `
```

Crear usuari amb contrasenya
```powershell
New-ADUser -Name user5 `
		-SamAccountName user5 `
		-UserPrincipalName user5@ccandelaresi.cat `
		-AccountPassword (ConvertTo-SecureString “P@ssw0rd” -AsPlainText -Force) `
		-Enabled $true `
```

Crear usuari amb nom de pila i inicials
GivenName (nom de pila) Initials (inicials)
```powershell
New-ADUser -Name user6 `
		-SamAccountName user6 `
		-UserPrincipalName user6@ccandelaresi.cat `
		-AccountPassword (Read-Host -AsSecureString   “Introdueix el password”) `
		-Enabled $true
		-DisplayName displayname `
		-GivenName givenname `
		-Surname surname `
		-Initials MC `
		-Path "OU=prova1,DC=rpla,DC=cat" `
```


Crear usuari (exemple2)
```powershell
New-ADUser -Name user8 `
    -SamAccountName user8 `
    -UserPrincipalName user8@sluchko.cat `
    -AccountPassword (ConvertTo-SecureString "P@ssw0rd" -AsPlainText -Force) `
    -Enabled $true `
    -DisplayName displayname `
    -GivenName givenname `
    -Surname surname `
    -Initials SL `
    -Path "OU=prova2,OU=prova1,DC=sluchko,DC=cat" `
    -ChangePasswordAtLogon $true `
```


Crear user (exemple3)
```powershell
New-ADUser -Name user12 `
    -SamAccountName user12 `
    -UserPrincipalName user12@rpla.cat `
    -AccountPassword (ConvertTo-SecureString "P@ssw0rd" -AsPlainText -Force) `
    -Enabled $true `
    -DisplayName displayname `
    -GivenName givenname `
    -Surname surname `
    -Initials RP `
    -Path "OU=prova2,OU=prova1,DC=rpla,DC=cat" `
    -ChangePasswordAtLogon $true `
    -EmailAddress enzo@socelmillor.com `
    -LogonWorkstations "t1,t2,t3" #Listar los terminales dentro del String.
```

Usuarios y equipos de AD -> User -> Propiedades -> Cuenta -> La cuenta expira... / Horas e inicio de sesion / Opciones de inicio de sesión (marcar los equipos permitidos de inicio de sesion para el user)








