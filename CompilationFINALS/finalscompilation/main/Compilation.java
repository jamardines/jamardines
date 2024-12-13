package finalscompilation.main;

import java.util.*;
import finalscompilation.arrays.*;
import finalscompilation.lists.*;
import finalscompilation.others.*;
import finalscompilation.infixtopostfix.*;

public class Compilation {
    public static void main(String[] args) {

        // Instantiation
        Scanner scan = new Scanner(System.in);

        NoDuplicate nd = new NoDuplicate();
        EvenAndOdd eo = new EvenAndOdd();
        SumAndProduct sp = new SumAndProduct();
        Largest2 l2 = new Largest2();
        NodeLists nl = new NodeLists();
        StackArray sa = new StackArray();
        StackList sl = new StackList();
        QueueArray qa = new QueueArray();
        QueueList ql= new QueueList();
        InfixToPostfix itp = new InfixToPostfix();
        

        
        System.out.println("\n[DATA STRUCTURE & ALGORITHM FINALS COMPILATION]\n");

        int choice = 0;
        do {
            Menu.mainmenu();
            choice = inputInt("\nEnter your choice: ", scan);

            switch (choice) {
                case 1: // no duplicate
                sleep();

                    int choice1 = 0;
                    do {
                        Menu.nodupemenu();
                        choice1 = inputInt("\nEnter your choice: ", scan);

                        switch (choice1) {
                            case 1:
                                nd.nodupe(scan);
                            sleep();
                                break;
                            case 0:
                                System.out.println("Going back to main menu...");
                            sleep();
                                break;
                            default:
                                System.err.println("Invalid input. Please try again.");
                            sleep();
                                break;
                        }
                        
                    } while (choice1 != 0);
                sleep();
                    break;
                case 2: // even and odd
                sleep();

                    int choice2 = 0;
                    do {
                        Menu.evenoddmenu();
                        choice2 = inputInt("\nEnter your choice: ", scan);

                        switch (choice2) {
                            case 1:
                                eo.evenodd(scan);
                            sleep();
                                break;
                            case 0:
                                System.out.println("Going back to main menu...");
                            sleep();
                                break;
                            default:
                                System.err.println("Invalid input. Please try again.");
                            sleep();
                                break;
                        }

                    } while (choice2 != 0);
                sleep();
                    break;
                case 3: // sum and product
                sleep();
                    
                    int choice3 = 0;
                    do {
                        Menu.sumandprodmenu();
                        choice3 = inputInt("\nEnter your choice: ", scan);

                        switch (choice3) {
                            case 1:
                                sp.sumprod(scan);
                            sleep();
                                break;
                            case 0:
                                System.out.println("Going back to main menu...");
                            sleep();
                                break;
                            default:
                                System.err.println("Invalid input. Please try again.");
                                sleep();
                                break;
                        }

                    } while (choice3 != 0);
                sleep();
                    break;
                case 4: // largest 2
                sleep();
                    
                    int choice4 = 0;
                    do {
                        Menu.largest2menu();
                        choice4 = inputInt("\nEnter your choice: ", scan);

                        switch (choice4) {
                            case 1:
                                l2.largest2(scan);
                            sleep();
                                break;
                            case 0:
                                System.out.println("Going back to main menu...");
                            sleep();
                                break;
                            default:
                                System.err.println("Invalid input. Please try again.");
                            sleep();
                                break;
                        }

                    } while (choice4 != 0);
                sleep();
                    break;
                case 5: // node list
                sleep();

                    int choice5 = 0;
                    do {
                        Menu.nodelistmenu();
                        choice5 = inputInt("\nEnter your choice: ", scan);

                        switch (choice5) {
                            case 1:
                                nl.add(new Node(inputString("Enter your item: ", scan)));
                                System.out.println("Item added to Node List");
                            sleep();
                                break;
                            case 2:
                                if (nl.delete(inputInt("Enter the index the item", scan)))
                                    System.out.println("Deleted the item from the Node List");
                                else
                                    System.out.println("Error deleting item: List is empty or index non-existent");
                            sleep();
                                break;
                            case 3:
                                nl.display();
                            sleep();
                                break;
                            case 0:
                                System.out.println("Going back to main menu...");
                            sleep();
                                break;
                            default:
                                System.err.println("Invalid input. Please try again.");
                            sleep();
                                break;
                        }

                    } while (choice5 != 0);
                sleep();
                    break;
                case 6: // stack array
                sleep();

                    int choice6 = 0;
                    do {
                        Menu.stackarrmenu();
                        choice6 = inputInt("\nEnter your choice: ", scan);

                        switch (choice6) {
                            case 1:
                                sa = new StackArray(inputInt("Enter size: ", scan));
                                System.out.println("Size has been set.");
                                sleep();
                                break;
                            case 2:
                                if (sa.push(inputString("Enter value: ", scan)))
                                    System.out.println("Successfully pushed an item.");
                                else
                                    System.out.println("Cannot push. Stack is full.");
                                sleep();
                                break;
                            case 3:
                                if (sa.pop())
                                    System.out.println("Successfully popped an item.");
                                else
                                    System.out.println("Cannot pop. Stack is empty.");
                                sleep();
                                break;
                            case 4:
                                if (sa.peek() != null)
                                    System.out.println(sa.peek());
                                else
                                    System.out.println("Stack is empty...");
                                sleep();
                                break;
                            case 5:
                                sa.display();
                                sleep();
                                break;
                            case 0:
                                System.out.println("Going back to main menu...");
                                sleep();
                                break;
                            default:
                                System.err.println("Invalid input. Please try again.");
                                sleep();
                                break;
                        }

                    } while (choice6 != 0);
                sleep();
                    break;
                case 7: // stack list
                sleep();

                    int choice7 = 0;
                    do {
                        Menu.stacklistmenu();
                        choice7 = inputInt("\nEnter your choice: ", scan);

                        switch (choice7) {
                            case 1:
                                sl.push(inputString("Enter an item: ", scan));
                                System.out.println("Successfully pushed an item.");
                            sleep();
                                break;
                            case 2:
                                if (sl.pop() != null)
                                    System.out.println("Successfully popped an item.");
                                else
                                    System.out.println("Cannot pop. Stack is empty.");
                            sleep();
                                break;
                            case 3:
                                if (!sl.isEmpty())
                                    System.out.println("[" + sl.peek() + "]");
                                else
                                    System.out.println();
                            sleep();
                                break;
                            case 4:
                                System.out.println("Number of items: " + sl.getCount());
                            sleep();
                                break;
                            case 5:
                                sl.display();
                            sleep();
                                break;
                            case 0:
                                System.out.println("Going back to main menu...");
                            sleep();
                                break;
                            default:
                                System.err.println("Invalid input. Please try again.");
                            sleep();
                                break;
                        }

                    } while (choice7 != 0);
                sleep();
                    break;
                case 8: // queue array
                sleep();

                    int choice8 = 0;
                    do {
                        Menu.queuearrmenu();
                        choice8 = inputInt("\nEnter your choice: ", scan);

                        switch (choice8) {
                            case 1:
                                qa = new QueueArray(inputInt("Enter size: ", scan));
                                System.out.println("Size has been set.");
                                sleep();
                                break;
                            case 2:
                                if (qa.enqueue(inputString("Enter value: ", scan)))
                                    System.out.println("Successfully enqueued an item.");
                                else
                                    System.out.println("Cannot enqueue. Stack is full.");
                                sleep();
                                break;
                            case 3:
                                if (qa.dequeue())
                                    System.out.println("Successfully dequeue an item.");
                                else
                                    System.out.println("Cannot dequeue. Stack is empty.");
                                sleep();
                                break;
                            case 4:
                                if (qa.front() != null)
                                    System.out.println(sa.peek());
                                else
                                    System.out.println("Queue is empty...");
                                sleep();
                                break;
                            case 5:
                                qa.display();
                                sleep();
                                break;
                            case 0:
                                System.out.println("Going back to main menu...");
                                sleep();
                                break;
                            default:
                                System.err.println("Invalid input. Please try again.");
                                sleep();
                                break;
                        }

                    } while (choice8 != 0);
                sleep();
                    break;
                case 9: // queue list
                sleep();

                int choice9 = 0;
                do {
                    Menu.queuelistmenu();
                    choice9 = inputInt("\nEnter your choice: ", scan);

                    switch (choice9) {
                        case 1:
                            ql.enqueue(inputString("Enter an item: ", scan));
                            System.out.println("Successfully enqueued an item.");
                        sleep();
                            break;
                        case 2:
                            if (ql.dequeue())
                                System.out.println("Successfully dequeued an item.");
                            else
                                System.out.println("Cannot dequeue. Queue is empty.");
                        sleep();
                            break;
                        case 3:
                            if (ql.getFirst() != null)
                                System.out.println("First item: " + ql.getFirst());
                            else
                                System.out.println("Cannot retrieve first. Queue is empty.");
                        sleep();
                            break;
                        case 4:
                            if (ql.getLast() != null)
                                System.out.println("Last item: " + ql.getLast());
                            else
                                System.out.println("Cannot retrieve last. Queue is empty.");
                        sleep();
                            break;
                        case 5:
                            ql.display();
                        sleep();
                            break;
                        case 6:
                            System.out.println(ql);
                        sleep();
                            break;
                        case 0:
                            System.out.println("Going back to main menu...");
                        sleep();
                            break;
                        default:
                            System.err.println("Invalid input. Please try again.");
                        sleep();
                            break;
                    }

                } while (choice9 != 0);

                    break;
                case 10: // infix to postfix
                sleep();

                String lastpostfix = null;
                int choice10 = 0;
                do {
                    Menu.intopostmenu();
                    choice10 = inputInt("\nEnter your choice: ", scan);

                    switch (choice10) {
                        case 1:
                            lastpostfix = itp.convert(inputString("Enter an infix expression: ", scan));
                            System.out.println(lastpostfix);
                        sleep();
                            break;
                        case 2:
                            if (lastpostfix != null) {
                                Evaluate eval = new Evaluate(lastpostfix);
                                System.out.println(eval.getResult());
                                lastpostfix = null;
                            } else {
                                Evaluate eval = new Evaluate(inputString("Enter a postfix expression: ", scan));
                                System.out.println(eval.getResult());
                            }
                        case 0:
                            System.out.println("Going back to main menu...");
                            sleep();
                            break;
                        default:
                            System.err.println("Invalid input. Please try again.");
                            sleep();
                            break;
                    }

                } while (choice10 != 0);

                    break;
                case 0:
                    System.out.println("Bye...");
                    sleep();
                    break;
                default:
                    System.err.println("Invalid choice. Please try again.");
                    sleep();
                    break;
            }

        } while (choice != 0);

        scan.close();
    }

    public static String inputString(String prompt, Scanner scan) {
        String str;
        do {
            System.out.print(prompt);
            str = scan.nextLine();
        } while (str.isEmpty());
        return str;
    }
    
    public static int inputInt(String prompt, Scanner scan) {
        int num = 0;

        while (true) {
            System.out.print(prompt);
            if (scan.hasNextInt()) {
                num = scan.nextInt();
                scan.nextLine(); // eats whitespace
                break;
            } else {
                System.err.println("Error! Input should be an integer");
                scan.nextLine(); // eats whitespace
            }
        }

        return num;
    }

    private static void sleep() {
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}