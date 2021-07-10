package com.deestech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;
        int answer = 0;
        System.out.println("Question1. Is Mars warming globally? ");
        System.out.print("1. Yes \n2. No \n3. It warming partially \n4. None of the above \n");
        answer = input.nextInt();
        if (answer == 2)
            score++;

        System.out.println("Question2. What is global warming? ");
        System.out.print("1. Warming of the globe \n2. No idea \n3. Global warming is the long term rising of the Earth's temperature, " +
                "caused by the greenhouse effect. \n4. None of the above \n");
        answer = input.nextInt();
        if (answer == 3)
            score++;

        System.out.println("Question3. Whats the main reason of global warming? ");
        System.out.print("1. Hot Plate \n2. Too much rain \n3. House party \n4. Green House Gases \n");
        answer = input.nextInt();
        if (answer == 4)
            score++;

        System.out.println("Question4. Below is one of  the reason of global warming ");
        System.out.print("1. Playing Football \n2. No idea \n3. Industrial activities \n4. None of the above \n");
        answer = input.nextInt();
        if (answer == 3)
            score++;

        System.out.println("Question4. Below is one of  the effect of global warming ");
        System.out.print("1. More money \n2. No idea \n3. Storm \n4. None of the above \n");
        answer = input.nextInt();
        if (answer == 3)
            score++;


        switch (score) {
            case 0:
            case 1:
            case 2:
            case 3:
                System.out.println("Time to brush up on your knowledge of global warming. score: " + score);
                break;

            case 4:
                System.out.println("Very good. Score : " + score);
                break;

            case 5:
                System.out.println("Excellent. Score: " + score);
                break;

        }
    }
}