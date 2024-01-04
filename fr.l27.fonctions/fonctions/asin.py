import math

def asin(colonne):
    longueur = len(colonne)
    resultat = [math.asin(colonne[i]) for i in range(longueur)]
    return resultat