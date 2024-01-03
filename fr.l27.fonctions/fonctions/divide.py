#je me suis pas du tout occupée de verif /0, surement ocl ?
def divide(*colonnes):
    longueur = len(colonnes[0])
    resultat = colonnes[0].copy()
    for colonne in colonnes[1:]:
        if len(colonne)==1:
            resultat = [(resultat[i]/colonne[0]) for i in range(longueur)]
        else:
            resultat = [(resultat[i]/colonne[i]) for i in range(longueur)]
    return resultat