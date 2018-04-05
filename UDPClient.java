package lab2; 
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import lab1.TimeHistory;

import lab1.Packet;
import lab1.TimeHistory;

public class UDPClient {
	public static void main(String[] args) {
		
		
		
		DatagramSocket aSocket = null;
		Scanner scanner = null;
		try {
			// args contain server hostname
			
			byte[] buffer1 = new byte[1024];
			InetAddress aHost = InetAddress.getByName("localhost");
			int serverPort = 9876;
			aSocket = new DatagramSocket();
			scanner = new Scanner(System.in);
			
			//6/1
			Integer[] buffer= {1,2,3,4,5};
			TimeHistory<Integer> packet = new TimeHistory<Integer>("device1", "fajne", 1 , 1, "unit", 1, buffer, 55);
			//6/2
			byte[] data = Tools.serialize(packet);
		
			
				//6/3					
				DatagramPacket request = new DatagramPacket(data, data.length, aHost, serverPort);
				//6/4
				aSocket.send(request);
				//6/5
				DatagramPacket reply = new DatagramPacket(buffer1, buffer1.length);
				//6/6
				aSocket.receive(reply);
				System.out.println("Reply: " + new String(reply.getData(), 0, reply.getLength()));
				
			Object read = Tools.deserialize(buffer1);
			System.out.println (read.toString());
				
		} catch (SocketException ex) {
			Logger.getLogger(UDPClient.class.getName()).log(Level.SEVERE, null, ex);
		} catch (UnknownHostException ex) {
			Logger.getLogger(UDPClient.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IOException ex) {
			Logger.getLogger(UDPClient.class.getName()).log(Level.SEVERE, null, ex);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			aSocket.close();
			scanner.close();
		}
	}
}