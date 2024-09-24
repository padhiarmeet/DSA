// public class First {

//     public static void main(String[] args) {

//         int prices[] = {7,1,5,3,6,4};

//         int min = prices[0];
//         int max = prices[0];
//         int maxPlace = 0;
//         int minPlace = 0;

//         for (int i = 1; i < prices.length - 1; i++) {
//             if (prices[i] < min) {
//                 min = prices[i];
//                 minPlace = i+1;  
//             }
//         }
//         for (int i = minPlace; i < prices.length - 1; i++) {
//             if (prices[i] > max) {
//                 max = prices[i];
//                 maxPlace = i;
//             }
//         }
//         if(minPlace < maxPlace){
//             System.out.println(max-min);
//         }
//         else{
//             System.out.println("111");
//         }
//     }
// public class First {

//     public static void main(String[] args) {

//         int prices[] = {3,2,6,5,0,3};

       
//         int min = prices[0];
//         int max = 0; 
//         int minPlace = 0;

       
//         for (int i = 1; i < prices.length-1; i++) {
//             if (prices[i] < min) {
//                 min = prices[i];
//                 minPlace = i;
//             }
//         }

//         for (int i = minPlace; i < prices.length; i++) {
//             if (prices[i] > max) {
//                 max = prices[i];
//             }
//         }

        
//         if (minPlace < prices.length - 1) {
//             System.out.println(max - min);
//         } else {
//             System.out.println("No profit possible");
//         }
//     }
// }

public class First{
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        int n1 = needle.length();
        int n2 = haystack.length();

        if(needle.isEmpty()){
            return -1;
        }

        for(int i=0;i< n1 - n2;i++){

            if(haystack.charAt(i) == needle.charAt(0)){
                String s = haystack.substring(i, i+(n1));
                if(s.equals(needle)){
                    return i;
                    
                }
                else{
                    return -1;
                }
            }
        }
    
        }
    }


