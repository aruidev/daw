Crear OU en el dominio
```powershell
New-ADOrganizationalUnit -Name unitat1 `
	-Path "DC=rpla,DC=cat" ` #El path de la OU puede ser directamente el dominio
	-ProtectedFromAccidentalDeletion $true
```

Modificar OU para poder eliminarla
```powershell
Set-ADOrganizationalUnit -Identity "DC=rpla,DC=cat" ` #El nombre no funcionará
	-ProtectedFromAccidentalDeletion $false
```

Eliminar OU desde terminal
```powershell
Remove-ADOrganizationalUnit -Identity "DC=rpla,DC=cat" `
	-Confirm:$false #Opcional, para confirmar el Remove
```
*Podemos ver esto en la GUI, ir a propiedades del objeto AD. La opción estará oculta por defecto, para mostrarla: Ver -> Características avanzadas*








