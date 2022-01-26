public class Solution {
    public static int solution(int N, int K){
        int il_rnt = 0, il_n = N, il_k = K;
        
        System.out.println();
        System.out.println("input N : " + il_n + ", Input K : " + il_k);
        
        if(1 > il_n || il_n > 1000000) return 0;
        if(1 > il_k || il_k > 1000000000) return 0;

        while(il_k > 0){
            if(il_n < 1 && il_k > 0) return -1;
            
            il_k -= il_n--;
            
            il_rnt++;
        }
        
        return il_rnt;
    }
    
    public static void main(String args[]) {
        System.out.println("Result : " + solution(5, 8));
        System.out.println("Result : " + solution(4, 10));
        System.out.println("Result : " + solution(1, 2));
        System.out.println("Result : " + solution(10, 5));
        
        System.out.println("Result : " + solution(10, 30));
        System.out.println("Result : " + solution(20, 207));
    }
}