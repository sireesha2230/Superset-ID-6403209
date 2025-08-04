// I have created a file named AppLogger.java.
// This is a Singleton class and the code demonstrates the Singleton Design Pattern.
/**
 * Author: Sireesha Munnamgi
 * Purpose: Custom Logger using Singleton Design Pattern
 * Date: June 20, 2025
 * 
 * Singleton pattern: A design pattern in object-oriented programming
 * that ensures only one instance of a class exists throughout the application.
 * Use Case: Logger, Config Manager, DB Connector, etc.
 */
public class AppLogger {

    // Singleton instance
    private static AppLogger instance;

    // logCount tracks how many times logging is done
    private int logCount = 0;

    // Private constructor prevents instantiation
    private AppLogger() {
        System.out.println("AppLogger started.");
    }

    // Access method for the single instance
    public static AppLogger getLogger() {
        if (instance == null) {
            instance = new AppLogger();
        }
        return instance;
    }

    // Method to log messages
    public void writeLog(String message) {
        logCount++;
        System.out.println("[INFO " + logCount + "] " + message);
    }
}
