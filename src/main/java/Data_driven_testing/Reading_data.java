package Data_driven_testing;

import java.io.*;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading_data {
public static void main(String args[]) throws IOException {
	FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\test_dataset\\reading.xlsx");
	
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	 int totalRows=sheet.getLastRowNum();
	 int totalCells= sheet.getRow(1).getLastCellNum();
	 System.out.println("No.of Rows= "+ totalRows);
	 System.out.println("No.of Columns= "+totalCells);
	 
	 
	 for(int r=0;r<=totalRows;r++) {
		 XSSFRow CurrentRow=sheet.getRow(r);
		 for(int c=0;c<totalCells;c++) {
			 String value=CurrentRow.getCell(c).toString();
			 System.out.print(value+"      ");
		 }
		 System.out.println();
	 }
	 workbook.close();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 file.close();
}
}
