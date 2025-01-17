Són operadors que només afecten a una dada.

- Signe negatiu (-): canvia el signe d'una dada o variable.
- Increment (++): a++ → a = a + 1.
- Decrement (--): a-- → a = a - 1).

Els operadors **increment** i **decrement** modifiquen directament la variable, sense haver de fer una assignació.

let a = 5;  
let b = -a;    // b = -5  
++a;           // a = 6    // També es podria haver fet a++;  
a--;           // a = 5    // També es podria haver fet --a;

Els operadors increment i decrement es poden posar abans o després de la variable.  
En la majoria de casos, és igual fer a++ que ++a, però en alguns casos, no:

1. v = b + ++a; → ++a; v = b + a;
2. v = b + a++; → v = b + a; ++a;

let a = 5;  
let b = 5;  
let v = b + ++a;    // a = 6; **v = 11;**  
v = b + a++;        // **v = 10;** a = 6;  

Els següents exemples s'entendran quan s'expliquin els _arrays_ i les funcions:

- Cas 1 (_arrays_)  
    1. v = a[++i]; → ++i; v = a[i];
    2. v = a[i++]; → v = a[i]; ++i;

- Cas 2 (_return_)  
    1. return ++i; → ++i; return i;
    2. return i++; no té equivalent (seria equivalent a return i; ++i; però --i; no s'executaria mai)