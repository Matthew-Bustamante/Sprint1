
/**
 * Program to perform CRUD (Create, Read, Update, Destroy) operations on excel/csv files
 *
 * @authors Sparkling Barracudas
 */

import java.io.*;
import java.util.Scanner;


public class Crud {

    public static void main(String[] args) {
    	boolean notDone = true;
    	Crud project = new Crud();
    	Scanner fileName = new Scanner(System.in);
    	System.out.println("Enter a File Location");
    	String fileNm = fileName.nextLine();
    	while(notDone) {
    		System.out.println("Enter a Number to Preform an action");
    		System.out.println("1.) Create \n2.) Read \n3.) Update \n4.) Delete \n5.) Exit");
    		Scanner userInput = new Scanner(System.in);
    		System.out.println("Enter a valid input");
    		String input = userInput.nextLine();
    		
    		if(input.equals("5")) {
    			notDone = false;
    		}
    		else if(input.equals("1")) {
    			project.create();
    		}
    		else if(input.equals("2")) {
    			project.read();
    		}
    		else if(input.equals("3")) {
    			project.update();
    		}
    		else if(input.equals("4")) {
    			project.delete();
    		}
    		else if(input.equals("P")) {
    			project.printData();
    		}
    	}

    }

    public void create() {

    }

    public void read() {

    }

    public void update() {

    }

    public void delete() {

    }
    
    /**
     * @param
     * a print method that searches the data and prints it.
     */
    public void printData() {
    	int[][] data = new int [4][4]; //a set 2D array but can be changed and data type can be changed as well
    	
    	
    	for(int row = 0; row < data.length; row++ ) { //for loop to loop the first part of the array
    		for(int collumn = 0; collumn < data[row].length; collumn++) {
    			data[row][collumn] = row * collumn;
    			System.out.println(data[row][collumn] + "\t");// will print the data
    		}
    		System.out.println();// will print a new line
    	}
    }
}