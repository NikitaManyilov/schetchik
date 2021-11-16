import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp extends JFrame {
    private int value;

    public CounterApp(int initialValue) {
        setTitle("Simple Counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500,500,600,600);
        Font font = new Font("Arial", Font.BOLD, 100);
        JLabel counterValueView = new JLabel();
        counterValueView.setFont(font);
        getContentPane().setBackground(Color.blue);
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValueView, BorderLayout.CENTER);


        value = initialValue;
        counterValueView.setText(String.valueOf(value));


        JButton decrementButton = new JButton("<-");
        decrementButton.setFont(font);
        add(decrementButton, BorderLayout.WEST);
        decrementButton.setBorderPainted(false);
        decrementButton.setFocusPainted(false);
        decrementButton.setContentAreaFilled(false);


        JButton incrementButton = new JButton("->");
        incrementButton.setFont(font);
        add(incrementButton, BorderLayout.EAST);
        incrementButton.setBorderPainted(false);
        incrementButton.setFocusPainted(false);
        incrementButton.setContentAreaFilled(false);


        decrementButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                --value;
                counterValueView.setText(String.valueOf(value));
                JButton btn = (JButton) e.getSource();
                System.out.println("Нажатие на кнопку <-");
            }
        });


        incrementButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                value++;
                counterValueView.setText(String.valueOf(value));
                JButton btn = (JButton) e.getSource();
                System.out.println("Нажатие на кнопку ->");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new CounterApp(0);
    }
}