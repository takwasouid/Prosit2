package main;

import entities.Departement;
import entities.DepartementHashSet;

public class Main {
    public static void main(String[] args) {
        DepartementHashSet gestionDepartements = new DepartementHashSet();

        Departement d1 = new Departement(1, "IT", 50);
        Departement d2 = new Departement(2, "Finance", 30);
        Departement d3 = new Departement(3, "RH", 20);
        
        gestionDepartements.ajouterDepartement(d1);
        gestionDepartements.ajouterDepartement(d2);
        gestionDepartements.ajouterDepartement(d3);

        System.out.println("Liste des départements :");
        gestionDepartements.displayDepartement();

        System.out.println("\nRecherche du département 'IT' : " + gestionDepartements.rechercherDepartement("IT"));

        System.out.println("\nDépartements triés par ID :");
        gestionDepartements.trierDepartementById().forEach(System.out::println);

        gestionDepartements.supprimerDepartement(d2);
        System.out.println("\nAprès suppression de 'Finance' :");
        gestionDepartements.displayDepartement();
    }
}
