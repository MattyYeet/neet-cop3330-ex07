package app;

import java.util.Scanner;
import java.util.Formatter;

public class example7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        int lf = input.nextInt();
        System.out.print("What is the width of the room in feet? ");
        int wf = input.nextInt();
        int f2 = lf * wf;
        double m2 = f2 * 0.09290304;
        Formatter fmt = new Formatter();
        fmt.format("%.3f", m2);

        System.out.println("You entered dimensions of "+lf+" feet by "+wf+" feet.");
        System.out.printf("The area is \n"+f2+" square feet\n"+fmt+" square meters");
    }
}
