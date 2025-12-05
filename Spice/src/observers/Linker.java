package observers;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Linker {

    private Socket socket;
    private PrintWriter out;
    private boolean connected;

    public Linker(String name, String host, int port) {
        try {
            socket = new Socket(host, port);
            out = new PrintWriter(socket.getOutputStream(), true);
            connected = true;
            System.out.println("Connexion établie sur "+host+":"+port);
        } catch (IOException ioe) {
            connected = false;
            System.out.println("La connexion n'a pas pu être établie avec "+host+":"+port);
        }
    }

    public void close() {
        try {
            if (out != null) out.close();
            if (socket != null && !socket.isClosed()) socket.close();
            connected = false;
            System.out.println("Déconnecté");
        } catch (IOException ioe) { ioe.printStackTrace(); }
    }

    public void send(String message) {
    	System.out.println("Sending: "+message);
        out.println(message);
    }

    public boolean isConnected() {
        return connected;
    }

}
