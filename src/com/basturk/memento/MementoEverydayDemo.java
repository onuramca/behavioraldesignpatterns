package com.basturk.memento;

import java.io.*;

/**
 * Created by basturk
 * Date: 02.02.2017.
 */
public class MementoEverydayDemo {

    private static Employee deserialize() {

        Employee emp = null;

        try {
            FileInputStream fileIn = new FileInputStream("employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            emp = (Employee) in.readObject();
            in.close();
            fileIn.close();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        return emp;
    }

    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.setName("Bryan Hansen");
        emp.setAddress("111 E Code Street");
        emp.setPhone("888-555-1212");

        serialize(emp);

        Employee newEmp = deserialize();

        System.out.println(newEmp.getName());

    }

    public static void serialize(Employee emp) {
        try {
            FileOutputStream fileOut = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(emp);
            out.close();
            fileOut.close();

        } catch (IOException i) {
            i.printStackTrace();
        }

    }

}
