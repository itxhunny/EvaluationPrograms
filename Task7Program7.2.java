// Custom Exception
class NullStringException extends Exception {
    public NullStringException(String message) {
        super(message);
    }
}
// Validator Class
class StringValidator {
    public static String validate(String input, String fieldName) throws NullStringException {
        if (input == null || input.trim().isEmpty()) {
            throw new NullStringException(fieldName + " cannot be null or empty");
        }
        return input;
    }
}
// Student Class (Example for Task 1)
class Student {
    String name;
    public Student(String name) {
        this.name = name;
    }
}
class Main {
    public static void main(String[] args) {

        try {
            String nameInput = " ";

            // Validate before creating object
            String validName = StringValidator.validate(nameInput, "Student Name");
            Student s = new Student(validName);
            System.out.println("Student Created: " + s.name);
        } catch (NullStringException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}