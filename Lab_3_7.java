public class Lab_3_7 {
    public static void main(String[] args) {
        int count1 = 0;
        int count2 = 0;
        for(int i=0;i<=4;i++){
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    System.out.print(1);
                }
                else{
                    if(j==1 || j==i-1){
                        
                    System.out.print(count1);
                    }
                    else{
                        count2 += count1+2;
                        System.out.print(count2);
                    }
                }
            }
            count1+=1;
            System.out.println("");
        }
    }
}
