#TD_BDD_1

Question 1:

	GitHub:
		redirection https
		Pagination
		Limitation du taux
		Hypermedia
		Authentification
		
	Météo:
		Météo par ville par heure
		Météo par ville par nom
		Météo par vile par ID
		Météo par ville par coordonnées GPS
		Météo par pays
		
Question 2:

	Choix de GitHub
	
	Liste des requetes POST:
		POST http://server/simplegit-progit.git/git-receive/pack
        curl -i -u username -d '{"scopes":["public_repo"]}' https://api.github.com/authorizations

    Liste des requêtes HTTP GET :
        curl -i "https://api.github.com/repos/vmg/redcarpet/issues?state=closed"
        curl https://api.github.com

    Requêtes Authentifiées :
        curl https://api.github.com/?access_token=OAUTH-TOKEN
        curl -H "Authorization: token OAUTH-TOKEN" https://api.github.com

Question 3:

	La premiere requete, POST, ne fonctionne pas
	Le deuxieme requete, GET, fonctionne
	
Question 4:
	
	Permet la création d'une application de statistique du répository GIT par jour
	
	Mobile:
		trier les versions des commits
		afficher les branches
		historiser l'évolution du projet
		
	Web:
		trier les versions des commits
		afficher les branches
		historiser l'évolution du projet
		
	
	Lien Mobile: https://ninjamock.com/s/9J88T
	Lien Web: https://ninjamock.com/s/8J88T