package excel;

import java.util.ArrayList;

public class ABCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcelHelper exHelp = new ExcelHelper("KTCTC", "Aug");
		
		ArrayList<String> keys = exHelp.getKeysList();
		ArrayList<String> values = exHelp.getValueList();

	}

}
