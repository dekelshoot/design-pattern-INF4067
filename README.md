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
