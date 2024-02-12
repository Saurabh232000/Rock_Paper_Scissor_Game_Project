import java.util.Random;
import java.util.Scanner;

/*
Ques:--ROCK , PAPER AND SCISSOR
0-Rock
1- Paper
2- Scissor

 */
public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 0 for Rock , 1 for Paper and 2 For Scissor");
        int userInput =sc.nextInt();
         Random r  =new Random();
         int computerInput= r.nextInt(3);
         if(userInput==computerInput)
         {
             System.out.println("Draw");
         }
         else if (userInput==0&&computerInput==2 || userInput==1&&computerInput==0 ||userInput==2&&computerInput==1)
         {
             System.out.println("Congratulation......... You Win");

         }
         else
         {
             System.out.println(" Computer Win");
         }
        System.out.println( "User input : " + userInput );
        System.out.println("Computer Input :"+ computerInput);
    }
}