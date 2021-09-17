package calculator;

import java.util.Scanner;

public class Input {

        public String getInput(String prompt) {
                Scanner scanner = new Scanner(System.in);
                System.out.print(prompt);
                return scanner.nextLine().replace(" ", "");
        }

        public String getMathSymbol(String stringIn) throws Exception {

// counter для проверки количества знаков мат. действий
                int counter = 0;
                String mathSymbol = "";

                for (int i = 0; i < stringIn.length(); i++) {
                        switch (stringIn.charAt(i)) {
                                case '+':
                                        counter++;
                                        mathSymbol = "\\+";
                                        break;
                                case '-':
                                        counter++;
                                        mathSymbol = "\\-";
                                        break;
                                case '*':
                                        counter++;
                                        mathSymbol = "\\*";
                                        break;
                                case '/':
                                        counter++;
                                        mathSymbol = "\\/";
                        }
                }
                if (counter != 1)
                        throw new Exception("Выражение не соответствует условиям");
                return mathSymbol;
        }
}
