
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
        //on the fourth step it messes up :'(
        int[] output = new int[input.length];
        for(int i = 0; i < input.length; i++){
            int firstArrayIndex = input[i]/bucketSize;
            size = buckets.get(firstArrayIndex).size();
            index = sortBucket(size, firstArrayIndex, input[i]);
            buckets.get(firstArrayIndex).add(index, input[i]);
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
    //6, fourth
    public int sortBucket(int size, int bucketNumber, int input){
        int index = 0;
        if(buckets.get(bucketNumber).isEmpty()){
            index = 0;
        }else if(input <= buckets.get(bucketNumber).get(0)){
            index = 0;
        }else if(input > buckets.get(bucketNumber).get(size-1)){
            index = size;//+1;
        }else{
            for(int i = 0; i < size; i++){
                if((input > buckets.get(bucketNumber).get(i))&&(input <= buckets.get(bucketNumber).get(i+1))){
                    index = i;
                }
            }
        }
        return index;
    }
    
}
