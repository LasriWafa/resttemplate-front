# Front-end: Client RestTemplate

## I. Description
Ce projet constitue la partie Front-end du TP. C'est une application Spring Boot Web utilisant JSP pour l'interface utilisateur et `RestTemplate` pour communiquer avec l'API Back-end.

## II. Configuration du Projet
-   **Nom du projet** : `resttemplate-front`
-   **Port** : `9191`
-   **Serveur REST cible** : `http://localhost:9090/rest/emp`

### Dépendances (pom.xml)
-   `spring-boot-starter-web`
-   `lombok`
-   `jakarta.servlet.jsp.jstl` & `tomcat-embed-jasper` : Pour le support JSP.

## III. Fonctionnalités Clés

### 1. Configuration RestTemplate
Un bean `RestTemplate` est configuré dans `MainApplication` pour être injecté dans les contrôleurs.

### 2. Contrôleur (`EmpController`)
Gère les interactions utilisateur et appelle l'API Back-end :
-   `GET /` ou `/viewemp` : Affiche la liste des employés (Appelle `GET` API).
-   `GET /empform` : Affiche le formulaire d'ajout.
-   `POST /save` : Enregistre un employé (Appelle `POST` API).
-   `GET /editemp/{id}` : Affiche le formulaire d'édition (Appelle `GET` API par ID).
-   `POST /editsave` : Sauvegarde les modifications (Appelle `POST` API).
-   `GET /deleteemp/{id}` : Supprime un employé (Appelle `DELETE` API).

### 3. Vues (JSP)
-   `index.jsp` : Page d'accueil avec liens.
-   `viewemp.jsp` : Tableau listant les employés avec options Éditer/Supprimer.
-   `empform.jsp` : Formulaire de création.
-   `empeditform.jsp` : Formulaire de modification.

## IV. Lancement
1.  Assurez-vous que le projet **Back-end** est démarré (`port 9090`).
2.  Importer le projet Maven `resttemplate-front`.
3.  Exécuter `MainApplication`.
4.  Accéder à l'application : `http://localhost:9191/`
