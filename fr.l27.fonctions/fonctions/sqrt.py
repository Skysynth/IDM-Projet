import math

def sqrt(colonne):
    longueur = len(colonne)
    resultat = [math.sqrt(colonne[i]) for i in range(longueur)]
    return resultat