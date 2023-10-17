# design-pattern-INF4067

Ici, se trouvent tous les codes, fichiers et devoir en relation avec l'ue design pattern

## I- comment naviger dans le projet?

    le projet est constitué de dossiers principaux tels que :

### 1- model

> qui est le dossier ou sont stockés toutes les modélisations faites au cours de cette année enregistrée dans un fichier .pdf

    dans ce dossier nous avons

- construction.pdf ou sont stockés toutes les modélisations liés aux patterns de construction
- structuration.pdf ou sont stockés toutes les modélisations liés aux patterns de structuration

### 2- construction

> ici nous retrouvons tous le code de différents pattern de construction. nous avons:

#### 2-1- factoryMethode

nous avons :

- [**ici**](https://github.com/dekelshoot/design-pattern-INF4067/tree/main/construction/FactoryMethodes) le code du pattern factoryMethode
- [**ici**](https://github.com/dekelshoot/design-pattern-INF4067/tree/main/diagrammes) le diagram

##### objectif:

> Permet de créer un objet dont le type dépend du contexte. L’utilisation d’une fabrique permet de rendre l’instanciation d’objets
> plus flexible qu’avec l’opérateur new

##### cas d'utilisation:

> Il est utilisé lorsqu’à l’exécution il est nécessaire de déterminer dynamiquement quel objet d’un ensemble de sous-classes doit être instancier.

##### participants

- Frabrique : la classe qui définit la méthode de création d’objets
- Produit : la classe abstraite dont les sous –classes seront instanciées
- ProduitConcret : les sous classes concrètes à instancier
- Client : le classe(programme) qui fait appel à la fabrique pour lui fournir des objets de type Produit

#### 2-2- factory

nous avons :

- [**ici**](https://github.com/dekelshoot/design-pattern-INF4067/tree/main/construction/FactoryMethodes) le code du pattern factory
- [**ici**](https://github.com/dekelshoot/design-pattern-INF4067/tree/main/diagrammes) le diagram

##### objectif:

> Permet de créer un objet dont le type dépend du contexte. L’utilisation d’une fabrique permet de rendre l’instanciation d’objets
> plus flexible qu’avec l’opérateur new

##### cas d'utilisation:

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

- [**ici**](https://github.com/dekelshoot/design-pattern-INF4067/tree/main/construction/AbstractFactory) le code du pattern Abstractfactory
- [**ici**](https://github.com/dekelshoot/design-pattern-INF4067/tree/main/construction/AbstractFactoryNouvelleFamille) le code du pattern Abstractfactory avec une nouvelle famille
- [**ici**](https://github.com/dekelshoot/design-pattern-INF4067/tree/main/diagrammes) le diagram

##### objectif:

> Le but est de créer des objets regroupés en familles sans avoir à
> connaître leurs classes concrètes.
> Permet de fournir une interface unique pour instancier des objets
> d’une même famille sans avoir à connaitre les classes à instancier.

##### cas d'utilisation:

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

- [**ici**](https://github.com/dekelshoot/design-pattern-INF4067/tree/main/construction/Singleton) le code du pattern Singleton
- [**ici**](https://github.com/dekelshoot/design-pattern-INF4067/tree/main/construction/arithmetique) le code du pattern Single auquel on a ajouter des foctions arithmetique (la class Arithmetique)

##### objectif:

> L’objectif du pattern SINGLETON est de garantir qu’une classe ne possède qu’une seule instance et de fournir un point d’accès global à

##### cas d'utilisation:

lorsque :

- Est utilisé lorsque l'on a besoin d'exactement un objet pour coordonner des opérations dans un système.

##### participants

- Un seul participant : la classe singleton
- Ses propriétés : - Le ou les constructeurs sont privés. Redéfinir le constructeur par
  défaut, si aucun n’est explicitement défini. - Une attribut de classe : pour stocker l’unique instance en cours - Un getter static et public : pour renvoyer l’instance et la créer au
  besoin

#### 2-5- Builder

nous avons :

- **[ici](https://github.com/dekelshoot/design-pattern-INF4067/tree/main/construction/Builder)** le code du pattern Builder
- **[ici](https://github.com/dekelshoot/design-pattern-INF4067/tree/main/construction/Builder_getPizza_dans_class_concrete)** le code du pattern Builder avec la methode getPizza dans les classes concrètes
- **[ici](https://github.com/dekelshoot/design-pattern-INF4067/tree/main/construction/Builder_ajout_troisieme_type)** le code du pattron builder avec k'ajout du troisième type (PizzaLocale)

##### objectif:

> Le but est d’encapsuler la construction d’objets complexes de
> sorte qu’un client puisse créer ces objets sans se préoccuper des
> différents étapes nécessaires.

##### cas d'utilisation:

lorsque :

- On veut créer des objets complexes à partir d’autres objets sources
- On veut assembler plusieurs objets pour les « monter » et
  n’en faire qu’un.

##### participants

- MonteurAbstrait : précise une classe abstraite (ou une interface)
  pour la création de partie d’un objet Produit
- MonteurConcret : construit et assemble des parties du produit
  par implémentation des méthodes du MonteurAbstrait
- Directeur : construit un objet en utilisant l’interface du Monteur
- Produit : représente l’objet complexe en cours de construction

#### 2-6- Prototype

nous avons :

- **[ici](https://github.com/dekelshoot/design-pattern-INF4067/tree/main/construction/prototype)** le code du pattern prototype

##### objectif:

> permet de définir le genre d'objet à créer en dupliquant une instance qui sert d'exemple.

##### cas d'utilisation:

lorsque :

- la création d'une
  instance est complexe ou consommatrice en temps. Plutôt que créer plusieurs instances de la classe, on copie
  la première instance et on modifie la copie de façon appropriée

##### participants

- Prototype: sert de modèle principal pour la création de nouvelles copies. Les classes
- ConcretePrototype1 et ConcretePrototype2 viennent spécialiser la classe Prototype en venant par exemple
  modifier certains attributs. La méthode clone() doit retourner une copie de l'objet concerné. Les sous-classes
  peuvent hériter ou surcharger la méthode clone().
- Le Client: va se charger d'appeler les méthodes de
  clonage via sa méthode operation().
