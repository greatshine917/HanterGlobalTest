package com.hanterglobal.test2;

import java.util.Scanner;
public class Coin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("동전의 합이 될 수를 입력해주세요.");
        int sum = sc.nextInt();

        System.out.println("배열의 크기가 될 수를 입력해주세요.");
        int[] coins = new int[sc.nextInt()];

        for(int i=0; i<coins.length; i++) {
            System.out.println("배열에 포함되는 동전이 될 수를 입력해주세요.");
            coins[i] = sc.nextInt();
        }

        System.out.println("합계의 수는 " + count(sum, coins) + " 입니다.");
    }

    public static int count(int sum, int[] coins) {

        int[] check = new int[sum+1];
        check[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i <= sum; i++) {
                check[i] += check[i-coin];
            }
        }
        return check[sum];
    }
}

