package calculator;

class Values {

        int getValue(String mathSign, int n1, int n2) {
                int result = 0;
                switch (mathSign) {
                        case "\\+":
                                result = n1 + n2;
                                break;
                        case "\\-":
                                result = n1 - n2;
                                break;
                        case "\\*":
                                result = n1 * n2;
                                break;
                        case "\\/":
                                result = n1 / n2;
                                break;
                }
                return result;
        }
}
