package org.example;

public class Euclid {


    public static int gcdDivision(int a, int b) {
        while (b != 0) {

            int t = b;
            b = a % b;
            a = t;

        }
        return a;
    }

    public static int gcdRecursion(int a, int b) {
        if (b == 0) {

            return a;

        } else {

            return gcdRecursion(b, a % b);

        }
    }

    public static int gcdSubtraction(int a, int b) {
        while(a != b){
            if(a > b){
                a = a-b;
            }else{
                b = b-a;
            }

        }

        return a;
    }

    public static void main(String[] args) {
        System.out.println(gcdDivision(14, 56));
        System.out.println(gcdRecursion(14, 56));
        System.out.println(gcdDivision(14, 56));


        System.out.println(gcdDivision(14, 58));
        System.out.println(gcdRecursion(14, 58));
        System.out.println(gcdDivision(14, 58));

        System.out.println(gcdDivision(12, 36));
        System.out.println(gcdRecursion(12, 36));
        System.out.println(gcdDivision(12, 36));
    }
}
