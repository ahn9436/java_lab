import java.util.Scanner;

class ForLoop {
    public static void main(String[] args) {
        int number = 0;
        String userChoice;
        Scanner scanner = new Scanner(System.in);

        for (userChoice = scanner.nextLine(); !userChoice.equalsIgnoreCase("exit"); userChoice = scanner.nextLine()) {
            // Simulate for loop initialization, condition, and increment
            // Begin program logic here (e.g., prompt user for input)
            System.out.println("Current number :" + number);

            //Update number based on user input (optional)
            if (userChoice.matches("\\d+")) { //เชค่ว่าเป็น Integer หรือปล่าว \\d+ คือ Integer
                number = Integer.parseInt(userChoice);
            }
        }

        System.out.println("Exiting the loop...");
        scanner.close();
        
    }
}