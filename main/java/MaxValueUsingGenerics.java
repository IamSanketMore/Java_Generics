import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxValueUsingGenerics<s1>
{
   public s1 [] arrayInput;

   //get arrayInput
    public s1[] getArrayInput()
    {
        return arrayInput;
    }

    //Set arrayInput
    public void setArrayInput(s1[] arrayInput)
    {
        this.arrayInput = arrayInput;
    }
    //Constructor
    public MaxValueUsingGenerics(s1[] arrayInput)
    {
        this.arrayInput = arrayInput;
    }

    public static <s1> Comparable findMax(s1[] arr)
    {
        List arrList = Arrays.asList(arr);
        Comparable maxValue = Collections.max(arrList);

        return maxValue;
    }
    // --------------------- MAin Method -----------------------------------
    public static void main(String[] args)
    {

    }
}
