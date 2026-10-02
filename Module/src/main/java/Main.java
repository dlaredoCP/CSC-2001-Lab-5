//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {

        // 2. Create the window object
        JFrame frame = new JFrame();

        // 3. Configure window settings
        frame.setTitle("My First Window");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closes application on exit

        // 4. Make it visible to the user
        frame.setVisible(true);
    }
}
