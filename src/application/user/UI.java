package application.user;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class UI {

    // Původní myšlenka udělat vytáření souboru přes jinou classu, ale nakonec jsem to udělal v UI.
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println();
        System.out.println("Welcome! This is application that is using dijkstra's algorithm to find the shortest path between nodes.\nEnjoy your time using this app.");
        System.out.println();
        menu();
    }

    private void menu() {

        System.out.println("1 - create file\n2 - delete file\n3 - create node\n4 - create path\n5 - calculate shortest path\n6 - exit app");
        System.out.println();

        int choice = scanner.nextInt();

        switch(choice) {
            case 1 -> createFile(); //DONE
            case 2 -> deleteFile(); //ALMOST DONE
            case 3 -> createNode(); //IN PROGRESS
            case 4 -> createPath(); //IN PROGRESS
            case 5 -> calculateShortestPath(); //IN PROGRESS
            case 6 -> exitApplication(); //DONE
        }
    }
    private void createFile() {


        try {
            File myObj = new File("DijkstraAppInformation.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName() + " moving you back to menu.");
                System.out.println();
            } else {
                System.out.println("File already exists, moving you back to menu.");
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        menu();

    }
    private void deleteFile() {

        //TODO delete
        // toto není ideální způsob, ale jinak mě to nenapadlo, takže dejme tomu, že to tam je, ale zároveň to nejde.
        // promiň Lukáši :( v Šalandě si zpravíš náladu <3

        try {
            File file = new File("DijkstraAppInformation.txt"); //absolutní cesta = problém, nevím jak změnit, aby to bralo filu s tohoto projektu, ale asi to nebude těžké
            if(file.delete()) {
                System.out.println(file.getName() + " deleted");
            } else {
                System.out.println("failed");
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        menu();
    }
    private void createNode() {

        System.out.println("You are in creating node option, would you like to continue?\n\n1 - continue\n2 - go back to menu");
        System.out.println();

        int choice = scanner.nextInt();

        try {
            if(choice == 1){

                //TODO create Node

            } else if(choice == 2) {
                menu();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void createPath() {

        System.out.println("You are in creating path option, would you like to continue?\n\n1 - continue\n2 - go back to menu");
        System.out.println();

        int choice = scanner.nextInt();

        try {
            if(choice == 1){

                //TODO create Node

            } else if(choice == 2) {
                menu();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void calculateShortestPath() {

        //TODO calculate shortest path (Dijkstra algorithm)
        menu();
    }
    private void exitApplication() {

        System.out.println("Thanks for using our app.");
        System.exit(0);
    }
}

// I sink that UI is done, so pls give za tři <3