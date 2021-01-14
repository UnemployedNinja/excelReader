import td.api.Report;
import td.api.TeamDynamix;

/*
 * Author: Shawn Phillips
 * Date:
 */
public class ReportFinder {

    /*
     * Run
     * Description:
     * 
     *
     * @param TeamDynamix tdapi
     */
    public void run(TeamDynamix tdapi) {

        Report report = getReports(tdapi);
    }

    public Report getReports(TeamDynamix tdapi) {

        Report report = new Report();

        // This should give us the Last Run Date
        report.getDataRows();

        return report;
    }

}
