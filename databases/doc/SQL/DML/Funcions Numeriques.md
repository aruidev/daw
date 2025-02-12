Funcions numèriques https://dev.mysql.com/doc/refman/8.0/en/numeric-functions.html 

![[Pasted image 20250123122959.png]]
![[Pasted image 20250123123025.png]]
![[Pasted image 20250123123057.png]]
ROUND(n,\[decimals]) 
Arrodoneix el número n al següent número amb el nombre de decimals indicat més proper. Ex: 
ROUND(8.239, 2) ➡️ 8.24 

TRUNCATE(n,decimals) 
Retorna el numero n només amb el nombre de decimals indicat. Ex: TRUNCATE(8.239, 2) ➡️ 8.23 

FLOOR(n) 
Obté l'enter immediatament més petit o igual que n. Ex: FLOOR(8.6) ➡️ 8 

CEIL(n) Obté l'enter immediatament més gran o igual que n. Ex: CEIL(8.3) ➡️ 9 

<u>Matemàtiques </u>

MOD(m,n) / N % M / N MOD M 
Retorna el residu de dividir m entre n. Ex: MOD(7,5) ➡️ 2 / 7 % 5 ➡️ 2 / 7 MOD 5 ➡️ 2 

POWER(m,n) 
Retorna el numero m elevat a la potència n. Ex: POWER(2,3) ➡️ 8 

SQRT(n) Obté l'arrel quadrada de n. Ex: SQRT(2) ➡️ 1.41421356 

SIGN(n) Retorna -1 si n és negatiu; 0 si n és 0 i 1 si n és positiu. Ex: SIGN(-2.3)  -1 SIGN(0)  0 SIGN(2.3)  1 ABS(n) Calcula el valor absolut de n. Ex: ABS(-2.3)  2.3 EXP(n) Calcula en , és a dir, l'exponent amb base e del número n. Ex: EXP(2)  7.3890561 LOG(m,n) Calcula el logaritme amb base m de n. Ex: LOG(10,100)  2 LOG2(n) Calcula el logaritme amb base 2 de n. EX: LOG2(65536)  16 LOG10(n) Calcula el logaritme amb base 10 de n EX: LOG10(100)  2 PI() Retorna el valor de PI SIN(n) Calcula el sinus de n (n ha d'estar amb radiants) Ex: SIN(0)  0 COS(n) Calcula el cosinus de n (n ha d'estar amb radiants) Ex: COS(0)  1 TAN(n) Calcula la tangent de n (n ha d'estar amb radiants) Llenguatge SQL DDL i DML Ex: TAN(0)  0 Altres Funció Descripció RAND([n]) Retorna un número en punt flotant entre 0 i 1.0 El paràmetre n és un enter que el podem utilitzar com a llavor per obtenir sempre els mateixos valors. Ex: RAND()  0.61914388706828


