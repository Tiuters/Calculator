package calculator;

public class Calculator {

        public static void main(String[] args) throws Exception {

                while (true) {
// Получить строку и удалить пробелы
                        Input input = new Input();
                        String tightInput = input.getInput("\nВведите выражение: ");

// Найти знак математического действия и разделить строку
                        String mathSymb = input.getMathSymbol(tightInput);
                        String[] numArray = tightInput.split(mathSymb);

                        Values values = new Values();
                        FromLatin fromLatin = new FromLatin();
                        ToLatin toLatin = new ToLatin();

// Перевести латинские в арабские
                        int latToArab1 = fromLatin.parseLatin(numArray[0]);
                        int latToArab2 = fromLatin.parseLatin(numArray[1]);

                        if (latToArab1 > 0 && latToArab2 > 0) {
// Если латинские
                                int resultL = values.getValue(mathSymb, latToArab1, latToArab2);
                                if (resultL < 1) throw new Exception("Не может быть меньше нуля");
                                String theResult = toLatin.getLatValue(resultL);
                                printResult(theResult);
                        } else {
// Если арабские
                                int arab1 = Integer.parseInt(numArray[0]);
                                int arab2 = Integer.parseInt(numArray[1]);

                                if (arab1 > 0 && arab1 < 11 && arab2 > 0 && arab2 < 11) {
                                        int resultA = values.getValue(mathSymb, arab1, arab2);
                                        String theResult = Integer.toString(resultA);
                                        printResult(theResult);
// Не удовлетворили условиям
                                } else {
                                        throw new Exception("Выражение не соответствует условиям");
                                }
                        }
                }
        }

        public static void printResult(String res) {
                System.out.println("Результат: " + res);
        }
}
