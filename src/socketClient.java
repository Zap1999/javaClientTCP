import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class socketClient {
    public void run() throws IOException {
        Socket s = new Socket(InetAddress.getLocalHost(), 9090);
        while (true) {
            String message = JOptionPane.showInputDialog(
                    "Enter your message to server:");
            PrintWriter out =
                    new PrintWriter(s.getOutputStream(), true);
            out.println(message);
            if(JOptionPane.showConfirmDialog(null,
                    "One more message?", "One question...", JOptionPane.YES_NO_OPTION) == 1) {
            }
            else {
                System.exit(0);
            }
        }
    }
}