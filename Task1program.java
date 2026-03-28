class Student {
    // Private Variables
    private String name;
    private int rollNo;
    private int age;
    private String email;
    private String Department;
    private Double cgpa;

    // Constructor
    public Student(String name, int rollNo, int age, String email,  String Department, Double cgpa) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.email = email;
        this.Department = Department;
        this.cgpa = cgpa;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getRollNo() { return rollNo; }
    public void setRollNo(int rollNo) { this.rollNo = rollNo; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getDepartment() { return Department; }
    public void setDepartment(String Department) { this.Department = Department; }

    // Method to display info
    public String displayInfo() {
        return "Name: " + name + ", \nRoll No: " + rollNo + ", \nAge: " + age + ", \nEmail: " + email +"\nDept:" + Department + ", \nCGPA: " + cgpa;
    }

    public static void main(String[] args) {
        Student s = new Student("Hanzala", 101, 20, "hanzala@email.com","Computer Scince",3.5);
        System.out.println(s.displayInfo());
    }
}