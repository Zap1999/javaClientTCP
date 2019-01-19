import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.io.PrintWriter;

public class socketClient {

    Socket s;
    ClientUI uInter;
    PrintWriter out;

    socketClient(ClientUI ui) {
        uInter = ui;
    }

    public void run() {
        try {
            s = new Socket(InetAddress.getLocalHost(), 9090);
            out = new PrintWriter(s.getOutputStream(), true);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    void sendMessage() {
            String msg = uInter.getMsgField().getText();
            out.println(msg);
    }

    void sendLastMsg(){
        System.exit(0);
    }
}