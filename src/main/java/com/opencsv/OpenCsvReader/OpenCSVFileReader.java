package com.opencsv.OpenCsvReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.Reader;

public class OpenCSVFileReader {
	private static final String CSV_FILE_PATH = "./object-list-sample.csv";
	
	public static void main(String[] args) throws IOException, CsvException{
		try (
			
			Reader reader = Files.newBufferedReader(Paths.get(CSV_FILE_PATH));
			CSVReader csvReader = new CSVReader(reader);
		
		){
			
			String[] nextRecord;
			
			while((nextRecord = csvReader.readNext()) != null) {
				System.out.println("Name : "+nextRecord[2]);
				System.out.println("Email : "+nextRecord[1]);
				System.out.println("Phone : "+nextRecord[3]);
				System.out.println("Country : "+nextRecord[0]);
				System.out.println("====================");
			}	
			
			List<String[]> records = csvReader.readAll();
			
			for(String[] record : records) {
				System.out.println("Name : "+record[2]);
				System.out.println("Email : "+record[1]);
				System.out.println("Phone : "+record[3]);
				System.out.println("Country : "+record[0]);
				System.out.println("====================");
			}			
		}
		
		
	}
}
