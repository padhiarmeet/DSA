public class RedixSort {
    public static void main(String[] args) {

        int arr[] = {121,23,423,45,432,342};
        count(arr);
        
    }
    public static void count(int arr[]){
        
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for(int place = 1;max / place > 0;place *= 10){
            counts(arr,arr.length,place);
        }
    }
    public static void counts(int arr[],int n,int place){

        int output[] = new int[n];
        int count[] = new int[10];
        
        for(int i=0;i<10;i++){
           count[i] = 0;
        }
        for(int i=0;i<arr.length;i++){
            count[(arr[i] / place) % 10]++;
        }
        for(int i = 1;i<10;i++){
            count[i] += count[i-1];
        }
        for(int i = n-1;i>=0;i--){
            output[count[(arr[i] / place) % 10]-1] = arr[i];
            count[(arr[i] /place) % 10]--;
        }
        for(int i = 0;i < arr.length;i++){
            arr[i] = output[i]; 
        }
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] +" "); 
        }
    }
}
