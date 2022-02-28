package utility;

import java.util.Scanner;

public class MainMenu {
    private int choice;
    private static Scanner menuChoiceScanner = new Scanner(System.in);


    public static void main(String[] args) {
        //On scan le choix de l'utilisateur
        int choice = menuChoiceScanner.nextInt(); //Interger,long ... input

        //Main menu loop
        do {
            switch (choice){
                case 0: //TODO: coder le menu
                    //grosse flemme
                    break;

                default:
                    break;
            }
        }while(choice != -1);
    }
}