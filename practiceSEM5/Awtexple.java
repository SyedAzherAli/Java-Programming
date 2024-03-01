import java.awt.Button;
import java.awt.Frame;

 

public class Awtexple {
    public static void main(String[] args) {
        Button button = new Button("click me");
        Frame frame = new Frame("AWT button example");
        frame.add(button);
        frame.setSize(200,202);
        frame.setLayout(null);
        frame.setVisible(true);
        }}

