package project1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readfile {
	
	String data;
	
	public List<String>  method() throws IOException {
		
		List<String > lit=new ArrayList<>();
		XSSFWorkbook we=new XSSFWorkbook(new FileInputStream("C:\\Users\\USER\\Documents\\excel files\\Project Tracksheet.xlsx "));
		
		//XSSFSheet sh=we.getSheet("sheet1");
		XSSFSheet sh=we.getSheetAt(0);
		int rowCount=sh.getLastRowNum()+1;
		int cols=sh.getRow(0).getLastCellNum();
		//System.out.println(rowCount);
				 
		for(int i=0;i<rowCount  ;i++) {
			XSSFRow row=sh.getRow(i);
			//System.out.println(i);
			
			 lit.add(row.getCell(4).toString());
			
			
		}
		System.out.println(lit);
			//System.out.println(data);
		return lit;
		
		
		

		
	}
	
}
