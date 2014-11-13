import javax.swing.ImageIcon;
import java.net.URL;

public class CrapsGUI extends javax.swing.JFrame {
    Craps game;
    boolean newgame;
    int money;
    
    //Create a new game and set money to 100
    public CrapsGUI() {
        initComponents(); 
        game = new Craps();
        txtgame.setEditable(false);
        newgame=true;
        money=100;
        txtgame.setText("Welcome to Craps, Click Roll to Start a Game");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnroll = new javax.swing.JButton();
        lbldie1 = new javax.swing.JLabel();
        lbldie2 = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        lblmoney = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtgame = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnroll.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnroll.setText("Roll Die");
        btnroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrollActionPerformed(evt);
            }
        });

        lbldie1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbldie2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbltotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblmoney.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtgame.setColumns(20);
        txtgame.setRows(5);
        jScrollPane1.setViewportView(txtgame);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel1.setText("Money Total:");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel2.setText("Roll Total:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnroll)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbldie1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbldie2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblmoney, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnroll))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbldie1, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbldie2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbltotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblmoney, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//When btnroll is clicked, roll dice and return Dice pictures
    private void btnrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrollActionPerformed
        game.roll();
        lbldie1.setIcon(game.getDicepic(1));
        lbldie2.setIcon(game.getDicepic(2));
        //If a new game begins, subtract $5 and return value.
        if(newgame){
            txtgame.append("\nNew Game\n-----------------------------\nYou rolled a:" +game.getTotal());
            newgame=false;
            money-=5;
            lblmoney.setText("$" +money);
        } 
        //Return dice roll
        else 
            txtgame.append("\n-----------------------------\nYou rolled a:" +game.getTotal());
            
        lbltotal.setText(""+game.getTotal());
        //Check to see if the user has won.
        if (game.hasWon()){
            txtgame.append("\nYou Won.\n Click Roll to Start a New Game.");
            game = new Craps();
            newgame= true;
            money+=15;
            lblmoney.setText("$"+money);
        } 
        //Else if
        else if (game.hasLost()){
            txtgame.append("\nYou Lost\nClick Roll to Start a New Game");
            game = new Craps();
            newgame = true;
            
    } 
        //Else
        else{
            txtgame.append("\nThe Game Continues");
        } 
        //Ensure whether or not the user has any money left
        if (money<=0){
            btnroll.setEnabled(false);
            txtgame.append("\nYou No Money Left\nYou Lose");
        }
           
       
    }//GEN-LAST:event_btnrollActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrapsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnroll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbldie1;
    private javax.swing.JLabel lbldie2;
    private javax.swing.JLabel lblmoney;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JTextArea txtgame;
    // End of variables declaration//GEN-END:variables
}
