package com.bptn.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner; 

public class FileUtils {

	public static void main(String[] args) {
		// The main() method is implemented in part 2 of this exercise.
        Path path = Paths.get("test.txt");
      
      // Testing the methods (part 2 will add further usage in main)
      FileUtils fileUtils = new FileUtils();
      System.out.println("isFileExist: " + fileUtils.isFileExist(path));
      System.out.println("isFileExistsWithExceptionHandling: " + fileUtils.isFileExistsWithExceptionHandling(path));
      System.out.println("createFileIfNotExist: " + fileUtils.createFileIfNotExist(path));
  }
  

  // define isFileExist() 
  public boolean isFileExist(Path path) {
      if (Files.exists(path)) {
          System.out.println("File exists!");
          return true;
      } else {
          System.out.println("File doesn't exist!");
          return false;
      }
  }

  // define isFileExistsWithExceptionHandling() 
  public boolean isFileExistsWithExceptionHandling(Path path) {
      try {
          File file = new File(path.toUri());
          Scanner scanner = new Scanner(file);
          scanner.nextLine();
          System.out.println("File exists");
          return true;
      } catch (FileNotFoundException e) {
          System.out.println("File doesn't exist!");
          return false;
      }
  }

  // define createFileIfNotExist()     
   public boolean createFileIfNotExist(Path path) {
      try {
          if (Files.exists(path)) {
              System.out.println("File already exists.");
              return true;
          } else {
              Files.createFile(path);
              System.out.println("File created successfully.");
              return true;
          }
      } catch (IOException e) {
          System.out.println("An error occurred while creating the file.");
          return false;
      }
  }

	}

