import org.junit.Assert;
import org.junit.Test;

public class TestGenerics
{
        MaxValueUsingGenerics findMax = new MaxValueUsingGenerics();

        @Test
        public void givenFirstNumberIsMaxNumberThenReturnFirstNumberAsMax() {

            Integer maximum = findMax.maximumInteger(800, 70, 115);
            Assert.assertEquals((Integer) 800, maximum);
        }

        @Test
        public void givenSecondNumberIsMaXNumberThenReturnSecondNumberAsMaximum() {
            Integer maximum1 = findMax.maximumInteger(5, 250, 112);
            Assert.assertEquals((Integer) 250, maximum1);
        }

        @Test
        public void givenThirdNumberIsMaXNumberThenReturnThirdNumberAsMaximum() {
            Integer maximum2 = findMax.maximumInteger(109, 200, 999);
            Assert.assertEquals((Integer) 999, maximum2);
        }
}
