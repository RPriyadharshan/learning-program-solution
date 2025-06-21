// Main.java
public class Main {
    public static void main(String[] args) {
        // Try to get multiple instances of Logger
        Logger logger1 = Logger.getInstance();
        logger1.log("First log message");

        Logger logger2 = Logger.getInstance();
        logger2.log("Second log message");

        // Verify both logger1 and logger2 are the same instance
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same (Singleton confirmed).");
        } else {
            System.out.println("Different logger instances (Singleton failed).");
        }
    }
}
