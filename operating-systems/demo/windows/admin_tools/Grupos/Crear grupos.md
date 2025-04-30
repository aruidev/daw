### Crear grupos

Crear grupo 
```powershell
New-ADGroup -Name grup1
#Falta posar el groupscope, comanda incompleta
```

Crear grupo2
```powershell
New-ADGroup -Name grup2 `
	-GroupScope DomainLocal `
```

Crear grupo3
```powershell
New-ADGroup -Name grup3 `
	-GroupScope DomainLocal `
	-Path "OU=prova2,OU=prova1,DC=rpla,DC=cat" `
```

Crear grupo4
```powershell
New-ADGroup -Name grup4 `
	-GroupScope DomainLocal `
	-Path "OU=prova2,OU=prova1,DC=rpla,DC=cat" `
	-Description "Es un grup de prova" `
```

