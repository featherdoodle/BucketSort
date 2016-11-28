/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sort;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

/**
 *
 * @author SyBye8898
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
    public void fillFile(int length, int range, int numberOfBuckets, File fileName){
        
        int[] randomArray = new int[length+1];
        
        Random random = new Random();
        
        randomArray[0] = numberOfBuckets;
        
        for(int i = 1; i < randomArray.length; i++){
            randomArray[i] = random.nextInt(range);
        }
        
        try{
            PrintWriter writer = new PrintWriter(fileName);
            for(int i : randomArray){
                writer.println(i);
            }
            writer.close();
        }catch(FileNotFoundException e){
            System.err.println("FileNotFoundException: " + e.getMessage());
        }
        
    }
    
}
