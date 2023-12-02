# design-pattern-INF4067

# TCHOUPE KENGNE DEKEL JUNIOR 19M2394

Ici, se trouvent tous les codes, fichiers et devoir en relation avec l'ue design pattern

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
