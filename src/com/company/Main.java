package com.company;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileInputStream fls;
        int bajt;
        try {
            fls = new FileInputStream("E:\\Study\\Java\\Czw9.txt");
        }catch (FileNotFoundException e){
            System.out.println("Nie znaleziono pliku o takiej nazwie");
            return;
        }
        try {
            do {
                bajt = fls.read();
                if(bajt != -1) System.out.println((char) bajt);
            } while (bajt != -1);
        }catch (IOException e){
            System.out.println("Blad odczytu pliku");
        }finally {
            fls.close();
        }
    }
}
