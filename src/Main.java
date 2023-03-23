import geometry.Rectangle;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scInput = new Scanner(System.in);
        Rectangle figure = new Rectangle();

        do{
            System.out.print("Введіть сторону А прямокутника: ");
            double tempSideA = scInput.nextDouble();
            if(tempSideA < 0) {System.out.println("Довжина не може бути від'ємною. ");}
            else if(tempSideA == 0) {System.out.println("Якщо довжина 0, то це лінія, а не прямокутник. ");}
            else {figure.SetSideA(tempSideA); break;}
        }while(true);

        do{
            System.out.print("Введіть сторону B прямокутника: ");
            double tempSideB = scInput.nextDouble();
            if(tempSideB < 0) {System.out.println("Довжина не може бути від'ємною. ");}
            else if(tempSideB == 0) {System.out.println("Якщо довжина 0, то це лінія, а не прямокутник. ");}
            else {figure.SetSideB(tempSideB); break;}
        }while(true);

        figure.areaCalculator();
        figure.perimeterCalculator();
        figure.PrintAll();

        System.out.println("Обчислення випадкового прямокутника: ");

        Random rndNumbers = new Random();
        Rectangle randomFigure = new Rectangle(rndNumbers.nextDouble(1,10), rndNumbers.nextDouble(1,10));

        randomFigure.PrintAll();


    }
}