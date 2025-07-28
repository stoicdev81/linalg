package io.jsauer.linalg;

import java.util.ArrayList;
import java.util.Scanner;
import io.jsauer.linalg.lib.JMath;

public class linalg {
    public static void main(String[] args) throws Exception {
        // Create the input scanner
        Scanner sc = new Scanner(System.in);
        String prompt = "Select function to perform\n"
                        + "A) Add 2 numbers\n"
                        + "B) Add two 1 X 3 matrices\n"
                        + "C) Add a scalar to a matrix\n";
        System.out.println(prompt);
        switch (sc.nextLine()) {
            case "A":
            case "a":
                System.out.println("Enter the first number: ");
                int a = sc.nextInt();
                System.out.println("Enter the second number: ");
                int b = sc.nextInt();
                System.out.println(JMath.add(a, b));
                
                break;

            case "B":
            case "b":
                System.out.println("Enter the first array in a,b,c form");
                String first = sc.nextLine();
                ArrayList<Integer> firstList = utils.Alist(first);
                System.out.println("Enter the second array: ");
                String second = sc.nextLine();
                ArrayList<Integer> secondList = utils.Alist(second);
                System.out.println(JMath.add(firstList, secondList));

            case "C":
            case "c":
                System.out.println("Enter a scalar to add to the array: ");
                String firstC = sc.nextLine();
                int scalarC = Integer.parseInt(firstC);
                System.out.println("Enter the array: ");
                String secondC = sc.nextLine();
                ArrayList<Integer> secondCList = utils.Alist(secondC);
                System.out.println(JMath.add(scalarC, secondCList));

        
            default:
                break;
        }
        sc.close();
    }

    private static class utils {
        public static ArrayList<Integer> Alist(String input) {
            String[] inlist = input.split(",");

            ArrayList<Integer> alist = new ArrayList<>();

            for (String s : inlist) {
                alist.add(Integer.parseInt(s));
            }

            return alist;
        }
    }
}
