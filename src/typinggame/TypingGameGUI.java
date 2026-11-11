/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package typinggame;

/**
 *
 * @author HP
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import javax.swing.Timer;

// Java layout imports
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;

// Java Collections imports
import java.util.ArrayList;
import java.util.Random;

public class TypingGameGUI {
    
        public static void main(String[] args) {
               // 1. Create the main application window
        JFrame frame = new JFrame("CEDEE KALLON Typing Speed Game");

        frame.setSize(700, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 2. Create the game title
        JLabel title = new JLabel(
            "CEDEE KALLON TYPING SPEED GAME",
            JLabel.CENTER
        );

        title.setFont(new Font("Arial", Font.BOLD, 25));

        // 3. Create the timer label
        JLabel timeLabel = new JLabel("Time: 60 seconds");

        timeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        timeLabel.setForeground(Color.RED);

        // 4. Create the score label
        int[] score = {0};

        JLabel scoreLabel = new JLabel("Score: 0");

        scoreLabel.setFont(new Font("Arial", Font.BOLD, 20));

        // 5. Create an ArrayList to store sentences
        ArrayList<String> sentences = new ArrayList<>();

        sentences.add("Java is a powerful programming language.");
        sentences.add("Programming helps us solve real world problems.");
        sentences.add("A software developer builds useful applications.");
        sentences.add("Learning data structures improves programming skills.");
        sentences.add("Computer technology makes communication easier.");
        sentences.add("Practice every day to become a better programmer.");
           sentences.add("I LOVE YVONNE SO MUCH.");
           sentences.add("YES I LOVE YVONNE AND I DO");

        // 6. Create a Random object
        Random random = new Random();

        // Select a random sentence from the ArrayList
        String[] currentSentence = {
            sentences.get(random.nextInt(sentences.size()))
        };

        
        
        // 7. Display the selected sentence
        JTextArea sentenceArea = new JTextArea(currentSentence[0]);
          sentenceArea.setHighlighter(null);
        sentenceArea.setEditable(false);
        sentenceArea.setLineWrap(true);
        sentenceArea.setWrapStyleWord(true);
        sentenceArea.setFont(new Font("Arial", Font.BOLD, 22));
        
        
        

        // Add sentence area to a scroll pane
        JScrollPane scrollPane = new JScrollPane(sentenceArea);

        // 8. Create the player's input field
        JTextField inputField = new JTextField(25);

        inputField.setFont(new Font("Arial", Font.PLAIN, 20));

        // 9. Store the remaining time
        int[] timeLeft = {60};

        // Check whether the game is running
        boolean[] gameRunning = {true};

        // 10. Create the top panel
        JPanel panel = new JPanel();

        panel.add(title);
        panel.add(timeLabel);
        panel.add(scoreLabel);

        // 11. Add components to the window
        frame.add(panel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(inputField, BorderLayout.SOUTH);

        // 12. Check the player's answer
        inputField.addActionListener(e -> {

            // Stop if the game has ended
            if (!gameRunning[0]) {
                return;
            }

            // Get the player's typed sentence
            String typedSentence = inputField.getText().trim();

            // Compare the typed sentence
            if (typedSentence.equalsIgnoreCase(currentSentence[0])) {

                // Increase the score
                score[0]++;

                // Update the score display
                scoreLabel.setText("Score: " + score[0]);

                // Select another random sentence
                currentSentence[0] =
                    sentences.get(random.nextInt(sentences.size()));

                // Display the new sentence
                sentenceArea.setText(currentSentence[0]);

            } else {

                // Inform the player of the wrong answer
                JOptionPane.showMessageDialog(
                    frame,
             "😂😂 Oops! You missed it!\nTry again! 😅",
                 "Wrong Answer",
        JOptionPane.WARNING_MESSAGE);
            }

            // Clear the input field
            inputField.setText("");
        });

        // 13. Create the countdown timer
     
        
        
        
// 13. Create the countdown timer
Timer timer = new Timer(1000, e -> {

    // Reduce time by one second
    timeLeft[0]--;

    // Update timer display
    timeLabel.setText("Time: " + timeLeft[0] + " seconds");

    // Check whether time has finished
    if (timeLeft[0] <= 0) {

        // Stop the countdown
        Timer currentTimer = (Timer) e.getSource();
        currentTimer.stop();

        // End the current game
        gameRunning[0] = false;

        // Display time up
        timeLabel.setText("TIME UP!");

        // Disable typing
        inputField.setEnabled(false);

        // Ask the player whether to try again
        int choice = JOptionPane.showConfirmDialog(
            frame,
            "GAME OVER!\nYour final score is: " + score[0]
            + "\n\nWould you like to try again?",
            "Game Over",
            JOptionPane.YES_NO_OPTION
        );

        
        
        
        // If the player chooses YES
        if (choice == JOptionPane.YES_OPTION) {

            // Reset the score
            score[0] = 0;
            scoreLabel.setText("Score: 0");

            // Reset the timer
            timeLeft[0] = 60;
            timeLabel.setText("Time: 60 seconds");

            // Select a new random sentence
            currentSentence[0] =
                sentences.get(random.nextInt(sentences.size()));

            // Display the new sentence
            sentenceArea.setText(currentSentence[0]);

            // Clear the input field
            inputField.setText("");

            // Enable typing again
            inputField.setEnabled(true);

            // Start a new game
            gameRunning[0] = true;

            // Restart the countdown
            currentTimer.start();

            // Return keyboard focus to the input field
            inputField.requestFocusInWindow();

        } else {

            // Close the game if the player chooses NO
            frame.dispose();
        }
    }
});





// 14. Start the countdown
timer.start();

        // 15. Center the window
        frame.setLocationRelativeTo(null);

        // 16. Display the window
        frame.setVisible(true);

        // Give the input field keyboard focus
        inputField.requestFocusInWindow();
        
        
            }
    
}
