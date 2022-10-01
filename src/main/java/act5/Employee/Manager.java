package act5.Employee;

public class Manager extends Employee {

    int numberOfReportees;

    Manager(int empId, String empEname, String empEmail, int empVacationDays, int reportees) {
        id = empId;
        ename = empEname;
        email = empEmail;
        vacationDays = empVacationDays;
        numberOfReportees = reportees;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Number of Reportees: " +this.numberOfReportees);
    }
}
