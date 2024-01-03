#ok pour 2 colonnes
def test(*colonnes):
    longueur = len(colonnes[0])
    resultat = colonnes[0].copy()
    for colonne in colonnes[1:]:
        resultat = [(resultat[i]%colonne[i]) for i in range(longueur)]
    return resultat