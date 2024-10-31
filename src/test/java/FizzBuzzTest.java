import org.example.Fizzbuzz;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    @DisplayName("test si el numero es divisible por 3")
    void test_whenthenumberisdivisiblebythree_thenReturnFizz() {

        //given dado
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        //when cuando
        String result = fizzbuzz.checkNumber(9);
        //then pues
        assertEquals("Fizz", result);


    }

    @Test
    @DisplayName("test if the number is divisible by 5")
    void test_ifnumberisdivisibleby5_thenreturnBuzz() {

        Fizzbuzz buzzFizz = new Fizzbuzz();
        String result = buzzFizz.checkNumber(10);
        assertEquals("Buzz", result);
    }
    @Test
    @DisplayName ("test if the number is multiple of 3 and 5")
    void test_ifthenumberismultipleof3and5 (){

        Fizzbuzz buzzFizz = new Fizzbuzz();
        String result = buzzFizz.checkNumber(15);
        assertEquals("FizzBuzz", result);

    }
}

