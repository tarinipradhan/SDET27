package com.crm.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author USER
 *
 */
public class ExcelUtility {
	/**
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 * 
	 * 
	 */
    public String getvaluefromexelsheet(String sheetName,int rowNum,int cellvalue) throws EncryptedDocumentException, IOException
    {
	FileInputStream fis_e=new FileInputStream("./data/Book1.xlsx");
	Workbook wb = WorkbookFactory.create(fis_e);
	Sheet sh =wb.getSheet(sheetName);
	Row ro =sh.getRow(rowNum);
	Cell cel =ro.getCell(cellvalue);
	String value =cel.getStringCellValue();
	return value;
    }
}