package UserClass.SeliniumFileManagementXL;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class WRITEtoExcel {
public static void main(String... args) throws IOException {
	System.out.println("Write to excel");
	FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir") +"/myexcelfilewrite.xlsx");
	
	XSSFWorkbook workbook = new XSSFWorkbook();
	
	XSSFSheet sheet = workbook.createSheet("TestData1");
	
	XSSFRow row1 = sheet.createRow(0);
			
	row1.createCell(0).setCellValue("java");
	row1.createCell(1).setCellValue(12);
	row1.createCell(2).setCellValue("dsa");
	row1.createCell(3).setCellValue("ayush");

	XSSFRow row2 = sheet.createRow(1);
			
	row2.createCell(0).setCellValue("phython");
	row2.createCell(1).setCellValue(10);
	row2.createCell(2).setCellValue("FrontEnd");
	row2.createCell(3).setCellValue("gamana");

	workbook.write(fos);
	workbook.close();
	fos.close();
}
}
