Modificar información usuario
```powershell
Set-ADUser -Identity fpi `
	-GivenName Filemon
```

Obtener informacion usuario
```powershell
Get-ADUser
```

Modificar contraseña de usuario AD
```powershell
Set-ADAccountPassword -Identity fpi `
	-NewPassword (ConvertTo-SecureString "P@ssw0rd" -AsPlainText -Force)
```

Modificar contraseña nueva y anterior.
```powershell
Set-ADAccountPassword -Identity user14 `
	-NewPassword (ConvertTo-SecureString "P@ssw0rd" -AsPlainText -Force) `
	-OldPassword (ConvertTo-SecureString "P@ssw0rd2" -AsPlainText)
```

Borra la contraseña y obliga a introducir una nueva (en ese momento)
```powershell
Set-ADAccountPassword -Identity user14 `
	-Reset
```





