package tictactoe;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToeStructure implements ActionListener{
    private JFrame Poopy = new JFrame("Tic-Tac-Toe");
    private JFrame reset = new JFrame("Reset");
    private JPanel extra = new JPanel();
    private JButton button1 = new JButton("");
    private JButton button2 = new JButton("");
    private JButton button3 = new JButton("");
    private JButton button4 = new JButton("");
    private JButton button5 = new JButton("");
    private JButton button6 = new JButton("");
    private JButton button7 = new JButton("");
    private JButton button8 = new JButton("");
    private JButton button9 = new JButton("");
    private JButton button10 = new JButton("");
    private String letter = "";
    Font re = new Font("Serif", Font.BOLD, 100);
    private int count = 0;
    private boolean win = false;

    public TicTacToeStructure(){
        /*Create Window*/
        Poopy.setSize(700,700);
        Poopy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Poopy.setLayout(new GridLayout(3,3));
        reset.setSize(200,200);
        reset.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /*Add Buttons To The Window*/
        Poopy.setBackground(Color.red);
        Poopy.add(button1);
        Poopy.add(button2);
        Poopy.add(button3);
        Poopy.add(button4);
        Poopy.add(button5);
        Poopy.add(button6);
        Poopy.add(button7);
        Poopy.add(button8);
        Poopy.add(button9);
        button10.setText("Reset");
        reset.add(button10);

        /*Add The Action Listener To The Buttons*/
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);


        //Colors to the buttons
         button1.setBackground(Color.red);
         button2.setBackground(Color.red);
         button3.setBackground(Color.red);
         button4.setBackground(Color.red);
         button5.setBackground(Color.red);
         button6.setBackground(Color.red);
         button7.setBackground(Color.red);
         button8.setBackground(Color.red);
         button9.setBackground(Color.red);
         button10.setBackground(Color.red);

        //Make The Window Visible
        Poopy.setVisible(true);
        Poopy.setLocation(220,25);
        reset.setVisible(true);
        reset.setLocation(920, 25);
        
        button10.addMouseListener(new MouseAdapter (){
                public void mouseClicked(MouseEvent e){
                        button1.setText("");
                        button1.setEnabled(true);
                        button2.setText("");
                        button2.setEnabled(true);
                        button3.setText("");
                        button3.setEnabled(true);
                        button4.setText("");
                        button4.setEnabled(true);
                        button5.setText("");
                        button5.setEnabled(true);
                        button6.setText("");
                        button6.setEnabled(true);
                        button7.setText("");
                        button7.setEnabled(true);
                        button8.setText("");
                        button8.setEnabled(true);
                        button9.setText("");
                        button9.setEnabled(true);
                        count = 0;
                }
            });
        }   

public void actionPerformed(ActionEvent a) {
    count++;

    /*Esto indica el turno de la persona*/
    if(count == 1 || count == 3 || count == 5 || count == 7 || count == 9){

        letter = "X";
    } else if(count == 2 || count == 4 || count == 6 || count == 8 || count == 10){

        letter = "O";
    }

    //X and Y in the buttons
    if(a.getSource() == button1){
        button1.setText(letter);
        button1.setFont(re);
        button1.setEnabled(false);
    } else if(a.getSource() == button2){
        button2.setText(letter);
        button2.setFont(re);
        button2.setEnabled(false);
    } else if(a.getSource() == button3){
        button3.setText(letter);
        button3.setFont(re);
        button3.setEnabled(false);
    } else if(a.getSource() == button4){
        button4.setText(letter);
        button4.setFont(re);
        button4.setEnabled(false);
    } else if(a.getSource() == button5){
        button5.setText(letter);
        button5.setFont(re);
        button5.setEnabled(false);
    } else if(a.getSource() == button6){
        button6.setText(letter);
        button6.setFont(re);
        button6.setEnabled(false);
    } else if(a.getSource() == button7){
        button7.setText(letter);
        button7.setFont(re);
        button7.setEnabled(false);
    } else if(a.getSource() == button8){
        button8.setText(letter);
        button8.setFont(re);
        button8.setEnabled(false);
    } else if(a.getSource() == button9){
        button9.setText(letter);
        button9.setFont(re);
        button9.setEnabled(false);
    }

    /*Determine who won*/
    //horizontal wins
    if( button1.getText() == button2.getText() && button2.getText() == button3.getText() && button1.getText() != ""){
        win = true;
        }
    else if(button4.getText() == button5.getText() && button5.getText() == button6.getText() && button4.getText() != ""){
        win = true;
        }
    else if(button7.getText() == button8.getText() && button8.getText() == button9.getText() && button7.getText() != ""){
        win = true;
        }

    //vertical wins
    else if(button1.getText() == button4.getText() && button4.getText() == button7.getText() && button1.getText() != ""){
        win = true;
        }
    else if(button2.getText() == button5.getText() && button5.getText() == button8.getText() && button2.getText() != ""){
        win = true;
        }
    else if(button3.getText() == button6.getText() && button6.getText() == button9.getText() && button3.getText() != ""){
        win = true;
        }

    //diagonal wins
    else if(button1.getText() == button5.getText() && button5.getText() == button9.getText() && button1.getText() != ""){
        win = true;
        }
    else if(button3.getText() == button5.getText() && button5.getText() == button7.getText() && button3.getText() != ""){
        win = true;
        }
    else {
        win = false;
        }

    /*Show a dialog if someone wins or the game is tie*/
    if(win == true){
        JOptionPane.showMessageDialog(null, letter + " Wins!");
        } else if(count == 9 && win == false){
        JOptionPane.showMessageDialog(null, " Tie!");
        }
    }
}

