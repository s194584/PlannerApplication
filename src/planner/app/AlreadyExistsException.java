package planner.app;

// Ansvarlig: Malthe
// Custom exception for when an object already exists in some collection
public class AlreadyExistsException extends Exception {
    public AlreadyExistsException(String user_already_exists) {
        super(user_already_exists);
    }
}
