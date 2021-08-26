package com.company;

    public class SnakeLadder {
        public static void main(String[] args) {

            int Player_Position = 0;
            System.out.println("\nThe Position of the player at starting is " + Player_Position);

            int dicenum = (int) (Math.floor(Math.random() * 6 % 7 + 1));
            System.out.println("\nThe Number while rolling dice " + dicenum);
        }
    }
