package lib;

public class BoyerMoore {
    //Boyer-Moore String Search Algorithm---------------------------
    public static int search(String text, String pattern){
        int[] table = new int[256];
        initTable(table, pattern);
        int i, j;
        i = j = pattern.length() - 1;
        while((i < text.length()) && (j >= 0))
            if(text.charAt(i) != pattern.charAt(j)){
                i += nextStep(table, text.charAt(i), pattern.length() - j);
                j  = pattern.length() - 1;
            }else{
                i -= 1;
                j -= 1;
            }
        if(j < 0) return i + 1;
        return -1;
    }
    
    private static void initTable(int table[], String ptn){
        int i;
        for(i = 0; i < table.length; i += 1)
            table[i] = ptn.length();
        for(i = 0; i < ptn.length(); i += 1)
            table[(int)ptn.charAt(i)] = ptn.length() - i - 1;
    }
    private static int nextStep(int table[], char ch, int remain){
        if(table[(int)ch] > remain)
            return table[(int)ch];
        return remain;
    }
    //--------------------------------------------------------
}
