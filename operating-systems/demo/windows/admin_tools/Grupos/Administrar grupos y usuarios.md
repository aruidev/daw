### Administrar grupos

Añadir Users a Group
```powershell
Add-ADGroupMember -Identity grup2 `
				#Cuando el objeto está creado, Name es Identity `
	-Members user10,user11,user12 `
```

Añadir Users a Group 2
```powershell
Add-ADGroupMember -Identity grup3 `
	-Members "CN=user13,OU=prova2,OU=prova1,DC=rpla,DC=cat" ` 
	# També podem fer-ho amb cadena LDAP. Si son varies, separar les Strings per comes.
	
```

### Administrar usuarios

Añadir Groups a User
```powershell
Add-ADPrincipalGroupMembership -Identity user9
	-MemberOf grup3,grup4
```

### Modificar grupos

```powershell
Set-ADGroup -Identity grupo
	-Description "grupo que tiene miembros"
```

