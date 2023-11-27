package com.company;
import java.io.File;

public class Delete {
    public static void main(String[] args){
        File myObj = new File("C:\\Users\\cti22c102\\IdeaProjects\\lab8ex1\\lab8ex1.txt");
        if(myObj.delete()){
            System.out.println("Deleted the file: " + myObj.getName());
        }else{
            System.out.println("Failed to delete the file.");
        }
    }
}
