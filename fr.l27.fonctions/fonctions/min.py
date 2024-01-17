def min(*colonnes):
    nb_ligne = len(colonnes[0])
    nb_colonne = len(colonnes)
    resultat = [0] * nb_ligne
    copy = list(colonnes)
    for i in range(nb_colonne):
        if len(copy[i]) == 1:
            copy[i] = copy[i] * nb_ligne
    for i in range(nb_ligne):
        resultat[i] = __builtins__.min(copy_i[i] for copy_i in copy)
    return resultat