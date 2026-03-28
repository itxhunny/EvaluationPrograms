// Abstract class
abstract class Person {
    // Private fields (hidden)
    private String name;
    private String email;
    // Protected constructor
    protected Person(String name, String email) {
        this.name = name;
        this.email = email;
    }
    // Abstract method
    abstract String getDetails();
    public String getName() {
        return name;
    }
    protected String getEmail() {
        return email;
    }
}
// Employee class
class Employee extends Person {
    private String employeeId;
    private String department;

    public Employee(String name, String email, String employeeId, String department) {
        super(name, email);   // call parent constructor
        this.employeeId = employeeId;
        this.department = department;
    }
    @Override
    String getDetails() {
        return "Name: " + getName() +
                "\nEmail: " + getEmail() +
                "\nEmployee ID: " + employeeId +
                "\nDepartment: " + department;
    }
}
// Main class
class Main {
    public static void main(String[] args) {
        Person person = new Employee("Hanzala", "ali@mail.com", "E001", "IT");
        System.out.println(person.getDetails());
    }
}