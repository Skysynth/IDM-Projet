#jai pas verif que la taille des colonees etaient ok, ocl ?
#peut ajouter constante (colonne a un seul element) a tout les elemnt de la colonne
#ne pas mettre la constante en premier
def add(*colonnes):
    print("add, colonnes = ", colonnes)
    longueur = len(colonnes[0])
    resultat = [0] * longueur
    for colonne in colonnes:
        if len(colonne)==1:
            resultat = [(resultat[i]+colonne[0]) for i in range(longueur)]
        else:
            resultat = [(resultat[i]+colonne[i]) for i in range(longueur)]
    print("resultat add: ", resultat)
    return resultat