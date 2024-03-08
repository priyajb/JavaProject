package com.inter.basics;

public class JarCompressor implements ICompressor {
    @Override
    public String[] compressFiles(String file1, String file2) {
        String[] JarFiles=new String[3];
        JarFiles[0]=file1;
        JarFiles[1]=file2;
        return JarFiles;
    }
}
