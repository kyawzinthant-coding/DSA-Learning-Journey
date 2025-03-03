
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Testing {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        // Create a frame
        JFrame frame = new JFrame("Simple Swing UI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null); // Center the window

        // Create a label
        JLabel label = new JLabel("Hello, Swing!", SwingConstants.CENTER);
        frame.add(label, BorderLayout.NORTH);

        // Create a button
        JButton button = new JButton("Click Me");
        frame.add(button, BorderLayout.SOUTH);

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked!");
            }
        });

        // Ensure all components are drawn properly
        frame.revalidate();
        frame.repaint();

        // Make the frame visible
        frame.setVisible(true);
    }
}

