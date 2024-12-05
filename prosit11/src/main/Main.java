package main;

import entities.*;

public class Main {
    public static void main(String[] args) {
        // Création de départements
        Departement dep1 = new Departement(1, "Informatique", 10);
        Departement dep2 = new Departement(2, "RH", 5);
        Departement dep3 = new Departement(3, "Finance", 8);

        // Création d'employés
        Employe emp1 = new Employe(1, "Mariem", "Khalfallah", "Manager", dep1);
        Employe emp2 = new Employe(2, "Fatma", "Khalfallah", "Analyste", dep2);
        Employe emp3 = new Employe(3, "Amna", "Mkadmi", "Technicien", dep1);
        Employe emp4 = new Employe(4, "Zeynib", "Saidani", "Comptable", dep3);
        Employe emp5 = new Employe(5, "Youssif", "Trabilsi", "Analyste", dep2);

        // Création de la société (gestion des employés)
        SocieteArrayList societe = new SocieteArrayList();

        // Ajouter des employés
        societe.ajouterEmploye(emp1);
        societe.ajouterEmploye(emp2);
        societe.ajouterEmploye(emp3);
        societe.ajouterEmploye(emp4);
        societe.ajouterEmploye(emp5);

        // Affichage des employés
        System.out.println("Liste des employés :");
        societe.displayEmploye();

        // Rechercher un employé par nom
        System.out.println("\nRecherche de l'employé 'Martin': " + societe.rechercherEmploye("Martin"));
        System.out.println("Recherche de l'employé 'Toto': " + societe.rechercherEmploye("Toto"));

        // Trier les employés par ID
        System.out.println("\nTri des employés par ID :");
        societe.trierEmployeParId();
        societe.displayEmploye();

        // Trier les employés par nom de département, puis grade
        System.out.println("\nTri des employés par nom de département et grade :");
        societe.trierEmployeParNomDepartementEtGrade();
        societe.displayEmploye();

        // Supprimer un employé
        System.out.println("\nSuppression de l'employé Durand (Luc)...");
        societe.supprimerEmploye(emp3);
        System.out.println("Liste des employés après suppression :");
        societe.displayEmploye();
    }
}
