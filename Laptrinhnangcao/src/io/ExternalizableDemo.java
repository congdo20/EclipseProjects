package io;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternalizableDemo implements Externalizable {
    String name;
    int age;
    int jobId;

    public ExternalizableDemo() {
    }

    public ExternalizableDemo(String name, int age, int jobId) {
        this.name = name;
        this.age = age;
        this.jobId = jobId;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeInt(age);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        age = in.readInt();
    }

    public static void main(String[] args) {
        try {
            ExternalizableDemo t1 = new ExternalizableDemo("Nguyen Van An", 20, 123456);
            FileOutputStream fos = new FileOutputStream("test.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(t1);
            oos.close();

            FileInputStream fis = new FileInputStream("test.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ExternalizableDemo t2 = (ExternalizableDemo) ois.readObject();
            ois.close();

            System.out.println("Name: " + t2.name);
            System.out.println("Age: " + t2.age);
            System.out.println("Job ID: " + t2.jobId);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
