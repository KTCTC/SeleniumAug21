package excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File f = new File(System.getProperty("user.dir") + "\\KTCTC.xlsx");

		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Aug");

		int roNum = sh.getLastRowNum();
		int roNum1 = sh.getPhysicalNumberOfRows();
		System.out.println(roNum);
		System.out.println(roNum1);

		for (int i = 0; i <= roNum; i++) {
			XSSFRow row = sh.getRow(i);
			XSSFCell cel = row.getCell(0);

			printCellValueAccordingToTypeOfCell(cel);

		}

		for (int i = 0; i <= roNum; i++) {
			XSSFRow row = sh.getRow(i);
			XSSFCell cel = row.getCell(1);
			printCellValueAccordingToTypeOfCell(cel);

		}

	}
	
	public static void printCellValueAccordingToTypeOfCell(XSSFCell cel)
	{
		switch (cel.getCellType()) {
		case STRING:
                        System.out.println(cel.getStringCellValue());
			break;
		case NUMERIC:
			System.out.println(cel.getNumericCellValue());
			break;
		case BOOLEAN:
			System.out.println(cel.getBooleanCellValue());
			break;
		case FORMULA:
			System.out.println(cel.getCellFormula());
			break;

		default:
			System.out.println("There is not value in cell. Its blank");
			break;
		}
	}

}
