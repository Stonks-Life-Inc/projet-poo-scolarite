package utility;//package utility;

import managers.personnes.Etudiant;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MainMenu {
    private static Scanner menuChoiceScanner = new Scanner(System.in);

    //TODO: améliorer le menu pour que l'on puisse rajouter des choix dans des choix plus facilement en liant la fonction du choix à son menu parent. (FileMenu system)
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int choice;
        TableManager tm = new TableManager();

        //Main menu loop
        do {
            System.out.println("Quel est votre choix ?\n - 1 : Etudiants\n - 2 : Cours\n - 3 : Inscriptions\n - 4 : Notes\n - 5 : Absences\n - 0 : Quitter\n");
            //On scan le choix de l'utilisateur
            choice = menuChoiceScanner.nextInt(); //Interger,long ... input

            switch (choice) {

                case 0:
                    choice = -1;
                    break;


                case 1:
                    do {
                        System.out.println("Opérations sur les Etudiants :\n - 1 : Ajouter un nouvel étudiant\n - 2 : Lister les étudiants par ordre alphabétique\n - 3 : Lister les étudiants par promotion\n - 4 : Modifier un étudiant\n - 5 : Supprimer un étudiant\n - 0 : Retour\n");
                        choice = menuChoiceScanner.nextInt(); //Interger,long ... input
                        switch (choice) {
                            case 0:
                                break;
                            case 1://Ajouter un nouvel étudiant
                                System.out.println("Ajouter un étudiant :\n - 1 : Charger depuis un fichier\n" +
                                        " - 2 : Ajouter un élève manuellement" +
                                        " - 0 : Retoure");
                                choice = menuChoiceScanner.nextInt(); //Interger,long ... input
                                switch (choice){
                                    case 0:
                                        choice = -1;
                                    case 1: //Chargement depuis un fichier
                                        try {
                                            tm.etudiants = tm.readObject("C:/Users/clem6/OneDrive/Documents/GitHub/university-projet-poo-scolarite/resources/csv/etudiant.csv");
                                        } catch (IOException e) {

                                            e.printStackTrace();
                                        } catch (ClassNotFoundException e) {
                                            e.printStackTrace();
                                        }

                                        break;
                                    case 2://Ajout manuel

                                        break;
                                }
                                break;
                            case 2://Lister les étudiants
                                tm.listerObject(tm.etudiants);
                                break;
                            default:
                                break;
                        }
                    } while (choice != 0);
                    break;

                case 2:
                    do {
                        System.out.println("Opérations sur les cours :\n - 1 : Ajouter un nouveau cours\n - 2 : Lister les cours\n - 3 : Modifier un cours\n - 4 : Supprimer un cours");
                        System.out.println(" - 0 : Retour\n");
                        choice = menuChoiceScanner.nextInt(); //Interger,long ... input
                        switch (choice) {
                            case 0:
                                break;

                            default:
                                break;
                        }

                    } while (choice != 0);
                    break;

                case 3:
                    do {
                        System.out.println("Opérations sur les inscriptions :\n - 1 : Ajouter un étudiant à un cours\n - 2 : Supprimer une inscription\n - 3 : Lister les étudiants d'un cours\n - 4 : Lister les cours d'un étudiants");
                        System.out.println(" - 0 : Retour\n");
                        choice = menuChoiceScanner.nextInt(); //Interger,long ... input
                        switch (choice) {
                            case 0:
                                break;

                            default:
                                break;
                        }

                    } while (choice != 0);
                    break;

                case 4:
                    do {
                        System.out.println("Opérations sur les notes :\n - 1 : Créer un examen\n - 2 : Supprimer un examen\n - 3 : Ajouter la note d'un étudiant\n - 4 : Modifier la note d'un étudiant\n - 5 : Supprimer la note d'un étudiant");
                        System.out.println("Pour un examen, afficher :\n\t Par cours auquel il est inscrit :\n\t - 6 : Ses notes\n\t - 7 : Sa moyenne");
                        System.out.println("Pour tous les cours auquel il est inscrit :\n\t - 8 : Sa moyenne");
                        System.out.println(" - 0 : Retour\n");
                        choice = menuChoiceScanner.nextInt(); //Interger,long ... input
                        switch (choice) {
                            case 0:
                                break;

                            default:
                                break;
                        }

                    } while (choice != 0);
                    break;

                case 5:
                    do {
                        System.out.println("Opérations sur les absences :\n - 1 : Ajouter une absence\n - 2 : Modifier une absence\n - 3 : Supprimer une absence");
                        System.out.println("Pour un cours :\n\t - 4 : Lister chronologiquement les absences et donner leur nombre");
                        System.out.println("Pour un étudiant :\n\t Lister par cours :\n\t - 5 : Chronologiquement ses absences\n\t - 6 : Le nombres d'absences\n - 7 : Le nombre total d'absences");
                        System.out.println(" - 0 : Retour\n");
                        choice = menuChoiceScanner.nextInt(); //Interger,long ... input
                        switch (choice) {
                            case 0:
                                break;

                            default:
                                break;
                        }

                    } while (choice != 0);
                    break;

                default:
                    break;
            }
        } while (choice != -1);

    }

}