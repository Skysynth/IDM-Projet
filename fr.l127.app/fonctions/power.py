#ici une colonne un exp
def power(colonne, exp):
    print("power: colonne = ", colonne)
    longueur = len(colonne)
    resultat = [colonne[i]**exp[0] for i in range(longueur)]
    print("resultat power: ", resultat)
    return resultat