package week3;

import java.util.ArrayList;

public class NameScore {


        /**
         * Each letter in alphabet,(english ,A-Z) has a score range in 1 and 26 based on their position.
         * A = 1 , B = 2 , C = 3 etc.
         * If the name is ATA , its score should be 22 (A=1,T=20,A=1)
         *
         * @param names ArrayList of Strings that contains names
         * @return total_score Total score of all names that is in the given list
         */
        /*
        //toCharArrayi kendim yazsaydım:
        public static char[] toMyCharArray(String s) {
             char[]arr=new char[s.length()];
             for(int i=0;i<s.length();i++){
                 arr[i]=s.charAt(i);
             }
             return arr;
        }
        */
        public static int totalScore (ArrayList < String > names) {
            if (names == null) return 0;
            int charScore = 0;
            for (String name : names) {

                if (name == null || name.isEmpty()) continue;
                if (!name.equals(name.toUpperCase())) continue;

                for (char c : name.toCharArray()) {
                    if (c >= 'A' && c <= 'Z') {
                        charScore += c - 'A' + 1;
                    }
                }
            }
            return charScore;
        }
    }
