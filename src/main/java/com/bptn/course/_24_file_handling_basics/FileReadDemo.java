package com.bptn.course._24_file_handling_basics;

import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) {
		
		try {
			FileReader reader = new FileReader("sample.txt");
		}catch(IOException e) {
			System.out.println("Something went wrong while creating the file:" + e.getMessage());
			e.printStackTrace();
			
		}

	}

}
