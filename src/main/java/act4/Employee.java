package act4;

public class Employee {

    private int ID;
    private  String firstName;
    private  String lastName;
    private  String department;


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

    private  String position;





}
