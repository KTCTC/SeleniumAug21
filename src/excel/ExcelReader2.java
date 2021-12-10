package excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		File f = new File(System.getProperty("user.dir")+"\\KTCTC.xlsx");
		
		FileInputStream fis = new FileInputStream(f);		
		XSSFWorkbook wb = new XSSFWorkbook(fis);		
		XSSFSheet sh = wb.getSheet("Aug");		
		
		int roNum = sh.getLastRowNum();
		int roNum1 = sh.getPhysicalNumberOfRows();
		System.out.println(roNum);
		System.out.println(roNum1);
		
		for (int i=0;i<=roNum;i++)
		{
			XSSFRow row = sh.getRow(i);
			XSSFCell cel = row.getCell(0);
			System.out.println(cel.getStringCellValue());
			
		}
		
		for (int i=0;i<=roNum;i++)
		{
			XSSFRow row = sh.getRow(i);
			XSSFCell cel = row.getCell(1);
			System.out.println(String.valueOf(cel));
			
		}
		
		
		for (int i=0;i<=roNum;i++)
		{
			XSSFRow row = sh.getRow(i);
			XSSFCell cel = row.getCell(1);
			System.out.println(cel.getStringCellValue());
			
		}
		
		
	
	}

}
