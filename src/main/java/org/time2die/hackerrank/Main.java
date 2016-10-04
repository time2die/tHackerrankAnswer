package org.time2die.hackerrank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.work();
    }

    private void work() {
        String[] data = getFakeData();
        for (String iter : data) {
            System.out.println(countDeletedNum(iter));
        }
    }

    private int countDeletedNum(String string) {
        int countCharToDelete = 0;
        StringBuilder sb = new StringBuilder(string);
        for (int i = 0; i < sb.length() ; ) {
            if (i + 1 == sb.length()) {
                break;
            }

            if (sb.charAt(i) != sb.charAt(i + 1)) {
                i++;
            } else {
                sb.deleteCharAt(i + 1);
                countCharToDelete++;
            }

        }
        return countCharToDelete;
    }

    private String[] getFakeData() {
        return new String[]{"AAAA", "BBBBB", "ABABABAB", "BABABA", "AAABBB"};
    }

    private String[] getData() {
        Scanner sc = new Scanner(System.in);
        int size = Integer.valueOf(sc.nextLine());

        String[] returnValue = new String[size];
        for (int i = 0; i < size; i++) {
            returnValue[i] = sc.nextLine();
        }

        return returnValue;
    }
}
