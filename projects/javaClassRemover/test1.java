import javax.swing.JButton;
import javax.swing.JFrame;

class test1{
    public static void main(String[] args) {
        JFrame f = new JFrame("Java class remover");
        JButton btn = new JButton("Click");
        btn.setBounds(100, 100,100,20);
        f.add(btn);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
