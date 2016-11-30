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
        int index, size;
        
        buckets.add(new ArrayList<>());
        
        /*for(int i = 0; i < 10; i++){
            buckets.add(new ArrayList<>());
            for(int j = 0; j < 10; j++){
                buckets.get(i).add(j);
            }
        }*/
        
        int[] output = new int[input.length];
        for(int i : input){
            size = buckets.get(i/bucketSize).size();
            index = sortBucket(size, (i/bucketSize), i);
            buckets.get(i/bucketSize).add(index, i);
        }
        
        int counter = 0;
        for(int i = 0; i < buckets.size(); i++){
            for(int j = 0; j < buckets.get(i).size(); j++){
                output[counter] = buckets.get(i).get(j);
                counter++;
            }
        }
        return output;
    }
    
    public int sortBucket(int size, int bucketNumber, int input){
        int index = 0;
        if(input <= buckets.get(bucketNumber).get(0)){
            index = 0;
        }else if(input >= buckets.get(bucketNumber).get(size)){
            index = size+1;
        }else{
            for(int i = 0; i < size; i++){
                if((input >= buckets.get(bucketNumber).get(i))&&(input <= buckets.get(bucketNumber).get(i+1))){
                    index = i;
                }
            }
        }
        return index;
    }
    
}
