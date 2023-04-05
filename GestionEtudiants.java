import java.util.ArrayList;
import java.util.Scanner;

public class GestionEtudiants {
    private ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>(); // Une liste pour stocker les étudiants
    private Scanner scanner = new Scanner(System.in); // Un scanner pour lire l'entrée utilisateur

    public void ajouterEtudiant() {
        System.out.println("Ajouter un etudiant :");
        System.out.print("ID : ");
        int id = scanner.nextInt();
         // Lire l'ID de l'étudiant
        scanner.nextLine(); 
        // Vider le scanner
        System.out.print("Nom : ");
        String nom = scanner.nextLine(); 
        // Lire le nom de l'étudiant
        System.out.print("Prénom : ");
        String prenom = scanner.nextLine(); 
        // Lire le prénom de l'étudiant
        System.out.print("Moyenne : ");
        double moyenne = scanner.nextDouble(); 
        // Lire la moyenne de l'étudiant

        Etudiant etudiant = new Etudiant(id, nom, prenom, moyenne); 
        // Créer un nouvel objet étudiant
        etudiants.add(etudiant); 
        // Ajouter l'étudiant à la liste

        System.out.println("L'étudiant a été ajouté avec succès !");
        
    }

    public void afficherListeEtudiants() {
        System.out.println("Liste des etudiants :");
        for (Etudiant etudiant : etudiants) { // Parcourir la liste des étudiants
            System.out.println(etudiant.getId() + " " + etudiant.getNom() + " " + etudiant.getPrenom() + " " + etudiant.getMoyenne()); // Afficher les informations de l'étudiant
        }
    }

    public void lancer() {
        boolean continuer = true;
        while (continuer) {
            System.out.println("\nQue voulez-vous faire ?");
            System.out.println("1. Ajouter un etudiant");
            System.out.println("2. Afficher la liste des etudiants");
            System.out.println("3. Quitter");
            System.out.print("Votre choix : ");

            int choix = scanner.nextInt(); // Lire le choix de l'utilisateur
            scanner.nextLine();
            switch (choix) {
                case 1:
                    ajouterEtudiant(); // Appeler la méthode pour ajouter un étudiant
                    break;
                case 2:
                    afficherListeEtudiants(); // Appeler la méthode pour afficher la liste des étudiants
                    break;
                case 3:
                    continuer = false; // Sortir de la boucle while pour quitter le programme
                    break;
                default:
                    System.out.println("Choix invalide !");
            }
        }
        scanner.close(); // Fermer le scanner
    }
}
 // Vider
