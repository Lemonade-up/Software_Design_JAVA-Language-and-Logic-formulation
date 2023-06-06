public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        int max = numbers[0];
        int lenNum = numbers.length-1;
        
        for(int i = 0; i < lenNum; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
            System.out.println("The maximum value in the array is: " + max);
        }
            
}
        /*
        Process here the max value will be save to max variable
        use loop
        */

       
}