package Day1_maven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xutil2 {
	private static final short IndexedColors = 0;
	private static final CellStyle GREEN = null;
	private static final FillPatternType FillPatternType = null;
	private static final String SOLID_FOREGROUND = null;
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle style;
	public static int getRowCount(String xlfile,String xlsheet) throws IOException
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		int rowcount=ws.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;
	}
	public static int getCellCount(String xlfile,String xlsheet,int rownum ) throws IOException{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		int cellcount=row.getLastCellNum();
		wb.close();
		fi.close();
		return cellcount;
	}
	public static String getCellData(String xlfile,String xlsheet,int rownum,int column ) throws IOException{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		cell=row.getCell(column);
		String data;
		try
		{
			//data=cell.toString();
			DataFormatter formatter= new DataFormatter();
			data= formatter.formatCellValue(cell);
			return data;
		}
		catch(Exception e) 
		{
			data="";
		}
		wb.close();
		fi.close();
		return data;
	}
	public static void setCellData(String xlfile,String xlsheet,int rownum,int column ,String data) throws IOException{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		cell=row.getCell(column);
		cell.setCellValue(data);
		fo=new FileOutputStream(xlfile);
		wb.close();
		fi.close();
		fo.close();
	}
//	public static void FillGreenColor(String xlfile,String xlsheet,int rownum,int column) throws IOException{
//		fi=new FileInputStream(xlfile);
//		wb=new XSSFWorkbook(fi);
//		ws=wb.getSheet(xlsheet);
//		row=ws.getRow(rownum);
//		cell=row.getCell(column);
//		style=wb.createCellStyle();
//		style.setFillBackgroundColor(IndexedColors,GREEN.getIndex());
//		style.setFillPattern(FillPatternType,SOLID_FOREGROUND);
//		
//		cell.setCellStyle(style);
//		fo=new FileOutputStream(xlfile);
//		wb.write(fo);
//		wb.close();
//		fi.close();
//		fo.close();
//		}
	}
	
