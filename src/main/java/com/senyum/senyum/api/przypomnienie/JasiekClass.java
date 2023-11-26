package com.senyum.senyum.api.przypomnienie;

public class JasiekClass {

    public String greetings() {
        return "adfafsa";
    }

    public int addition(int a, int b) {
        return a+b;
    }

    public void showAllNumbersInRange(int a, int b) {
        while(a <= b) {
            System.out.println(a);
            a++;
        }
    }

    public int sumFrom0(int a) {
        int sum = 0;
        for(int i = 0; i <= a; i++) {
            sum += i;
        }
        return sum;
    }

    public void toBin(int a) {
        int rests[] = new int[30];
        int i = 0;
        while (a > 0) {
            rests[i] = a % 2;
            a = a / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(rests[j]);
        }

    }

}
