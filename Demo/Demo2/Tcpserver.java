package Demo.Demo2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

//import sun.management.counter.ByteArrayCounter;

public class Tcpserver {
    public static void main(String[] args) {
        Socket socket = null;
        InputStream is = null;
        ServerSocket serverSocket = null;
        ByteArrayOutputStream baos = null;
        // ServerSocket serversocket;
        try {
            serverSocket = new ServerSocket(9999);
        } catch (IOException e1) {

            e1.printStackTrace();
        }
        // Socket socket;
        try {
            socket = serverSocket.accept();
        } catch (IOException e1) {

            e1.printStackTrace();
        }
        // InputStream is;
        try {
            is = socket.getInputStream();
        } catch (IOException e1) {

            e1.printStackTrace();
        }
        try {
            is = socket.getInputStream();
        } catch (IOException e1) {

            e1.printStackTrace();
        }
        // ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len;
        try {
            while ((len = is.read(buffer)) != -1) {
                baos.write(buffer, 0, len);
            }
        } catch (IOException e1) {

            e1.printStackTrace();
        }
        System.out.println(baos.toString());
        if (baos != null) {
            try {
                baos.close();
            } catch (IOException e) {

                e.printStackTrace();
            }
        }
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {

                e.printStackTrace();
            }
        }
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e) {

                e.printStackTrace();
            }
        }
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (IOException e) {

                e.printStackTrace();
            }
        }
    }
}