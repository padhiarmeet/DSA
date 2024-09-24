public class selectionSort {
    public static void main(String[] args) {
        
        int []a = {7,1,5,0,7,0,4};
        for(int i=0;i <= a.length-2;i++){
            int min = i;
            for(int j=i;j <= a.length-1;j++){
                if(a[j] < a[min]){
                    min = j;
                    }
                    }
                    int temp = a[min];
                    a[min] = a[i];
                    a[i] = temp;
        }
        for(int i = 0;i<a.length-1;i++){
            System.out.println(a[i]);
        }
    }
}
