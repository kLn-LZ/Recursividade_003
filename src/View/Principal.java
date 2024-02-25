package View;

import Controller.Fatorial;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Fatorial calcF = new Fatorial();

        Scanner scan = new Scanner(System.in);
        int var;

        var = scan.nextInt();

        System.out.println(calcF.fFatorial(var));




    }

}
