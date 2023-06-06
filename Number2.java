public class Number2 {
    public static void main(String[] args) {
        int num = 29; // this is the number to test
        boolean isPrime = true;


        
        if(num%2 != 0){
            if(num%3 != 0){
                isPrime = true;
            }
            else {
                isPrime = false;
            }

        }
        else {
            isPrime = false; 
        }

        if(isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        }
}