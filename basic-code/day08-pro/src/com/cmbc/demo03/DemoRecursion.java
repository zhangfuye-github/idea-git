package com.cmbc.demo03;

import java.io.File;

public class DemoRecursion {
    public static void main(String[] args) {
        File file = new File("E:\\mianshi");
//        boolean b = file.isFile();
//        System.out.println(b);
         printFileName(file);
    }

    private static void printFileName(File file) {
//        System.out.println(file.getAbsolutePath());
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isDirectory()){
                printFileName(file1);
            }else{
                String name = file1.getName();
                boolean b = name.endsWith(".java");
                if(b){
                    System.out.println(file1.getAbsolutePath());
                }


            }

        }

    }
}
