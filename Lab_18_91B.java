public class Lab_18_91B {
    public static void main(String[] args) {
        System.out.println(binarySearch(num, num));
    }
    static int arr[] = {1,3,5,6,7,8,9};
    static int num = 5;
    public static int binarySearch(int left,int right){
        left = 0;
        right = arr.length-1;
        int mid = (left + right)/2;
        while(left < right){
            
            if(num == arr[mid]){
                return mid;  
            }
            else if(num > arr[mid]){
               return binarySearch(mid+1, right);
            }
            else if(num < arr[mid]){
                return binarySearch(left, mid-1);
            }
            mid = (left+right)/2;
            
        }
        return -1;
    }
}
