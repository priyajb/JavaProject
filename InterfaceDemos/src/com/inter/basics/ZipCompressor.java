package com.inter.basics;

public class ZipCompressor implements ICompressor {
    @Override
    public String[] compressFiles(String file1, String file2) {
        String[] ZippedFiles = new String[3];
        ZippedFiles[0] = file1;
        ZippedFiles[1] = file2;
        return ZippedFiles;
    }
}
