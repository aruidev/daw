Son les eines, programes o comandes PowerShell que ens ajuden a administrar el nostre domini desde una terminal.

W8.1 
- Usuarios y equipos de Active Directory
- Herramientas Administrativas
- Administración de Equipos
- Directiva de Seguridad Local
Todo pertenece a `mmc.exe`

Podemos hacer `run` (`Windows + R`) -> `mmc` para abrir la consola multimedia.
Desde allí podemos hacer todo.
- Archivo -> Agregar complemento

`shift` + `click derecho` = Siempre aparece opción de Ejecutar como otro usuario

Ejecutar como administrador u otro usuario desde la consola
```powershell
Start-Process <executable> 
	[-Credential <usuari_SAMid_o_NetBIOS>] //ejecuta como usuario o admin
	[-ArgumentList <arguments>]

Start-Process <executable> 
	[-ArgumentList <arguments>]
	[-Verb RunAs] //ejecuta como admin
```

Si no especificamos el dominio del usuario, intentará entrar como usuario en local. Especificar dominio junto con usuario (`dominio\usuario` o `usuario@dominio.cat`)

Administrador de tareas
```powershell
Get-Process 
	[-Name <nombre>]
	[-IncludeUserName]
	| [where -Name match <nombre>]
```

Veure totes les comandes
```powershell
Get-Command
```

Parar processos
```powershell
Stop-Process 
	[-id <id>]
	[-Name <nombre>]
```

Apagar ordenador
```powershell
Stop-Computer 
	[-ComputerName <nombreEquipo>]
	[-force]
```

Concatenar saltos de linea
```powershell
Stop-Computer -ComputerName `
<name>
```
La tilde abierta concatena saltos de línea

Comentar
```powershell
#Comment
#En cada linea
```




