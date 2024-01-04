def min(*colonnes):
    resultat = min(colonnes[0])
    for colonne in colonnes[1:]:
        resultat = min(resultat, min(colonne))
    return resultat