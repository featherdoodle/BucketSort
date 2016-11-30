/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package sort;


import java.io.File;




/**
 *
 * @author SyBye8898
 */
public class Main {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File fileName = new File("fileName.txt");
        
        Input input = new Input(fileName, 10, 10);
        input.fillFile();
        
        System.out.println(input);
        
        BucketSort bucketSort = new BucketSort();
        
        System.out.println(bucketSort.sort(input.randomArray));
        
    }
    
    
    
}