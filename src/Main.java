import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] nums = {4, 7, 7, 3, 2, 2, 4, 4, 4, 6, 4, 6, 6};
        int numDoubles = ArrayAlgorithms.countConsecutiveDoubles(nums);
        System.out.println(numDoubles);

        // original array NOT modified
        System.out.println(Arrays.toString(nums));
    }
}
