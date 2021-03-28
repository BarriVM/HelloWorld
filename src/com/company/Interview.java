package com.company;

public class Interview {

    public int[] evenArray(int[] initialArray) {

        int count = 0;

        for (int i = 0; i < initialArray.length; i++) {
            if (initialArray[i] % 2 == 0)
                count++;
        }

        int[] resultArray = new int[count];

        int indexResult = 0;
        for (int i = 0; i < initialArray.length; i++) {
            if (initialArray[i] % 2 == 0) {
                resultArray[indexResult] = initialArray[i];
                indexResult++;
            }
        }
        return resultArray;
    }
}
