package com.jihuayu;

import com.jihuayu.gen.PlusGen;

import java.util.Scanner;

public class MathGen {
    public static void main(String[] args) {
        PlusGen gen = new PlusGen();
        Scanner input=new Scanner(System.in);
        while(true) {
            System.out.println(gen.showQuestion());
            int ans = input.nextInt();
            System.out.println(gen.isTrue(ans));
            if (ans == -1) {
                break;
            }
        }
    }
}
