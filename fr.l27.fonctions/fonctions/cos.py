import math

def cos(colonne):
    longueur = len(colonne)
    resultat = [math.cos(colonne[i]) for i in range(longueur)]
    return resultat