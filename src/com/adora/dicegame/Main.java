package com.adora.dicegame;

import java.util.Random;

/**
 * Created by BILL ADORA on 1/28/2016.
 */
public class Main {

    public static void main(String[] args){

        Die die = new Die();
        Random rand = new Random();
        int i = 0;
        while(i < 1000){
            int val = rand.nextInt((6 - 1) + 1) + 1;

            switch (val){
                case 1:
                    die.setFace1(die.getFace1() + 1);
                    break;
                case 2:
                    die.setFace2(die.getFace2() + 1);
                    break;
                case 3:
                    die.setFace3(die.getFace3() + 1);
                    break;
                case 4:
                    die.setFace4(die.getFace4() + 1);
                    break;
                case 5:
                    die.setFace5(die.getFace5() + 1);
                    break;
                case 6:
                    die.setFace6(die.getFace6() + 1);
                    break;
                default:
                    System.out.println("An error occurred in the simulation!!");
            }
            i++;
        }

        int frequency = die.getFace1() + die.getFace2() + die.getFace3() + die.getFace4() + die.getFace5() + die.getFace6();

        if (frequency != 1000)
            System.out.println("An error occurred!!");

        System.out.println(die.getPercentage1());
    }
}
