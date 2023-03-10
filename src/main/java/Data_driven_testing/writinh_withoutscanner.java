package Data_driven_testing;
import java.util.*;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writinh_withoutscanner {
	public static void main(String args[]) throws IOException {
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\test_dataset\\writing.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet();
		
		
		
		
//		Scanner sc=new Scanner(System.in);
//		for(int r=0;r<=3;r++) {
//			XSSFRow currentrow=sheet.createRow(r);
//			for(int c=0;c<2;c++) {
//				System.out.println("Enter a value= ");
//				String value=sc.next();
//				
//				currentrow.createCell(c).setCellValue(value);
//			}
//		}
		workbook.write(file);
		workbook.close();
		System.out.println("Writing is done");
}}