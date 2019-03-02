package socket;

import java.io.IOException;
import java.net.*;

/**
 * @anthor joey
 * @date 2019/3/2 17:02
 */
public class UDPClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket =new DatagramSocket();
        byte[] buf ="Hello World".getBytes();
        InetAddress address=InetAddress.getByName("127.0.0.1");
        DatagramPacket packet=new DatagramPacket(buf,buf.length,address,65001);
        socket.send(packet);
        byte[] data =new byte[100];
        DatagramPacket  receivedPacket=new DatagramPacket(data,data.length);
        socket.receive(receivedPacket);
        String content =new String(receivedPacket.getData(),0,receivedPacket.getLength());
        System.out.println(content);
    }
}
