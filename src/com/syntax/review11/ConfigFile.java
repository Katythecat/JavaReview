package com.syntax.review11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFile {
    public static void main(String[] args) {
        //location of the file
        String path="Files/Config.properties";
        //navigate to the file

        try {
            FileInputStream fileInputStream=new FileInputStream(path);
            //This "Properties" class will assist us to read or write the data from the .properties files
            Properties properties=new Properties();
            properties.load(fileInputStream);

            System.out.println(properties.getProperty("username"));//Leo



        } catch (FileNotFoundException e) {
            System.out.println("Something gone wrong");
        }catch(NullPointerException e){
            System.out.println("You are try to call a method on Null object");
        }catch(IOException e){
            System.out.println("IO Exception occurred");
        }
    }
}
