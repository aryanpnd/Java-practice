import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator extends JFrame implements ActionListener {
    private JTextField displayField;
    private JButton[] numberButtons;
    private JButton[] operatorButtons;
    private JButton equalsButton;
    private JButton clearButton;

    private String currentNumber;
    private String currentOperator;
    private double result;

    public calculator() {
        // Set up the frame
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create the display field
        displayField = new JTextField();
        displayField.setEditable(false);
        add(displayField, BorderLayout.NORTH);

        // Create the number buttons
        numberButtons = new JButton[10];
        JPanel numbersPanel = new JPanel(new GridLayout(4, 3));
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numbersPanel.add(numberButtons[i]);
        }
        add(numbersPanel, BorderLayout.CENTER);

        // Create the operator buttons
        operatorButtons = new JButton[4];
        JPanel operatorsPanel = new JPanel(new GridLayout(4, 1));
        String[] operators = {"+", "-", "*", "/"};
        for (int i = 0; i < operators.length; i++) {
            operatorButtons[i] = new JButton(operators[i]);
            operatorButtons[i].addActionListener(this);
            operatorsPanel.add(operatorButtons[i]);
        }
        add(operatorsPanel, BorderLayout.EAST);

        // Create the equals and clear buttons
        equalsButton = new JButton("=");
        equalsButton.addActionListener(this);
        clearButton = new JButton("C");
        clearButton.addActionListener(this);

        JPanel buttonsPanel = new JPanel(new GridLayout(1, 2));
        buttonsPanel.add(equalsButton);
        buttonsPanel.add(clearButton);
        add(buttonsPanel, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == clearButton) {
            currentNumber = "";
            currentOperator = "";
            result = 0;
            displayField.setText("");
        } else if (source == equalsButton) {
            calculateResult();
        } else {
            for (int i = 0; i < 10; i++) {
                if (source == numberButtons[i]) {
                    currentNumber += i;
                    displayField.setText(currentNumber);
                    break;
                }
            }
            for (int i = 0; i < operatorButtons.length; i++) {
                if (source == operatorButtons[i]) {
                    currentOperator = operatorButtons[i].getText();
                    if (!currentNumber.equals("")) {
                        result = Double.parseDouble(currentNumber);
                        currentNumber = "";
                    }
                    break;
                }
            }
        }
    }

    private void calculateResult() {
        if (!currentNumber.equals("")) {
            double number = Double.parseDouble(currentNumber);
            switch (currentOperator) {
                case "+":
                    result += number;
                    break;
                case "-":
                    result -= number;
                    break;
                case "*":
                    result *= number;
                    break;
                case "/":
                    if (number != 0) {
                        result /= number;
                    } else {
                        JOptionPane.showMessageDialog(this, "Error: Division by zero!");
                    }
                    break;
            }
            displayField.setText(String.valueOf(result));
            currentNumber = "";
            currentOperator = "";
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                calculator calculator = new calculator();
                calculator.setVisible(true);
            }
        });
    }
}
