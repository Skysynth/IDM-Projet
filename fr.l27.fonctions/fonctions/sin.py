import math

def sin(colonne):
    longueur = len(colonne)
    resultat = [math.sin(colonne[i]) for i in range(longueur)]
    return resultat