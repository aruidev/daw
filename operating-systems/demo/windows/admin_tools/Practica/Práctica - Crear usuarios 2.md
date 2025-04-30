### Crear usuarios práctica

Crear user deshabilitado
```powershell
New-ADUser -Name slopez `
	-SamAccountName slopez `
	-UserPrincipalName slopez@rpla.cat `
	-GivenName Juan `
	-Surname Lopez `
	-Initials JL `
	-DisplayName "Juan Lopez" `
	-AccountPassword (ConvertTo-SecureString "P@ssw0rd" -AsPlainText -Force) ` 
	-Enabled $false
```


Crear user con PasswordNeverExpires
```powershell
New-ADUser -Name bboniato `
	-SamAccountName bboniato `
	-UserPrincipalName bboniato@rpla.cat `
	-GivenName Benito `
	-Surname Boniato `
	-Initials BB `
	-DisplayName "Benito Boniato" `
	-AccountPassword (ConvertTo-SecureString "P@ssw0rd" -AsPlainText -Force) `
	-Enabled $true `
	-PasswordNeverExpires $true 
```


Crear user con PasswordNotRequired
```powershell
New-ADUser -Name rtechos `
	-SamAccountName rtechos `
	-UserPrincipalName rtechos@rpla.cat `
	-GivenName Rompe `
	-Surname Techos `
	-Initials RT `
	-DisplayName "Rompe Techos" `
	-Enabled $true `
	-PasswordNotRequired $true
```


Crear user con ChangePasswordAtLogon
```powershell
New-ADUser -Name fpi `
	-SamAccountName fpi `
	-UserPrincipalName fpi@rpla.cat `
	-GivenName Filemon `
	-Surname Pi `
	-Initials FP `
	-DisplayName "Filemon Pi" `
	-AccountPassword (ConvertTo-SecureString "P@ssw0rd" -AsPlainText -Force) `
	-Enabled $true `
	-ChangePasswordAtLogon $true
```


Crear user con LogonWorkstations
```powershell
New-ADUser -Name pgotera `
	-SamAccountName pgotera `
	-UserPrincipalName pgotera@rpla.cat `
	-GivenName Pepe `
	-Surname Gotera `
	-Initials PG `
	-DisplayName "Pepe Gotera" `
	-AccountPassword (ConvertTo-SecureString "P@ssw0rd" -AsPlainText -Force) `
	-Enabled $true `
	-LogonWorkstations "t1"
```

Crear user con pedir establecer contraseña
```powershell
New-ADUser -Name pgotera `
	-SamAccountName pgotera `
	-UserPrincipalName pgotera@rpla.cat `
	-GivenName Pepe `
	-Surname Gotera `
	-Initials PG `
	-DisplayName "Pepe Gotera" `
	-AccountPassword (Read-Host -AsSecureString) `
	-Enabled $true `
	-LogonWorkstations "t1"
```



