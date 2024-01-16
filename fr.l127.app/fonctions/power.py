#ici une colonne un exp
def power(colonne, exp):
    longueur = len(colonne)
    resultat = [colonne[i]**exp[0] for i in range(longueur)]
    return resultat