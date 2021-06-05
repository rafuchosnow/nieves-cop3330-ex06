/*
 *  UCF COP3330 Summer 2021 Assignment 1  Solution
 *  Copyright 2021 Rafael Nieves
 */

package org.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Retirement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy");
        int dateNumber = Integer.parseInt(df.format(date));

        System.out.print("What is your current age? ");
        String age1String = input.nextLine();
        int age1Number = Integer.parseInt(age1String);

        System.out.print("At what age would you like to retire? ");
        String age2String = input.nextLine();
        int age2Number = Integer.parseInt(age2String);

        int retire = age2Number - age1Number;
        System.out.println("You have " + retire + " years left until you can retire");
        int retireYear = dateNumber + retire;

        String outputString = ("It's " + dateNumber + ", so you can retire in " + retireYear);

        System.out.println(outputString);
    }
}
