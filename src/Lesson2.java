public class Lesson2 {
  public static void main(String[] args) {
    String studentName = "Marllon";
    int studentAge = 20;
    double grade1 = 7.5;
    double grade2 = 8.0;
    double average = (grade1 + grade2) / 2;

    System.out.println("Student name: " + studentName);
    System.out.println("Student age: " + studentAge);
    if (average >= 7.0) {
      System.out.println("Passed with an average grade of: " + average);
    } else {
      System.out.println("Failed with an average grade of: " + average);
    }

    /*
     * 
     * float number1 = 10.5f;
     * 
     * if(number1 > 0){
     * System.out.println("The number is positive.");
     * } else if(number1 < 0){
     * System.out.println("The number is negative.");
     * } else {
     * System.out.println("The number is zero.");
     * }
     * 
     */

  }
}
