

class Solution {
    public int solution(int[] ranks) {int N , int K {
        int il_rnt = 0 , il_n = N , il_k = K ;

        System.out.println();
        System.out.println("input N : " + il_n+", Input K : " + il_K);

        if (1 > il_n || il_n > 1000000 ) return 0 ;
        if(1 > il_k || il_k > 1000000000) return 0;

        while(il_k > 0){
            if (il_n < 1 && il_k > 0) return -1;

            il_k -=il_n --;

            il_rnt++;
        }

        return il_rnt
    
        // write your code in Java SE 8
    }
    public static void main (String args[]) {
        System.out.println("Result : "+ Solution(3,4,3,0,2,2,3,0,0))



    }
}

