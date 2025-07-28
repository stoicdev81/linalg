package io.jsauer.linalg.lib;

import java.util.ArrayList;

class MismatchedArrayException extends RuntimeException {
    public MismatchedArrayException (){
        super();
    }

    public MismatchedArrayException (String msg) {
        super(msg);
    }
}

public final class JMath {
    // Class to hold the mathematical functions used in linear algebra
    public static int add (int a, int b) {
        /* Simply add 2 numbers */
        return a + b;
    }

    public static ArrayList<Integer> add (ArrayList<Integer> a, ArrayList<Integer> b) throws MismatchedArrayException {
        /* Overloaded method, this one adds 2 arrays of the same size */

        // First verify the size. If not matched, throws exception
        if (a.size() != b.size()) {
            throw new MismatchedArrayException("The array lengths must be the same for element-wise addition");
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            result.add(a.get(i) + b.get(i));
        }

        return result;
    }

    public static ArrayList<Integer> add (int a, ArrayList<Integer> b) throws MismatchedArrayException {
        /* Adds a scalard to each element of the array */

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < b.size(); i++) {
            result.add(a + b.get(i));
        }

        return result;
    }
}