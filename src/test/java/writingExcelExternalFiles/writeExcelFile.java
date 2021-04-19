package writingExcelExternalFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeExcelFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet0 = workbook.createSheet("firstCreatedSheet");
		
		
		for(int rows=0 ; rows<10; rows++)
		{	
			Row row = sheet0.createRow(rows);
		for(int cols=0;cols<10; cols++)
		{
			Cell cell = row.createCell(cols);
			cell.setCellValue((int)(Math.random()*100));
			
			
		}
		}
		
		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\myFirstCreatedExcel.xlsx");
		
		FileOutputStream fo = new FileOutputStream(f);
		
		workbook.write(fo);
		fo.close();
		
		System.out.println("excel file created ");
	}

}
