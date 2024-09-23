package com.opencsv.OpenCsvReader;

import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;

public class OpenCSVWriter {

	private static final String OBJECT_LIST_SAMPLE = "./object-list-sample.csv";
	
	public static void main(String[] args) {
		
		List<MyUser> myUsers = Arrays.asList(
				new MyUser("Tejaswini", "tejaswini@gmail.com", "302342131","India"),
				new MyUser("Shreya","shreya@gmail.com", "1234567809","India")
			);
		
		try (Writer writer = Files.newBufferedWriter(Paths.get(OBJECT_LIST_SAMPLE))) {
			StatefulBeanToCsv<MyUser> beanToCsv = new StatefulBeanToCsvBuilder<MyUser>(writer)
					.withQuotechar(CSVWriter.NO_QUOTE_CHARACTER) 
					.build();
			
			beanToCsv.write(myUsers);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
