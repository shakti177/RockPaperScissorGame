package com.shakti.Projects;

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        char comp;
        int randomnum = random.nextInt(2);
        if(randomnum == 0){
            comp = 'r';
        } else if (randomnum == 1){
            comp = 'p';
        } else {
            comp = 's';
        }
        System.out.println("Computer Generating...");
        System.out.print("user Turn - Choose Rock(r), Paper(p), Scissor(s) = ");
        char user = in.next().charAt(0);
        System.out.println("Computer Choose = " + comp);
        int answer = compare(comp, user);
        if (answer == 0){
            System.out.println("Game Tie");
        } else if (answer == 2){
            System.out.println("User Won!\nComputer Loss!");
        } else {
            System.out.println("User Loss!\nComputer Won!");
        }

    }


    static int compare(char comp, char userturn){
        if (comp == userturn){
            return 0;
        }
        if (comp == 'r'){
            if (userturn == 's'){
                return 1;
            } else {
                return 2;
            }
        } else if (comp == 'p'){
            if (userturn == 'r'){
                return 1;
            } else {
                return 2;
            }
        } else if (comp == 's'){
            if (userturn == 'p'){
                return 1;
            } else {
                return 2;
            }
        }
        return 0;
    }

}
