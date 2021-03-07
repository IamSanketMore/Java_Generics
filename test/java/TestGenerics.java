import org.junit.Assert;
import org.junit.Test;

public class TestGenerics
{
    //------------------- Test for Integers ----------------------------------------
        @Test
        public void givenFirstNumberIsMaxNumberThenReturnFirstNumberAsMax() {

            Integer maximum = MaxValueUsingGenerics.maximumInteger(800, 70, 115);
            Assert.assertEquals((Integer) 800, maximum);
        }

        @Test
        public void givenSecondNumberIsMaXNumberThenReturnSecondNumberAsMaximum() {
            Integer maximum1 = MaxValueUsingGenerics.maximumInteger(5, 250, 112);
            Assert.assertEquals((Integer) 250, maximum1);
        }

        @Test
        public void givenThirdNumberIsMaXNumberThenReturnThirdNumberAsMaximum() {
            Integer maximum2 = MaxValueUsingGenerics.maximumInteger(109, 200, 999);
            Assert.assertEquals((Integer) 999, maximum2);
        }

        //------------------- Test for Float --------------------------

        @Test
        public void givenFloatFirstNumberIsMaxNumberThenReturnFirstNumberAsMax() {

            Double maximum = MaxValueUsingGenerics.maximumFloat(14.3, 1.2, 2.3);
            Assert.assertEquals((Double) 14.3, maximum);
        }

        @Test
        public void givenFloatSecondNumberIsMaXNumberThenReturnSecondNumberAsMaximum() {
            Double maximum = MaxValueUsingGenerics.maximumFloat(1.2,14.3, 2.3);
            Assert.assertEquals((Double) 14.3, maximum);
        }

        @Test
        public void givenFloatThirdNumberIsMaXNumberThenReturnThirdNumberAsMaximum() {
            Double maximum = MaxValueUsingGenerics.maximumFloat( 1.2, 2.31,14.3);
            Assert.assertEquals((Double) 14.3, maximum);
        }
    //------------------- Test for String--------------------------

    @Test
    public void givenStringFirstNumberIsMaxNumberThenReturnFirstNumberAsMax() {

        String maxString = MaxValueUsingGenerics.maximumString("apple","cat","ball");
        Assert.assertEquals("apple", maxString);
    }

    @Test
    public void givenStringSecondNumberIsMaXNumberThenReturnSecondNumberAsMaximum() {
        String maxString = MaxValueUsingGenerics.maximumString("cat","apple","ball");
        Assert.assertEquals("apple", maxString);
    }

    @Test
    public void givenStringThirdNumberIsMaXNumberThenReturnThirdNumberAsMaximum() {
        String maxString = MaxValueUsingGenerics.maximumString("cat","ball","apple");
        Assert.assertEquals( "apple", maxString);
    }
}
