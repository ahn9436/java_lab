
class Main {
    // create a method
    public int addNumber(int a, int b) {
        int sum = a + b;
        //return value
        return sum;
    }


    public static void main(String[] args) {


        int num1 = 25;
        int num2 = 15;


        //create an object of Main
        Main obj = new Main();
        // ใส่ตัวผ่านตัวแปร
        int result = obj.addNumber(num1, num2);
        System.out.println("Sum is:" + result);

        Main obj2 = new Main();
        //Way 2: ใสตัวเลขโดนตรงลงไปแล้วมีตัวแปรมาเก็บค้าเผือจะเรียนใช้อีก
        int result_2 = obj2.addNumber(550,1234);
        System.out.println(result_2);

        //Way 3: ทุกอย่างจบในบรรทัดไม่มีตัวแปรเรียนใช้ค้าที่คำนวนมาซำ้ไม่ได้
        Main obj3 = new Main();
        System.out.println(obj3.addNumber(1000,5555));



    }
}