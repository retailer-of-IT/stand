package Demo.Demo2;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Tcpclient {
    public static void main(String[] args) {
        Socket socket = null;
        OutputStream os = null;
        int port = 9999;
        InetAddress serverIP = null;
        try {
            serverIP = InetAddress.getByName("127.0.0.1");
        } catch (UnknownHostException e2) {

            e2.printStackTrace();
        }
        try {
            socket = new Socket(serverIP, port);
        } catch (IOException e1) {

            e1.printStackTrace();
        }
        // OutputStream os;
        try {
            os = socket.getOutputStream();
        } catch (IOException e) {

            e.printStackTrace();
        }
        try {
            os.write("你好啊".getBytes());
        } catch (IOException e) {

            e.printStackTrace();
        }
        if (os != null) {
            try {
                os.close();
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

    }
}