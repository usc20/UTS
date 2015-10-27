/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klien;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author sai
 */
public class Klien {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        byte [] buf = new byte[10];
        int panjang;
        try (Socket socket = new Socket("10.151.34.155",6666); InputStream is = socket.getInputStream(); OutputStream os = socket.getOutputStream()) {
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String str = br.readLine();
            int pjg= str.length();
            os.write("username:5113100089\n".getBytes());
            //os.write("Result:1500\n".getBytes());
            os.flush();
            int len = is.read(buf);
            while(true){
                buf = new byte[10];
                len = is.read(buf);
                if(len == -1){
                    break;
                }
                else {
                    BufferedReader agk = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    String ops = agk.readLine();
                    int k = is.read(buf);
                    for(int i = 0; i<k;i++){
                        if(ops.substring(i).equals(" ")){
                            
                        }
                    
                    }
                    
                }
                System.out.print(new String(buf));
            }
        }
    
}}
