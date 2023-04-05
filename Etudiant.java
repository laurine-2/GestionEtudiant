public class Etudiant {
    // Variables privées pour stocker les informations de l'étudiant
    private int id;
    private String nom;
    private String prenom;
    private double moyenne;

    // Constructeur pour initialiser les variables privées avec des valeurs
    public Etudiant(int id, String nom, String prenom, double moyenne) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.moyenne = moyenne;
    }

    // Getters et setters pour accéder aux variables privées
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }
}
