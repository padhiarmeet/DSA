public class ShellSort {
    public static void main(String[] args) {
        int arr[] = {43,21,56,38,19};
        //for gap
        for(int gap = arr.length/2;gap >= 1;gap /= 2){
            //for moving for next pointer
            for(int j = gap;j < arr.length;j++){
                //for moving next gap pointer   
                for(int i = j-gap;i >= 0;i-=gap){
                    
                    if(arr[i + gap] > arr[i]){
                        
                        System.out.println("");
                        for(int k = 0;k<arr.length;k++){
                            System.out.print(arr[k] +" ");
                        }
                        break;

                    }
                    else{
                        
                        int temp = arr[gap + i];
                        arr[gap + i] = arr[i];
                        arr[i] = temp;
                        for(int k = 0;k<arr.length;k++){
                            System.out.print(arr[k] +" ");
                        }
                        System.out.println("");
                    }
                }
            }
        }
        for(int i=0;i<arr.length;i++){  
            System.out.print(arr[i]+" ");
        }
    }
}
