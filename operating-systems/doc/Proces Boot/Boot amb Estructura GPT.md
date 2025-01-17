LBA 0 | Protective MBR (Legacy MBR per compatibilitat amb programes antics)
LBA 1 | Primary GPT Header (Capçalera GPT defineix els blocs de disc que pot usar l'usuari. Defineix la quant. de particions que s'han creat i la capacitat de cadascuna)
LBA 2 - LBA 33 | Entries (Taula de particions. Cada partició ocupa 128Bytes, màxim 128 particions)
LBA 34 a LBA -34 | Son les particions en si
LBA -33  a LBA -1 | Copia de seguretat capçalera i taula de particions


![[Pasted image 20241111095736.png]]

Procés Boot:

UEFI / GPT (taula particions) / ESP (grubx64.efi) / Ubuntu 22 (/boot/grub)

1. Engegem el PC amb el botó Power.
2. UEFI dona el control directament al HDD, concretament al fitxer grubx64.efi de la partició ESP.
3. grubx64.efi és el bootloader (fitxer carregador) del grub.
4. El grub està en la propia partició d'Ubuntu (carpeta /boot/grub)
5. Aquest grub és l'encarregat de:
   - Mostrar menú de GRUB
   - carregar kernel de SO
   - finalment pasar el control al kernel carregat