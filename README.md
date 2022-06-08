# JSBach-Double-Interpreter
JSBach és un llenguatge de programació orientat a la composició algorísmica. Amb JSBach s'utilitzen construccions imperatives per generar composicions que donen lloc a partitures que poden ser desades en diferents formats digitals.

En diem un doble intèrpret perquè funciona en el sentit informàtic (interpreta un programa) i en el sentit musical (interpreta una peça de música).

Per tant, interpreta el llenguatge JSBach té les següents característiques:

# Assignacions:
  Es fan amb el símbol <-, i permeten assignar a variables, tant enters com llistes d'enters o de notes musicals.
# Lectures:
  Es fan amb el símbol <?>, i assignen a la variable especificada a continuació, el valor rebut pel canal d'entrada estàndard.
# Escriptures:
  Es fan amb el símbol <!>, i accepten strings, enters, llistes d'enters i llistes de notes.
# Reproducció:
  Indicada amb el símbol <:>, accepta notes per separat o llistes, i les afegeix a la partitura que es genera i reprodueix al finalitzar el programa
# Invocació de procediments:
  Els procediments en JSBAch son de tipus void. Es poden passar paràmetres; entesrs i notes (per còpia), així com llistes (per referència). Per invocar un mètode, només cal escriure el seu nom seguit dels paràmetres, separats per espais.
# If-then-else:
  Els blocs de codi condicionals s'escriuen de manera similar a Python; sense parèntesi a l'expressió a avaluar, i, com tots els blocs, amb els corresponents separadors '|:' i ':|'.
  El else é
  Els blocs de codi condicionals s'escriuen de manera similar a Python; sense parèntesi a l'expressió a avaluar, i, com tots els blocs, amb els corresponents separadors '|:' i ':|'. El else és opcional.
# Iteració:
  La iteració en JSBach es fa amb el while, on la condició a avaluar va novament sense parèntesi després del "while", i el bloc de codi entre els separadors.
# Manipulació de llistes:
  JSBach inclou quatre operacions bàsiques per a manipular llistats d'enters i de notes musicals. Podem:
    - Accedir a un element dins de l'index de la llista (1, length(llista)):
        Es fa especificant la llista, seguit de claudàtors que contenen l'index a retornar. llista[i] retornaria l'ièsim valor de la llista
    - Obtenir la longitud de la llista
        Es fa amb el símbol #, seguit de la llista en qüestió. #llista retorna el nombre d'elements en aquesta llista. 
    - Afegir un element al final de la llista
        Amb el símbol <<. llista << n avalua n i la concatena al final de llista.
    - Eliminar un element dins de l'index de la llista (1, length(llista))
        Amb el simbol 8< seguit de l'accés a l'element que es vol eliminar. 8< llista[i] elimina l'i-èsim element en llista.

# Partitures
Per a tots aquells programes que facin servir notes musicals i la instrucció de reproducció <:>, un cop acabada l'execució del prorgrama es generen diversos arxius de so, així com un pdf amb la partirura generada. Aquesta es reprodueix automàticament al finalitzar el programa. 

De generar aquestes partitures s'encarrega la funció generate_score.



# Errors:
  Es llancen excepcions quan es detecta algun error en el codi. Algunes d'aquestes son causades per:
    - Accés a un índex fora del rang d'una llista
    - Divisió per zero
    - Intentar accedir a una variable (enter o llista) no declarada
    - Intentar invocar una funció no declarada en el codi
    - Invocar una funció amb el nombre incorrecte de paràmetres

# Altres detalls i estructures del codi intern
Per simular l'enregistrament de variables, l'intèrpret compta amb dues estructures (diccionaris), que s'encarreguen d'emmagatzemar les variables normals, i les llistes.
Interessa guardar-les per separat perquè unes es passen per còpia, i les altres per referència. És per això, que mentre les variables tenen com a clau el nom de la variable, i com a valor el valor actual d'aquesta, el diccionari de llistes funciona d'una manera una mica diferent:
L'intèrpret simula una memòria d'adresses que comencen per zero. Per cada llista nova declarada, li assignem una nova direcció de memòria, i és aquesta la clau del diccionari on s'emmagatzemen les llistes. D'aquesta manera, quan cal passar una llista per paràmetre, en lloc de passar-li el nom de la variable, li passem la direcció on està emmagatzemada.
En la memòria doncs, guardarem com a clau el nom de la variable, i el seu valor serà la direcció de memòria corresponent en la estructura de llistes. És una espècie de diccionari de punters.

Pel que fa a les notes musicals, son constants enteres, i l'intèrpret compta amb una funció encarregada de codificar i descodificar les notes quan és necessari. Per exemple, per avaluar expressions ens interessa que les notes estiguin en forma numèrica, i per tant les decodifiquem. En canvi, a l'hora d'escriure-les, o d'afegir-les a la partitura, cal tenir-les en forma de nota.

La crida a mètodes fa ús d'una altra estructura, que simula un stack de memòria, per anar afegint i traient funcions i permetre recursivitat. Abans de la crida a un programa, canviem l'ambit de les variables, guardant l'estat de tot el necessari abans de fer el canvi. Llavors s'avaluen també que coincideixin els paràmetres. Altrament, salta una excepció.
