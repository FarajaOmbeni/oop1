package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int x,y,z;

    System.out.println("Enter KCSE garde: ");
    x=input.nextInt();
    System.out.println("Enter Interview Scores: ");
    y=input.nextInt();
    System.out.println("Enter confidence level score: ");
    z=input.nextInt();
    System.out.println("The student got a score of "+x+" in the KCSE exams, "+y+" in the interview questions, and "+z+" in the confidence level test.");

    if (x>=65 && y>=6 && z>=5)
         System.out.println("Hence, the student can be admitted to the university ");
    else if (x>=65 && y<6 && z>=5)
        System.out.println("Hence, the student can be admitted to the university ");
    else if (x>=65 && y>=6 && z<5)
        System.out.println("Hence, the student can be admitted to the university ");
    else
        System.out.println("Hence, the student can not be admitted to the university");
    }
}
