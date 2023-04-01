import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner menu = new Scanner(System.in);
        String userInput;
        int sc, scInput;
        do {
            System.out.println("Choose from the following activities:");
            System.out.println("[1] Activity 1");
            System.out.println("[2] Activity 2");
            
            sc = menu.nextInt();
            
            if (sc == 1){
              Activity1();
            }
            else if (sc == 2){
              Activity2();
            }

            System.out.print("Do you want to run the application again? (y/n): ");
            userInput = scanner.nextLine();
        } while (userInput.equalsIgnoreCase("y"));
        
        scanner.close();
    }

    public static void Activity1() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanners = new Scanner(System.in);

        String[] cmnds = {"You shall have no other God’s before me.",
                "Thou shalt not make unto thee any graven images. ",
                "Thou shalt not take the name of the Lord thy God in vain.",
                "Remember the Sabbath day and keep it Holy.",
                "Honor your father and mother.",
                "Thou shalt not kill.",
                "Thou shalt not commit adultery.",
                "Thou shalt not steal.",
                "Thou shall not bear false witness.",
                "You shall not covet."};

        System.out.println("10 COMMANDMENTS");

        for (int i = 0; i < cmnds.length; i++) {
            System.out.println((i + 1) + ". " + cmnds[i]);
        }

        int input = 0;
        int inputs = 0;

        System.out.print("\nENTER CHOICE [1-10]: ");
        input = scanner.nextInt();

        if (input < 1 || input > 10) {
            System.out.println("\n!RESTART AND TRY AGAIN!\n!RESTART AND TRY AGAIN!\n!RESTART AND TRY AGAIN!");
            System.exit(0);
        }

        System.out.print("\nDISPLAY HOW MANY TIMES: ");
        inputs = scanners.nextInt();

        if (inputs < 0) {
            System.out.println("\n!RESTART AND TRY AGAIN!\n!RESTART AND TRY AGAIN!\n!RESTART AND TRY AGAIN!");
            System.exit(0);
        }

        for (int x = 1; x <= inputs; x++) {
            System.out.println(cmnds[input - 1]);
        }

        if (inputs == 0) {
            System.out.println("\n!RESTART AND TRY AGAIN!");
        }
    }
    
    public static void Activity2() {
            int input,rnum;

        System.out.println("THIS APPLICATION WILL CLOSE \nIF YOU GUESS THE CORRECT NUMBER \nnumber [4 to 7] THIS COMPUTER GENERATES\n----------------------------------------");

        do{

        System.out.print("ENTER A NUMBER FROM [4 to 7]: ");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();

        Random rand = new Random();
        rnum = rand.nextInt(7 - 4) + 4; 

        if (input == rnum){
            System.out.println("\n----------------------------------------\nCORRECT! APPLICATION IS CLOSING!");
            System.exit(0);
        }else{
            System.out.println("----------------------------------------\nINCORRECT! \nGUESS AGAIN\n----------------------------------------");
        }


        }while (rnum != input);

    }

    }

