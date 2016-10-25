import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

/**
 * Created by Winnah Gwen Acal on 10/24/2016.
 */
public class RPSLS extends Frame{
    private Button btnRPSLS;
    private Label lblPlayerScore;
    private Label lblComScore;
    private TextField txtPS;
    private TextField txtCS;
    private Label lblChoice;
    private CheckboxGroup choices;
    private TextArea result;

    private int scorePlayer = 0;
    private int scoreComputer = 0;

    public RPSLS(){
        setLayout(new FlowLayout());
        lblPlayerScore = new Label("Player's Score");
        lblComScore = new Label("Computer's Score");
        txtCS = new TextField("0", 20);
        txtCS.setEditable(false);
        txtPS = new TextField("0", 20);
        txtPS.setEditable(false);
        btnRPSLS = new Button("RockPaperScissorsLizardSpock");
        lblChoice = new Label("Your Choice:");
        CheckboxGroup choices = new CheckboxGroup();
        Checkbox rock = new Checkbox("Rock", choices, true);
        Checkbox paper = new Checkbox("Paper", choices, true);
        Checkbox scissors = new Checkbox("Scissors", choices, true);
        Checkbox lizard = new Checkbox("Lizard", choices, true);
        Checkbox spock = new Checkbox("Spock", choices, true);
        result = new TextArea("Results", 10, 20);
        result.setEditable(false);



        btnRPSLS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random rn = new Random();
                int rand = rn.nextInt(5) + 1;
                if (scoreComputer < 5 && scorePlayer < 5){
                    if (choices.getSelectedCheckbox().getLabel().equals("Rock")){
                        if (rand == 3){
                            scorePlayer++;
                            txtPS.setText(scorePlayer + "");
                            result.setText("Result:\nPlayer chose ROCK\nComputer chose Scissors\n\nPlayer win this round");
                        }else if (rand == 4){
                            scorePlayer++;
                            txtPS.setText(scorePlayer + "");
                            result.setText("Result:\nPlayer chose ROCK\nComputer chose Lizard\n\nPlayer win this round");
                        } else if(rand == 1){
                            result.setText("Result:\nPlayer chose ROCK\nComputer chose ROCK\n\nIt is a draw");
                        }else if(rand == 2){
                            scoreComputer++;
                            txtCS.setText(scoreComputer + "");
                            result.setText("Result:\nPlayer chose ROCK\nComputer chose Paper\n\nComputer win this round");
                        }else if(rand == 5){
                            scoreComputer++;
                            txtCS.setText(scoreComputer + "");
                            result.setText("Result:\nPlayer chose ROCK\nComputer chose SPOCK\n\nComputer win this round");
                        }
                    }else if (choices.getSelectedCheckbox().getLabel().equals("Paper")){
                        if (rand == 1){
                            scorePlayer++;
                            txtPS.setText(scorePlayer + "");
                            result.setText("Result:\nPlayer chose Paper\nComputer chose Rock\n\nPlayer win this round");
                        }else  if (rand == 5){
                            scorePlayer++;
                            txtPS.setText(scorePlayer + "");
                            result.setText("Result:\nPlayer chose Paper\nComputer chose Spock\n\nPlayer win this round");
                        }else if(rand == 2){
                            result.setText("Result:\nPlayer chose Paper\nComputer chose Paper\n\nIt is a draw");
                        }else if(rand == 3){
                            scoreComputer++;
                            txtCS.setText(scoreComputer + "");
                            result.setText("Result:\nPlayer chose Paper\nComputer chose Scissors\n\nComputer win this round");
                        }else if(rand == 4){
                            scoreComputer++;
                            txtCS.setText(scoreComputer + "");
                            result.setText("Result:\nPlayer chose Paper\nComputer chose Lizard\n\nComputer win this round");
                        }

                    }else if (choices.getSelectedCheckbox().getLabel().equals("Scissors")){
                        if (rand == 2){
                            scorePlayer++;
                            txtPS.setText(scorePlayer + "");
                            result.setText("Result:\nPlayer chose Scissors\nComputer chose Paper\n\nPlayer win this round");
                        }else if ( rand == 4){
                            scorePlayer++;
                            txtPS.setText(scorePlayer + "");
                            result.setText("Result:\nPlayer chose Scissors\nComputer chose Paper\n\nPlayer win this round");
                        }else if(rand == 3){
                            result.setText("Result:\nPlayer chose Scissors\nComputer chose Scissors\n\nIt is a draw");
                        }else if(rand == 1){
                            scoreComputer++;
                            txtCS.setText(scoreComputer + "");
                            result.setText("Result:\nPlayer chose Scissors\nComputer chose Rock\n\nComputer win this round");
                        }else if(rand == 5){
                            scoreComputer++;
                            txtCS.setText(scoreComputer + "");
                            result.setText("Result:\nPlayer chose Scissors\nComputer chose Spock\n\nComputer win this round");
                        }
                    }else if (choices.getSelectedCheckbox().getLabel().equals("Lizard")){
                        if (rand == 5){
                            scorePlayer++;
                            txtPS.setText(scorePlayer + "");
                            result.setText("Result:\nPlayer chose Lizard\nComputer chose Paper\n\nPlayer win this round");
                        }else  if (rand == 2){
                            scorePlayer++;
                            txtPS.setText(scorePlayer + "");
                            result.setText("Result:\nPlayer chose Lizard\nComputer chose Paper\n\nPlayer win this round");
                        }else if(rand == 4){
                            result.setText("Result:\nPlayer chose Lizard\nComputer chose Lizard\n\nIt is a draw");
                        }else if(rand == 1){
                            scoreComputer++;
                            txtCS.setText(scoreComputer + "");
                            result.setText("Result:\nPlayer chose Lizard\nComputer chose Spock\n\nComputer win this round");
                        }else if(rand == 3){
                            scoreComputer++;
                            txtCS.setText(scoreComputer + "");
                            result.setText("Result:\nPlayer chose Lizard\nComputer chose Spock\n\nComputer win this round");
                        }

                    }else if(choices.getSelectedCheckbox().getLabel().equals("Spock")) {
                        if (rand == 1) {
                            scorePlayer++;
                            txtPS.setText(scorePlayer + "");
                            result.setText("Result:\nPlayer chose Spock\nComputer chose Rock\n\nPlayer win this round");
                        } else if (rand == 3) {
                            scorePlayer++;
                            txtPS.setText(scorePlayer + "");
                            result.setText("Result:\nPlayer chose Spock\nComputer chose Scissors\n\nPlayer win this round");
                        } else if (rand == 5) {
                            result.setText("Result:\nPlayer chose Spock\nComputer chose Spock\n\nIt is a draw");
                        } else if (rand == 2) {
                            scoreComputer++;
                            txtCS.setText(scoreComputer + "");
                            result.setText("Result:\nPlayer chose Spock\nComputer chose Paper\n\nComputer win this round");
                        } else if (rand == 4) {
                            scoreComputer++;
                            txtCS.setText(scoreComputer + "");
                            result.setText("Result:\nPlayer chose Spock\nComputer chose Lizard\n\nComputer win this round");
                        }
                    }
                }else if (scorePlayer == 5){
                    gameOver(1);
                }else if (scoreComputer == 5){
                    gameOver(2);
                }


            }
        });

        add(lblChoice);
        add(rock);
        add(lizard);
        add(paper);
        add(scissors);
        add(spock);
        add(result);
        add(btnRPSLS);
        add(lblPlayerScore);
        add(txtPS);
        add(lblComScore);
        add(txtCS);

        setTitle("RockPaperScissorsLizardSpock");
        setSize(500, 400);
        setVisible(true);
    }


    public void gameOver(int win) {
        if (win == 1) {
            JOptionPane.showMessageDialog(this, "Player Win",
                    "Game Over", JOptionPane.YES_NO_OPTION);
        } else {
            JOptionPane.showMessageDialog(this, "Computer Win",
                    "Game Over", JOptionPane.YES_NO_OPTION);

        }
        setVisible(false);
        main(null);
    }
    public static void main(String[] args) {
        new RPSLS();
    }
}
