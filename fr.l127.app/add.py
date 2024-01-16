import csv
import sys

def add(*colonnes):
    longueur = len(colonnes[0])
    resultat = [0] * longueur
    for colonne in colonnes:
        if len(colonne)==1:
            resultat = [(resultat[i]+colonne[0]) for i in range(longueur)]
        else:
            resultat = [(resultat[i]+colonne[i]) for i in range(longueur)]
    return resultat


def lire_csv_et_executer_add(fonction, input_csv, output_csv):
    colonnes = []

    # Lecture du fichier CSV
    with open(input_csv, newline='') as csvfile:
        reader = csv.reader(csvfile)
        for row in reader:
            # Conversion des éléments de la ligne en entiers si possible
            colonnes.append([int(item) if item.isdigit() else item for item in row])
            print(colonnes)
    # Exécution de la fonction add
    resultat = fonction(*colonnes)
    print(resultat)

    # Écriture du résultat dans un fichier CSV
    with open(output_csv, 'w', newline='') as csvfile:
        writer = csv.writer(csvfile)
        for val in resultat:
            writer.writerow([val])

if __name__ == "__main__":
    # Vérifier si un argument de fichier a été fourni
    if len(sys.argv) > 3:
        script = sys.argv[1]
        input_csv = sys.argv[2]
        output_csv = sys.argv[3]
        fonction = globals()[script] #getattr(globals(),script)

        
        
        lire_csv_et_executer_add(fonction, input_csv, output_csv)
    else:
        println("Veuillez spécifier un fichier CSV en argument.")