
from algoGen import *
import csv
import sys

def ecrire_csv(donnees, nom_fichier):
    # Vérifier si les données sont une liste de listes ou une simple liste
    if all(isinstance(el, list) for el in donnees):
        liste_de_listes = donnees
    else:
        liste_de_listes = [donnees]  # Convertir en liste de listes pour une seule colonne

    # Calculer la longueur maximale des sous-listes
    longueur_max = __builtins__.max(len(sous_liste) for sous_liste in liste_de_listes)
    
    # Compléter les sous-listes plus courtes avec des chaînes vides
    liste_normalisee = [sous_liste + [''] * (longueur_max - len(sous_liste)) for sous_liste in liste_de_listes]

    # Ouvrir le fichier CSV en mode écriture
    with open(nom_fichier, 'w', newline='', encoding='utf-8') as fichier:
        writer = csv.writer(fichier)

        # Écrire les données dans le fichier CSV
        for i in range(longueur_max):
            writer.writerow([sous_liste[i] for sous_liste in liste_normalisee])

    
# def lire_csv_et_executer_add(fonction, input_csv, output_csv):
#     colonnes = []

#     # Lecture du fichier CSV
#     with open(input_csv, newline='') as csvfile:
#         reader = csv.reader(csvfile)
#         for row in reader:
#             # Conversion des éléments de la ligne en entiers si possible
#             colonnes.append([int(item) if item.isdigit() else item for item in row])
#     # Exécution de la fonction add

#     resultat = fonction(*colonnes)
#     ecrire_csv(resultat, output_csv)
            
def lire_csv_et_executer_add(fonction, input_csv, output_csv):
    colonnes = []

    # Lecture du fichier CSV
    with open(input_csv, newline='') as csvfile:
        reader = csv.reader(csvfile)
        for row in reader:
            nouvelle_ligne = []
            for item in row:
                try:
                    # Tente de convertir l'élément en entier
                    nouvelle_ligne.append(int(item))
                except ValueError:
                    # Laisse l'élément sous forme de chaîne si la conversion échoue
                    nouvelle_ligne.append(item)
            colonnes.append(nouvelle_ligne)
    
    # Exécution de la fonction add
            
    resultat = fonction(*colonnes)
    print("resultat = ", resultat)
    ecrire_csv(resultat, output_csv)


if __name__ == "__main__":
    # Vérifier si un argument de fichier a été fourni
    if len(sys.argv) > 3:
        script = sys.argv[1]
        input_csv = sys.argv[2]
        output_csv = sys.argv[3]
        fonction = globals()[script]         
        lire_csv_et_executer_add(fonction, input_csv, output_csv)
    else:
        print("Usage : python3 lanceur_algo.py <script> <input_csv> <output_csv>")