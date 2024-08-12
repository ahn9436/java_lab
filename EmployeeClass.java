
class Employee {
    // Fields
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    //default Constructor
    public Employee() {
        this.id = 0;
        this.firstName = "";
        this.lastName = "";
        this.salary = 0;
    }


    // กำหนดหนดรูปแบบ
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getter การดึงค้าออกมา
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    // Setter กำหนดค้าเข้าไปในหนวยความจำของเครื่องคอมพ์
    public void setSalary(int salary) {
        this.salary = salary;
    }

    //Method
    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {   //Percent
        salary += salary * percent / 100;
        return salary;
    }

    @Override //เขียนทับรูปแบบที่มีอยู่
    // Tostring เมื่อค้าพิมออกมาจะอยู่ในรูปแบบ String
    public String toString() {
        return "Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
    }
}
class EmployeeDemo {
    public static void main(String[] args) {
        //Using Default Constructor
        Employee emp1 = new Employee();
        System.out.println(emp1); //Employee[id=0, name= , salary=0]

        //Using parameter constructor
        Employee emp2 = new Employee(1,"John","Doe",3000);
        System.out.println(emp2);  //Employee[id=0, name= , salary=0]

        //Getting individual details
        System.out.println("ID: " + emp2.getId()); //ID = 1
        System.out.println("First Name: " + emp2.getFirstName()); //John
        System.out.println("Last Name: " + emp2.getLastName()); //Doe
        System.out.println("Name: " + emp2.getName()); //John Doe
        System.out.println("Salary: " + emp2.getSalary()); //Salary = 3000
        // Setting salary and calculating annual salary
        emp2.setSalary(4000);
        System.out.println("Updated Salary: " + emp2.getSalary()); //Update 4000
        System.out.println("Annual Salary: " + emp2.getAnnualSalary()); // 48000

        //Rasing YAy
        emp2.raiseSalary(10);
        System.out.println("Raised Salary:" + emp2.getSalary()); //Raised Salary 4400

        // Using another parameterized constructor
        Employee emp3 = new Employee(2, "Jane", "Smith", 3500);
        System.out.println(emp3); //Employee
    }



}