package com.piyumi.training.java.ReadWrite;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read {
    public static void main(String[] args) throws IOException {
        read();
    }

    static void read() throws IOException {
        FileReader fileReader = new FileReader("/home/user/IdeaProjects/QA-JAVA/file/filewriter.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        System.out.println("Reading");
        String line;
        while ((line=bufferedReader.readLine())!=null){
            System.out.println(line);
        }

    }
}
