## Definició d'un usuari en YAML

## Requisits previs

- Un sistema Ubuntu (pot ser una màquina virtual o un servidor).
- Connexió a Internet.
- Accés a un compte amb permisos de root o <font color="#ffffff">sudo.</font>

<font color="green">Instal·lem [Linux Mint 22.1](https://linuxmint.com/) (SO fork d'Ubuntu) a una màquina virtual, en configuració NAT per tenir accés a Internet.</font>

## Tasques a realitzar

1. Actualitza els paquets del sistema.
```bash
sudo apt update && sudo apt upgrade -y
```

2. Instal·la Python3 i Ansible.
```bash
sudo apt install -y python3 python3-pip ansible
```

3. Comprova la instal·lació amb ansible --version.
```bash
ansible --version
```

![Ansible Version](./img/Pasted image 20250320205142.png)

### Configurar l'inventari d'Ansible (inventory.ini)

1. Crea un fitxer inventory.ini.
```bash
nano inventory.ini
```

2. Afegeix la configuració perquè Ansible pugui gestionar el servidor local (127.0.0.1).
```bash
[webservers]
127.0.0.1 ansible_user=root ansible_ssh_pass=<PASSWORD> ansible_ssh_common_args='-o StrictHostKeyChecking=no'
```

3. Configura l'usuari i la contrasenya per a la connexió SSH.
```bash
sudo passwd root
```

### Comprovar la connexió amb Ansible

1. Executa ansible -i inventory.ini webservers -m ping.
![Ansible Ping](./img/Pasted image 20250320200635.png)

2. Si apareixen errors, soluciona'ls seguint les instruccions.

##### ⚠ Possible error: ssh: connect to host 127.0.0.1 port 22: Connection refused

Solució: Instal·lar i activar el servidor SSH:
```bash
sudo apt install openssh-server -y
```

```bash
sudo systemctl enable ssh
```

```bash
sudo systemctl start ssh
```

##### ⚠ Possible error: Failed to connect to the host via ssh

Solució: Instal·lar sshpass per permetre connexions amb contrasenya:
```bash
sudo apt install sshpass -y
```

##### ⚠ Possible error: Permission denied (publickey, password)

Solució: Edita el fitxer de configuració SSH:
```bash
sudo nano /etc/ssh/sshd_config
```

Modificar aquestes linies:
```sshd_config
PermitRootLogin yes

PasswordAuthentication yes
```

Reiniciar SSH:
```bash
sudo systemctl restart ssh
```


### Crear un Playbook per instal·lar Apache (apache_deploy.yml)

1. Crea un fitxer YAML que instal·li Apache, afegeix una tasca per iniciar el servei i activar-lo, i un altre per copiar un fitxer index.html com a pàgina principal.

<font color="green">apache_deploy.yaml</font>
```yaml
---
- name: Deploy Apache Server
  hosts: webservers
  become: yes 

  tasks:
    - name: Install Apache
      apt:
        name: apache2
        state: present
        update_cache: yes

    - name: Start and enable Apache
      systemd:
        name: apache2
        state: started
        enabled: yes

    - name: Copy index.html to Apache root
      copy:
        src: index.html
        dest: /var/www/html/index.html
        mode: '0644'

```

2. Crea un fitxer HTML com a pàgina principal.
```html
<!DOCTYPE html>
<html lang="ca">
<head>
    <meta charset="UTF-8">
    <title>Pàgina de prova</title>
</head>
<body>
    <h1>Apache instal·lat amb Ansible!</h1>
</body>
</html>
```

### Executar el Playbook

1. Executa el Playbook.
```bash
ansible-playbook -i inventory.ini apache_deploy.yaml
```

2. Observa com Ansible executa cada tasca.
![Ansible Playbook Execution](./img/Pasted image 20250320205656.png)

### Comprovar el desplegament d'Apache

1. Verifica que Apache està funcionant
```bash
systemctl status apache2
```
![Apache Status](./img/Pasted image 20250320205934.png)

2. Accedeix a http://127.0.0.1 des del navegador i comprova que es mostra la pàgina creada.
![Apache Web Page](./img/Pasted image 20250320205741.png)

### Llegeix l'arxiu utilitzant Python

1. Fes l'arxiu corresponent 

<font color="green">read_yaml.py</font>
```python
import yaml

# Llegir el fitxer YAML
with open("apache_deploy.yaml", "r") as file:
    data = yaml.safe_load(file)
    
# Mostrar informació llegida
print("Nom de la tasca:", data[0]['name'])
print("Hosts afectats:", data[0]['hosts'])
print("Llista de tasques:") 

for task in data[0]['tasks']:
    print(f"- {task['name']}")
```

2. Executa l'arxiu

```bash
python3 read_yaml.py
```

![Python YAML Result](./img/Pasted image 20250320210851.png)
