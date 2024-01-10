import math

def tanh(colonne):
    longueur = len(colonne)
    resultat = [math.tanh(colonne[i]) for i in range(longueur)]
    return resultat