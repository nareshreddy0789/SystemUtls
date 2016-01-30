package com.java.bayampreverse;

import com.java.bayamputls.PrintFile;
import com.java.bayamputls.PrintToConsole;

/**
 * Created by naresh on 1/29/2016.
 */
public class ReverseSwap {
    public static String reverse(String str){
        int len = str.length();
        for (int i = (len-1); i >= 0; --i)
            str += str.charAt(i);
        str = str.substring(len);
        return str;
    }
    public static void main(String args[]){
        String original = "asdf";
        String reverse = reverse(original);
        PrintToConsole.printConsole(reverse);
        PrintFile.printFileAppend(reverse);
    }
}
