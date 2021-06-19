package project;

public class FizzBuzzQix {

    public String interpret(int numberToInterpret) {
        String spokenWord = "";

        if (numberToInterpret % 3 == 0) {
            spokenWord += "Fizz";
        }
        if (numberToInterpret % 5 == 0) {
            spokenWord += "Buzz";
        }
        if (numberToInterpret % 7 == 0) {
            spokenWord += "Qix";
        }
        if (!spokenWord.equals("")) {
            return spokenWord;
        }
        return numberToInterpret + "";
    }
}