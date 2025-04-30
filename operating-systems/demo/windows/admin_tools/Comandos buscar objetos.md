Sirven para localizar objetos u obtener sus propiedades.

```powershell
Get-AdUser
Get-ADGroup
Get-ADGroupMember
Get-ADComputer
GET-ADPrincipalGroupMember
# ADObject engloba todo tipo de objetos
Get-ADObject
```

- `Get-ADUser -Identity` "Cadena LDAP" o SAMid
  para buscar una serie de propiedades de un usuario que conocemos
- `Get-ADUser -Filter <expressió_del_filtre>`
  para buscar usuarios con unas determinadas propiedades
- `Get-ADUser -LDAPFilter` "Cadena LDAP del filtre"
  para buscar usuarios con filtros LDAP

