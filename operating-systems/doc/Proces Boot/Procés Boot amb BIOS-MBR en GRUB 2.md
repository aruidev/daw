- Estructura MBR
  Codi del programa gestor Boot = 446 bytes
  Taula de particions primarias (4 entrades de 16 bytes) = 64 bytes
  Signatura MBR = 0xAA55 = 
  Mida total = 512 bytes

| Descripció                                             | Mida en Bytes |
| ------------------------------------------------------ | ------------- |
| Codi del programa gestor Boot                          | 446           |
| Taula de particions primarias (4 entrades de 16 bytes) | 64            |
| Signatura MBR = 0xAA55                                 | 2             |
| Mida total:                                            | 512           |

Format cada entrada (taula de particions):

| 00     | Indica si la particio es activa o no                          |
| ------ | ------------------------------------------------------------- |
| 01-03  | Sector inicial                                                |
| 04     | Tipus de particio (00=buida, 07=NTFS, 12=FAT32, 15=estesa...) |
| 05-07  | Sector final                                                  |
| 08-011 | Primer sector en formal Long Bloc                             |
| 12-15  | Longitud de la partició                                       |

BIOS | boot.img (446B) | grub2 core.img (1MB) | EFI system partition | ubuntu 22 /boot/grub
- MBR ha estat modificat per Linux
- fase 1: boot.img carrega el codi core.img (conegut com fase 1.5) que està guardat en una partició propia (de tipus BIOSGRUB o Reserved BIOS Boot Area) d'1MB.
	*boot.img no comprova quina es la partició activa! !!!!!!!
- fase 1.5: core.img carrega /boot/grub (que es coneix com a Fase 2), ubicat en la partició d'ubuntu (o en qualsevol part del HDD)
- fase 2: S'encarrega de:
  mostrar el menú de GRUB.
  carregar el kernel del SO.
  finalment pasar-li el control.
En MBR trobem una particio ESP (Efi System Partition) que no fa res si estem amb BIOS/MBR.

Ubuntu no té en compte quina és la partició activa.

