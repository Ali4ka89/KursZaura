package stepik;

import java.util.Scanner;

public class Vvod2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        Vvod2 vvleningrad=new Vvod2();
        vvleningrad.summa(a,b);


    }
    public void summa (int a,int b){
        System.out.println("Summa chisel "+a+" i "+b+" ravna: "+(a+b));

    }
}
