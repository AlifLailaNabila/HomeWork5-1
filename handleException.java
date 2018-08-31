package HomeWork5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class handleException {
    public static void main(String[] args) {

        FileReader fr=null;
        BufferedReader br=null;
        String path="C:\\Users\\Owner\\Downloads\\Bug Lifecycle - Weekend.txt";
        try{
            fr=new FileReader(path);
            System.out.println("your file is in our archive.");
        }catch(Exception e){
            System.out.println("File did not found");
        }

        try{ br=new BufferedReader(fr);
            String data="";
            while((data=br.readLine())!=null){
                System.out.println(data);
            }

        }catch (Exception ex){
            System.out.println("Your data is not there .");
        }
    }

}
