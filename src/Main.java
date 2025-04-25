import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

  //write a program to find cube of given number

        //create  a Scanner object to read user input
        Scanner sc=new Scanner(System.in);

        //prompt the user to Enter a number
        System.out.println("Enter a Number");
        double number=sc.nextDouble();

        //calculate the cube of the number
        double cube=Math.pow(number,3);
        //display the result
        System.out.println("the cube of "+number+" is "+cube);

        //close the scanner
        sc.close();















    }
}