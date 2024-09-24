public class CountSort {
    public static void main(String[] args) {
        
        int arr[] = {9,1,4,14,4,15,6};
        int maxVal = Integer.MIN_VALUE ;
    
        for(int i = 0;i < arr.length;i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        int coutntArr[] = new int[maxVal+1];

        for(int i = 0;i < arr.length;i++){
            coutntArr[arr[i]]++;
        }
        for(int i = 1;i<=maxVal;i++){
            coutntArr[i] += coutntArr[i-1];
        }

        int mainArr[] = new int[arr.length];

        for(int i= arr.length - 1;i>=0;i--){
            mainArr[coutntArr[arr[i]]-1] = arr[i];
            coutntArr[arr[i]]--;
        }
        for(int i=0;i<mainArr.length;i++){
            System.out.print(mainArr[i] + " ");
        }
    }
}
