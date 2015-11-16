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
