package act5.Employee;

public class Employee {

    int id;
    String ename;
    String email;
    int vacationDays;

    public Employee(int empId, String empEname, String empEmail, int empVacationDays) {
        id = empId;
        ename = empEname;
        email = empEmail;
        vacationDays = empVacationDays;

    }

    Employee() {

    }

    public void printDetails() {
        System.out.println("Id: " + this.id);
        System.out.println("Name: " + this.ename);
        System.out.println("Email: " + this.email);
        System.out.println("Vacation Days: " + this.vacationDays);
    }
}
