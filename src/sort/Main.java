/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package sort;


import java.util.Arrays;
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
        
        Random random = new Random();
        int length = 100;
        int range = 100;
        
        int[] randomArray = new int[length];
        
        for(int i = 0; i < randomArray.length; i++){
            randomArray[i] = random.nextInt(range);
        }
        
        int[] output;
        
        //System.out.println(Arrays.toString(randomArray));
        
        long first = System.nanoTime();
        BucketSort bucketSort = new BucketSort();
        
        output = (bucketSort.sort(randomArray));
                
        long second = System.nanoTime();
        
        //System.out.println(Arrays.toString(output));
        
        System.out.println("Time: " + (second-first));
    }
    
    
    
}