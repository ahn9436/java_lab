class MultiplicationTables {

    public static void main(String[] args) {

        //Loop through number from 2 to 12
        for (int number = 2; number <= 12; number++) { //Outer loop

            //Print the header for the current number
            System.out.println("Multiplication Table for " + number);


            //Loop to iterate from 1 to 10
            for (int i = 1; i <= 10; i++) {// Inner Loop
                //Calculate the product
                int product = number * i;
                //Print the Multiplication equation in formatted way
                System.out.printf("%d x %d = %d\n", number, i, product);

                //the program must run and finish in

            }

            // Add an Empty line between tables for better readability
            System.out.println();
            checkValue();
        }
    }

    public static void checkValue() {
        //Test Writing Function
        System.out.println("Test Calling Function");
    }
}