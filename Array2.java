class Main {
    public static void main(String[] args) {

        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum =0;
        Double average;

        //access all elements using for each loop
        // add each element in sum
        for (int number: numbers) {
            sum += number; // sum = sum + number
        }

        //get the total number elements
        int arrayLength = numbers.length;

        // calculate the average
        //covert the average for int to double
        average = ((double)sum / (double)arrayLength);

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}