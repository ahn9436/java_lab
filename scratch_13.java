import java.util.Scanner;

class UserInputSum {
    public static void main(String[] args) {

        Double number, sum = 0.0;

        // create an object of Scanner
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number");


            //takes double input for user
            number = input.nextDouble(); // เลขทศนิยมแบบ Double

            // if number is negative
            if (number < 0.0) {
                break; // จบการทำงาน
            }

            sum += number;
        }
        System.out.println("Sum =" + sum);
    }
}