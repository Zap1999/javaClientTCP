import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientUI {
    private JPanel mainPanel;
    private JTextField msgField;
    private JButton sendMessageButton;
    private JButton endItButton;
    private JButton connectButton;
    static public ClientUI ui = new ClientUI();
    socketClient clientSocket;

    JTextField getMsgField(){
        return msgField;
    }

    public ClientUI() {
        connectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                socketClient client1 = new socketClient(ui);
                client1.run();
                clientSocket = client1;
            }
        });
        sendMessageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                clientSocket.sendMessage();
            }
        });
        endItButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                clientSocket.sendLastMsg();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ClientUI");
        frame.setContentPane(ui.mainPanel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }



}
