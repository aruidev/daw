### Passos (entorn gràfic):
sudo apt update
gnome-system / gnome-system-tools (Users and Groups)
Aplicació Users and Groups.
Advanced settings
Advanced
Main group
Afegir user a admins:
account type => change

### Passos (terminal):
`sudo apt update`
`sudo apt install gnome-system-tools`
`sudo apt purge gnome-system-tools` (PARA DESINSTALAR)

Crear usuari:
`adduser`

Crear / afegir grup:
`addgroup`

Afegeix peppa a grup porcs (grup ja creat)
`sudo adduser peppa porcs` 

Info:
`sudo id peppa` (info peppa)
`sudo groups peppa` (info peppa relativa a grups)

Cambiar el grup inicial de peppa:
`sudo usermod -g porcs peppa`

Eliminar usuari com a membre d'un grup:
`sudo deluser peppa familia`

Eliminar grup:
`sudo delgroup porcs`

Eliminar user:
`sudo deluser peppa`

Eliminar carpeta d'usuari:
`sudo rm -R /home/peppa`

Tot en una comanda:
`sudo deluser --remove-home george`

Habilitar compte usuari
`sudo usermod -U george`
or...
`sudo passwd -U george`

Activar caducitat compte usuari (format data AAAA-MM-DD):
`sudo usermod -e 2019-10-16 george`
or...
`sudo chage george -E 2020-05-30`

Comprovar opcions d'un compte d'usuari
`sudo chage -l george`

Cambiar contrasenya:
`sudo passwd peppa`

Fer que demani en la primera sessió d'un usuari el nou password:
`sudo passwd -d george`
`sudo passwd -e george`

`-d` = delete passwd
`-e` = expire passwd

Posar/treure un usuari d'administrador:
`sudo visudo`
Afegim aquesta linia:
`george ALL=(ALL:ALL) ALL`

Saber quins users té el sys:
`cat /etc/passwd | cut -d":" -f1`
or...
`getent passwd | cut -d":" -f1`

Saber quins grups té el sys:
`cat /etc/group | cut -d":" -f1`
or...
`getent group | cut -d":" -f1`

Saber quins membres té un grup:
`grep "familia" /etc/group | cut -d":" -f4`
or...
`getent group "familia"`


