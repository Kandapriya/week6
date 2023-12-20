package week6Assignment;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.checkerframework.checker.units.qual.s;

public class RedExcel {

	public static String[][] redexcel1() throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook wb=new XSSFWorkbook("./Data/redhat.xlsx");
		
		XSSFSheet sheet=wb.getSheetAt(0);
		
		XSSFRow row=sheet.getRow(1);
		
		int lastRowNum = sheet.getLastRowNum();
		
		short lastCellNum = row.getLastCellNum();
		
		String data[][]=new String[lastRowNum][lastCellNum ];
		//XSSFCell cell = row.getCell(0);
		for (int i = 1; i <=lastRowNum; i++) {
			for (int j = 0; j < lastCellNum; j++) {
				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j]=stringCellValue;
			}
			
		}
		wb.close();
		return data;
		
		

	}

}
