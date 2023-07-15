import javax.swing.*;

public class gui {
    public static void main(String[] args) {
        // Create a JFrame (window) and set its title
        JFrame frame = new JFrame("Simple GUI Example");
        
        // Create a JLabel (text label) and set its text
        JLabel label = new JLabel("Hello, World!");
        
        // Set the size and layout of the frame
        frame.setSize(300, 200);
        frame.setLayout(new java.awt.FlowLayout());
        
        // Add the label to the frame
        frame.add(label);
        
        // Set the default close operation and make the frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
