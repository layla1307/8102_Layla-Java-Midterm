package math_problems;

public class FindLowestDifference {

    /** INSTRUCTIONS
     * Write a method to return the lowest number, that is not shared between the 2 arrays below
     * HINT: The lowest number that isn't shared between these arrays is 1
     */


    static int lowestDifference(int[] array, int n)
    {
        int difference = Integer.MAX_VALUE;

        for (int i = 0; i < n-1; i++)
            for (int j = i + 1; j < n; j++)
                if (Math.abs((array[i]) )< difference)
                    difference = Math.abs((array[i] - array[j]));
        return difference;
    }
    public static void main(String[] args) {


        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1, -15};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19, -15};

            System.out.println("the minimum difference between array1 and array2 is " + lowestDifference(array1, array1.length));


    }



}
