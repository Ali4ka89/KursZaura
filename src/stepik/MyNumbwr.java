package stepik;

import java.util.Scanner;


class MyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String st2 = sc.nextLine();
        String result = st + " " + st2;
        System.out.println(result);
        System.out.println(result.length());
//        System.out.println(st + " " + st2);
//        System.out.println(st.length()+st2.length()+1);
    }
}
//        if (chas < 10) {
//            System.out.print("0" + chas + ":");
//        } else {
//            System.out.print(chas + ":");
//        }
//        if (minuta < 10) {
//            System.out.print("0" + minuta + ":");
//        } else {
//            System.out.print(minuta + ":");
//        }
//        if (secunda < 10) {
//            System.out.print("0" + secunda);
//        } else {
//            System.out.print(secunda);
//        }
