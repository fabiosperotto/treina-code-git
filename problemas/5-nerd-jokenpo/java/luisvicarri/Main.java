package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of rounds:");
        int numRounds = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer
        
        for (int i = 0; i < numRounds; i++) {
            System.out.println("\nEnter choices for Sam and Karen (separated by space):");
            String sam = scanner.next().toLowerCase();
            String karen = scanner.next().toLowerCase();
            
            String result = playJokenpo(sam, karen);
            System.out.println("Result of round " + (i+1) + ": " + result);
        }
        
        scanner.close();
    }
    
    public static String playJokenpo(String sam, String karen) {
        if (sam.equals(karen)) {
            return "Draw";
        } else if ((sam.equals("tesoura") && (karen.equals("papel") || karen.equals("lagarto")))
                || (sam.equals("papel") && (karen.equals("pedra") || karen.equals("spock")))
                || (sam.equals("pedra") && (karen.equals("tesoura") || karen.equals("lagarto")))
                || (sam.equals("lagarto") && (karen.equals("spock") || karen.equals("papel")))
                || (sam.equals("spock") && (karen.equals("tesoura") || karen.equals("pedra")))) {
            return "Sam wins";
        } else {
            return "Karen wins";
        }
    }
}


