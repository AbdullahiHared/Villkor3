import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Skatte avdrag

       //  Distance
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

        // calculations

        System.out.println("Enter your calculation + or -");
        String calculation = sc.nextLine();

        int indexOfPlus = calculation.indexOf("+");
        int indexOfMinus = calculation.indexOf("-");

        if (calculation.contains("+")) {
            String[] parts = calculation.split("\\+");
            if (parts.length == 2) {
                int firstNumber = Integer.parseInt(parts[0].trim());
                int secondNumber = Integer.parseInt(parts[1].trim());
                int result = firstNumber + secondNumber;
                System.out.println(result);
            }
        } else if (calculation.contains("-")) {
            String[] partings = calculation.split("\\-");
            if (partings.length == 2) {
                int firstNumber = Integer.parseInt(partings[0].trim());
                int secondNumber = Integer.parseInt(partings[1].trim());
                int result1 = firstNumber - secondNumber;
                System.out.println(result1);

            }
        }

        // From smallest to largest

        System.out.println("What is the first Numbers");
        int firstNumber = sc.nextInt();

        System.out.println("What is the second Number");
        int secondNumber = sc.nextInt();

        System.out.println("What is the third Number");
        int thirdNumber = sc.nextInt();

        int[] myArray = new int[3];

        if (firstNumber < secondNumber && firstNumber < thirdNumber && secondNumber < thirdNumber) {
            myArray[0] = firstNumber;
            myArray[1] = secondNumber;
            myArray[2] = thirdNumber;
        } else if (secondNumber < firstNumber && secondNumber < thirdNumber && firstNumber < thirdNumber) {
            myArray[0] = secondNumber;
            myArray[1] = firstNumber;
            myArray[2] = thirdNumber;
        } else if (thirdNumber < firstNumber && thirdNumber < secondNumber && firstNumber < secondNumber) {
            myArray[0] = thirdNumber;
            myArray[1] = firstNumber;
            myArray[2] = secondNumber;
        }  else {
            myArray[0] = thirdNumber;
            myArray[1] = secondNumber;
            myArray[2] = firstNumber;
        }

         System.out.println(Arrays.toString(myArray));
    }
}