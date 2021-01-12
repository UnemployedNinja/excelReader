import td.api.TDException;
import td.api.TeamDynamix;

/*
 * Main Class
 * Description:
 *     This file is where the program starts to run. It uses Main as the driver and then calls functions
 *     from other objects in order to get the reports to be cleaned up and to create a ticket for the
 *     office New and Unassigned List.
 */

/*
 * Author: Shawn Phillips
 * Date: 1/12/2021
 */
public class Main {

    /*
     * Main
     * Description:
     *     Logs into the TD and starts up the program.
     */
    public static void main(String[] args) {

        // Log in setup
        String basePath = System.getenv("tdbasepath");
        String username = System.getenv("tduser");
        String password = System.getenv("tdpassword");
        TeamDynamix tdapi = new TeamDynamix(basePath, username, password);

        // Log into TD
        try {
            tdapi.login();
            System.out.println("Login Successful!");
        } catch (TDException e) {
            e.printStackTrace();
        }

        // Time to find reports to be deleted
        ReportFinder reportFinder = new ReportFinder();
        reportFinder.run(tdapi);
    }
}