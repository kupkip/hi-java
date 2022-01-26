import java.util.Arrays;

class Tt {
    public static int solution(int[] ranks) {
        int li_n, li_rtn;
        int[] lia_ranks;

        li_n = ranks.length;
        lia_ranks = new int[li_n];
        lia_ranks = ranks;

        Arrays.sort(lia_ranks);

        li_rtn = 0;
        for(int i=0; i < li_n; i++) {
            for(int j=i+1; j < li_n; j++) {
                if(lia_ranks[i] == lia_ranks[j] - 1) {
                    li_rtn++;
                    break;
                }
            }
        }

        return li_rtn;
    }
	public static void main(String[] args) {
        System.out.println("Result : " + solution(new int[] {3,4,3,0,2,2,3,0,0}));
        System.out.println("Result : " + solution(new int[] {4,2,0}));
        System.out.println("Result : " + solution(new int[] {4,4,3,3,1,0}));
	}
}