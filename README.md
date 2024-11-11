# Java Collections 🎯

## 📄 Descripció - Enunciat de l'exercici

Aquest projecte està format per 5 exercicis que exploren diferents col·leccions en Java:

### Nivell 1 ⭐
#### Exercici 1: Mesos de l'any
Implementació d'una llista de mesos de l'any utilitzant ArrayList que permet la inserció ordenada d'elements i la seva posterior conversió a HashSet, demostrant l'ús de col·leccions en Java, la gestió de duplicats mitjançant la sobreescriptura dels mètodes equals() i hashCode(), i el recorregut dels elements tant amb bucle for-each com amb Iterator.

Crea una classe anomenada Month amb un atribut "name" (que emmagatzemarà el nom del mes de l'any). Afegeix 11 objectes Month (cadascun amb el seu atribut diferent) en un ArrayList, a excepció de l'objecte amb atribut "Agost". Després, efectua la inserció en el lloc que correspon a aquest mes i demostra que l’ArrayList manté l'ordre correcte. Converteix l’ArrayList de l’exercici anterior en un HashSet i assegura’t que no permet duplicats. Recorre la llista amb un for i amb un iterador.

#### Exercici 2: Ordre invers
Implementació d'una llista d’enters de l’1 al 10 que demostra l'ús de col·leccions en Java, afegint i imprimint elements a la llista, i utilitzant un ListIterator per invertir l'ordre dels elements en una segona llista, assegurant així l'accés seqüencial i invers d'una col·lecció mitjançant iteradors.

Crea i emplena un List<Integer>. Crea un segon List<Integer> i insereix a la segona llista els elements de la primera en ordre invers. Empra els objectes ListIterator per a llegir els elements de la primera llista i inserir-los en la segona.

#### Exercici 3: Countries
Implementació d'un quiz de capitals on es llegeixen països i capitals d'un fitxer, es guarden en un HashMap per a la consulta, es mostren països de forma aleatòria per recollir respostes de l'usuari, i es registra la puntuació en un fitxer, demostrant l'ús d'entrades/sortides amb fitxers, i col·leccions en Java.

Donat el fitxer countrties.txt (revisa l'apartat recursos) que conté països i capitals. El programa ha de llegir el fitxer i guardar les dades en un HashMap<String, String>. El programa demana el nom de l’usuari/ària, i després ha de mostrar un país de forma aleatòria, guardat en el HashMap. Es tracta que l’usuari/ària ha d’escriure el nom de la capital del país en qüestió. Si l’encerta se li suma un punt. Aquesta acció es repeteix 10 vegades. Un cop demanades les capitals de 10 països de forma aleatòria, llavors s’ha de guardar en un fitxer anomenat classificacio.txt, el nom de l’usuari/ària i la seva puntuació.

### Nivell 2 ⭐⭐
#### Exercici 1: Classificació de restaurants
Implementació d'un sistema de gestió de restaurants que permet emmagatzemar restaurants amb els seus noms i puntuacions en un HashSet, assegurant que no hi hagi duplicats amb el mateix nom i puntuació mitjançant la sobreescriptura dels mètodes equals() i hashCode(), demostrant l'ús de col·leccions úniques i gestió d'entrada d'usuari en Java.

Crea una classe anomenada Restaurant amb dos atributs: nom(String) i puntuació(int). Implementa els mètodes necessaris perquè no es puguin introduir objectes Restaurant amb el mateix nom i la mateixa puntuació en un HashSet creat en el main() de l’aplicació. Pot haver-hi restaurants amb el mateix nom amb diferent puntuació, però no pot haver-hi restaurants amb el mateix nom i la mateixa puntuació.

#### Exercici 2: Classificació ordenada de restaurants
Implementació d'un sistema de gestió de restaurants que permet emmagatzemar restaurants amb els seus noms i puntuacions en un TreeSet, assegurant que no hi hagi duplicats amb la mateixa puntuació, ordenant-los automàticament per nom i puntuació descendent, demostrant l'ús de col·leccions ordenades, comparació d'objectes, gestió d'entrada d'usuari i bones pràctiques de programació orientada a objectes en Java.

Utilitzant la classe del programa anterior, crea la implementació necessària perquè els objectes de la classe Restaurant estiguin ordenats per nom i per puntuació en ordre descendent. 

### Nivell 3 ⭐⭐⭐
#### Exercici 1: Llistes en ordre

Implementació d'un sistema de gestió de persones que llegeix dades d'un fitxer CSV i permet afegir i ordenar persones per nom, cognom o DNI, utilitzant ArrayList i Comparator per manipular les dades de manera flexible i eficient.

Crea una aplicació capaç de llegir un fitxer CSV. Aquest fitxer té 3 camps: nom, cognom i DNI, per cada registre. Es tracta d’ordenar les persones llegides del fitxer, mitjançant el seu nom, cognom o DNI. Pots fer servir la llista que creguis més adient. La classe Persona té 3 atributs (nom, cognom, DNI).


La classe principal té el següent menú:

1.- Introduir persona.

2.- Mostrar les persones ordenades per nom (A-Z).

3.- Mostrar les persones ordenades per nom (Z-A).

4.- Mostrar les persones ordenades per cognoms (A-Z).

5.- Mostrar les persones ordenades per cognoms (Z-A).

6.- Mostrar les persones ordenades per DNI (1-9).

7.- Mostrar les persones ordenades per DNI (9-1).

0.- Sortir.

## 💻 Tecnologies Utilitzades

- Java SE Development Kit (JDK) 17
- IntelliJ IDEA
- Git
- GitHub

## 📋 Requisits

- Java JDK 17 o superior
- IntelliJ IDEA (Community o Ultimate Edition)
- Git instal·lat al sistema

## 🛠️ Instal·lació

1. Clona el repositori:
```bash
git clone https://github.com/EnricW/1.3-Java_Collections-Nivell2.git
```

2. Obre el projecte amb IntelliJ IDEA:
   - Obre IntelliJ IDEA
   - File -> Open
   - Selecciona la carpeta del projecte
   - Espera que el projecte s'indexi i es configurin les dependències

## ▶️ Execució

1. Navega fins a la classe principal que conté el mètode main
2. Fes clic dret sobre la classe
3. Selecciona "Run Main.main()"
