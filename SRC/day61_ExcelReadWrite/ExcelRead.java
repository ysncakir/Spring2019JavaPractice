package day61_ExcelReadWrite;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.*;


public class ExcelRead {

	public static void main(String[] args) throws Exception{
		String filePath = "/Users/ysncakir/Desktop/warmUp.xlsx"; // path of the excel file
		
		String sheetName= "Sheet1"; // name of the sheet
		
		FileInputStream file = new FileInputStream(filePath); // reads the file
		
		Workbook excelFile = WorkbookFactory.create(file); // workbook specially designed for Excel files
		
		Sheet sheet = excelFile.getSheet(sheetName); // gets the specific spread sheet from excel file 
		
		
		Cell cell = sheet.getRow(1).getCell(2); // Retrieves specific cell from spreadsheet
		
		String cellData = cell.toString(); // converts to cell data to String 
		
		System.out.println(cellData);
		
		
		
		
		
		
				
	}
}
