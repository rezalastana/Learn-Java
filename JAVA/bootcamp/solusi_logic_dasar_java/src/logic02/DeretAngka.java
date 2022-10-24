package logic02;

public class DeretAngka {
    public static int[] tribonacchi(int n){
        int[] deret = new int[n];
        for (int i = 0; i < n; i++) {
            if(i < 3){
                deret[i] = 1;
            }else {
                deret[i] = deret[i-1] + deret[i-2] + deret[i-3];
            }
        }
        return deret;
    }
}
