/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bayzat.balls.in.the.bag;

import java.math.BigInteger;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.hamcrest.number.OrderingComparison.comparesEqualTo;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Admin
 */
public class BagTest
{

    @Test
    public void test5()
    {
        int n = 5;
        BigInteger expectedSwaps = new BigInteger(8 + "");
        String expected[] =
        {
            "[1, 1, 1, 1, 1]",
            "[2, 1, 1, 1]",
            "[1, 2, 1, 1]",
            "[1, 1, 2, 1]",
            "[1, 1, 1, 2]",
            "[2, 2, 1]",
            "[2, 1, 2]",
            "[1, 2, 2]"
        };
        BallsInTheBag bag = new BallsInTheBag(n);
        assertThat(expectedSwaps, comparesEqualTo(bag.getTotalPerms()));
        assertThat(bag.getPerms(), containsInAnyOrder(expected));
    }

    @Test
    public void test3()
    {
        int n = 3;
        BigInteger expectedSwaps = new BigInteger(3 + "");
        String expected[] =
        {
            "[1, 1, 1]",
            "[2, 1]",
            "[1, 2]"
        };
        BallsInTheBag bag = new BallsInTheBag(n);
        assertThat(expectedSwaps, comparesEqualTo(bag.getTotalPerms()));
        assertThat(bag.getPerms(), containsInAnyOrder(expected));
    }

    @Test
    public void test6()
    {
        int n = 6;
        BigInteger expectedSwaps = new BigInteger(13 + "");
        String expected[] =
        {
            "[1, 1, 1, 1, 1, 1]",
            "[2, 1, 1, 1, 1]",
            "[1, 2, 1, 1, 1]",
            "[1, 1, 2, 1, 1]",
            "[1, 1, 1, 2, 1]",
            "[1, 1, 1, 1, 2]",
            "[2, 2, 1, 1]",
            "[2, 1, 2, 1]",
            "[2, 1, 1, 2]",
            "[1, 2, 2, 1]",
            "[1, 1, 2, 2]",
            "[1, 2, 1, 2]",
            "[2, 2, 2]",
        };
        BallsInTheBag bag = new BallsInTheBag(n);
        assertThat(expectedSwaps, comparesEqualTo(bag.getTotalPerms()));
        assertThat(bag.getPerms(), containsInAnyOrder(expected));
    }

    @Test
    public void test7()
    {
        int n = 7;
        BigInteger expectedSwaps = new BigInteger(21 + "");
        String expected[] =
        {
            "[1, 1, 1, 1, 1, 1, 1]",
            "[2, 1, 1, 1, 1, 1]",
            "[1, 2, 1, 1, 1, 1]",
            "[1, 1, 2, 1, 1, 1]",
            "[1, 1, 1, 2, 1, 1]",
            "[1, 1, 1, 1, 2, 1]",
            "[1, 1, 1, 1, 1, 2]",
            "[2, 1, 2, 1, 1]",
            "[1, 1, 2, 2, 1]",
            "[1, 1, 1, 2, 2]",
            "[2, 1, 1, 2, 1]",
            "[1, 1, 2, 1, 2]",
            "[1, 2, 1, 2, 1]",
            "[2, 2, 1, 1, 1]",
            "[1, 2, 2, 1, 1]",
            "[1, 2, 1, 1, 2]",
            "[1, 2, 2, 2]",
            "[2, 1, 2, 2]",
            "[2, 2, 1, 2]",
            "[2, 2, 2, 1]",
        };
        BallsInTheBag bag = new BallsInTheBag(n);
        assertThat(expectedSwaps, comparesEqualTo(bag.getTotalPerms()));
        assertThat(bag.getPerms(), containsInAnyOrder(expected));
    }

}
