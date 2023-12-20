package week6Assignment;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class redw3excel {

	public static String[][] common(String exceldata) throws IOException {
		// TODO Auto-generated method stub
           XSSFWorkbook wb=new XSSFWorkbook("./Data/"+exceldata+".xlsx");
           
           XSSFSheet sheet=wb.getSheetAt(0);
           
           XSSFRow row=sheet.getRow(1);
           
           int RowNum = sheet.getLastRowNum();
           
           short CellNum = row.getLastCellNum();
           
           String data[][]=new String[RowNum][CellNum];
           
           for (int i = 1; i <=RowNum; i++) {
        	   for (int j = 0; j < CellNum; j++) {
        		   String value = sheet.getRow(i).getCell(j).getStringCellValue();
        		   data[i-1][j]=value;
				
			}
			
		}
           wb.close();
		return data;
	}

}
