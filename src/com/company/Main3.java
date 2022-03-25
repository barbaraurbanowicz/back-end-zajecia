package com.company;

public class Main3 {

    public static void main(String[] args) {
        int[] array = new int[] {4, 5, 7, 11, 12, 15, 15, 21, 40, 45 };
        int index = searchIndex(array);

        System.out.println(index);
    }

    static int searchIndex(int[] array) {
        int index = 0;
        int limit = array.length - 1;

        while (index <= limit) {

            int point = (int) Math.ceil((index + limit) / 2.0);
            int entry = array[point];

            if (11 > entry) {

                index = point + 1;
                continue;
            }
            if (11 < entry) {

                limit = point - 1;
                continue;

            }
            return point;
        }
        return -1;

    }
}

