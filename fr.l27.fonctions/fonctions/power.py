#ici une colonne un exp
def test(colonne, exp):
    longueur = len(colonne)
    resultat = [colonne[i]**exp for i in range(longueur)]
    return resultat