package finalscompilation.others;

import finalscompilation.main.Compilation;

public class Largest2 {
    public void largest2(java.util.Scanner scan) {
        int x, y, z;

        System.out.println("Enter 3 numbers: ");
        x = Compilation.inputInt("", scan);
        y = Compilation.inputInt("", scan);
        z = Compilation.inputInt("", scan);

        if (y > x)
            x = y;
        if (z > x)
            x = z;

        System.out.println(x);
    }
}
