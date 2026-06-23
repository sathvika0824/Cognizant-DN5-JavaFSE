public class Logger {

    // Stores the single Logger object
    private static Logger instance;

    // Private constructor prevents object creation from outside
    private Logger() {
        System.out.println("Logger Created");
    }

    // Method to get the single Logger object
    public static Logger getInstance() {

        // Create object only if it does not exist
        if (instance == null) {
            instance = new Logger();
        }

        // Return the same object every time
        return instance;
    }

    // Method to display log messages
    public void log(String message) {

        // Print the log message
        System.out.println("LOG: " + message);
    }
}