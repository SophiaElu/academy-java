package com.bptn.course._24_file_handling_basics;

import java.io.File;

public class FileDeleteDemo {

	public static void main(String[] args) {
		File file = new File ("sample.txt");
		if (file.delete()) {
			System.out.println("File deleted!");
		}

	}

}
