package Backpack;

/**
 * Created by Valerie on 20.05.2018.
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public  static int positionRow = 0;
    public static String[][] data = new String[2][3];
    public static int bagWeight = 0;
    public static int currItemsWeight = 0;
    public static int maxItemsWeight = 0;
    public static int totalWeight = 0;


    public static void main(String[] args) {

        File file = new File("C://Users/kolesnykv1/Data.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String str = sc.nextLine();
                parseLine(str);
            }
            printData();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }

        sc.close();
    }

    private static void printData() {

    }

    private static void parseLine(String str) {
        String name, importance, weight;
        Scanner sc = new Scanner(str);
        sc.useDelimiter(",");

        while (sc.hasNext()) {
            name = sc.next();
            importance = sc.next();
            weight = sc.next();
            System.out.println("[ " + name + " " + importance + " " + weight + " ]");
            writeToArray(name, importance, weight);
        }

        sc.close();
    }

    private static void writeToArray(String name, String importance, String weight) {
        data[positionRow][0] = name;
        data[positionRow][1] = importance;
        data[positionRow][2] = weight;
        positionRow++;
    }

}



