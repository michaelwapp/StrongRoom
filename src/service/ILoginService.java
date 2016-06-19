package service;

/**
 * Created by Michael on 19/06/16.
 */
public interface ILoginService {

    /**
     * Allows the user to login to the service with a specific user and password.
     *
     * @param username the given username from the user
     * @param password the given password from the user
     * @return returns true if the user is successfully logged in or not
     */
    boolean login(String username, String password);

}
