import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(5000);
            System.out.println("Waiting for server to accept the client...");
            Socket s = ss.accept();
            System.out.println("Client accepted...");
            DataInputStream in = new DataInputStream(s.getInputStream());
            DataOutputStream out = new DataOutputStream(s.getOutputStream());

            String name = in.readUTF();
            System.out.println("Name from client: " + name);
            
            out.writeUTF("Hello, " + name + "!");

            out.close();
            in.close();
            s.close();
            ss.close();
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
}
