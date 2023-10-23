import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Skatte avdrag

        // Distance
        System.out.println("How long do you live from your job in km? ");
        int userDistance = sc.nextInt();
        boolean eligibleDistance = userDistance >= 50;
        sc.nextLine();
        // Relation
        System.out.println("What is your relationship: Single/Partner?");
        String partner = sc.nextLine();
        boolean hasPartner = partner.equalsIgnoreCase("partner");
        // sc.nextLine();

        // Working years
        System.out.println("How long have you been working in the company? ");
        int workingYears = sc.nextInt();

        if (userDistance >= 50 && hasPartner && workingYears >= 3) {
        System.out.println("You have right to double tax deduction");
        } else if (userDistance >= 50 && !hasPartner && workingYears >= 1) {
        System.out.println("You have right to double tax deduction");
        } else {
        System.out.println("You don't have right to double tax deduction");
        }

        // Beräkning 

        System.out.println("Enter your calculation + or -");
        String calculation = sc.nextLine();

        int indexOfPlus = calculation.indexOf("+");
        int indexOfMinus = calculation.indexOf("-");

        if (calculation.contains("+")) {
            String[] parts = calculation.split("\\+");
            if( parts.length == 2) {
                int firstNumber = Integer.parseInt(parts[0].trim());
                int secondNumber = Integer.parseInt(parts[1].trim());
                int result = firstNumber + secondNumber;
                System.out.println(result + 10);
            }
        } else if (calculation.contains("-")) {
             String[] partings = calculation.split("\\-");
            if( partings.length == 2) {
                int firstNumber = Integer.parseInt(partings[0].trim());
                int secondNumber = Integer.parseInt(partings[1].trim());
                int result = firstNumber - secondNumber;
                System.out.println(result);
            }
        }
    }
}