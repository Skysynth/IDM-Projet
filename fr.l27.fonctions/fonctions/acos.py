import math

def acos(colonne):
    longueur = len(colonne)
    resultat = [math.acos(colonne[i]) for i in range(longueur)]
    return resultat