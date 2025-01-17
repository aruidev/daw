MBR (Master Boot Record)
- Es la taula de particions: guarda la config de les particions del HDD.
- Fisicament es troba en el primer sector del HDD (Sector 1 del cilindre 0 del capçal 0).
- Normalment cada sector té una longitud de 512 bytes.

GPT (GUID Partition Table)
- És l'equivalent a l'MBR, però en dispositius UEFI.

Partició
- Cadascuna de les zones del disc dur contigües i no solapables.
- Des d'un punt de vista logic son tractades com a diferents unitats, tot i que internament formen part de la mateixa unitat física
- Les particions estan definides a l'MBR (o al GPT, segons com s'ha inicialitzat el disc). (inicialitzar disc = crear taula de particions)

Tipus de particions en MBR:
- Primaries: tenen un bootsector per poder arrencar. MBR només té espai per guardar un màxim de 4 primàries.
- Estesa: és una partició primària que al seu interior només conté particions lògiques. Com a molt hi ha 1 estesa per cada dispositiu físic.
- Lògiques: particions dins de la partició estesa. No hi ha cap límit, només la capacitat de l'estesa. No té boot-sector.
*Sempre primaries + estesa <= 4

Tipus de particions en GPT:
- Només poden ser primàries.
- En GPT no hi ha cap límit de primàries.

Partició activa
- És la partició primària escollida per arrancar. (Ha de ser primaria)
- Conté un programa en el primer sector de la partició (boot-sector).
- Només 1 partició per cada disc pot ser activa.
- La informació de quina és l'activa es guarda en la taula de particions.

Sector
- És la mínima unitat de lectura o escriptura física del HDD. Normalment té una capacitat de 512 bytes.

Boot Sector 
- És el primer sector de cada partició primària (tant si és activa com si no).

Cluster
- És una agrupació de sectors consecutius.
- Determinen la unitat mínima de informació de la partició que serà ocupada o alliberada.
- La longitud del clúster es defineix quan es dona format a una partició.

Taula de fitxers
- És un espai a l'inici de cada partició (després del boot-sector, si existeix) on es guarda la informació de cada fitxer que conté la partició.
- Entre altres coses, de cada fitxer es guarda: nom complet, ruta on es troba, clusters on està ubicat (amb el seu ordre de lectura), atributs i altres detalls de seguretat,...
- En un sistema de fitxers FAT32, la taula s'anomena FAT (File Allocation Table, taula d'assignació de fitxers).
- En un sistema NTFS, la taula és MFT (Master File Table / taula mestra de fitxers)

Inicialitzar el disc
- Consisteix en crear la taula de particions.

### Pasos per poder usar un HDD
Crear la partició
- Sobre un espai lliure del disc es marca quins sectors ocuparà (des de l'inicial al final).
*Si la partició es primaria -> reserva el 1r sector per al boot-sector.*
*Si la partició es lógica -> no reserva boot-sector. Les lògiques només poden estar dins la estesa*.

Formatar la partició 
- Defineix quin sistema de fitxers farà servir.
- Reserva un espai gran al principi de la partició per guardar la taula de fitxers.
- Estableix quina és la longitud dels clústers.
- Marca l'etiqueta de la partició.
*En NTFS la taula MFT ocupa el 12,5% de tota la partició.*

