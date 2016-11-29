/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sort;

import java.util.ArrayList;

/**
 *
 * @author SyBye8898
 */
public class BucketSort extends Sort{
    
    
    @Override
    public int[] sort(int[] input, int range){
        ArrayList<Integer> buckets = new ArrayList<>(range);
        int[] output = new int[input.length];
        
        
        for(int i : input){
            buckets.set(i, i++);
        }
        int counter;
        for(int i = 0; i < output.length; i++){
            counter = buckets.get(i);
            for(int j = 0; j < counter; j++){
                output[i] = buckets.indexOf(buckets.get(j));
                buckets.set(i, (buckets.get(i)-1));
            }
        }
        
        return output;
    }
    
    
}
