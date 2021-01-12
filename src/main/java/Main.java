import td.api.TDException;
import td.api.TeamDynamix;

/*
 * Main Class
 * Description:
 *
 */

/*
 * Author: Shawn Phillips
 * Date:
 */
public class Main {

    /*
     * Main
     * Description:
     *     Starts up the program.
     */
    public static void main(String[] args) {

        // Log into TD
        String basePath = System.getenv("tdbasepath");
        String username = System.getenv("tduser");
        String password = System.getenv("tdpassword");

        TeamDynamix tdapi = new TeamDynamix(basePath, username, password);

        try {
            tdapi.login();
            System.out.println("Login Successful!");
        } catch (TDException e) {
            e.printStackTrace();
        }
    }
}