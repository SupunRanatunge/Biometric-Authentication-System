
package my.login;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Person extends javax.swing.JFrame {


    public static long startingPoint;
    public static long keyStroke1;
    List<Long> alist = new ArrayList<>();
    List<Long> blist = new ArrayList<>();
    List<Long> clist = new ArrayList<>();
    List<Long> dlist = new ArrayList<>();
    List<Long> elist = new ArrayList<>();
    List<Long> flist = new ArrayList<>();
    List<Long> glist = new ArrayList<>();
    List<Long> hlist = new ArrayList<>();
    
    public long period;
    public static Connection myConn = null;
    public static Statement myStat  = null;
    public static ResultSet myRs = null;
    public static ResultSet myQuery1 = null;
    public static PreparedStatement pStat = null;
        
    public static String user = "root";
    public static String pass = null;
    
    public Person() {
        initComponents();
        this.setLocationRelativeTo(null); //center login form on the screen
    }
    
    public void writeToDatabase(String ID,String name,long letter1,long letter2,long letter3,long letter4,long letter5,long letter6,long letter7){
        try{
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/people", user, pass);
            
            myStat = myConn.createStatement();
            myStat.executeUpdate("INSERT INTO person VALUES('"+ID+"','"+name+"','"+letter1+"','"+letter2+"','"+letter3+"','"+letter4+"','"+letter5+"','"+letter6+"','"+letter7+"')");
            JOptionPane.showMessageDialog(null,"You have successfully signed up");
        }catch(Exception e){                                                                //write to the database
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"That ID is already in use");
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonSignUp = new javax.swing.JButton();
        jButtonLogin = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextID = new javax.swing.JTextField();
        jTextName = new javax.swing.JTextField();
        jTextElephant1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextElephant2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextElephant3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText(" ");

        jLabel2.setText("Name   :");

        jLabel3.setText("elephant         :");

        jButtonSignUp.setText("Sign up");
        jButtonSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSignUpMouseClicked(evt);
            }
        });

        jButtonLogin.setText("Log in");
        jButtonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLoginMouseClicked(evt);
            }
        });

        jLabel8.setText("     ID   :");

        jTextElephant1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextElephant1KeyPressed(evt);
            }
        });

        jLabel9.setText("Write the word Elephant WITHOUT making any mistakes!!!");

        jButton2.setText("Exit");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel4.setText("elephant         :");

        jTextElephant2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextElephant2KeyPressed(evt);
            }
        });

        jLabel5.setText("elephant         :");

        jTextElephant3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextElephant3KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1))
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextID, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(jButtonSignUp))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(25, 25, 25)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextElephant1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                            .addComponent(jTextElephant2)
                                            .addComponent(jTextElephant3))))
                                .addGap(0, 153, Short.MAX_VALUE)))
                        .addGap(92, 92, 92))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8)
                    .addComponent(jTextID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextElephant1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextElephant2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(65, 65, 65))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextElephant3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSignUp)
                    .addComponent(jButtonLogin))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButtonSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSignUpMouseClicked
                                                                                                     // sign up button
      if(!alist.isEmpty()&& alist.size()==8 && !blist.isEmpty() && blist.size()==8 && !clist.isEmpty()&& clist.size()==8){
        
      
        Person man = new Person();
        
        for(int i=0;i<alist.size()-1;i++){
            period = alist.get(i+1)- alist.get(i);
            dlist.add(period);
            
        }
        for(int i=0;i<blist.size()-1;i++){
            period = blist.get(i+1)- blist.get(i);
            elist.add(period);
            
        }
        for(int i=0;i<clist.size()-1;i++){
            period = clist.get(i+1)- clist.get(i);
            flist.add(period);
            
        }
        for(int i=0;i<7;i++){
           glist.add((dlist.get(i)+elist.get(i)+flist.get(i))/3);
           System.out.println(glist);
        }
        


        man.writeToDatabase(jTextID.getText(),jTextName.getText(),glist.get(0),glist.get(1),glist.get(2),glist.get(3),glist.get(4),glist.get(5),glist.get(6));
        
    }//GEN-LAST:event_jButtonSignUpMouseClicked
      else{
         JOptionPane.showMessageDialog(null,"Fill all the three text boxes "); 
      }
    }
    private void jButtonLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLoginMouseClicked
        if(!alist.isEmpty()&& alist.size()==8 && !blist.isEmpty() && blist.size()==8 && !clist.isEmpty()&& clist.size()==8){
        
        for(int i=0;i<alist.size()-1;i++){
            period = alist.get(i+1)- alist.get(i);                                                  //login button
            dlist.add(period);
        }
        for(int i=0;i<blist.size()-1;i++){
            period = blist.get(i+1)- blist.get(i);                                                  
            elist.add(period);
        }
        for(int i=0;i<clist.size()-1;i++){
            period = clist.get(i+1)- clist.get(i);                                                  
            flist.add(period);
        }
        
        for(int i=0;i<7;i++){
           hlist.add((dlist.get(i)+elist.get(i)+flist.get(i))/3);
           System.out.println(hlist);
        }

        try{
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/people", user, pass);
            pStat = myConn.prepareStatement("SELECT * FROM person WHERE ID = ? AND name = ?");
            pStat.setString(1,jTextID.getText());
            pStat.setString(2, jTextName.getText());
            System.out.println(jTextID.getText());
            myQuery1 = pStat.executeQuery();
            
            
            
            if(myQuery1.next()){
                
                
                if(((Long.parseLong(myQuery1.getString("letter1"))-hlist.get(0))< 60000000)&&((Long.parseLong(myQuery1.getString("letter2"))-hlist.get(1))< 60000000)){
                    System.out.println("Hello "+jTextName.getText()+" you are logged in" );
                    JOptionPane.showMessageDialog(null,"you have logged in");
                }
                System.out.println(dlist.get(0));
                pStat.close();
                System.out.println(myQuery1.next());
            }
            
            
            
            
        }catch(Exception e){
            System.out.println(e);
        }
        }else{
            JOptionPane.showMessageDialog(null,"Fill all the three text boxes "); 
        }
    }//GEN-LAST:event_jButtonLoginMouseClicked

    private void jTextElephant1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextElephant1KeyPressed
        keyStroke1 = System.nanoTime();
        alist.add(keyStroke1);                                                               //elephant key 1
        if(alist.size()>8){
              JOptionPane.showMessageDialog(null,"You entered wrong letters. Clear and let's go again");   
              alist.clear();  
              jTextElephant1.setText(" "); 
              System.out.println(alist);                                                        
        }
        
        
    }//GEN-LAST:event_jTextElephant1KeyPressed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        System.exit(0);                                                                     //exit button
    }//GEN-LAST:event_jButton2MouseClicked

    private void jTextElephant2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextElephant2KeyPressed
        keyStroke1 = System.nanoTime();
        blist.add(keyStroke1);
        if(blist.size()>8){                                                                  // elephant key 2
              JOptionPane.showMessageDialog(null,"You entered wrong letters. Clear and let's go again");   
              blist.clear();                                                                     
              jTextElephant2.setText(" "); 
              System.out.println(blist);                                                       
        }                                                                                   
    }//GEN-LAST:event_jTextElephant2KeyPressed

    private void jTextElephant3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextElephant3KeyPressed
        keyStroke1 = System.nanoTime();
        clist.add(keyStroke1);
        if(clist.size()>8){
              JOptionPane.showMessageDialog(null,"You entered wrong letters. Clear and let's go again");  
              clist.clear();  
              jTextElephant3.setText(" "); 
              System.out.println(clist); 
        }                                                                                   // elephant key 3
    }//GEN-LAST:event_jTextElephant3KeyPressed
  
    
    
    
    
    
    
    
    public static void main(String args[]) throws SQLException{
       
        
        
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Person.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Person.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Person.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Person.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Person().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextElephant1;
    private javax.swing.JTextField jTextElephant2;
    private javax.swing.JTextField jTextElephant3;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextName;
    // End of variables declaration//GEN-END:variables
}
