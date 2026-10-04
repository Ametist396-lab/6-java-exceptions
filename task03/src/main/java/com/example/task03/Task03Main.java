package com.example.task03;

import java.io.FileReader;

public class Task03Main {
    public static void main(String[] args) throws Exception{
        throwCheckedException();
    }

//    public static void throwCheckedException() {
//        String file = "";
//        new FileReader(file);
//    }
    public static void throwCheckedException() throws Exception {
        throw new Exception();
    }
}