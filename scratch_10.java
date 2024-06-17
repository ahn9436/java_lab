class WhileLoopExample {

    public static void main(String[] args) {
        int number = 1;

        //Loop to continue as long as number is less than 10
        while (number <= 10) {//Always checking condition
            System.out.println("Current number: "+ number);

            //Update number (assuming you want to increment)
            number++;


        }

        System.out.println("Loop exited. Current number: " + number);
    }
}