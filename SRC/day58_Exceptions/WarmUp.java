package day58_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import day50_Abstraction.SouthKorea;

public class WarmUp {
	
	/*
	  1. Write a method called "wait" that causes the current executing thread to sleep for the specific number of seconds
            parameters: double seconds
            return-type: String
            Thread.sleep();
        Note: Exceptions MUST be handled within the methods
    2. write a method called "getData" that can retrieve the data from properties files
            parameters: String Key, String FilePath
            return-type: String
        Note: Exceptions MUST be handled within the methods
        */
	
	
	public static void main(String[] args) {
		Wait(2.5);
		System.out.println("Batch 12");
		
		Properties property = new Properties();
		
		String path= "/Users/ysncakir/Desktop/Data.properties";
		
		try {
		FileInputStream file = new FileInputStream(path);
		property.load(file);
		}
		catch(Exception e) {
			
		}
		
		String Name = property.getProperty("Name");
		System.out.println(Name);
		
		System.out.println(getData("Name","/Users/ysncakir/Desktop/Data.properties"));
		
		String myData = getData("Age","TestData.properties");
		System.out.println(myData);
		
		String URL= getData("URL", "Files/TestData2");
		System.out.println(URL);
	}
	
	// WarmUp 1
	public static void Wait( double seconds) { // this method is designed for Long variable
		
		try {
		Thread.sleep((long)(seconds*1000)); // that means 1 second
		} catch(Exception e) {
			
		}
		
	}
	
	// WarmUp 2
	
	public static String getData(String Key, String FilePath) {
		
		String data = ""; 
		
		Properties property = new Properties();
		String path= "/Users/ysncakir/Desktop/Data.properties";
		
		try {
		FileInputStream file = new FileInputStream(FilePath);
		property.load(file);
		}
		catch(Exception e) {
			
		}
		
		data = property.getProperty(Key);
		
		return data;
	}
	
}
