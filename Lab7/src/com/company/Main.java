package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        boolean cont = true;
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        float firstnum = 0;
        float secondnum = 0;
        while (cont) {
            System.out.println("0 - Exit\n" +
                    "1 - Addition\n" +
                    "2 - Subtraction\n" +
                    "3 - Multiplication\n" +
                    "4 - Division\n" +
                    "Please Choose an Option:");
            int choice = scan.nextInt();

            if(choice != 0){
                System.out.println(
                        "Please enter the first number:");
                firstnum = scan.nextFloat();
                System.out.println(
                        "Please enter the second number:");
                secondnum = scan.nextFloat();
            }

            switch (choice){
                case 0:
                    cont = false;
                    break;
                case 1:
                    System.out.println(calc.add(firstnum,secondnum));
                    break;
                case 2:
                    System.out.println(calc.subtract(firstnum,secondnum));
                    break;
                case 3:
                    System.out.println(calc.multiply(firstnum,secondnum));
                    break;
                case 4:
                    System.out.println(calc.divide(firstnum,secondnum));
                    break;
                default:
                    break;
            }
        }
        }
}
