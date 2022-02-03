
/**
 * Program to perform CRUD (Create, Read, Update, Destroy) operations on excel/csv files
 *
 * @authors Sparkling Barracudas
 */

import java.io.*;
import java.util.Scanner;


public class Crud {

    public static void main(String[] args) {

    }

    public void create() {

    }

    public void read() {

    }

    public void update() {

    }

    public void delete() {

    }
    
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