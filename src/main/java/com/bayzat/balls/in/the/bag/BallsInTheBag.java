/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bayzat.balls.in.the.bag;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Admin
 */
public final class BallsInTheBag
{

    private final int n;

    //total number of 2 selections availabel 
    private final int towPicks;

    private BigInteger totalPerms;

    private Set<String> perms;

    public BallsInTheBag(int n)
    {
        this.n = n;
        this.towPicks = (n - (n % 2)) / 2;
        perms = new HashSet<>();
        this.totalPerms=new BigInteger("0");
        permutations();

    }

    public BigInteger getTotalPerms()
    {
        return totalPerms;
    }

    public void setTotalPerms(BigInteger totalPerms)
    {
        this.totalPerms = totalPerms;
    }

   

    public Set<String> getPerms()
    {
        return perms;
    }

    public void setPerms(Set<String> perms)
    {
        this.perms = perms;
    }

    void permutations()
    {
        int arr[];
        for (int i = 0; i < this.towPicks + 1; i++)
        {
            arr = new int[this.n - i];
            for (int j = 0; j < arr.length; j++)
            {
                if (i > j)
                {
                    arr[j] = 2;
                }
                else
                {
                    arr[j] = 1;
                }
            }
            //permute(arr, 0, arr.length);
            writePerms(arr);
            this.totalPerms=this.totalPerms.add(computeSwaps(arr));
        }
    }

    BigInteger computeSwaps(int arr[])
    {
        int numerOfTwos = this.n - arr.length;
        int numberOfOnes = arr.length - numerOfTwos;
        BigInteger x =factorial(arr.length);
        BigInteger y = factorial(numerOfTwos);
        BigInteger z = factorial(numberOfOnes);
        return x.divide(y.multiply(z));
    }

    void writePerms(int arr[])
    {
        int key;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                if (arr[i] != arr[j])
                {
                    key = arr[i];
                    arr[i] = arr[j];
                    arr[j] = key;

                }
                perms.add(Arrays.toString(arr));
            }
        }
    }

    void printPerms()
    {
        this.perms.forEach((perm) ->
        {
            System.out.println(perm);
        });
    }

    BigInteger factorial(int n)
    {
        // Initialize result 
        BigInteger factorial = new BigInteger("1"); // Or BigInteger.ONE 

        // Multiply f with 2, 3, ...N 
        for (int i = 2; i <= n; i++)
        {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        return factorial;
    }
}
