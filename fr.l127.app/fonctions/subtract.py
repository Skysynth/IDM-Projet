def subtract(*colonnes):
    longueur = len(colonnes[0])
    resultat = [0] * longueur
    for colonne in colonnes:
        if len(colonne)==1:
            resultat = [(resultat[i]-colonne[0]) for i in range(longueur)]
        else:
            resultat = [(resultat[i]-colonne[i]) for i in range(longueur)]
    return resultat