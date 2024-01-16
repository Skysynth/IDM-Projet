import math

def exp(colonne):
    longueur = len(colonne)
    resultat = [math.exp(colonne[i]) for i in range(longueur)]
    return resultat