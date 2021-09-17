package calculator;

public class FromLatin {

        public int parseLatin(String str) {
                int latinNum = 0;
                switch (str) {
                        case "I": latinNum = 1; break;
                        case "II": latinNum = 2; break;
                        case "III": latinNum = 3; break;
                        case "IV": latinNum = 4; break;
                        case "V": latinNum = 5; break;
                        case "VI": latinNum = 6; break;
                        case "VII": latinNum = 7; break;
                        case "VIII": latinNum = 8; break;
                        case "IX": latinNum = 9; break;
                        case "X": latinNum = 10; break;
                }
                return latinNum;
        }
}
