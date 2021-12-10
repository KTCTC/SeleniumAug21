package excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		File f = new File(System.getProperty("user.dir")+"\\KTCTC.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheet("Aug");
		
		XSSFRow row = sh.getRow(0);
		XSSFCell cel = row.getCell(0);
		String dd = cel.getStringCellValue();
		System.out.println(dd);
		sh.getRow(3);
		
	System.out.println(sh.getRow(1).getCell(1).getStringCellValue());	
	
	String val = new XSSFWorkbook(new FileInputStream(new File(System.getProperty("user.dir")+"\\KTCTC.xlsx"))).getSheet("Aug").getRow(0).getCell(1).getStringCellValue();
 System.out.println(val);
	}

}
