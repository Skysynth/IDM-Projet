import math

def sinh(colonne):
    longueur = len(colonne)
    resultat = [math.sinh(colonne[i]) for i in range(longueur)]
    return resultat