public class MaxValueUsingGenerics
{
    public static void main(String[] args)
    {
        printMaxValue(maximumInteger(100, 200, 400));
    }
    public static int maximumInteger(Integer x, Integer y, Integer z)
    {
        Integer maxValue = x;
        if (y.compareTo(maxValue) > 0)
        {
            maxValue = y;
        }
        if (z.compareTo(maxValue) > 0)
        {
            maxValue = z;
        }
        return maxValue;
    }
    private static void printMaxValue(Integer maxValue)
    {
        System.out.println(" Maximum number is : " + maxValue);
    }
}
