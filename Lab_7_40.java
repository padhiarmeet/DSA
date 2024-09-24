public class Lab_7_40 {
    public static void main(String[] args) {
        String input = "aaabbb"; 
        System.out.println(ghatana(input));
    }

    public static boolean ghatana(String s) {
       
        if (s == null || s.length() == 0) {
            return false;
        }

        int countA = 0;
        int countB = 0;
        boolean foundB = false;

        for (char c : s.toCharArray()) {
            if (c == 'a') {
                if (foundB) { 
                    return false;
                }
                countA++;
            }
            else if (c == 'b') {
                foundB = true;
                countB++;
            } 
            else {
                return false;
            }
        } 
        return countA > 0 && countA == countB;
}
}
