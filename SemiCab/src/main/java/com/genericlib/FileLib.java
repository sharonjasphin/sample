package com.genericlib;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public String getDataFromProperty(String path,String key) throws Throwable{
		FileInputStream ip =new FileInputStream(path);
		Properties prop=new Properties();
		prop.load(ip);
		return prop.getProperty(key);
	}

	public String getDataFromExel(String path,int row,int col,String sheet) throws Throwable {
		FileInputStream ip = new FileInputStream(path);
		Workbook w=WorkbookFactory.create(ip);
		Sheet s=w.getSheet(sheet);
		String data = s.getRow(row).getCell(col).toString();
		return data;
}
}
