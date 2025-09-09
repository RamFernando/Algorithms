package HashBasedAlgorithms;

import java.util.HashMap;

public class HashMapAlgorithm {

    public static void displayFrequencyOfEachElement(int[] arr){
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for (int x: arr){
            if(!freqMap.containsKey(x)){
                freqMap.put(x,1);
            }else{
                freqMap.put(x,freqMap.get(x) + 1);
            }
        }
        freqMap.forEach((key,value) -> System.out.println( key +" : "+value));
    }

    public static void main(String[] args) {
        displayFrequencyOfEachElement(new int[]{1,2,3,2,4,2,3,4,56,3,0,3,2,2,2,5,5});
    }
}
