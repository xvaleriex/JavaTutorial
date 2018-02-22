package EmailsApp;

import java.util.Scanner;
import EmailsApp.Email;

public class EmailApp {
    public static void main (String [] args)
    {
        Email emailrecord = new Email();
        Scanner in = new Scanner(System.in);
        System.out.println("Set first name: ");
        String s = in.nextLine();
        emailrecord.setFirstname(s);

        System.out.println("Set last name: ");
        s = in.nextLine();
        emailrecord.setLastname(s);

        boolean flag = false;
        while (flag == false){
        System.out.println("Set department (0 - Sales,1 - Development,2 - Accounting): ");
        int c = in.nextInt();
        if (c > 2 ){System.out.println("Error! Must be from 0 to 2. Reenter again!");continue;}
        else {flag = true; emailrecord.setDepartment(c);}
        }
        System.out.println("Set email capacity :");
        int b = in.nextInt();
        emailrecord.setCapacity(b);

        System.out.println("Email will be: " + emailrecord.generateEmail());
        System.out.println("Email capacity will be: " + emailrecord.getCapacity());
        System.out.println("Password will be: " + emailrecord.generatePassword(8));
    }
}
