import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import td.api.TeamDynamix;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class ExcelReader {

    public void start(TeamDynamix tdapi) {

        File file = new File("C:\\Users\\test.xlsx");

        FileInputStream fis = null;   //obtaining bytes from the file
        Workbook wb = null;
        try {
            fis = new FileInputStream(file);
            wb = new XSSFWorkbook(fis);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        // creating Workbook instance that refers to .xlsx file
        Sheet sheet = wb.getSheetAt(0);     // creating a Sheet object to retrieve object
        Iterator<Row> itr = sheet.iterator();    // iterating over excel file

        while (itr.hasNext())
        {
            Row row = itr.next();
            Iterator<Cell> cellIterator = row.cellIterator();   // iterating over each column
            while (cellIterator.hasNext())
            {
                Cell cell = cellIterator.next();
                switch (cell.getCellType())
                {
                    case Cell.CELL_TYPE_STRING:    // field that represents string cell type
                        System.out.print(cell.getStringCellValue() + "\t\t\t");
                        break;
                    case Cell.CELL_TYPE_NUMERIC:    // field that represents number cell type
                        System.out.print(cell.getNumericCellValue() + "\t\t\t");
                        break;
                    default:
                }
            }
            System.out.println("");
        }
    }
//    catch(Exception e)
//    {
//        e.printStackTrace();
//    }
}



