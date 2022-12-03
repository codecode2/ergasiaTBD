
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.sql.Types;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.DefaultListModel;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;
 


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Chameleon
 */
public class logfile extends javax.swing.JFrame {

       static String driverClassName="oracle.jdbc.OracleDriver";
    static String url = "jdbc:oracle:thin:@192.168.6.21:1521/dblabs";
    static Connection dbConnection = null;
    static Connection dbConnection2 = null;
    static String username = "it175093";
    static String passwd = "Powerteam1515";
    static Statement statement =null;
    static ResultSet rs=null;
     static PreparedStatement  insertonList =null;
    static String value1;
    static String value2;
    static String value3;
    static String value4;
    static String value5;
    static String value6;
    static String value7;
    static String value8;
    static String value9;
    static String value10;
   


    
    public logfile() {
        
        
        initComponents();
        
         centreWindow(this);
         makelist();
         
    }

    
    void makelist()
    {
         DefaultListModel mylist =new DefaultListModel();
     try{
             Class.forName(driverClassName);
                
         } catch(ClassNotFoundException ex) {}
         
         try{
                 
            
             
             
                dbConnection2= DriverManager.getConnection(url,username,passwd); 
                statement = dbConnection2.createStatement();

                String selectString = "select * from logfiletable order by logid";
                  
                
               rs=statement.executeQuery(selectString);
               
                
               while(rs.next()){
               
             value1 = rs.getString("logid");
             value2 = rs.getString("valueaction");
             value3 = rs.getString("valuetable");
             value4 = rs.getString("tablesid");
             value5 = rs.getString("value1");
             value6 = rs.getString("value2");
             value7 = rs.getString("value3");
             value8 = rs.getString("value4");
             value9 = rs.getString("value5");
             value10 = rs.getString("value7");
             
              
             
              if (value1==null)
              {
              
                  value1=" ";
              }
              if(value2==null)
              {
              
                   value2=" ";
              
              }
              if(value3==null || value3.equals("-") || value3.equals("null")|| value3.equals(""))
              {
              
                   value3=" ";
              
              }
              if(value4==null  || value4.equals("-")|| value4.equals("null")|| value4.equals(""))
              {
              
                   value4=" ";
              
              }
              if(value5==null  || value5.equals("-") || value5.equals("null")|| value5.equals(""))
              {
              
                   value5=" ";
              
              }
              if(value6==null  || value6.equals("-") || value6.equals("null") || value6.equals(""))
              {
              
                   value6=" ";
              
              }
              if(value7==null  || value7.equals("-") || value7.equals("null") || value7.equals(""))
              {
              
                   value7="";
              
              }
              if(value8==null  || value8.equals("-") || value8.equals("null")|| value8.equals(""))
              {
              
                   value8=" ";
              
              }
              if(value9==null  || value9.equals("-") || value9.equals("null")|| value9.equals(""))
              {
              
                   value9=" ";
              
              }
              if(value10==null  || value10.equals("-")|| value10.equals("null")|| value10.equals(""))
              {
              
                   value10="";
              
              } 
              
             
              
              String a =(value1+"      " + value2.toUpperCase() +"       "+ value3 +"      "+ value4 +"      "+ value5+"      " + value6 +"      "+ value7+"     "+ value8+"      "+ value9+"      "+ value10 );
                
               mylist.addElement(a);
              
               }
                  
          
              
  
        }
         catch(SQLException ex) 
           {
            System.out.print("\n -- SQL Exception -- \n" + ex.getMessage());
            ex=ex.getNextException();   
             
           }   
    
         logtable.setModel(mylist);
    
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
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        logtable = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(187, 218, 222));
        jPanel1.setFocusCycleRoot(true);

        BackToMenu.setText("Main menu");
        BackToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenuActionPerformed(evt);
            }
        });

        jButton1.setText("Back to About");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        logtable.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {  };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(logtable);

        jButton2.setText("Clear Log");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(BackToMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackToMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                .addGap(48, 48, 48)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addGap(44, 44, 44))
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
                this.hide();
                MainMenu StartPage = new MainMenu();
                StartPage.setVisible(true);
                
    }//GEN-LAST:event_BackToMenuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        About goabout= new About();
        goabout.show();
        this.hide();
        
        


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        try{

                dbConnection2= DriverManager.getConnection(url,username,passwd); 
                statement = dbConnection2.createStatement();

                String selectString = "drop table logfiletable;";
                  
                
               rs=statement.executeQuery(selectString);
               
                
                
                
        }
         catch(SQLException ex) 
           {
            System.out.print("\n -- SQL Exception -- \n" + ex.getMessage());
            ex=ex.getNextException();   
             
           }   
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> logtable;
    // End of variables declaration//GEN-END:variables
}
