public class QuickShort {
    public static void main(String[] args) {
        int a[] = {4,1,7,3,5,2};
        int i = 0 ;
        int temp  =a[i];
        int j = a.length; 
        
        while(i<j){
            while(a[i] <= a[temp] && i<=j){
                i++;
            }
            while(a[i]>a[temp] && j>=i){
                j--;
            }
            if(i<j){
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        for(int k=0;k<a.length;k++){
            System.out.println(a[k]);
        }
    }
    
}
