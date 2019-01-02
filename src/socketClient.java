import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class socketClient {
    public void run() throws IOException {
        while (true) {
            String message = JOptionPane.showInputDialog(
                    "Enter your message to server:");
            Socket s = new Socket(InetAddress.getLocalHost(), 9090);
            PrintWriter out =
                    new PrintWriter(s.getOutputStream(), true);
            out.println(message);
            String msg = JOptionPane.showInputDialog(
                    "Message sent. Anything else?");
            if (msg == "no")
                System.exit(0);
        }
    }
}