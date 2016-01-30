package com.java.bayamputls;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by naresh on 1/29/2016.
 */
public class PrintFile {
    public static void printFileAppend(String msg) {
        try {
            File file = new File("D:/ioappend.txt");
            java.util.Date date = new java.util.Date();

            //if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            //true = append file
            FileWriter fileWritter = new FileWriter(file.getPath(), true);
            BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
            bufferWritter.write(date + msg );
            bufferWritter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



