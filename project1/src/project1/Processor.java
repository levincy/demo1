package project1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Processor {
	
String data1;
//	String data2;
	
	public List<String> method1() throws IOException {
		List<String> list=new ArrayList< >();
	
	readfile obj=new readfile();
	List<String> current = obj.method();
	XSSFWorkbook we1=new XSSFWorkbook(new FileInputStream("C:\\Users\\USER\\Documents\\excel files\\project billing.xlsx "));

//	for(String malu:current) {
//		System.out.println(malu);
//	}
	//XSSFSheet sh=we.getSheet("sheet1");
	XSSFSheet sh1=we1.getSheetAt(0);
	int rowCount1=sh1.getLastRowNum()+1;
	int cols1=sh1.getRow(1).getLastCellNum();
	System.out.println(rowCount1);
	for(int i=0;i<rowCount1  ;i++) {
		XSSFRow rows=sh1.getRow(i);
		
		
		//for(int j=0;j<cols1;j++) {
		
		data1=rows.getCell(3).getStringCellValue(); 
			
			  
//			  list.add(data1);
//			  list.add(data2);
//	
//		}
		System.out.println(data1);
			
		}
	

//		  for (String row1 : list) {
//	          System.out.println(row1+" ");
//	          
//		  }
		  //System.out.println(data1);
		


	return list;
}
	
	}



