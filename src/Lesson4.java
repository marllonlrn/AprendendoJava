public class Lesson4 {
    public static void main(String[] args) {
        /*
         * The "for" statement is a loop structure.
         * It is useful when we know how many times we want to repeat some code.
         *
         * Structure:
         *
         * for (initialization; condition; update) {
         *     code to be repeated;
         * }
         *
         * 1. Initialization: runs only once, before the loop.
         * 2. Condition: checked before each iteration.
         * 3. Body: runs while the condition is true.
         * 4. Update: runs after the body, at the end of each iteration.
         *
         * The order is:
         * initialization -> condition -> body -> update -> condition...
         */

        System.out.println("1) ASCENDING COUNT");

        // int number = 1: creates a counter starting at 1.
        // number <= 10: repeats while number is less than or equal to 10.
        // number++: increases the value by 1 after each iteration.
        for (int number = 1; number <= 10; number++) {
            System.out.println("Number: " + number);
        }

        System.out.println("\n2) DESCENDING COUNT");

        // number-- decreases the value by 1 after each iteration.
        for (int number = 5; number >= 1; number--) {
            System.out.println("Number: " + number);
        }

        System.out.println("\n3) COUNTING BY TWOS");

        // number += 2 is equivalent to: number = number + 2.
        for (int number = 0; number <= 10; number += 2) {
            System.out.println("Even number: " + number);
        }

        System.out.println("\n4) ADDING VALUES");

        int sum = 0;

        // During each iteration, the value of number is added to the sum.
        for (int number = 1; number <= 5; number++) {
            sum += number; // Equivalent to: sum = sum + number.
        }

        System.out.println("Sum from 1 to 5: " + sum);

        System.out.println("\n5) ITERATING OVER AN ARRAY BY INDEX");

        String[] students = {"Ana", "Bruno", "Carla"};

        // Array indexes start at 0.
        // students.length provides the number of elements in the array.
        // We use index < students.length to avoid going beyond the last index.
        for (int index = 0; index < students.length; index++) {
            System.out.println("Index " + index + ": " + students[index]);
        }

        System.out.println("\n6) FOR-EACH (ENHANCED FOR LOOP)");

        /*
         * The for-each loop iterates directly over every element in an array.
         * It is simpler when we do not need to know the index.
         *
         * Structure:
         * for (type element : collection) {
         *     code;
         * }
         */
        for (String student : students) {
            System.out.println("Student: " + student);
        }

        System.out.println("\n7) USING CONTINUE");

        // continue skips the rest of the current iteration and moves to the next one.
        for (int number = 1; number <= 5; number++) {
            if (number == 3) {
                continue; // The number 3 will not be printed.
            }

            System.out.println("Number other than 3: " + number);
        }

        System.out.println("\n8) USING BREAK");

        // break ends the loop completely, even if the condition is still true.
        for (int number = 1; number <= 10; number++) {
            if (number == 4) {
                break; // Ends the for loop when number is equal to 4.
            }

            System.out.println("Before break: " + number);
        }

        System.out.println("\n9) NESTED FOR LOOP");

        // A for loop can be placed inside another for loop.
        // For each row value, the inner for loop iterates over every column.
        for (int row = 1; row <= 2; row++) {
            for (int column = 1; column <= 3; column++) {
                System.out.println("Row " + row + ", column " + column);
            }
        }

        /*
         * IMPORTANT NOTES:
         *
         * 1. A variable declared in a for loop exists only within that loop:
         *    for (int i = 0; i < 3; i++) { ... }
         *    Outside that loop, the variable i cannot be used.
         *
         * 2. Make sure the condition does not create an infinite loop.
         *    The example below would never end because it has no false condition:
         *    for (;;) { ... }
         *
         * 3. Be careful with <= when iterating over arrays. Because indexes start at 0,
         *    the correct expression is usually index < array.length, not index <= array.length.
         *
         * 4. Parts of a for loop may be omitted, but both semicolons are still required.
         *    In most cases, the complete form is clearer.
         */
    }
}
