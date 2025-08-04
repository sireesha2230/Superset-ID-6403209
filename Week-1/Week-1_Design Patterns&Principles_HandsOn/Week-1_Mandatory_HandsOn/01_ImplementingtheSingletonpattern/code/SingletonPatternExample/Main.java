/**
 * Author: Sireesha Munnamgi
 * Purpose: Test class for Singleton AppLogger
 * Date: June 20, 2025
 * This program verifies that only one instance of AppLogger is created,
 * and explains  how log messages are tracked using a counter.
 */
import SingletonPatternExample.AppLogger;
package SingletonPatternExample;

public class Main {
    public static void main(String[] args) {
        // Get APPLogger instance first time
        AppLogger loggerA = AppLogger.getLogger();
        loggerA.writeLog("Application started.");

        // Get APPLogger instance second time
        AppLogger loggerB = AppLogger.getLogger();
        loggerB.writeLog("User Sireesha uploaded a file.");

        // Get APPLogger instance third time
        AppLogger loggerC = AppLogger.getLogger();
        loggerC.writeLog("User Sireesha has successfully logged out.");

        // Verify Singleton behavior
        if (loggerA == loggerB && loggerB == loggerC) {
            System.out.println(" Singleton confirmed: All logger instances are the same.");
        } else {
            System.out.println(" Singleton failed: Different logger instances were created.");
        }
    }
}
