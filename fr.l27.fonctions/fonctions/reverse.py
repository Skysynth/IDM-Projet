#je me suis pas du tout occupée de verif /0, surement ocl ?
def reverse(colonne):
    longueur = len(colonne)
    resultat = [1/colonne[i] for i in range(longueur)]
    return resultat