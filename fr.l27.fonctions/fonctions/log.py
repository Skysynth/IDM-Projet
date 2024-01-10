import math

def log(colonne):
    longueur = len(colonne)
    resultat = [math.log(colonne[i]) for i in range(longueur)]
    return resultat