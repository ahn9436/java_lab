import java.util.Scanner;

class DoWhileExit {
    public static void main(String[] args) {
        int number = 0; //ตัวแปรตัวเลข
        String userChoice; //ตัวแปรสตริงใช้ในการเช็กการทำงาน
        Scanner scanner = new Scanner(System.in); //Create scanner object ใข้สำหรับจัดการข้อมูลผู้ใช้ เหมือน input ใน python

        //Loop to continue until user choice exit
        do {
            //Begin program logic here (e.g., prompt user for input)
            System.out.println("Current number: " + number);
            System.out.println("Enter a number (or 'exit' to quit): ");
            userChoice = scanner.nextLine(); //Read input using scanner

            //Update number based on user input (optional)
            //ถ้าค้าที่ใส่เป็นตัวเลข ให้แปลงเป็นตัวเลขแล้วแนะนะให้เก็นใน number
            if (userChoice.matches("\\d+")) { //Check if input a number
                number = Integer.parseInt(userChoice);

            }

          //check for exit condition
        } while (!userChoice.equalsIgnoreCase("exit"));

        System.out.println("Exiting the loop...");
        scanner.close(); //Close Scanner (optional but good practice)
    }
}
