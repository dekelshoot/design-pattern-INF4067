# design-pattern-INF4067

# TCHOUPE KENGNE DEKEL JUNIOR 19M2394

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

### 3- Structuration

> ici nous retrouvons tous le code de différents pattern de Structuration. nous avons:

#### 3-1- adapteur

nous avons :

- [**ici**](https://github.com/dekelshoot/design-pattern-INF4067/tree/main/structuration/adaptateur/Adaptateur) le code du pattern adapteur
- [**ici**](https://github.com/dekelshoot/design-pattern-INF4067/blob/main/models/Structuration.pdf) le diagram
- [**ici**](https://github.com/dekelshoot/design-pattern-INF4067/tree/main/structuration/adaptateur/AdaptateurCarre) le code du pattern adapteur qui adapte le rectangle en carre
- [**ici**](https://github.com/dekelshoot/design-pattern-INF4067/tree/main/structuration/adaptateur/AdapteurImpressionDocument) le code du pattern adapteur implemente l'impression de document
- [**ici**](https://github.com/dekelshoot/design-pattern-INF4067/tree/main/structuration/adaptateur/adaptateurHeritantDlist) le code du pattern adapteur heritant de Dlist
- [**ici**](https://github.com/dekelshoot/design-pattern-INF4067/tree/main/structuration/adaptateur/adaptateurImplementantDlist) le code du pattern adapteur implementant de Dlist
- [**ici**](https://github.com/dekelshoot/design-pattern-INF4067/tree/main/structuration/adaptateur/adaptateurUtilisantLaFileEtDlist) le code du pattern adapteur adaptant la file en de Dlist

##### objectif:

> Son but est de convertir l’interface d’une classe existante en un
> autre attendue par le client également existants afin qu’ils
> puissent travailler ensemble.

##### cas d'utilisation:

> On l'utilise lorsque l'on veut confier à une classe existante une nouvelle interface pour répondre aux besoins de clients.

##### participants

- Interface : introduit la signature des méthodes de l’objet
- Client : programme ou classe qui interagit avec les objets
  répondant à interface
- Adaptateur : implémente les méthodes de Interface en
  invoquant les méthodes de l’objet adapte
- Adapte : l’objet dont l’interface doit être adaptée pour
  correspondre a Interface.

#### 3-2- Composite

nous avons :

- [**ici**](https://github.com/dekelshoot/design-pattern-INF4067/tree/main/structuration/composite/Composite) le code du pattern Composite
- [**ici**](https://github.com/dekelshoot/design-pattern-INF4067/blob/main/models/Structuration.pdf) le diagram
- [**ici**](https://github.com/dekelshoot/design-pattern-INF4067/tree/main/structuration/composite/ComositeTexte) le code du pattern Composite du Texte paragraphe et des section
- [**ici**](https://github.com/dekelshoot/design-pattern-INF4067/tree/main/structuration/composite/CompositeRepertoire) le code du pattern Composite du systeme de fichier

##### objectif:

> Il permet de combiner des objets en structures plus grandes.
> Il décrit une façon de traiter de la même manière les objets
> simples et les objets composites .
> Composer des objets dans des structures arborescentes pour
> représenter des hiérarchies composants/composés
> Permet au client de manipuler uniformément les objets simples et
> les objets au sein de leurs compositions

##### cas d'utilisation:

> On l'utilise lorsque l'on veut omposer des objets dans des structures arborescentes pour représenter des hiérarchies composants/composés

##### participants

- Component
  - déclare l’interface commune à tous les objetss
  - déclare le comportement par défaut pour toutes les classes
- Leaf : représente une feuille
  - Implémente le comportement élémentaire
- Composite : définit le comportement des composants ayant des
  fils, stocke les fils et implémente les opérations nécessaires à leur
  gestion.
- Client : utilise l’interface component
  - Si le receveur est une feuille la requête est directement traitée
  - Sinon le composite retransmet la requête à ses fils.

#### 3-3- Bridge

nous avons :

- [**ici**](https://github.com/dekelshoot/design-pattern-INF4067/tree/main/structuration/brige/bridgeStructureGenerique) le code du pattern Bridge
- [**ici**](https://github.com/dekelshoot/design-pattern-INF4067/blob/main/models/Structuration.pdf) le diagram
- [**ici**](https://github.com/dekelshoot/design-pattern-INF4067/tree/main/structuration/brige/bridgeForme) le code du pattern bridge avec les formes

##### objectif:

> Il permet de découpler l’interface d’une classe et son
> implémentation.
> Ceci permet à l’interface et l’implémentation de varier
> séparément.
> Utilise la règle : préférez la composition à l’héritage?.

##### participants

- Abstraction : définit l’interface de l’abstraction; gère une référence
  à un objet de type implémentation.
- RefineAbstration : enrichit l’interface définie par l’abstraction pour
  constituer une classe concrète
- Implementor : définit l’interface commune pour toutes les
  implémentations concrètes. En général elle définit des opérations
  primitives
- ConcreteImplementor : réalise concrètement l’implémentation de
  l’interface.
- bridge : lien d’association qui fait le pont entre l’abstraction et
  l’implémentation.

#### 3-4- Decorateur

nous avons :

- [**ici**](https://github.com/dekelshoot/design-pattern-INF4067https://github.com/dekelshoot/design-pattern-INF4067/tree/main/structuration/decorateur/decorateurStructureGenerique) le code du pattern Decorateur
- [**ici**](https://github.com/dekelshoot/design-pattern-INF4067/blob/main/models/Structuration.pdf) le diagram
- [**ici**](https://github.com/dekelshoot/design-pattern-INF4067/tree/main/structuration/decorateur/decorateurSystemeFenetre) le code du pattern decorateur avec le system de fenêtre

##### objectif:

> Attacher dynamiquement des fonctionnalités supplémentaires à
> un objet.
> L’ajout se fait dynamiquement à l’exécution
> Cet ajout de fonctionnalités ne modifie pas l’interface de l’objet
> L’ajout reste transparent vis-à-vis des clients.
> il offre une alternative assez souple à l’héritage pour composer de
> nouvelles fonctionnalités

##### participants

- ComposantAbstrait : déclare l’interface commune pour les
  décorateurs et les objets décorés.
- ComposantConcret : la classe qui définit les objets initiaux auxquels
  de nouvelles fonctionnalités doivent être ajoutées.
- Decorateur
  composant
  : classe abstraite ayant une référence vers un
- DecorateurConcretA et DecorateurConcretB : définissent des
  comportement
  supplémentaires
  pouvant
  être
  ajoutés
  dynamiquement aux composants.
- Client
  : utilise le décorateur pour l’ajout dynamique des
  fnctionnalités.
