import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ArithmeticGameRon extends JFrame implements ActionListener {

    private JLabel randomNumber1Label, randomNumber2Label, resultLabel, scoreLabel;
    private JTextField resultTextField;
    private JButton additionButton, subtractionButton, divideButton, moduleButton, submitButton;
    private JRadioButton level1RadioButton, level2RadioButton, level3RadioButton;
    private ButtonGroup levelGroup;
    private int randomNumber1, randomNumber2, level;
    private String operation = "";
    private int correctCount = 0;
    private int incorrectCount = 0;
    private JLabel correctCountLabel, incorrectCountLabel;

    public ArithmeticGameRon() {
        setTitle("Arithmetic Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLayout(new BorderLayout());

        // Top Panel for Random Numbers and Result
        JPanel topPanel = new JPanel(new FlowLayout());
        randomNumber1Label = new JLabel("Random Number 1: ");
        randomNumber2Label = new JLabel("Random Number 2: ");
        resultLabel = new JLabel("Result: ");
        resultTextField = new JTextField(10);
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        topPanel.add(randomNumber1Label);
        topPanel.add(randomNumber2Label);
        topPanel.add(new JLabel("+")); // Operation symbol
        topPanel.add(resultLabel);
        topPanel.add(resultTextField);
        topPanel.add(submitButton);

        add(topPanel, BorderLayout.NORTH);

        // Center Panel for Operations and Levels
        JPanel centerPanel = new JPanel(new GridLayout(2, 1)); // 2 rows, 1 column

        // Operations Panel (Buttons)
        JPanel operationsPanel = new JPanel(new FlowLayout());
        additionButton = new JButton("Addition");
        subtractionButton = new JButton("Subtraction");
        divideButton = new JButton("Divide");
        moduleButton = new JButton("Module");

        additionButton.addActionListener(this);
        subtractionButton.addActionListener(this);
        divideButton.addActionListener(this);
        moduleButton.addActionListener(this);

        operationsPanel.add(additionButton);
        operationsPanel.add(subtractionButton);
        operationsPanel.add(divideButton);
        operationsPanel.add(moduleButton);

        centerPanel.add(operationsPanel);

        // Levels Panel (Radio Buttons)
        JPanel levelsPanel = new JPanel(new FlowLayout());
        level1RadioButton = new JRadioButton("Level 1 (1-100)");
        level2RadioButton = new JRadioButton("Level 2 (100-500)");
        level3RadioButton = new JRadioButton("Level 3 (500-1000)");

        levelGroup = new ButtonGroup();
        levelGroup.add(level1RadioButton);
        levelGroup.add(level2RadioButton);
        levelGroup.add(level3RadioButton);

        level1RadioButton.addActionListener(this);
        level2RadioButton.addActionListener(this);
        level3RadioButton.addActionListener(this);

        levelsPanel.add(new JLabel("Level:"));
        levelsPanel.add(level1RadioButton);
        levelsPanel.add(level2RadioButton);
        levelsPanel.add(level3RadioButton);

        centerPanel.add(levelsPanel);

        add(centerPanel, BorderLayout.CENTER);

        // Bottom Panel for Score
        JPanel bottomPanel = new JPanel(new FlowLayout());
        scoreLabel = new JLabel("Score: ");
        correctCountLabel = new JLabel("Correct: 0");
        incorrectCountLabel = new JLabel("Incorrect: 0");

        bottomPanel.add(scoreLabel);
        bottomPanel.add(correctCountLabel);
        bottomPanel.add(incorrectCountLabel);

        add(bottomPanel, BorderLayout.SOUTH);

        // Initialize game
        setVisible(true);
    }

    private void generateRandomNumbers() {
        Random random = new Random();
        int min = 1, max = 100;

        if (level1RadioButton.isSelected()) {
            level = 1;
            min = 1;
            max = 100;
        } else if (level2RadioButton.isSelected()) {
            level = 2;
            min = 100;
            max = 500;
        } else if (level3RadioButton.isSelected()) {
            level = 3;
            min = 500;
            max = 1000;
        }

        randomNumber1 = random.nextInt(max - min + 1) + min;
        randomNumber2 = random.nextInt(max - min + 1) + min;

        randomNumber1Label.setText("Random Number 1: " + randomNumber1);
        randomNumber2Label.setText("Random Number 2: " + randomNumber2);
    }

   public void actionPerformed(ActionEvent e) {
        if (e.getSource() == additionButton) {
            operation = "addition";
            generateRandomNumbers();
        } else if (e.getSource() == subtractionButton) {
            operation = "subtraction";
            generateRandomNumbers();
        } else if (e.getSource() == divideButton) {
            operation = "division";
            generateRandomNumbers();
        } else if (e.getSource() == moduleButton) {
            operation = "module";
            generateRandomNumbers();
        } else if (e.getSource() == submitButton) {
            checkAnswer();
        } else if (e.getSource() == level1RadioButton || e.getSource() == level2RadioButton || e.getSource() == level3RadioButton) {
            generateRandomNumbers();
        }
    }

    private void checkAnswer() {
        try {
            int userAnswer = Integer.parseInt(resultTextField.getText());
            int correctAnswer = 0;

            switch (operation) {
                case "addition":
                    correctAnswer = randomNumber1 + randomNumber2;
                    break;
                case "subtraction":
                    correctAnswer = randomNumber1 - randomNumber2;
                    break;
                case "division":
                    if (randomNumber2 != 0) {
                        correctAnswer = randomNumber1 / randomNumber2;
                    } else {
                        JOptionPane.showMessageDialog(this, "Cannot divide by zero!");
                        return;
                    }
                    break;
                case "module":
                    correctAnswer = randomNumber1 % randomNumber2;
                    break;
            }

            if (userAnswer == correctAnswer) {
                correctCount++;
                JOptionPane.showMessageDialog(this, "Correct!");
            } else {
                incorrectCount++;
                JOptionPane.showMessageDialog(this, "Incorrect. The correct answer was " + correctAnswer);
            }

            correctCountLabel.setText("Correct: " + correctCount);
            incorrectCountLabel.setText("Incorrect: " + incorrectCount);

            generateRandomNumbers();
            resultTextField.setText("");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter a number.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ArithmeticGameRon::new);
    }
    }
