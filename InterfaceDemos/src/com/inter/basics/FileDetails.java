package com.inter.basics;

public class FileDetails {
    public static void main(String[] args) {
        ICompressor iCompressor = new ZipCompressor();
        iCompressor.compressFiles("hi", "heelo");
        System.out.println(".......................");
        iCompressor = new ZipCompressor();
        iCompressor.compressFiles("hiii", "good");


    }
}
