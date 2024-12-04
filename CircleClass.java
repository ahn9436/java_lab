class Circle { //Save as CircleClass.Java
    //Private คือ ตัวแปรที่เรียกใช้จากข้างนอกไม่ได้
    private double radius;
    private String color;

    //Constructor (การเขียนทับ)(เป็นชุดข้อมูลที่กำหนดไว้)(default)
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double r) { //second constructor
        radius = r;
        color = "red";
    }

    public double getRadius() {
        return radius;
    }

    //** Return the area of circle
    public double getArea() {
        return radius * radius * Math.PI;
    }

    double x = radius; //ไม่ปลอดภัยผิดกฎ OOP

}
     // OOP - Object Oriented Programming
/*
Function / Method -> Setter, Getter
Setter -> Function ที่ใช้ในการกำหนดค่า
Getter -> Function ที่ใช้ในการดึงค่าออกมา
        Encapsulation การห่อหุ้ม การเข้าถึงข้อมูล จะเข้าได้เฉพาะ Access -> public และ กำหนดค่าผ่าน setter method, ดึงค่าผ่าน getter method -> Information Hiding
 */