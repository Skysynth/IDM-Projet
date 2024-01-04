import math

def atan(colonne):
    longueur = len(colonne)
    resultat = [math.atan(colonne[i]) for i in range(longueur)]
    return resultat