package socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @anthor joey
 * @date 2019/3/2 16:55
 */
public class UDPServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket=new DatagramSocket(65001);
        byte[] buff=new byte[100];
        DatagramPacket packet=new DatagramPacket(buff,buff.length);
        socket.receive(packet);
        byte[] data=packet.getData();
        String content=new String(data,0,packet.getLength());
        System.out.println(content);
        byte[] sendedContent=String.valueOf(content.length()).getBytes();
        DatagramPacket packetToClient=new DatagramPacket(sendedContent,sendedContent.length,packet.getAddress(),packet.getPort());
        socket.send(packetToClient);
    }
}
