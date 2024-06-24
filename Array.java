/*
String[] array = new String[100];
the above array cannot store more than 100 names. The number of value in Java array is always fixed

// declare an array
double[] data; //ประกาศตัวแปร

// allocate memory
data = new double[10]; // จัดสรรค์พื้นที่ให้ตัวแปร

//declare and allocate the memory of an array is one single statement
double[] data = new double[10];

//declare and initialize and array
int[] age = {12, 4, 5, 2, 5}; // ประกาศตัวแปรกำหนด่า

//declare and allocate memory of an array
int[] age = new int[5];

//initialize array
age[0] = 12;
age[1] = 4:
age[2] = 5;
age[3] = 2;
age[4] = 5;

age[2] = 15;

 */

//Access Array element
class Main {
    public static void main(String[] args) {

        // create an array
        int[] age = {12, 4, 5, 2, 5};

        //access each array elements
        System.out.println("Accessing Elements of Array:");
        System.out.println("First Element" + age[0]);
        System.out.println("Second Element" + age[1]);
        System.out.println("Third Element" + age[2]);
        System.out.println("Fourth Element" + age[3]);
        System.out.println("Fifth Element" + age[4]);
        //System.out.println("Fifth Element" + age[45]);  //Error Index out of bound
    }
}