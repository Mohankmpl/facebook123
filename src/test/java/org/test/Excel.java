package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File ("C:\\Users\\Mohan\\eclipse-workspace\\Frameworksclass1\\Excel Folder\\Maven_Sample.xlsx");
		
		FileInputStream stream = new FileInputStream(file);
		
		Workbook workbook = new XSSFWorkbook(stream);
		
		Sheet sheet = workbook.getSheet("Sheet1");
		
//		int count = sheet.getPhysicalNumberOfRows();
//		System.out.println(count);
		
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				
				Cell cell = row.getCell(j);
			//	System.out.println(cell);
				
				int type = cell.getCellType();
			//System.out.println(type);
				
				if (type == 1) {
					
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
					
				}
				
				if (type == 0) {
					
					if (DateUtil.isCellDateFormatted(cell)) {
					/*	
						Date date = cell.getDateCellValue();
						//System.out.println(date);
						
						SimpleDateFormat dateformats = new SimpleDateFormat("dd-MMM-yy");
						String data = dateformats.format(date);
						System.out.println(data);
					}
					else {
						double numericCellValue = cell.getNumericCellValue();
						long d = (long) numericCellValue;
						String valueOf = String.valueOf(d);		
						System.out.println(valueOf);
					}
					*/
					System.out.println(DateUtil.isCellDateFormatted(cell));	
					}
				}
			}
		}
	}
}
				

						
						
						
					
					
					
		
		
		
	
						
					
					
				
				
			
			
		
		
		
		
		
				
		
		
		
		
		
		
		
		
	
		
		
		
		
		
	


