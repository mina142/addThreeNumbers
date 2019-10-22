import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner key = new Scanner(System.in);
        int[] vars = new int[3];
        int sum = 0;

        for(int i = 0; i < vars.length; i++){
            System.out.println("please enter a number: ");
            vars[i] = key.nextInt();
            sum = sum + vars[i];

        }
        System.out.println(" Total of three numbers is: " + sum);

       /* System.out.println("please enter a number: ");
        Scanner keyboard1 = new Scanner(System.in);
        int myAnswer1 = keyboard1.nextInt();

        System.out.println("please enter a number: ");
        Scanner keyboard2 = new Scanner(System.in);
        int myAnswer2 = keyboard2.nextInt();

        System.out.println("please enter a number: ");
        Scanner keyboard3 = new Scanner(System.in);
        int myAnswer3 = keyboard3.nextInt();

        int finalAnswer = myAnswer1+myAnswer2+myAnswer3;
        System.out.println(" Total of three numbers is: " + finalAnswer);*/



    }
}
