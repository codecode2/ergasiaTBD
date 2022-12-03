
 
 
 
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Chameleon
 */
public class movieInsertion extends javax.swing.JFrame {

    
    static String driverClassName="oracle.jdbc.OracleDriver";
    static String url = "jdbc:oracle:thin:@192.168.6.21:1521/dblabs";
    static Connection dbConnection = null;
    static String username = "it175093";
    static String passwd = "Powerteam1515";
    static Statement statement =null; 
    static PreparedStatement insertMovie = null;
    static PreparedStatement insertCombo = null;
    
    static ResultSet rs   = null;
    public final int javaid3 = 0; 
    public int changeid3 ;
    String myCompany[]=new String[30];
    String myCustomers[]=new String[30];
    String firstnameout[]=new String [30];
    String namesout[]=new String [30];
    String phonesout[]=new String [30];
    
     
     
    public movieInsertion() {
        
        
        initComponents();
        
         centreWindow(this);
         myconnection();
         mylist();
    }

    
     void myconnection()
      {
         try{
             Class.forName(driverClassName);
                
         } catch(ClassNotFoundException ex) {}
         
         try{
                dbConnection= DriverManager.getConnection(url,username,passwd);                
               String insertString= "insert into MOVIE  (id3,moviename,kindmovie,producer,duration) values(?,?,?,?,?)";
                insertMovie= dbConnection.prepareStatement(insertString);
                
         
         } catch(SQLException ex) 
         {
            System.out.print("\n -- SQL Exception -- \n" + ex.getMessage());
            ex=ex.getNextException();
         
         }         
   }    
     
