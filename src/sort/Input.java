/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;


/**
 *
 * @author Owner
 */
public class Input {
    
    //int arrayLength, range, numberOfBuckets
    //adding a new bucket if needed, arraylist of buckets
    
    File fileName;
    int length;
    int range;
    int[] randomArray;
    
    public Input(File _fileName, int _length, int _range){
        fileName = _fileName;
        length = _length;
        range = _range;
    }
    
    
    public void fillFile(){
        
        randomArray = new int[length];
        
        Random random = new Random();
        
        /*for(int i : randomArray){
            i = random.nextInt(range);
        }*/
        
        try{
            PrintWriter writer = new PrintWriter(fileName);
            for(int i : randomArray){
                writer.println(random.nextInt(range));
            }
            writer.close();
        }catch(FileNotFoundException e){
            System.err.println("FileNotFoundException: " + e.getMessage());
        }
    }
    
    @Override
    public String toString(){
        
        String output = "";
        
        try{
            FileReader in;
            BufferedReader readFile;
            String line;
            in = new FileReader(fileName);
            readFile = new BufferedReader(in);
            while((line = readFile.readLine()) != null){
                output += " " + line;
            }
            readFile.close();
            in.close();
        }catch(FileNotFoundException e){
            System.err.println("FileNotFoundException: " + e.getMessage());
        }catch(IOException e){
            System.err.println("IOException: " + e.getMessage());
        }
        
        return output;
    }
    
}
