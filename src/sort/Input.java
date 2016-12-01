/*
 * Only necessary for writing input to a file
 */
package sort;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;


/**
 *
 * @author Owner
 */
public class Input {
    
    File fileName;
    int[] input;
    
    public Input(File _fileName, int[] _input){
        fileName = _fileName;
        input = _input;
    }
    
    
    public void fillFile(){
        
        try{
            PrintWriter writer = new PrintWriter(fileName);
            writer.println(Arrays.toString(input));
            writer.close();
        }catch(FileNotFoundException e){
            System.err.println("FileNotFoundException: " + e.getMessage());
        }
    }
    
    @Override
    public String toString(){
        return Arrays.toString(input);
        /*String output = "";
        
        int lineNumber = 0;
        
        try{
            FileReader in;
            BufferedReader readFile;
            String line;
            in = new FileReader(fileName);
            readFile = new BufferedReader(in);
            while((line = readFile.readLine()) != null){
                output += " " + line;
                input[lineNumber] = Integer.parseInt(line);
                lineNumber++;
            }
            readFile.close();
            in.close();
        }catch(FileNotFoundException e){
            System.err.println("FileNotFoundException: " + e.getMessage());
        }catch(IOException e){
            System.err.println("IOException: " + e.getMessage());
        }
        
        return output;*/
    }
    
}
