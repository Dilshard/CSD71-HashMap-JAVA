package com.company;

import java.util.Scanner;

public class MainMenu {

    public void menu(){
        System.out.println("Welcome to HPS");
        System.out.println("Select 1 - Create user");
        System.out.println("Select 2 - Create user");
        System.out.println("Select 3 - Create user");
        System.out.println("Select 4 - Create user");

        Scanner scan = new Scanner(System.in);

        int selectOption = scan.nextInt();

        if(selectOption == 1){
            createUser();
        }

    }

    public void createUser(){
        System.out.println("Crate user");
    }
}
