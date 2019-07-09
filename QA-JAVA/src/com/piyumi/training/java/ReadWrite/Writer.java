package com.piyumi.training.java.ReadWrite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) throws IOException {
        write();

    }

    static void write() throws IOException {
        FileWriter fileWriter = new FileWriter("/home/user/IdeaProjects/QA-JAVA/file/filewriter.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);


        for(int i=0; i<10;i++){
            bufferedWriter.write("line" +i);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        System.out.println("Job Done");
    }
    //go to correct path in terminal and type cat <filewriter.txt>.then it will display the answer
}
