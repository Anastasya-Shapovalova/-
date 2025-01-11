package com.java.A;

public class Mass {
    public static void main (String[] args)
    {
        int[] m = {1,2,3,4,5,6,7,8,9,10};
        int i;
        System.out.println("Четные числа: ");
        for (i = 0; i < m.length; i++)
        {
            if (m[i] % 2 == 0)
            {
                System.out.println(m[i] + ", ");
            }
        }
    }
}

