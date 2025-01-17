1. `.`  
    **Text:** `a`  
    _Explicació:_ Qualsevol caràcter, excepte salts de línia.
    
2. `.?`  
    **Text:** `b` o `` (buit)  
    _Explicació:_ Cap o un caràcter (opcional).
    
3. `.+`  
    **Text:** `abc`  
    _Explicació:_ Un o més caràcters.
    
4. `.*`  
    **Text:** `` (buit) o `123`  
    _Explicació:_ Cap, un o més caràcters.
    
5. `\.`  
    **Text:** `.`  
    _Explicació:_ Literalment un punt.
    
6. `.{3,5}`  
    **Text:** `abcd` o `12345`  
    _Explicació:_ Entre 3 i 5 caràcters de qualsevol tipus.
    
7. `[A-Za-z]{3}`  
    **Text:** `abc` o `XYZ`  
    _Explicació:_ Exactament tres lletres (majúscules o minúscules).
    
8. `\(\)`  
    **Text:** `()`  
    _Explicació:_ Els parèntesis literals oberts i tancats.
    
9. `\d{4}`  
    **Text:** `2024` o `1234`  
    _Explicació:_ Exactament quatre dígits numèrics.
    
10. `\d\d?\\\d{4}`  
    **Text:** `1\2024` o `12\2024`  
    _Explicació:_ Un o dos dígits seguits d'un `\` literal i després quatre dígits.