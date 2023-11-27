package com.company;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args){
        try{
            FileWriter myWriter = new FileWriter("C:\\Users\\cti22c102\\IdeaProjects\\lab8ex1\\lab8ex1.txt");
            myWriter.write("Text in java file.");
            myWriter.close();
            System.out.println("Succesfully wrote to the file.");
        }catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}