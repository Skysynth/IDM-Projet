import math

def factorial(colonne):
    longueur = len(colonne)
    resultat = [math.factorial(colonne[i]) for i in range(longueur)]
    return resultat