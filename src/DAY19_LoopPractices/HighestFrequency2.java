package DAY19_LoopPractices;

public class HighestFrequency2 {
    public static void main(String[] args) {


        String str = "aabbbnmdhg";
        int maxFreq = 0;
        char maxCh=0;

        for (int j = 0; j < str.length(); j++) {
            int freq = 0;
            char ch=str.charAt(j);
            for (int i = 0; i < str.length(); i++) {
                if (ch == str.charAt(i)) {
                    freq++;
                }
                if (freq > maxFreq) {
                    maxFreq = freq;
                    maxCh=ch;
                }

            }

        }

        System.out.println(maxCh+" has max frequincy of "+maxFreq);


    }
}