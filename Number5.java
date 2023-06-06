public class Number5 {
    public static void main(String[] args) {
        String original = "racecar";
        String reversed = "";
        int len = original.length();
        int lenIter = len/2;
        String fLetter;
        String bLetter;
        boolean isPalindrome = false;

        for(int i = 0; i <= lenIter-1; i++){
            fLetter = original.substring(i,i+1);
            bLetter = original.substring(len-i-1,len-i);
            isPalindrome = fLetter.equals(bLetter);
            System.out.print(original.substring(i,i+1) +" and "+ original.substring(len-i-1,len-i) + "\n");
        }

        System.out.print(isPalindrome);




    }
}