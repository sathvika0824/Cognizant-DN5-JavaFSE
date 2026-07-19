public class SingletonTest {

    public static void main(String[] args) {

        // Request Logger object first time
        Logger logger1 = Logger.getInstance();

        // Request Logger object second time
        Logger logger2 = Logger.getInstance();

        // Log messages
        logger1.log("Application Started");
        logger2.log("User Logged In");

        // Check whether both references point to same object
        if (logger1 == logger2) {
            System.out.println("Only one Logger instance exists.");
        } else {
            System.out.println("Multiple Logger instances created.");
        }
    }
}