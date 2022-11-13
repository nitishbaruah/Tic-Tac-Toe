
import java.awt.Color;
import static java.awt.Color.white;
import static java.awt.Color.yellow;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author dilub
 */
public class Tic_tac_toe extends javax.swing.JFrame {

    /**
     * Creates new form Tic_tac_toe
     */
    private String turn= "O";
    private int Xcount=0;
    private int Ocount=0;
    private int total=0;
    
    private void Score()
    {
        ScoreX.setText(String.valueOf(Xcount));
        ScoreO.setText(String.valueOf(Ocount));
    }
    
    private void Winning(){
        String b1=Button1.getText();
        String b2=Button2.getText();
        String b3=Button3.getText();
        String b4=Button4.getText();
        String b5=Button5.getText();
        String b6=Button6.getText();
        String b7=Button7.getText();
        String b8=button8.getText();
        String b9=button9.getText();
        //String b1=Button1.getText();
        
        if(b1==("X") && b2==("X") && b3==("X")){
            Xcount++;
            Score();
            Button1.setBackground(yellow);
            Button2.setBackground(yellow);
            Button3.setBackground(yellow);
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            //xcount++;
            Button1.setEnabled(false);
            Button2.setEnabled(false);
            Button3.setEnabled(false);
        
            Button4.setEnabled(false);
            Button5.setEnabled(false);
            Button6.setEnabled(false);
        
            Button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            

        } else if(b4==("X") && b5==("X") && b6==("X")){
            Xcount++;
            Score();
            Button4.setBackground(yellow);
            Button5.setBackground(yellow);
            Button6.setBackground(yellow);
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            //xcount++;
            Button1.setEnabled(false);
            Button2.setEnabled(false);
            Button3.setEnabled(false);
        
            Button4.setEnabled(false);
            Button5.setEnabled(false);
            Button6.setEnabled(false);
        
            Button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            
        } else if(b7==("X") && b8==("X") && b9==("X")){
            Xcount++;
            Score();
            Button7.setBackground(yellow);
            button8.setBackground(yellow);
            button9.setBackground(yellow);
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            //xcount++;
            Button1.setEnabled(false);
            Button2.setEnabled(false);
            Button3.setEnabled(false);
        
            Button4.setEnabled(false);
            Button5.setEnabled(false);
            Button6.setEnabled(false);
        
            Button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            
        } else if(b1==("X") && b4==("X") && b7==("X")){
            Xcount++;
            Score();
            Button1.setBackground(yellow);
            Button4.setBackground(yellow);
            Button7.setBackground(yellow);
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            //xcount++;
            Button1.setEnabled(false);
            Button2.setEnabled(false);
            Button3.setEnabled(false);
        
            Button4.setEnabled(false);
            Button5.setEnabled(false);
            Button6.setEnabled(false);
        
            Button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
          
        } else if(b2==("X") && b5==("X") && b8==("X")){
            Xcount++;
            Score();
            Button2.setBackground(yellow);
            Button5.setBackground(yellow);
            button8.setBackground(yellow);
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            //xcount++;
            Button1.setEnabled(false);
            Button2.setEnabled(false);
            Button3.setEnabled(false);
        
            Button4.setEnabled(false);
            Button5.setEnabled(false);
            Button6.setEnabled(false);
        
            Button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
       
        } else if(b3==("X") && b6==("X") && b9==("X")){
            Xcount++;
            Score();
            Button3.setBackground(yellow);
            Button6.setBackground(yellow);
            button9.setBackground(yellow);
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            //xcount++;
            Button1.setEnabled(false);
            Button2.setEnabled(false);
            Button3.setEnabled(false);
        
            Button4.setEnabled(false);
            Button5.setEnabled(false);
            Button6.setEnabled(false);
        
            Button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            
        } else if(b1==("X") && b5==("X") && b9==("X")){
            Xcount++;
            Score();
            Button1.setBackground(yellow);
            Button5.setBackground(yellow);
            button9.setBackground(yellow);
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            //xcount++;
            Button1.setEnabled(false);
            Button2.setEnabled(false);
            Button3.setEnabled(false);
        
            Button4.setEnabled(false);
            Button5.setEnabled(false);
            Button6.setEnabled(false);
        
            Button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
        } else if(b3==("X") && b5==("X") && b7==("X")){
            Xcount++;
            Score();
            Button3.setBackground(yellow);
            Button5.setBackground(yellow);
            Button7.setBackground(yellow);
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            //xcount++;
            Button1.setEnabled(false);
            Button2.setEnabled(false);
            Button3.setEnabled(false);
        
            Button4.setEnabled(false);
            Button5.setEnabled(false);
            Button6.setEnabled(false);
        
            Button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
        } else if(b1==("O") && b2==("O") && b3==("O")){
            Ocount++;
            Score();
            Button1.setBackground(yellow);
            Button2.setBackground(yellow);
            Button3.setBackground(yellow);
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            //xcount++;
            Button1.setEnabled(false);
            Button2.setEnabled(false);
            Button3.setEnabled(false);
        
            Button4.setEnabled(false);
            Button5.setEnabled(false);
            Button6.setEnabled(false);
        
            Button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
        } else if(b4==("O") && b5==("O") && b6==("O")){
            Ocount++;
            Score();
            Button4.setBackground(yellow);
            Button5.setBackground(yellow);
            Button6.setBackground(yellow);
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            //xcount++;
            Button1.setEnabled(false);
            Button2.setEnabled(false);
            Button3.setEnabled(false);
        
            Button4.setEnabled(false);
            Button5.setEnabled(false);
            Button6.setEnabled(false);
        
            Button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
        } else if(b7==("O") && b8==("O") && b9==("O")){
            Ocount++;
            Score();
            Button7.setBackground(yellow);
            button8.setBackground(yellow);
            button9.setBackground(yellow);
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            //xcount++;
            Button1.setEnabled(false);
            Button2.setEnabled(false);
            Button3.setEnabled(false);
        
            Button4.setEnabled(false);
            Button5.setEnabled(false);
            Button6.setEnabled(false);
        
            Button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
        } else if(b1==("O") && b4==("O") && b7==("O")){
            Ocount++;
            Score();
            Button1.setBackground(yellow);
            Button4.setBackground(yellow);
            Button7.setBackground(yellow);
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            //xcount++;
            Button1.setEnabled(false);
            Button2.setEnabled(false);
            Button3.setEnabled(false);
        
            Button4.setEnabled(false);
            Button5.setEnabled(false);
            Button6.setEnabled(false);
        
            Button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
        } else if(b2==("O") && b5==("O") && b8==("O")){
            Ocount++;
            Score();
            Button2.setBackground(yellow);
            Button5.setBackground(yellow);
            button8.setBackground(yellow);
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            //xcount++;
            Button1.setEnabled(false);
            Button2.setEnabled(false);
            Button3.setEnabled(false);
        
            Button4.setEnabled(false);
            Button5.setEnabled(false);
            Button6.setEnabled(false);
        
            Button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
        } else if(b3==("O") && b6==("O") && b9==("O")){
            Ocount++;
            Score();
            Button3.setBackground(yellow);
            Button6.setBackground(yellow);
            button9.setBackground(yellow);
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            //xcount++;
            Button1.setEnabled(false);
            Button2.setEnabled(false);
            Button3.setEnabled(false);
        
            Button4.setEnabled(false);
            Button5.setEnabled(false);
            Button6.setEnabled(false);
        
            Button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
        } else if(b1==("O") && b5==("O") && b9==("O")){
            Ocount++;
            Score();
            Button1.setBackground(yellow);
            Button5.setBackground(yellow);
            button9.setBackground(yellow);
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            //xcount++;
            Button1.setEnabled(false);
            Button2.setEnabled(false);
            Button3.setEnabled(false);
        
            Button4.setEnabled(false);
            Button5.setEnabled(false);
            Button6.setEnabled(false);
        
            Button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
        } else if(b3==("O") && b5==("O") && b7==("O")){
            Ocount++;
            Score();
            Button3.setBackground(yellow);
            Button5.setBackground(yellow);
            Button7.setBackground(yellow);
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            //xcount++;
            Button1.setEnabled(false);
            Button2.setEnabled(false);
            Button3.setEnabled(false);
        
            Button4.setEnabled(false);
            Button5.setEnabled(false);
            Button6.setEnabled(false);
        
            Button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
        } else if( total==9){
            JOptionPane.showMessageDialog(this ,"Match Draw","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE );
            Button1.setEnabled(false);
            Button2.setEnabled(false);
            Button3.setEnabled(false);
        
            Button4.setEnabled(false);
            Button5.setEnabled(false);
            Button6.setEnabled(false);
        
            Button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
        }
        
        
        
    }
    
    
    public Tic_tac_toe() {
        initComponents();
    }
    
    private void ChoosePlayer(){
        if(turn.equalsIgnoreCase("X")){
            turn="O";
        } else{
            turn= "X";
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Button1 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        Button7 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        ButtonReset = new javax.swing.JButton();
        ButtonExit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ScoreO = new javax.swing.JLabel();
        ScoreX = new javax.swing.JLabel();
        newgame = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIC TAC TOE GAME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        Button1.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        Button2.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        Button3.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        Button4.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });

        Button5.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });

        Button6.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });

        Button7.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });

        button8.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        button9.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });

        ButtonReset.setBackground(new java.awt.Color(102, 255, 102));
        ButtonReset.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        ButtonReset.setText("RESET");
        ButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonResetActionPerformed(evt);
            }
        });

        ButtonExit.setBackground(new java.awt.Color(255, 51, 0));
        ButtonExit.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        ButtonExit.setText("EXIT");
        ButtonExit.setRolloverEnabled(false);
        ButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExitActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel2.setText("SCOREBOARD");

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        jLabel3.setText("PLAYER X :");

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        jLabel4.setText("PLAYER O :");

        ScoreO.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        ScoreO.setText("0");

        ScoreX.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        ScoreX.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(31, 31, 31))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(30, 30, 30)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ScoreX, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                            .addComponent(ScoreO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ScoreX))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ScoreO))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        newgame.setBackground(new java.awt.Color(204, 204, 204));
        newgame.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        newgame.setText("NEW GAME");
        newgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newgameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Button7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(Button1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Button2, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(Button5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(ButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(46, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(newgame)
                        .addGap(80, 80, 80))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ButtonReset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(newgame))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        // TODO add your handling code here:
        
        if(Button1.getText()!=""){
            return;
        }
        Button1.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            Button1.setForeground(Color.red);
        }else {
            Button1.setForeground(Color.magenta);
        }
        total++;
        Winning();
        ChoosePlayer();
        
        
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        // TODO add your handling code here:
        if(Button5.getText()!=""){
            return;
        }
        Button5.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            Button5.setForeground(Color.red);
        }else {
            Button5.setForeground(Color.magenta);
        }
        total++;
        Winning();
        ChoosePlayer();
    }//GEN-LAST:event_Button5ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        // TODO add your handling code here:
        if(button8.getText()!=""){
            return;
        }
        button8.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            button8.setForeground(Color.red);
        }else {
            button8.setForeground(Color.magenta);
        }
        total++;
        Winning();
        ChoosePlayer();
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        // TODO add your handling code here:
        if(button9.getText()!=""){
            return;
        }
        button9.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            button9.setForeground(Color.red);
        }else {
            button9.setForeground(Color.magenta);
        }
        total++;
        Winning();
        ChoosePlayer();
    }//GEN-LAST:event_button9ActionPerformed

    private void ButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExitActionPerformed
        // TODO add your handling code here:
        JFrame frame= new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to Exit",
        "Tic Tac Toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_ButtonExitActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        // TODO add your handling code here:
        if(Button2.getText()!=""){
            return;
        }
        Button2.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            Button2.setForeground(Color.red);
        }else {
            Button2.setForeground(Color.magenta);
        }
        total++;
        Winning();
        ChoosePlayer();
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        // TODO add your handling code here:
        if(Button3.getText()!=""){
            return;
        }
        Button3.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            Button3.setForeground(Color.red);
        }else {
            Button3.setForeground(Color.magenta);
        }
        total++;
        Winning();
        ChoosePlayer();
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        // TODO add your handling code here:
        if(Button4.getText()!=""){
            return;
        }
        Button4.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            Button4.setForeground(Color.red);
        }else {
            Button4.setForeground(Color.magenta);
        }
        total++;
        Winning();
        ChoosePlayer();
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        // TODO add your handling code here:
        if(Button6.getText()!=""){
            return;
        }
        Button6.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            Button6.setForeground(Color.red);
        }else {
            Button6.setForeground(Color.magenta);
        }
        total++;
        Winning();
        ChoosePlayer();
    }//GEN-LAST:event_Button6ActionPerformed

    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button7ActionPerformed
        // TODO add your handling code here:
        if(Button7.getText()!=""){
            return;
        }
        Button7.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            Button7.setForeground(Color.red);
        }else {
            Button7.setForeground(Color.magenta);
        }
        total++;
        Winning();
        ChoosePlayer();
    }//GEN-LAST:event_Button7ActionPerformed

    private void ButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonResetActionPerformed
        // TODO add your handling code here:
        Button1.setText("");
        Button2.setText("");
        Button3.setText("");
        
        Button4.setText("");
        Button5.setText("");
        Button6.setText("");
        
        Button7.setText("");
        button8.setText("");
        button9.setText("");
        
        
        Button1.setBackground(white);
        Button2.setBackground(white);
        Button3.setBackground(white);
        
        Button4.setBackground(white);
        Button5.setBackground(white);
        Button6.setBackground(white);
        
        Button7.setBackground(white);
        button8.setBackground(white);
        button9.setBackground(white);
        
        total=0;
        Button1.setEnabled(true);
            Button2.setEnabled(true);
            Button3.setEnabled(true);
        
            Button4.setEnabled(true);
            Button5.setEnabled(true);
            Button6.setEnabled(true);
        
            Button7.setEnabled(true);
            button8.setEnabled(true);
            button9.setEnabled(true);
    }//GEN-LAST:event_ButtonResetActionPerformed

    private void newgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newgameActionPerformed
        // TODO add your handling code here:
        Button1.setText("");
        Button2.setText("");
        Button3.setText("");
        
        Button4.setText("");
        Button5.setText("");
        Button6.setText("");
        
        Button7.setText("");
        button8.setText("");
        button9.setText("");
        
        
        Button1.setBackground(white);
        Button2.setBackground(white);
        Button3.setBackground(white);
        
        Button4.setBackground(white);
        Button5.setBackground(white);
        Button6.setBackground(white);
        
        Button7.setBackground(white);
        button8.setBackground(white);
        button9.setBackground(white);
        
        total=0;
        Xcount=0;
        Ocount=0;
        Score();
        Button1.setEnabled(true);
            Button2.setEnabled(true);
            Button3.setEnabled(true);
        
            Button4.setEnabled(true);
            Button5.setEnabled(true);
            Button6.setEnabled(true);
        
            Button7.setEnabled(true);
            button8.setEnabled(true);
            button9.setEnabled(true);
    }//GEN-LAST:event_newgameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tic_tac_toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tic_tac_toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tic_tac_toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tic_tac_toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tic_tac_toe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button7;
    private javax.swing.JButton ButtonExit;
    private javax.swing.JButton ButtonReset;
    private javax.swing.JLabel ScoreO;
    private javax.swing.JLabel ScoreX;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton newgame;
    // End of variables declaration//GEN-END:variables
}
