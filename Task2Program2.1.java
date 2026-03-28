class Person {
    String name, email;

    Person(String name, String email) {
        this.name = name;
        this.email = email;
    }
    String introduce() {
        return "I am " + name + " and my email is " + email;
    }
}
// Student class
class Student extends Person {
    int rollNo, age;

    Student(String name, String email, int rollNo, int age) {
        super(name, email);
        this.rollNo = rollNo;
        this.age = age;
    }

    @Override
    String introduce() {
        return "I am " + name + ", Roll No: " + rollNo +
                ", Age: " + age + ", Email: " + email;
    }
}
// Teacher class
class Teacher extends Person {
    String subject;

    Teacher(String name, String email, String subject) {
        super(name, email);
        this.subject = subject;
    }
    @Override
    String introduce() {
        return "I am " + name + ", I teach " + subject +
                ", Email: " + email;
    }
}
// Main class
class Main {
    public static void main(String[] args) {

        Student s = new Student("Hanzala", "hanzala@gmail.com", 101, 20);
        Teacher t = new Teacher("Sir Hamza", "hamza@gmail.com", "OOP");

        System.out.println(s.introduce());
        System.out.println(t.introduce());
    }
}