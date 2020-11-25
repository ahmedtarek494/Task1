package com.example.demo.bussiness;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.swing.text.Document;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.springframework.stereotype.Service;

import com.example.demo.DTOs.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	
	 public static final String BALANCE = "balance";
	public String processemp(String list) {
		// TODO Auto-generated method stub
		
        String jsonFilePath = "C:\\Users\\ahmed.t.abouelsouod\\Desktop\\data.json";
      
        File jsonFile = new File(jsonFilePath);
		int counter = 0;
		JsonFactory jsonfactory = new JsonFactory();
		try {
			JsonParser jsonParser = jsonfactory.createJsonParser(list);
			
	            while (jsonParser.nextToken()!= JsonToken.END_ARRAY) {
	            	
	                String fieldname = jsonParser.getCurrentName();
	               System.out.println("location : " +jsonParser.getCurrentLocation());//get current name of token
	                System.out.println("token  "+fieldname);
	                if (BALANCE.equals(fieldname)) {
	                    jsonParser.nextToken(); //read next token
	                   if( jsonParser.getFloatValue()<2000);
	                   {
	                   counter++;
	                   System.out.println(counter);
	                   }
	                }
           }
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//return "done";
		return counter+" of employees have balance less than 2000";
		
	}

}
