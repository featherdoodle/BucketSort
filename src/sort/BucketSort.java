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
    
    ArrayList<ArrayList<Integer>> buckets = new ArrayList<>();
    int bucketSize = 10;
    
    @Override
    public int[] sort(int[] input){
        for(int i : input){
            buckets.get(i/bucketSize).set(index, i);
            //index determined by insertion sort
        }
    }
    
    
}
