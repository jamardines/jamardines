package finalscompilation.main;

public class Menu {
    
    // Main Menu
    public static void mainmenu() {
        System.out.println("[1] No Duplicate");
        System.out.println("[2] Even and Odd");
        System.out.println("[3] Sum and Product");
        System.out.println("[4] Largest 2");
        System.out.println("[5] Node List");
        System.out.println("[6] Stack Array");
        System.out.println("[7] Stack List");
        System.out.println("[8] Queue Array");
        System.out.println("[9] Queue List");
        System.out.println("[10] Infix to Postfix");
        System.out.println("[0] Exit");
    }

    // No Duplicate
    public static void nodupemenu() {
        System.out.println("\nNO DUPLICATE");
        System.out.println("[1] Enter your integers");
        System.out.println("[0] Go back to main menu");
    }

    // Odd and Even
    public static void evenoddmenu() {
        System.out.println("\nEVEN AND ODD");
        System.out.println("[1] Enter your integers");
        System.out.println("[0] Go back to main menu");
    }
    
    // Sum and Product
    public static void sumandprodmenu() {
        System.out.println("\nSUM AND PRODUCT");
        System.out.println("[1] Enter your integers");
        System.out.println("[0] Go back to main menu");
    }

    // Largest 2
    public static void largest2menu() {
        System.out.println("\nLARGEST TWO");
        System.out.println("[1] Enter your integers");
        System.out.println("[0] Go back to main menu");
    }
    
    // Node
    public static void nodelistmenu() {
        System.out.println("\nNODE LIST");
        System.out.println("[1] Enter an item");
        System.out.println("[2] Delete an item");
        System.out.println("[3] Display List");
        System.out.println("[0] Go back to main menu");
    }
    
    // Stack
    public static void stackarrmenu() {
        System.out.println("\nSTACK ARRAY");
        System.out.println("[1] Set Stack Size");
        System.out.println("[2] Push an item");
        System.out.println("[3] Pop an item");
        System.out.println("[4] Peek Top");
        System.out.println("[5] Display Stack");
        System.out.println("[0] Go back to main menu");
    }
    
    public static void stacklistmenu() {
        System.out.println("\nSTACK LIST");
        System.out.println("[1] Push an item");
        System.out.println("[2] Pop an item");
        System.out.println("[3] Peek Top");
        System.out.println("[4] Get Count");
        System.out.println("[5] Display Stack");
        System.out.println("[0] Go back to main menu");
    }
    
    // Queue
    public static void queuearrmenu() {
        System.out.println("\nQUEUE ARRAY");
        System.out.println("[1] Set Queue Size");
        System.out.println("[2] Enqueue an item");
        System.out.println("[3] Dequeue an item");
        System.out.println("[4] Retrieve Front");
        System.out.println("[5] Display Queue");
        System.out.println("[0] Go back to main menu");
    }
    
    public static void queuelistmenu() {
        System.out.println("\nQUEUE LIST");
        System.out.println("[1] Enqueue an item");
        System.out.println("[2] Dequeue an item");
        System.out.println("[3] Retrieve First Item");
        System.out.println("[4] Retrieve Last Item");
        System.out.println("[5] Display Queue");
        System.out.println("[6] Display All Queue Information");
        System.out.println("[0] Go back to main menu");
    }

    // Infix to Postfix
    public static void intopostmenu() {
        System.out.println("\nINFIX TO POSTFIX");
        System.out.println("[1] Convert infix to postfix");
        System.out.println("[2] Evaluate postfix");
        System.out.println("[0] Go back to main menu");
    }


}
