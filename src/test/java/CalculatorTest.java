import calc.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {




    //red, green, refactor

    @Test
    public void addTest(){
        //Given
        Calculator calculator = new Calculator();
        int val1 = 7;
        int val2 = 10;
        int expected = val1 + val2;
        //When
        int actual = calculator.add(val1, val2);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void subtractTest(){
        //Given
        Calculator calculator = new Calculator();
        int val1 = 7;
        int val2 = 10;
        int expected = val2 - val1;
        //When
        int actual = calculator.subtract(val2, val1);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multiplyTest(){
        //Given
        Calculator calculator = new Calculator();
        int val1 = 7;
        int val2 = 10;
        int expected = val2 * val1;
        //When
        int actual = calculator.multiply(val2, val1);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void divideTest(){
        //Given
        Calculator calculator = new Calculator();
        int val1 = 7;
        int val2 = 10;
        int expected = val2 / val1;
        //When
        int actual = calculator.divide(val2, val1);
        //Then
        Assert.assertEquals(expected, actual);
    }

//    @Test
//    public void squareTest(){}
//    //Given
//    Calculator calculator = new Calculator();
//    int val1 = 7;
//    int val2 = 10;
//    int expected = val2 * val2;
//    int expected1 = val1 * val1;
//
//    //When
//    int actual = calculator.square(val2, val2);
//    int actual1 = calculator.square(val1, val1);
//    //Then
//    Assert.assertEquals(expected, actual);
//    Assert.assertEquals(expected1, actual1);

    @Test
    public void squareTest(){
        //Given
        Calculator calculator = new Calculator();
        int val1 = 7;
        val1 = (int) Math.pow(val1, 2);
        int val2 = 10;
        val2 = (int) Math.pow(val2, 2);
        int expected = val1 * val1;
        int expected1 = val2 * val2;

        //When
        int actual = calculator.square(val1, val1);
        int actual1 = calculator.square(val2, val2);
        //Then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected1, actual1);
    }





}
