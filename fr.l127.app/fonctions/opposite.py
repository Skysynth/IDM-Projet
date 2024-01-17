def opposite(colonne):
    longueur = len(colonne)
    print("opposite: colonne = ", colonne)
    resultat = [-colonne[i] for i in range(longueur)]
    print("resultat opposite: ", resultat)

    return resultat