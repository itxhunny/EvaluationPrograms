class NullStringException extends Exception {
    // Constructor with message
    public NullStringException(String message) {
        super(message);
    }
}
// Main Class to Test Exception
class Main {
    public static void main(String[] args) {
        try {
            String name = "";
            if (name == null || name.trim().isEmpty()) {
                throw new NullStringException("Name field is null or empty");
            }
            System.out.println("Valid Input: " + name);
        } catch (NullStringException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}