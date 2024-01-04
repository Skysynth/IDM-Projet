def max(*colonnes):
    resultat = max(colonnes[0])
    for colonne in colonnes[1:]:
        resultat = max(resultat, max(colonne))
    return resultat