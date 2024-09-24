public class InsertionSort {
    public static void main(String[] args) {

        int []a = {5,1,3,4,2};
        for(int i=0;i<a.length;i++){
            int j=i;
            while(j>0 && a[j-1] > a[j]){
                int temp = a[j-1];
                a[j-1] = a[j];
                a[j] = temp;
                j--;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
