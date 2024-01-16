#attention à la division par 0
def divide(*colonnes):
    longueur = len(colonnes[0])
    resultat = colonnes[0].copy()
    for colonne in colonnes[1:]:
        if len(colonne)==1:
            resultat = [(resultat[i]/colonne[0]) for i in range(longueur)]
        else:
            resultat = [(resultat[i]/colonne[i]) for i in range(longueur)]
    return resultat