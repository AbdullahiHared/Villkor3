import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        // Skatte avdrag

        // Distance
        System.out.println("How long do you live from your job in km? ");
        int userDistance = sc.nextInt();

        // Relation
        System.out.println("What is your relationship:  Single/Partner?");
        String partner = sc.nextLine();
        sc.nextLine();

        // Job Experience 
        System.out.println("How long have you been working in the company? ");
        int workingYears = sc.nextInt();

        if (userDistance >= 50 && partner.equalsIgnoreCase("partner") && workingYears >= 3) {
            System.out.println("You have right to double tax deduction");
        }


    }
}