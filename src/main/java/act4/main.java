package act4;

public class main {

    public static void main(String[] args) {

        Employee employee1 = new Employee();

        employee1.setID(1);
        employee1.setFirstName("Juan");
        employee1.setLastName("Dela Cruz");
        employee1.setDepartment("Business Department");
        employee1.setPosition("Accountant");

        //see employee1 details
        employee1.printDetails();


        Employee employee2 = new Employee(2, "Pedro", "Santiago", "Advertising Department", "Manager");

        //see employee2 details
        employee2.printDetails();
    }
}
