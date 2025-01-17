1. Es pulsa el botó Power
2. BIOS estava activa esperant la senyal de Power. Comença a engegar components i a fer comprovacions.
3. BIOS dona el control al dispositiu que està preparat per arrancar segons un ordre.
4. Normalment aquest dispositiu es el disc dur.
5. BIOS dona el control al disc dur seleccionat -> carrega en RAM el contingut del primer sector (=MBR) i l'executa el programa que conté (446 Bytes).
6. Code (440 bytes) / Disk signature (4 bytes) / Nulls (2 bytes) / Partition Table (64 bytes) / MBR Signature (2 bytes).
7. Aquest programa té accés a la taula de particions i la llegeix per saber quina posició està activa i comença.
8. Com sap on comença, sap on està el seu boot-sector (el primer sector de la partició) i el carrega en RAM i l'executa.
9. El boot-sector busca el fitxer bootmgr (boot manager) en l'arrel de la partició activa, el carrega en RAM i l'executa.
10. bootmgr llegeix el fitxer BCD que està a la carpeta Boot en la mateixa partició. BCD és un fitxer de configuració, no és executable.
11. BCD li diu a bootmgr quants sistemes operatius Windows hi ha i les preferències d'arrencada.
12. Amb la informació del BCD, bootmgr mostra la llista dels SO instal·lats i demana escollir un durant uns segons. Si només tenim un S.O. no cal mostrar la llista.
13. winload.exe carrega els mòduls que falten del SO, fins arribar a la pantalla de benvinguda o la de logon.