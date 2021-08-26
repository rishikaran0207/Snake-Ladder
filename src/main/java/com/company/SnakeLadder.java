package com.company;

    public class SnakeLadder {
        public static void main(String[] args) {

            int Player_Position=0,dicenum;

            System.out.println("\nThe starting position of the player at  is " + Player_Position);
            dicenum = (int) (Math.floor(Math.random() * 6 % 7 + 1));


            int play = (int) (Math.random() * 3);
            if (play == 1 || play == 2)
                System.out.println("\nThe Number  while rolling dice " + dicenum);


            switch (play) {
                case 0:
                    System.out.println("\nThere is no play for player, so hence positiion is "+Player_Position);
                    break;
                case 1:
                    Player_Position=Player_Position+dicenum;
                    System.out.println("\nThe player position  changed to :"+Player_Position);
                    break;
                case 2:
                    if(Player_Position>dicenum)
                        Player_Position=Player_Position-dicenum;
                    else
                        Player_Position=0;
                    System.out.println("\nThe player position changed to :"+Player_Position);
                    break;

            }
        }
    }
