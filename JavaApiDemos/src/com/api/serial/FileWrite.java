package com.api.serial;

import java.io.*;

public class FileWrite {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("demo.txt");
            char c = (char) bufferedReader.read();//read in the console
            while (c != 'q') {
                System.out.print(c);//print on the console
                fileOutputStream.write(c);
                c = (char) bufferedReader.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
