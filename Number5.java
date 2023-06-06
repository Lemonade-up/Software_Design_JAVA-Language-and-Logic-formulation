public class Number5 {
    public static void main(String[] args) {
        String original = "racecar";
        String reversed = "";
        int len = original.length();
        int lenIter = len/2;
        boolean isPalindrome = false;

        for(int i = 0; i <= lenIter-1; i++){
            if(original.substring(i,i+1) == original.substring(len-i-1,len-i)){
                isPalindrome = true;
                System.out.print(isPalindrome);
            }
            System.out.print(original.substring(i,i+1) +" and "+ original.substring(len-i-1,len-i));
        }

        System.out.print(isPalindrome);




    }
}