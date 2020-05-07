package planner.app;

public class AlreadyExistsException extends Exception {
    public AlreadyExistsException(String user_already_exists) {
        super(user_already_exists);
    }
}
