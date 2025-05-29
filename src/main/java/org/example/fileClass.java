package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileClass {
  public static void method_01() {
    try {
      File myObj = new File("/Users/mohammadziaurrahman/files/name.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }

  public static void method_02() {
    try {
      FileWriter myWriter = new FileWriter("name.txt");
      myWriter.write("Files in java might be tricky, but it is fun enough!");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      throw new RuntimeException(e);
    }
  }

  public static void method_03() {
    try {
      File myObj = new File("name.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNext()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      throw new RuntimeException(e);
    }
  }
  public static void method_04() {
      File myObj = new File("name.txt");
      if (myObj.delete()) {
      System.out.println("Deleted the file: " + myObj.getName());
      } else {
      System.out.println("Failed to delete the file.");
      }
  }
}
