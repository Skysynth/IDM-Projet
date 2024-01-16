import math

def cosh(colonne):
    longueur = len(colonne)
    resultat = [math.cosh(colonne[i]) for i in range(longueur)]
    return resultat