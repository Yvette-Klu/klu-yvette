/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;

/**
 *
 * @author E_Y_UNSCRIPTED
 */

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;


public class DSA {
    
    private static final Map<Character,
                         Integer> roman = new HashMap<Character,
                                                      Integer>()
{{
    put('I', 1);
    put('V', 5);
    put('X', 10);
    put('L', 50);
    put('C', 100);
    put('D', 500);
    put('M', 1000);
}};
    
    
    private static int romanToInt(String s)
{
    int sum = 0;
    int n = s.length();
     
    for(int i = 0; i < n; i++)
    {
         
       
        if (i != n - 1 && roman.get(s.charAt(i)) <
                          roman.get(s.charAt(i + 1)))
        {
            sum += roman.get(s.charAt(i + 1)) -
                   roman.get(s.charAt(i));
            i++;
        }
        else
        {
            sum += roman.get(s.charAt(i));
        }
    }
    return sum;
}
 

    
    public static void main(String[] args) {
        
        String input = "XDLC";
     
    System.out.print("Integer form of Roman Numeral is " +
                     romanToInt(input));
    
    
}
       
    
    
}
