package com.opencsv;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

import com.opencsv.OpenCsvReader.CSVUser;
import com.opencsv.bean.*;

public class OpenCsvReadAndParseToBean {
	
	private static final String CSV_FILE_PATH = "./object-list-sample.csv";

	public static void main(String[] args) throws IOException {
		
		try (
			Reader reader = Files.newBufferedReader(Paths.get(CSV_FILE_PATH));			
			){
			
			CsvToBean<CSVUser> csvToBean = new CsvToBeanBuilder<CSVUser>(reader)
					.withType(CSVUser.class)
					.withIgnoreLeadingWhiteSpace(true)
					.build();
			
			Iterator<CSVUser> csvUserIterator = csvToBean.iterator();
			
			while(csvUserIterator.hasNext()) {
				CSVUser csvUser = csvUserIterator.next();
				
				System.out.println("Name : "+csvUser.getName());
				System.out.println("Email : "+csvUser.getEmail());
				System.out.println("PhoneNo : "+csvUser.getPhoneNo());
				System.out.println("Country : "+csvUser.getCountry());
				System.out.println("==================");
			}
			
			List<CSVUser> csvUsers = csvToBean.parse();
			
			for(CSVUser csvUser: csvUsers) {
				System.out.println("Name : "+csvUser.getName());
				System.out.println("Email : "+csvUser.getEmail());
				System.out.println("Phone : "+csvUser.getPhoneNo());
				System.out.println("Country : "+csvUser.getCountry());
				System.out.println("====================");
			}			
		}

	}

}
