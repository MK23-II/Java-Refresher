package act4;

public class Employee {

    private int ID;
    private  String firstName;
    private  String lastName;
    private  String department;
    private  String position;

    //with parameters
    Employee (int empID, String empFirstName, String empLastName, String empDepartment, String empPosition ) {
        ID = empID;
        firstName = empFirstName;
        lastName = empLastName;
        department = empDepartment;
        position = empPosition;
    }

    //no parameters
    Employee() {

    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void printDetails() {
        System.out.println("Employee Details: ");
        System.out.println("ID: " + this.ID);
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Department: " + this.department);
        System.out.println("Position: " + this.position);
        System.out.println("--------------------------------");

    }





}
