public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1, 2");
        int [] integers = new int[3];
        for (int i = 0; i < integers.length; i++) {
            integers [i] = i + 1;
            if (i == integers.length - 1) {
                System.out.print(integers [i]);
            } else {
                System.out.print(integers[i] + ",");
            }
        }
        System.out.println(" ");
        double [] fractions = new double[] {1.57, 7.654, 9.986};
        for (int i = 0; i < fractions.length; i++) {
            if (i == fractions.length - 1) {
                System.out.print(fractions[i]);
            } else {
                System.out.print(fractions[i] + ",");
            }
        }
        System.out.println(" ");
        double [] arbitrary = new double[] {1.0, 2.45, 17.123,56.0,128,67};
        for (int i = 0; i < arbitrary.length; i++) {
            if (i == arbitrary.length - 1) {
                System.out.print(arbitrary[i]);
            } else {
                System.out.print(arbitrary[i] + ",");

            }
        }
        System.out.println(" ");
        System.out.println("Task 3");
        for (int i = integers.length - 1; i >= 0; i --) {
            System.out.print(integers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        for (int i = fractions.length - 1; i >= 0; i --) {
            System.out.print(fractions[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        for (int i = arbitrary.length - 1; i >= 0; i --) {
            System.out.print(arbitrary[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        System.out.println("Task 4");
        for (int i = 0; i < integers.length; i ++) {
            if (integers[i] % 2 == 1) {
                integers[i] ++;
            }
            System.out.print(integers[i]);
            if (i < integers.length - 1) {
                System.out.print(", ");
            }
        }
    }
}