package lab1.arsw;

import java.util.ArrayList;
import java.util.Scanner;

public class EndOfFile {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        int i = 1;
        while (scan.hasNext()){
            System.out.println(i +" "+scan.nextLine());
            i+= 1;
        }
    }
}
