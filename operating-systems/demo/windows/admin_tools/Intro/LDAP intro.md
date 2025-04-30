LDAP: Lightweight Directory Access Protocol
- S'utilitza per ubicar i fer referencia als objectes del Active Directory (en realitat a l'esquema del AD).

- Cada objecte del AD té un nom de distinció (Distinguished Name, DN) que és únic i que el diferencia de la resta dels objectes
- És una cadena de text.

Exemple:
`DN="CN=maria,OU=Clients,DC=ASIX1,DC=com"`

- Fa referencia a un objecte que es diu "maria" i que está dins de la Unitat Organitzativa "Clients" del domini ASIX1.com

`DN="CN=Maria,OU=Clients,DC=ASIX1,DC=com"`
Tres tipus de components:

- `CN`: Common Name -> Per referir-se al nom de l'objecte o a les carpetes del domini.
- `OU`: Organizational Unit -> nom de les unitats organitzatives
- `DC`: Domain Component -> Fa referencia a les subcadenes que formen el nom del domini. Cada component està separat per un punt '.'

Exemple 2:
`DN="CN=mariano,OU=Fontaneria,OU=treballadors,DC=DAW1,DC=cat"`

- L’objecte "mariano" està dins la unitat organitzativa “Fontaneria”, filla de la OU “treballadors”, dins del domini DAW1.cat

Exemple 3:
`DN="CN=macarena,CN=Users,DC=cicles,DC=net"`

- L'objecte macarena està dins de la carpeta "users" del domini CICLES.net

Exemple 4:
`DN="CN=admins. del dominio,CN=Users,DC=blanes,DC=cat"`

- Representa al grup dels administradors del domini, que està dins de la carpeta "Users", dins del domini blanes.cat

Exemple 5:
`DN="CN=usuaris,CN=Users,DC=ASIX,DC=sapalomera,DC=cat"`

- És un grup que està dins la carpeta "Users", dins del domini ASIX.sapalomera.cat
- Si tenim un subdomini, els DC també han de seguir l'ordre.

Exemple 6: 
`DN="CN=Users,DC=ASIX,DC=com`

- Fa referencia a la carpeta "Users", dins del domini ASIX.com

Exemple 7:
`DN="OU=usuaris,DC=FP,DC=org"`

- Fa referencia a la unitat organitzativa "usuaris" dins del domini FP.org

Exemple 8:
`DN="DC=DAW,DC=com"`

- Fa referencia al domini DAW.com

### Nom Complet i Nom Relatiu

Nom complet:
- És el DN: el nom de l'objecte + el lloc on està ubicat (contenidor).
- Es tota la cadena LDAP.

Nom relatiu:
- Identifica únicament l'objecte, sense expressar el seu contenidor.
- És únicament el primer component de la cadena LDAP.



