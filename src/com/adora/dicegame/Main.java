package com.adora.dicegame;


/**
 * Created by BILL ADORA on 1/28/2016.
 */
public class Main {

    public static void main(String[] args) {

        Die die = new Die();
        int i = 0;
        while (i < 1000) {
            int val = generateCubeFace();

            switch (val) {
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

        int freqSum = die.getFace1() + die.getFace2() + die.getFace3() + die.getFace4() + die.getFace5() + die.getFace6();

        System.out.println("Face\t\t\tFrequency\t\t\tPercentage");
        System.out.println("1\t\t\t\t" + die.getFace1() + "\t\t\t\t\t" + ((float) die.getFace1() / 10));
        System.out.println("2\t\t\t\t" + die.getFace2() + "\t\t\t\t\t" + ((float) die.getFace2() / 10));
        System.out.println("3\t\t\t\t" + die.getFace3() + "\t\t\t\t\t" + ((float) die.getFace3() / 10));
        System.out.println("4\t\t\t\t" + die.getFace4() + "\t\t\t\t\t" + ((float) die.getFace4() / 10));
        System.out.println("5\t\t\t\t" + die.getFace5() + "\t\t\t\t\t" + ((float) die.getFace5() / 10));
        System.out.println("6\t\t\t\t" + die.getFace6() + "\t\t\t\t\t" + ((float) die.getFace6() / 10));
        System.out.println("Total\t\t\t" + freqSum + "\t\t\t\t100");
    }

    private static int generateCubeFace() {
        double rand = Math.random();

        return  rand < (1.0 / 6.0) ? 1 :
                rand < (1.0 / 3.0) ? 2 :
                rand < (1.0 / 2.0) ? 3 :
                rand < (2.0 / 3.0) ? 4 :
                rand < (5.0 / 6.0) ? 5 : 6;
    }
}
