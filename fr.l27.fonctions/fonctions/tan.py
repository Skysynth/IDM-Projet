import math

def tan(colonne):
    longueur = len(colonne)
    resultat = [math.tan(colonne[i]) for i in range(longueur)]
    return resultat