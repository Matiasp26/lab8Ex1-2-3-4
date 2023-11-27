package com.company;
import java.io.File;
import java.io.IOException;


public class Main {

    public static void main(String[] args) {
        try{
            File myObj = new File("C:\\Users\\cti22c102\\IdeaProjects\\lab8ex1\\lab8ex1.txt");
            if (myObj.createNewFile()){
                System.out.println("File created: " + myObj.getName());
            }else{
                System.out.println("File already exists.");
            }
        }catch (IOException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}