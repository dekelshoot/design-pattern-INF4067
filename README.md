# design-pattern-INF4067

Ici, se trouvent tous les codes, fichiers et devoir en relation avec l'ue design pattern

## I- comment naviger dans le projet?

    le projet est constitué de dossiers principaux tels que :

### 1- model

> qui est le dossier ou sont stoqués toutes les modélisations faites au cour de cette année enregistré dans un fichier .pdf

    dans ce dossier nous avons - construction.pdf ou sont stockés toutes les modélisations liés aux patterns de construction - structuration.pdf ou sont stockés toutes les modélisations liés aux patterns de structuration

### 2- construction

> ici nous retrouvons tous le code de différents pattern de construction. nous avons:

#### 2-1- factoryMethode

nous avons :

- [ici](https://github.com/dekelshoot/design-pattern-INF4067/tree/main/construction/FactoryMethodes) le code du pattern factoryMethode
- [ici](https://github.com/dekelshoot/design-pattern-INF4067/tree/main/diagrammes) le diagram

##### objectif:

> Permet de créer un objet dont le type dépend du contexte. L’utilisation d’une fabrique permet de rendre l’instanciation d’objets
> plus flexible qu’avec l’opérateur new

### cas d'utilisation

> Il est utilisé lorsqu’à l’exécution il est nécessaire de déterminer dynamiquement quel objet d’un ensemble de sous-classes doit être instancier.

##### participants

- Frabrique : la classe qui définit la méthode de création d’objets
- Produit : la classe abstraite dont les sous –classes seront instanciées
- ProduitConcret : les sous classes concrètes à instancier
- Client : le classe(programme) qui fait appel à la fabrique pour lui fournir des objets de type Produit

#### 2-2- factory

nous avons :

- [ici](https://github.com/dekelshoot/design-pattern-INF4067/tree/main/construction/FactoryMethodes) le code du pattern factory
- [ici](https://github.com/dekelshoot/design-pattern-INF4067/tree/main/diagrammes) le diagram

##### objectif:

> Permet de créer un objet dont le type dépend du contexte. L’utilisation d’une fabrique permet de rendre l’instanciation d’objets
> plus flexible qu’avec l’opérateur new

### cas d'utilisation

> Il est utilisé lorsqu’à l’exécution il est nécessaire de déterminer dynamiquement quel objet d’un ensemble de sous-classes doit être instancier.

##### participants

- FrabriqueAbstraite : Classe abstraite qui abrite la signature de la méthode de fabrique et l’implémentation des méthodes qui invoquent cette méthode de
  fabrique.
- FabriqueConcrete : Classe concrète qui implémente la méthode fabrique. On
  peut avoir plusieurs fabriques concrètes.
- Produit : la classe abstraite dont les sous –classes seront instanciées
- ProduitConcret : les sous classes concrètes à instancier
- Client : le classe(programme) qui fait appel à la fabrique pour lui fournir des
  objets de type Produit

#### 2-3- AbstractFactory

nous avons :

- [ici](https://github.com/dekelshoot/design-pattern-INF4067/tree/main/construction/AbstractFactory) le code du pattern Abstractfactory
- [ici](https://github.com/dekelshoot/design-pattern-INF4067/tree/main/construction/AbstractFactoryNouvelleFamille) le code du pattern Abstractfactory avec une nouvelle famille
- [ici](https://github.com/dekelshoot/design-pattern-INF4067/tree/main/diagrammes) le diagram

##### objectif:

> Le but est de créer des objets regroupés en familles sans avoir à
> connaître leurs classes concrètes.
> Permet de fournir une interface unique pour instancier des objets
> d’une même famille sans avoir à connaitre les classes à instancier.

### cas d'utilisation

lorsque :

- Le système est indépendant de la création des objets qu’il utilise
- Le système est capable de créer des objets d’une même famille

##### participants

- FrabriqueAbstraite : interface spécifiant les signatures des méthodes
  créant les différents objets
- FrabriqueConcrete (1 et 2) : classes implémentant les méthodes de
  création d’objets. Connaissent les familles et les produits, capable de
  créer une instance d’un produit pour une famille.
- Produit (A et B) : interfaces (ou classes abstraites) des produits
  indépendamment de leur famille.
- Produit (Ax et Bx) : introduisent les familles de produits
- Client : le classe(programme) qui fait appel à la fabrique pour lui
  fournir des objets de type Produit

#### 2-4- Singleton

nous avons :

- [ici](https://github.com/dekelshoot/design-pattern-INF4067/tree/main/construction/Singleton) le code du pattern Singleton
- [ici](https://github.com/dekelshoot/design-pattern-INF4067/tree/main/construction/arithmetique) le code du pattern Single auquel on a ajouter des foctions arithmetique (la class Arithmetique)

##### objectif:

> L’objectif du pattern SINGLETON est de garantir qu’une classe ne possède qu’une seule instance et de fournir un point d’accès global à

### cas d'utilisation

lorsque :

- Est utilisé lorsque l'on a besoin d'exactement un objet pour coordonner des opérations dans un système.

##### participants

- Un seul participant : la classe singleton
- Ses propriétés : - Le ou les constructeurs sont privés. Redéfinir le constructeur par
  défaut, si aucun n’est explicitement défini. - Une attribut de classe : pour stocker l’unique instance en cours - Un getter static et public : pour renvoyer l’instance et la créer au
  besoin

#### 2-5- Bulder

nous avons :

- [ici](https://github.com/dekelshoot/design-pattern-INF4067/tree/main/construction/Singleton) le code du pattern Singleton
- [ici](https://github.com/dekelshoot/design-pattern-INF4067/tree/main/construction/arithmetique) le code du pattern Single auquel on a ajouter des foctions arithmetique (la class Arithmetique)

##### objectif:

> Le but est de créer des objets regroupés en familles sans avoir à
> connaître leurs classes concrètes.
> Permet de fournir une interface unique pour instancier des objets
> d’une même famille sans avoir à connaitre les classes à instancier.

### cas d'utilisation

lorsque :

- Le système est indépendant de la création des objets qu’il utilise
- Le système est capable de créer des objets d’une même famille

##### participants

- FrabriqueAbstraite : interface spécifiant les signatures des méthodes
  créant les différents objets
- FrabriqueConcrete (1 et 2) : classes implémentant les méthodes de
  création d’objets. Connaissent les familles et les produits, capable de
  créer une instance d’un produit pour une famille.
- Produit (A et B) : interfaces (ou classes abstraites) des produits
  indépendamment de leur famille.
- Produit (Ax et Bx) : introduisent les familles de produits
- Client : le classe(programme) qui fait appel à la fabrique pour lui
  fournir des objets de type Produit
