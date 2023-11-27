package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {
    public static void main(String[] args){
        try{
            File myObj = new File("C:\\Users\\cti22c102\\IdeaProjects\\lab8ex1\\lab8ex1.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }catch(FileNotFoundException e){
            System.out.println("An error eccurred.");
            e.printStackTrace();
        }
    }
}
