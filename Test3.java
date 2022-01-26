public class Test3 {
    public static boolean solution(int[] A, int[] B) {
        int[] lia_a, lia_b, lia_m; 
        int li_n, li_len, li_curr;
        
        if( A.length != B.length) {
            return false;
        } else {
            li_n = A.length;
        }
        
        lia_a = new int[li_n];
        lia_a = A;
        lia_b = new int[li_n];
        lia_b = B;
        
        lia_m = new int[li_n];
        
        for(int i=0; i < li_n; i++) {
            lia_m[lia_a[i]-1] = lia_b[i]-1;
        }
        
        li_len = 0;
        li_curr = 0;
        do {
            li_curr = lia_m[li_curr];
            li_len += 1;
        } while(li_curr != 0);
        
        return li_len == li_n;
    }
    
    public static void main(String args[]) {
        System.out.println(solution(new int[] {1,3,2,4}, new int[] {4,1,3,2}));
        System.out.println(solution(new int[] {1,2,3,4}, new int[] {2,1,4,3}));
        System.out.println();
        System.out.println(solution(new int[] {3,1,2}, new int[] {2,3,1}));
        System.out.println(solution(new int[] {1,2,1}, new int[] {2,3,3}));
        System.out.println(solution(new int[] {1,2,3,4}, new int[] {2,1,4,4}));
        System.out.println(solution(new int[] {1,2,2,3,3}, new int[] {2,3,3,4,5}));
    }
}
