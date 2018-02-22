package StudentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp
{
    public static void main(String [] args)
    {
        System.out.println("Please enter:");
        System.out.println("0 to see student's status");
        System.out.println("1 to enter new students");
        boolean flag = false;
        while (flag == false) {
            Scanner in = new Scanner(System.in);
            int i = in.nextInt();
            switch (i) {
                case 0:
                    flag = true;


                case 1:
                    flag = true;

                default:
                    System.out.println("0 or 1. Please reenter.");
                    continue;
            }
        }

    }
}