     void mylist()
     {
     
         int i =0;
         String namesCO = "select coname from company";
         try 
         {
             statement = dbConnection.createStatement();
             rs= statement.executeQuery(namesCO);
             while(rs.next())
             {
                  myCompany[i]=rs.getString("coname");
                  i++;
             }
         } 
         catch(SQLException ex)
          {
              while(ex !=null)
              {
                  System.out.println("Message: "+ex.getMessage());
                  ex=ex.getNextException();
              }   
          }
         
         combocompany.addItem("");
         for(int y=0;y<i;y++)
            {
             combocompany.addItem(myCompany[y]);
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

        jPanel1 = new javax.swing.JPanel();
        BackToMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        movieProducer = new javax.swing.JTextField();
        movieName = new javax.swing.JTextField();
        movieKind = new javax.swing.JTextField();
        duration = new javax.swing.JTextField();
        comboCustomer = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        combocompany = new javax.swing.JComboBox<>();
        duration1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(175, 219, 238));
        jPanel1.setFocusCycleRoot(true);

        BackToMenu.setText("Main Menu");
        BackToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenuActionPerformed(evt);
            }
        });

        jLabel1.setText("Select Customer of the company");

        jLabel2.setText("Kind of movie");

        jLabel3.setText("Producer name");

        jLabel4.setText("Duration");

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        movieKind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movieKindActionPerformed(evt);
            }
        });

        duration.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                durationFocusLost(evt);
            }
        });

        comboCustomer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));

        jLabel5.setText("Select Company");

        jLabel6.setText("Name of movie");

        combocompany.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        combocompany.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combocompanyItemStateChanged(evt);
            }
        });
        combocompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combocompanyActionPerformed(evt);
            }
        });

        duration1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duration1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("h");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("m");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 162, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comboCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combocompany, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(movieProducer, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(movieKind, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(movieName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36)
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(duration1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(BackToMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(BackToMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combocompany, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(movieName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(movieKind, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(movieProducer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(duration1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(90, 90, 90)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenuActionPerformed
        MainMenu StartPage = new MainMenu();
                StartPage.setVisible(true);       
                     this.hide();
                
                
    }//GEN-LAST:event_BackToMenuActionPerformed

    private void movieKindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movieKindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_movieKindActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
                
        String compan=String.valueOf(combocompany.getSelectedItem()) ;
        String custom=String.valueOf(comboCustomer.getSelectedItem()) ;
        
        String s="";
        String name= movieName.getText();
        String kind= movieKind.getText();
        String producer = movieProducer.getText();
        String durati=duration.getText();
        String duration2=duration1.getText();
         String durationm=durati+"h"+" "+duration2+"m";
        boolean appear=false;
         
        
        if(compan.equals("null") || custom.equals("null")){
            
             JOptionPane.showMessageDialog(jPanel1, "Make an option"); 
        }  
        else
        {
              try{
                     
                  
                   statement = dbConnection.createStatement();
                     String selectString ="select * from movie order by id3 desc FETCH FIRST 1 ROWS ONLY";
                     rs=statement.executeQuery(selectString);
                        
                     
                     
                     while(rs.next())
                     {
                        int counter = rs.getInt("ID3");                     
                        changeid3= counter+1;
                     }
                     
                      insertMovie.setInt(1,changeid3);  
                      insertMovie.setString(2,name);
                      insertMovie.setString(3,kind);
                      insertMovie.setString(4,producer);
                      insertMovie.setString(5,durationm);
                      insertMovie.executeUpdate(); 
                      
                      CallableStatement  insertmoviepacket= dbConnection.prepareCall("{call  insertentry(?,?,?)}"); 
                      
                      insertmoviepacket.setString(1,compan );
                      insertmoviepacket.setString(2,custom );
                      insertmoviepacket.setString(3,name );
                      insertmoviepacket.executeUpdate();
                      
                      statement.close();
                      dbConnection.close();

                } catch(SQLException ex)
                 {
                    System.out.println("");
                    while(ex != null)
                    {
                    System.out.println("\n -- SQL Exception -- \n" + ex.getMessage());
                    ex=ex.getNextException();
                    appear=  true;
                    }
                   
                  }  
           
              if (appear==false){
       moviePop1 moviepop1 = new moviePop1();
       moviepop1.show();
       this.hide();
              }else
              {
               JOptionPane.showMessageDialog(jPanel1, "Something go wrong , try again please."); 
             
               
              }
           }      
    }//GEN-LAST:event_submitActionPerformed
 
    private void combocompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combocompanyActionPerformed
        
        
        
        
    }//GEN-LAST:event_combocompanyActionPerformed

    private void combocompanyItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combocompanyItemStateChanged
               int i=0;
        String found = String.valueOf( combocompany.getSelectedItem());
            
           comboCustomer.removeAllItems();
                   
             if(found.equals("null"))
             {
                 firstnameout[0]="";
                 namesout[0]="";
                 phonesout[0]="";
             }
             else{  
          
               
              try{
                 
                    statement = dbConnection.createStatement();
                   String selectString ="select firstname,lastname,phone from customer where company='" +found+"'";
                     
                     rs=statement.executeQuery(selectString);

                     while(rs.next()){
                         
                        firstnameout[i]= rs.getString("FIRSTNAME");                         
                        namesout[i]= rs.getString("LASTNAME");
                        phonesout[i]= rs.getString("PHONE");                        
                          i++; 
                      
                      } 
                    
                      
                    
                } catch(SQLException ex)
                 {
                    System.out.println("");
                    while(ex != null)
                    {
                    System.out.println("\n -- SQL Exception -- \n" + ex.getMessage());
                    ex=ex.getNextException();

                    }
                   
                  }  
              
             }  
            
               for(int y=0;y<i;y++)
            {
               
             comboCustomer.addItem(firstnameout[y]+"  "+namesout[y]+"  "+phonesout[y]); 
          
            }
        
         
    }//GEN-LAST:event_combocompanyItemStateChanged

    private void durationFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_durationFocusLost
                String dur=duration.getText().trim();
        
        
        if (!dur.matches("[ 0-9 ]*") )
       
       {
       
                 JOptionPane.showMessageDialog(jPanel1, "Something go wrong, please try again"); 
                   duration.setText("");
       }
    
        
        
    }//GEN-LAST:event_durationFocusLost

    private void duration1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duration1ActionPerformed
                String dur2=duration1.getText().trim();
        
        
        if (!dur2.matches("[ 0-9 ]*") )
       
       {
       
                 JOptionPane.showMessageDialog(jPanel1, "Something go wrong, please try again"); 
                   duration1.setText("");
       }
    
        
        
        
        
    }//GEN-LAST:event_duration1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewCustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewCustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewCustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewCustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new NewCustomerMenu().setVisible(true);
            }
        });
    }
 public static void centreWindow(Window frame) {
         Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();  
    int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
    int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
    frame.setLocation(x, y);
        } 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMenu;
    private javax.swing.JComboBox<String> comboCustomer;
    private javax.swing.JComboBox<String> combocompany;
    private javax.swing.JTextField duration;
    private javax.swing.JTextField duration1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField movieKind;
    private javax.swing.JTextField movieName;
    private javax.swing.JTextField movieProducer;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
