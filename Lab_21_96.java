public class Lab_21_96 {
    static int arr[] = {5,8,2,3,7,5,9};
    public static void main(String[] args) {
       
        int low = 0;
        int high = arr.length-1;
        mergesort(low, high);
        for(int i=0;i<=arr.length-1;i++) System.out.print(arr[i]+" ");
    }
    static void mergesort(int low,int high){
        if(low < high){
            int mid = (int)(Math.floor(high + low))/2;
            mergesort(low, mid);
            mergesort(mid+1, high);
            merge(low,mid,high);
        }
    }
    static void merge(int low,int mid,int high){

        int tempArr[] = new int[high+1];
        int h = low;
        int i = low;
        int j = mid +1;

        while(h <= mid && j <= high){

            if(arr[h] <= arr[j]) tempArr[i] = arr[h++];
            else tempArr[i] = arr[j++];
              
            i++;
        }
        if(h > mid) for(int k = j;k<=high;k++) tempArr[i++] = arr[k];
        else for(int k = h;k<=mid;k++) tempArr[i++] = arr[k];

        for(int k=low;k<=high;k++) arr[k] = tempArr[k];
    }
}
