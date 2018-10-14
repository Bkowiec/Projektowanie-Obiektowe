import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Window {
    static JTextField a;
    static JTextField b;
    static JTextField c;

    static public void createWindow() {
        JFrame frame = new JFrame("My First GUI");
        JTextField jTextField = new JTextField();
        JButton button1 = new JButton(new CustomAction());
        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Enter Text");
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        button1.setText("Button1");
        a = new JTextField(10); // accepts upto 10 characters
        b = new JTextField(10); // accepts upto 10 characters
        c = new JTextField(10); // accepts upto 10 characters
        panel.add(a);
        panel.add(b);
        panel.add(c);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.getContentPane().add(BorderLayout.CENTER, button1);
        frame.setVisible(true);
    }
}

class CustomAction extends AbstractAction {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(new Calculator().getDoubletValue(Double.valueOf(Window.a.getText()),
                Double.valueOf(Window.b.getText()), Double.valueOf(Window.c.getText())));
    }
}
