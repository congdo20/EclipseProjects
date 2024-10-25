package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class TestObjectOutputStream {
    public static void main(String[] args) throws IOException { 
        try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("object.dat"))) {
            output.writeUTF("John");
            output.writeDouble(85.5);
            output.writeObject(new Date());
        }
    }
}
