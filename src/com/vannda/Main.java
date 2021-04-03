package com.vannda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        System.out.print("Input your password :");
        String password = input.nextLine();

        Encryption encryption = new Encryption();

        encryption.setPassword(password);
        String password_md5 = encryption.MD5();
        String password_sha156 = encryption.sha256();
        System.out.println("Your MD5 encryption :" + password_md5);
        System.out.println("Your sha256 encryption :" + password_sha156);

    }
}
