package com.training.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.training.bean.LoginBean;
import com.training.bean.SignUpBean;
import com.training.connection.GetConnection;
import com.training.utility.LoadDBDetails;

public class ELearningDAO {
	
	Properties properties; 
	
	public ELearningDAO() {
		 try {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/sql.properties");
			properties.load(inStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	public List<SignUpBean> geLogins(){
		String sql = properties.getProperty("get.logins"); 
		
		GetConnection gc  = new GetConnection(); 
		List<SignUpBean> lists = null;
		try {
			gc.ps1 = GetConnection.getMySqlConnection(LoadDBDetails.getDBDetails()).prepareStatement(sql); 
			lists = new ArrayList<SignUpBean>(); 
			
			gc.rs1 = gc.ps1.executeQuery(); 
			
			while(gc.rs1.next()) {
			
				SignUpBean temp = new SignUpBean(); 
				temp.setFirstName(gc.rs1.getString(1));
				temp.setLastName(gc.rs1.getString(2));
				temp.setEmail(gc.rs1.getString(3));
				temp.setUserName(gc.rs1.getString(4));
				temp.setPwd(gc.rs1.getString(5));
				temp.setCPwd(gc.rs1.getString(6));
				temp.setPhone(gc.rs1.getString(7));
				temp.setLang(gc.rs1.getString(8));

				lists.add(temp); 
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lists; 
	}
	
	
	public static void main(String[] args) {
		new ELearningDAO().geLogins().forEach(System.out :: println);
	}



	
	
	
}
