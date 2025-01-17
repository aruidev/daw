IPv4 (Internet Protocol versió 4)
- Identifica un punt de connexió de la xarxa.
- Es coneix també com a adreça lògica.
- És assignat a cada interface de xarxa per un administrador de xarxa.
- Format: 32 bits expressats en 4 bytes separats per punts.
![[Pasted image 20250109094338.png]]
Cada adreça IP té 2 camps:
- Identificador de xarxa (porta bits reservats).
- Identificador del host dins de la xarxa.
La quantitat de bits de cada part és variable, però la suma ha de ser sempre 32 bits.

![[Pasted image 20250109094640.png]]

L'adreça de Host ha de cumplir 2 regles:
- Bits no poden ser tots zeros (000...000).
- Bits no poden ser tots uns (111...111).

Classes d'adreces:
- Classe A: 0.0.0.0 -> 127.255.255.255
- Classe B: 128.0.0.0 -> 191.255.255.255
- Classe C: 192.0.0.0 -> 223.255.255.255

![[Pasted image 20250109094952.png]]
![[Pasted image 20250109095006.png]]



|                 | Xarxa       | Host           |
| --------------- | ----------- | -------------- |
| Adreça de xarxa | ID xarxa    | 000...000      |
| Adreça de host  | 000...000   | ID host        |
| Broadcast       | ID xarxa    | 111...111      |
| APIPA           | 169. / 254. | Qualsevol cosa |
| Loopback        | 127.        | Qualsevol cosa |
Adreces IPv4 especials:

- Broadcast (difusió): Adreça que permet arribar de manera automàtica a tots els hosts d'una xarxa, sense necessitat de saber les respectives adreces IP de cada host.

- APIPA (Automatic Private Internet Protocol Addresing): Adreça IP que resulta de fallar la comunicació amb un servidor DHCP.

- Loopback: Direcció especial que s'utilitza per comunicar-se amb el mateix host, sense necessitat d'arribar a la xarxa física.

IP Estàtica:
- La IP és fixa, configurada manualment al dispositiu per un administrador de xarxa.
- Sempre tindrà la mateixa, a no ser que l'admin la torni a canviar.

IP Dinàmica:
- La IP s'assigna automàticament a través d'un servidor DHCP.
- Cada cop que el dispositiu es connecta a Internet, el servidor DHCP pot assignar una diferent.

IP Públiques:
- Són visibles en tot Internet.
- Si un PC vol connectar-se a internet cal tenir accés a una IP pública.
- Un ordinador amb una IP pública és accesible (visible) des de qualsevol altre ordinador connectat a Internet.

IP Privada:
- Són visibles únicament per altres hosts de la seva propia xarxa (o d'altres xarxes privades interconnectades per routers).
- Es fan servir a les empreses per connectar les terminals de treball
- Els PC amb IP privades poden sortir a Internet per mitjà d'un router (o un Proxy) que tingui una Ip pública però des de Internet no es pot accedir als PC amb IPs privades.

	10.0.0.0 -> 10.255.255.255
	172.16.0.0 -> 172.31.255.255
	192.168.0.0 -> 192.168.255.255
	
	- El primer block és una única xarxa de classe A, amb 16.777.214 de possibles hosts.
	- El segon block és un conjunt de 16 xarxes contigües de classe B, cadascuna amb 65534 possibles hosts.
	- El tercer block és un conjunt de 256 xarxes contigües de classe C, cadascuna amb 254 possibles hosts.

Máscara de Subxarxa
- És una combinació de bits a 1s + bits a 0s.
- Serveix per segmentar l'adreça IP i saber quins bits són d'adreça de xarxa (1s) i quins són de hosts (0s).
- Permet crear subxarxes.
- Format: 111...111000...000 (en total 32 bits)
- De vegades s'expressa juntament amb la IP de la següent manera:
  IP = 192.168.121.3/24 -> Significa 24 bits a 1.

Exemples:
	IP 192.168.28.5
	

IPv6
- Pensades per substituir a l'anterior IPv4.
- Format: 128 bits expressats en 8 blocks de 4 digits hexadecimals separat per dos punts (:).
`1467 : 2001 : 12C5 : 23B0 : 0000 : 0000 : 0000 : AF13`
- Si hi ha blocs a 0000 es poden substituir per dobles dos punts (::)
- Adreça de loopback: 
  `::1`

