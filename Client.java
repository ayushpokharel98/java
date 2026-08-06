import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("localhost", 5000);
            DataInputStream in = new DataInputStream(s.getInputStream());
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            out.writeUTF(name);
            String serverMessage = in.readUTF();
            System.out.println("Message from server: " + serverMessage);
            sc.close();
            out.close();
            in.close();
            s.close();
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
}
