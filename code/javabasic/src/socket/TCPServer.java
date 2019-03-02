package socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @anthor joey
 * @date 2019/3/2 16:12
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss= new ServerSocket(65000);
        while(true){
            Socket socket=ss.accept();
            new LengthCalculator(socket).start();
        }

    }
}
