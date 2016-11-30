/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package sort;


import java.io.File;
import java.util.Arrays;




/**
 *
 * @author SyBye8898
 */
public class Main {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*File fileName = new File("fileName.txt");
        
        Input input = new Input(fileName, 10, 10);
        input.fillFile();*/
        
        //for testing purposes:
        
        int[] input = {5, 7, 3, 6, 7, 0, 3, 3};
        
        System.out.println(Arrays.toString(input));
        
        BucketSort bucketSort = new BucketSort();
        
        System.out.println(Arrays.toString(bucketSort.sort(input)));
        
        //System.out.println(Arrays.toString(bucketSort.sort(input.randomArray)));
        
    }
    
    
    
}