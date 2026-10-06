package com.example.task03;

import java.io.FileReader;
import java.io.FileNotFoundException;

public class Task03Main {
    public static void main(String[] args) throws Exception{
        throwCheckedException();
    }

    public static void throwCheckedException() throws FileNotFoundException{
        String file = "";
        new FileReader(file);
    }
}