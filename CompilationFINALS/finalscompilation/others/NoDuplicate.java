package finalscompilation.others;

import finalscompilation.main.Compilation;

public class NoDuplicate {

    public void nodupe(java.util.Scanner scan)
    {
        int[] num = new int[10];
        String result = "";
        int x;
        int count;
        int arr_count = 0;

        System.out.println("Enter 10 numbers:");
        for(count = 0; count < 10; count = count + 1)
        {
            x = Compilation.inputInt("", scan);
            if(!isExisting(x, arr_count, num))
            {
                num[arr_count++] = x;
                result += x + "\n";
            }
        }

        System.out.println("Result: \n" + result);
    }

    private boolean isExisting(int x, int arr_count, int[] arr)
    {
        for(int i=0; i<arr_count; i++)
        {
            if(x == arr[i])
            return true;
        }

        return false;

    }
}
