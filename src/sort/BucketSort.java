
package sort;


import java.util.ArrayList;


/**
 *
 * @author SyBye8898
 */
public class BucketSort extends Sort{
    
    ArrayList<ArrayList<Integer>> buckets = new ArrayList<>();
    
    
    int bucketSize = 32;
    
    @Override
    public int[] sort(int[] input){
        
        int index, size, range, totalBuckets, bucketRange;
        int[] extremes = getExtremes(input);
        
        range = extremes[1]-extremes[0];
        totalBuckets = input.length/bucketSize;
        bucketRange = range/totalBuckets;
        
        for(int j = extremes[0]; j <= extremes[1]; j += bucketRange){
                buckets.add(new ArrayList<>());
        }
        
        int[] output = new int[input.length];
        for(int i = 0; i < input.length; i++){
            int bucketIndex = (input[i]-extremes[0])/bucketRange;
  
            size = buckets.get(bucketIndex).size();
            index = sortBucket(size, bucketIndex, input[i]);
            buckets.get(bucketIndex).add(index, input[i]);
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
        if(buckets.get(bucketNumber).isEmpty()){
            index = 0;
        }else if(input <= buckets.get(bucketNumber).get(0)){
            index = 0;
        }else if(input > buckets.get(bucketNumber).get(size-1)){
            index = size;
        }else{
            for(int i = 0; i < size; i++){
                if((input > buckets.get(bucketNumber).get(i))&&(input <= buckets.get(bucketNumber).get(i+1))){
                    index = i+1;
                }
            }
        }
        return index;
    }
    
    public int[] getExtremes(int[] input){
        int[] extremes = {input[0], input[0]};
        
        for(int i = 0; i < input.length; i++){
            if(input[i] < extremes[0]){
                extremes[0] = input[i];
            }else if(input[i] > extremes[1]){
                extremes[1] = input[i];
            }
        }
        return extremes;
    }
    
    
    
    
    
    
    
    
    
    
}
