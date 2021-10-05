package com.company.Netology;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientServer {
    public static void main(String[] args) throws IOException {
        String host = "netology.homework";
        int port = 8089;

        try(Socket clientSocket = new Socket(host,port);
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

            out.println("netology.ru");
            final String resp = in.readLine();
            System.out.println(resp);
            out.println("yes");
            final String resp2 = in.readLine();
            System.out.println(resp2);
            out.println("bye");
            final String resp3 = in.readLine();
            System.out.println(resp3);
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
}
