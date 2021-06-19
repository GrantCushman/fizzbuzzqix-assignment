package project;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzQixTest {

    @Test
    public void oneShouldReturnOne() {
        FizzBuzzQix underTest = new FizzBuzzQix();
        String spokenWord = underTest.interpret(1);
        assertThat(spokenWord).isEqualTo("1");
    }

    @Test
    public void threeShouldReturnFizz() {
        FizzBuzzQix underTest = new FizzBuzzQix();
        String spokenWord = underTest.interpret(3);
        assertThat(spokenWord).isEqualTo("Fizz");
    }

    @Test
    public void fiveShouldReturnBuzz() {
        FizzBuzzQix underTest = new FizzBuzzQix();
        String spokenWord = underTest.interpret(5);
        assertThat(spokenWord).isEqualTo("Buzz");
    }

    @Test
    public void sevenShouldReturnQix() {
        FizzBuzzQix underTest = new FizzBuzzQix();
        String spokenWord = underTest.interpret(7);
        assertThat(spokenWord).isEqualTo("Qix");
    }

    @Test
    public void fifteenShouldReturnFizzBuzz() {
        FizzBuzzQix underTest = new FizzBuzzQix();
        String spokenWord = underTest.interpret(15);
        assertThat(spokenWord).isEqualTo("FizzBuzz");
    }

    @Test
    public void twentyOneShouldReturnFizzQix() {
        FizzBuzzQix underTest = new FizzBuzzQix();
        String spokenWord = underTest.interpret(21);
        assertThat(spokenWord).isEqualTo("FizzQix");
    }

    @Test
    public void thirtyFiveShouldReturnBuzzQix() {
        FizzBuzzQix underTest = new FizzBuzzQix();
        String spokenWord = underTest.interpret(35);
        assertThat(spokenWord).isEqualTo("BuzzQix");
    }

    @Test
    public void oneHundredFiveShouldReturnFizzBuzzQix() {
        FizzBuzzQix underTest = new FizzBuzzQix();
        String spokenWord = underTest.interpret(105);
        assertThat(spokenWord).isEqualTo("FizzBuzzQix");
    }
}
