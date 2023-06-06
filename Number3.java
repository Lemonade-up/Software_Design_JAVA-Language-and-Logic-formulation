import java.util.ArrayList;
public class Number3 {
    public static void main(String[] args) {
        int n = 11;
        /*Nakalagay sa output hanggang 55, so tinaasan ko ng 1 yung n since pang 11th na yung 55*/
        int t1 = 0, t2 = 1;
        int tAdd;
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        arr.add(t1);
        arr.add(t2);

        System.out.print("First " + n + " terms: ");
        for(int i = 3; i <= n; i++){
            int firstAdd = i-3;
            int secondAdd = i-2;
            tAdd = arr.get(firstAdd) + arr.get(secondAdd);
            arr.add(tAdd);

        }
        System.out.print(arr);
    }
}