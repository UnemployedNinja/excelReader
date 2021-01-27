import td.api.TeamDynamix;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadSpreadsheet {

    public void start(TeamDynamix tdapi) {

        File file = new File("C:\\Users\\Unemployed_Ninja\\Documents\\College\\Work\\reportCleaner\\src\\main\\java\\test.xlsx");

        try {
            FileInputStream fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        

    }
}
