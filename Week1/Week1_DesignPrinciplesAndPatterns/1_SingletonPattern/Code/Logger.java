// Logger.java
public class Logger {
    // Step 1: Create a private static instance
    private static Logger instance;

    // Step 2: Make constructor private to prevent instantiation
    private Logger() {
        System.out.println("Logger instance created");
    }

    // Step 3: Public method to provide access to the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // Lazy initialization
        }
        return instance;
    }

    // Logging method for demonstration
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
