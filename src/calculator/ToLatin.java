package calculator;

class ToLatin {

        String getLatValue(int arabic) {
                String latStr = "";
                int lastNum = arabic % 10;

                if (arabic < 10) {
                        latStr = getLat10(arabic);
                } else if (arabic < 20) {
                        latStr = "X" + getLat10(lastNum);
                } else if (arabic < 30) {
                        latStr = "XX" + getLat10(lastNum);
                } else if (arabic < 40) {
                        latStr = "XXX" + getLat10(lastNum);
                } else if (arabic < 50) {
                        latStr = "XL" + getLat10(lastNum);
                } else if (arabic < 60) {
                        latStr = "L" + getLat10(lastNum);
                } else if (arabic < 70) {
                        latStr = "LX" + getLat10(lastNum);
                } else if (arabic < 80) {
                        latStr = "LXX" + getLat10(lastNum);
                } else if (arabic < 90) {
                        latStr = "LXXX" + getLat10(lastNum);
                } else if (arabic < 100) {
                        latStr = "XC" + getLat10(lastNum);
                } else if (arabic == 100) {
                        latStr = "C";
                }
                return latStr;
        }

        String getLat10(int arabic10) {
                String latStr = "";
                switch (arabic10) {
                        case 0: latStr = ""; break;
                        case 1: latStr = "I"; break;
                        case 2: latStr = "II"; break;
                        case 3: latStr = "III"; break;
                        case 4: latStr = "IV"; break;
                        case 5: latStr = "V"; break;
                        case 6: latStr = "VI"; break;
                        case 7: latStr = "VII"; break;
                        case 8: latStr = "VIII"; break;
                        case 9: latStr = "IX"; break;
                }
                return latStr;
        }
}
