public class Testtext1 {
    public static String solution(String S) {
        String ls_s, lsa_s[], ls_ss, ls_rnt;
        int li_len, lia_len[], li_lensub;
        int li_repCnt, li_repRnt, li_strRtn;

        ls_s = S;
        System.out.println();

        li_len = ls_s.length();
        if(1 > li_len || li_len > 200) return "";
        if(!ls_s.matches("[a-z]+")) return "";

        lsa_s = new String[li_len];
        lia_len = new int[li_len];

        ls_ss = "";
        ls_rnt = "";
        li_repRnt = 0;
        li_strRtn = 0;

        for(int i=0; i < li_len - 1; i++) {
            ls_ss = String.valueOf(ls_s.charAt(i));

            for(int j=i+1; j < li_len; j++) {
                ls_ss += String.valueOf(ls_s.charAt(j));

                li_lensub = ls_ss.length();
                li_repCnt = 0;

                for(int k=0; k + li_lensub - 1 < li_len; k++) {
                    if(ls_ss.equals(ls_s.substring(k, k + li_lensub))) li_repCnt++;
                }

                if( (li_repCnt <= li_repRnt && li_lensub < li_strRtn)
                    || (li_repCnt < li_repRnt && li_lensub > li_strRtn)
                    || (li_repRnt == 0 && li_strRtn == 0) ) {
                    li_repRnt = li_repCnt;
                    li_strRtn = li_lensub;
                    ls_rnt = ls_ss;
                }
            }
        }

        return String.valueOf(li_strRtn);
    }

    public static void main(String[] args) {
        System.out.println("solution(\"abaaba\") : " + solution("abaaba"));
        System.out.println("solution(\"zyzyzyz\") : " + solution("zyzyzyz"));
        System.out.println("solution(\"aabbbabaaa\") : " + solution("aabbbabaaa"));
        
    }  
}