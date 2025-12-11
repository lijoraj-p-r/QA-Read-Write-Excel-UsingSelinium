package UserClass.SeliniumFileManagementXL;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {

        // FileInputStream file = new FileInputStream("/Users/apple/Desktop/JavaPractice/apachepoiapi/testfiles/testdata.xlsx");
        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/book1.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
    
        int lastrow = sheet.getLastRowNum();
        short totalCell = sheet.getRow(1).getLastCellNum();
        System.out.println(lastrow);
        System.out.println(totalCell);
        for(int row = 0; row <= lastrow ; row++) {
        	XSSFRow currentRow = sheet.getRow(row);
        	for(int cells = 0; cells < totalCell; cells++) {
        		XSSFCell cell = currentRow.getCell(cells);
        		System.out.println(cell + "\t");
        	}
        	System.out.println();
        }
        
      
        workbook.close();
        file.close();
    }
}
