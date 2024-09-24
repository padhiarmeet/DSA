public class Lab_18_94 {
    public static void main(String[] args) {
        int a[] = {7,8,3,1,2};
        int i=0;
        while(i<a.length){
            int key = a[i];
            int j = i-1;
            while(j>=0 && a[j]>key){
                a[j+1] = a[j];
                j = j-1;
            }
            a[j+1] = key;
            i = i+1;
        }
        for(int k=0;k<a.length;k++){
            System.out.print(a[k]+" ");
        }
    }
}
