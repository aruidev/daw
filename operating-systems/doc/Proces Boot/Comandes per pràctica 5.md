lsblk => Llista dels dispositius muntats
- lsblk -f /dev/sda => Saber quines particions tenim i com estàn muntades

df => Informe del sistema de fitxers
- df /carpeta => per saber en quina partició està muntada la carpeta

Tots els dispositius d'Ubuntu estàn situats (no muntats) sobre /dev)


| Dispoitiu                      | Nom unitat          |
| ------------------------------ | ------------------- |
| Segona disquetera floppy       | /dev/fd0            |
|                                |                     |
| Primer HDD                     | /dev/hda            |
| Primera partició del HDD       | /dev/hda2           |
|                                |                     |
| Segon disc HDD                 | /dev/hdb            |
| Primera particio del segon HDD | /dev/hdb1           |
|                                |                     |
| Primer disc dur SCSI o SATA    | /dev/sda            |
|                                |                     |
| Primera unitat CD SCSI o SATA  | /dev/scd0 o dev/sr0 |
