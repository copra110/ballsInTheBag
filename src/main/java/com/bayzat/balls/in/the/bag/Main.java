/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bayzat.balls.in.the.bag;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main
{

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        processBalls(scanner);
    }

    static void processBalls(Scanner scanner)
    {
        int n = 1;
        
        try
        {
            System.out.println("Enter the number of balls or (end) to stop program execution : ");
            String input = scanner.nextLine();
            if (input.equals("end"))
            {
                System.out.println("program ended");
            }
            else
            {
                n = Integer.parseInt(input);
                BallsInTheBag x = new BallsInTheBag(n);
                System.out.println("max picking permutaion : "+x.getTotalPerms());
                System.out.println("ways : ");
                x.getPerms().forEach((s) ->
                {
                    System.out.println(s);
                });
                processBalls(scanner);
            }

        }
        catch (NumberFormatException e)
        {
            System.out.println("Wrong input");
            processBalls(scanner);
        }
    }
}
