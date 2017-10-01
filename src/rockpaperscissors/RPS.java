package rockpaperscissors;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

public class RPS extends JFrame {

    private String[] computerChoices;
    private Random random = new Random();

    public RPS(String[] computerChoices) {
        initComponents();
        this.computerChoices = computerChoices;
    }


    public String play(String computerChoice, String playerChoice) {

        if (computerChoice.contains(playerChoice)) {
            output.setText("Its a Draw!");
        } else if (playerChoice.contains("s") && computerChoice.contains("p") || playerChoice.contains("ro") && computerChoice.contains("s") || playerChoice.contains("p") && computerChoice.contains("ro")) {
            output.setText("You Win!");
        } else {
            output.setText("You Lose!");
        }
        return String.format("You chose %s and the computer chose %s!",playerChoice,computerChoice);

    }

    private void initComponents() {


        paper = new JButton();
        rock = new JButton();
        scissors = new JButton();
        output = new JTextField();


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        paper.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        paper.setText("Paper");
        paper.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                playerSelectionActionPerformed("paper");
            }
        });

        rock.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        rock.setText("Rock");
        rock.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                playerSelectionActionPerformed("rock");
            }
        });

        scissors.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        scissors.setText("Scissors");
        scissors.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                playerSelectionActionPerformed("scissors");
            }
        });

        output.setEditable(false);
        output.setFont(new Font("Tahoma", 1, 24)); // NOI18N
        output.setHorizontalAlignment(javax.swing.JTextField.CENTER);


        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(output)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rock, GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(paper, GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(scissors, GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(output, GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(paper, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(scissors, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(rock, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }

    private void playerSelectionActionPerformed(String playerChoice) {
        JOptionPane.showMessageDialog(null, play(computerChoices[random.nextInt(computerChoices.length)],playerChoice));
    }

    public String[] getComputerChoices() {
        return computerChoices;
    }

    private javax.swing.JButton paper;
    private javax.swing.JButton rock;
    private javax.swing.JButton scissors;

    public String getOutput() {
        return output.getText();
    }

    private javax.swing.JTextField output;
}
