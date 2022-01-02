package org.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class Main {
    public static void main(String[] args) throws IOException {

        // serialize the object
        Xploit xploit = new Xploit();
        FileOutputStream fileOutputStream = new FileOutputStream("xploit.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(xploit);
        objectOutputStream.flush();
        objectOutputStream.close();
    }
}
