**Si hi ha un error a algun paràmetre, no es farà la sentencia completa.**

Apagar equipos
```powershell
Stop-Computer
	[-ComputerName <nom_equip>]
	[-Force]
```

Reiniciar equipo
```powershell
Restart-Computer
	[-ComputerName <nom_equip>]
	[-Force]
```

### Comandes adicionals

Enviar missatges a qualsevol terminal:
```powershell
Send-RDUserMessage -HostServer <nom_equip>
	-UnifiedSessionID 1
	-MessageTitle <"Titol del missatge">
	-MessageBody <"Missatge que volem enviar">
```

Per fer un temps d'espera dins del script
```powershell
Start-Sleep -Seconds <segons>
```
