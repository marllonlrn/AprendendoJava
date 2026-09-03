import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        /*
        System.out.print("Enter your age: ");
        int age = userInput.nextInt();

        if(age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        userInput.close();
        

        System.out.print("Enter your grade: ");
        double grade = userInput.nextDouble();
        System.out.println("Enter your second grade: ");
        double grade2 = userInput.nextDouble();
        double average = (grade + grade2) / 2;

        if(average >= 7.0) {
            System.out.println("Passed with an average grade of: " + average);
        } else {
            System.out.println("Failed with an average grade of: " + average);
        }
        
        userInput.close();
        */


        System.out.print("Choose a day:\n1 - Monday\n2 - Tuesday\n3 - Wednesday\nEnter the number corresponding to the day: ");
        String dayChoice = userInput.nextLine();

        switch(dayChoice) {
            case "1":
                System.out.println("Your day is Monday.");
                break;
            case "2":
                System.out.println("Your day is Tuesday.");
                break;
            case "3":
                System.out.println("Your day is Wednesday.");
                break;
            default:
                System.out.println("Invalid option.");
        }

        userInput.close();
    }
}
