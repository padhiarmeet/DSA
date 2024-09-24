
import java.util.*;

public class BucketSort {
    public static void main(String[] args) {
        
        float arr[] = {0.5f,0.4f,0.3f,0.2f,0.1f};
        bucketsort(arr);

        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    @SuppressWarnings("unchecked")
    public static void bucketsort(float arr[]){
        int n = arr.length;

        ArrayList<Float>[] buckets = new ArrayList[n];
        for(int i = 0;i < n;i++){
            buckets[i] = new ArrayList<Float>();
        }
        for(int i = 0;i < n;i++){
            int bucketIndex = (int)arr[i] * n;
            buckets[bucketIndex].add(arr[i]);
        }
        for(int i =0;i < n;i++){
            Collections.sort(buckets[i]);
        }
        int index = 0;
        for(int i = 0;i<buckets.length;i++){
            ArrayList<Float> curruntBucket = buckets[i];
            for(int j = 0;j< curruntBucket.size();j++){
                arr[index++] = curruntBucket.get(j);
            }
        }
    }
}
