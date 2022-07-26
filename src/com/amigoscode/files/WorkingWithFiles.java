package com.amigoscode.files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WorkingWithFiles {

    public static void main(String[] args) {
        String fileName = "src/data.csv";
        File file = new File(fileName);

        if(!file.exists()) {
            try {

                file.createNewFile();

            } catch (IOException e) {
                System.out.println("Error creating file");
                System.out.println(e);
            }
        }

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("id,name,email");
            printWriter.println("1,sam,sam@gmail.com");
            printWriter.println("2,alex,alex@gmail.com");
            printWriter.println("3,zama,zam@gmail.com");
            printWriter.println("4,ahmed,ahmed@gmail.com");


            printWriter.close();
            printWriter.flush();
            System.out.println( "Content added to file");

        } catch (IOException e) {
            System.out.println("Error occurred " + e);
        }


        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            System.out.println("header= "+bufferedReader.readLine());;

            List<User> users = new ArrayList<>();

            while((line=bufferedReader.readLine()) != null) {

                String [] split = line.split(",");

                int id = Integer.parseInt(split[0]);
                String name = split[1];
                String email = split[2];


                User user = new User(id, name,email);
                users.add(user);

            }

            bufferedReader.close();
            System.out.println("Looping through users list");
            users.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
