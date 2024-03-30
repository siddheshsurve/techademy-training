import java.io.File;  //import the File Class library
import java.io.IOException; //Handling Exceptions
import java.io.FileWriter; //For writing a file
import java.io.FileNotFoundException; //to handle errors
import java.util.Scanner;

public class File_Handling {
    public static void main(String[] args) {
        //myfile.txt
        File myFile = new File("C:\\Users\\HP\\MyJavaTest");
        if(myFile.delete()) {
            System.out.println("Directory deleted successfully " + myFile.getName());
        } else {
            System.out.println("Directory not found.. or set correct path");
        }
    }
}
