package com.training.dataproviders;

import java.util.List;

import org.testng.annotations.DataProvider;

import com.training.bean.LoginBean;
import com.training.dao.ELearningDAO;
import com.training.readexcel.ApachePOIExcelRead;
import com.training.readexcel.ReadExcel;

public class LoginDataProviders {

	
	@DataProvider(name = "excel-inputs")
	public Object[][] getExcelData(){
		String fileName ="C:/Users/Naveen/Desktop/Testing.xls"; 
		return new ApachePOIExcelRead().getExcelContent(fileName); 
	}
	
	@DataProvider(name = "testcase87")
	public Object[][] gettestcase87Data(){
		// ensure you will have the title as first line in the file 
		return new ReadExcel().getExcelData("C:/Users/IBM_ADMIN/Testing.xls", "Sheet1"); 
	}
	
	@DataProvider(name = "testcase88")
	public Object[][] gettestcase88Data(){
		// ensure you will have the title as first line in the file 
		return new ReadExcel().getExcelData("C:/Users/IBM_ADMIN/Testing.xls", "Sheet2"); 
	}
}
