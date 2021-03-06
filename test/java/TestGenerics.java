import org.junit.Assert;
import org.junit.Test;

public class TestGenerics
{
    //------------------- Test for Integers ----------------------------------------
        @Test
        public void givenFirstNumberIsMaxNumberThenReturnFirstNumberAsMax()
        {
            Object[] arr = {10, 2, 1,5,4};
            Assert.assertEquals(arr[0], MaxValueUsingGenerics.findMax(arr));
        }

        @Test
        public void givenSecondNumberIsMaXNumberThenReturnSecondNumberAsMaximum() {
            Object[] arr = {10, 12, 1,5,4};
            Assert.assertEquals(arr[1], MaxValueUsingGenerics.findMax(arr));
        }

        @Test
        public void givenThirdNumberIsMaXNumberThenReturnThirdNumberAsMaximum() {
            Object[] arr = {10, 2, 13,5,4};
            Assert.assertEquals(arr[2], MaxValueUsingGenerics.findMax(arr));
        }

        //------------------- Test for Float --------------------------

        @Test
        public void givenFloatFirstNumberIsMaxNumberThenReturnFirstNumberAsMax()
        {
            Object[] arr = {3.1, 2.1, 1.4,1.2,2.21};
            Assert.assertEquals(arr[0], MaxValueUsingGenerics.findMax(arr));
        }

        @Test
        public void givenFloatSecondNumberIsMaXNumberThenReturnSecondNumberAsMaximum() {
            Object[] arr = {3.1, 7.1, 1.4,1.2,2.21};
            Assert.assertEquals(arr[1], MaxValueUsingGenerics.findMax(arr));
        }

        @Test
        public void givenFloatThirdNumberIsMaXNumberThenReturnThirdNumberAsMaximum() {
            Object[] arr = {3.1, 2.1, 8.4,1.2,2.21};
            Assert.assertEquals(arr[2], MaxValueUsingGenerics.findMax(arr));
        }
    //------------------- Test for String--------------------------

    @Test
    public void givenStringFirstNumberIsMaxNumberThenReturnFirstAsMax() {
        Object[] arr = {"Peach", "Banana", "Apple"};
        Assert.assertEquals(arr[0], MaxValueUsingGenerics.findMax(arr));
    }

    @Test
    public void givenStringSecondNumberIsMaXNumberThenReturnSecondAsMaximum() {
        Object[] arr = {"Apple", "Peach", "Banana"};
        Assert.assertEquals(arr[1], MaxValueUsingGenerics.findMax(arr));
    }

    @Test
    public void givenStringThirdNumberIsMaXNumberThenReturnThirdAsMaximum() {
        Object[] arr = {"Banana", "Apple","Peach"};
        Assert.assertEquals(arr[2], MaxValueUsingGenerics.findMax(arr));
    }
}
