import java.io.IOException;

public class Run {
    public static void main(String args[]){
        socketClient client1 = new socketClient();
        try {
            client1.run();
        }
        catch(IOException er){
            System.err.println("Error " +er.getMessage());
        }
    }
}
