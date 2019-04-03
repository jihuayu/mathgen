package com.jihuayu.gen;

import java.util.Random;

public class PlusGen implements QuestionGen{

    private static final Random random = new Random();
    private int ans;

    @Override
    public String showQuestion() {
        int num1 = Math.abs(random.nextInt()%100);
        int num2 = Math.abs(random.nextInt()%100);
        this.ans = num1 + num2;
        return ""+num1+"+"+num2+"=";
    }

    @Override
    public boolean isTrue(int num) {
        return num==this.ans;
    }
}
