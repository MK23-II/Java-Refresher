package act4;

public class main {

    public static void main(String[] args) {

        Employee employee1 = new Employee();

        employee1.setID(1);
        employee1.setFirstName("Juan");
        employee1.setLastName("Dela Cruz");
        employee1.setDepartment("Business Department");
        employee1.setPosition("Accountant");

        employee1.printDetails(); //see employee1 details
    }
}
