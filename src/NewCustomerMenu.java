
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.sql.Types;
import javax.swing.JOptionPane;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Chameleon
 */
public class NewCustomerMenu extends javax.swing.JFrame {

    static String driverClassName="oracle.jdbc.OracleDriver";
    static String url = "jdbc:oracle:thin:@192.168.6.21:1521/dblabs";
    static Connection dbConnection = null;
    static String username = "it175093";
    static String passwd = "Powerteam1515";
    static Statement statement =null; 
    static PreparedStatement insertCustomer = null;
    static PreparedStatement  insertCompany =null;
    static ResultSet rs   = null;
    public final int javaid1 = 10000;
    public final int javaid2 = 100;
    public int changeid ;
    public int changeid2 ;
    static Connection dbConnection2 = null;
     
    public NewCustomerMenu() {
        
        
        initComponents();
         
         centreWindow(this);
         myconnection();
         
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
        firstName = new javax.swing.JFormattedTextField();
        lastName = new javax.swing.JFormattedTextField();
        email = new javax.swing.JFormattedTextField();
        phone = new javax.swing.JFormattedTextField();
        company = new javax.swing.JFormattedTextField();
        submit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mailCompany = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        phoneCompany = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        locationCompany = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.TOOLKIT_EXCLUDE);

        jPanel1.setBackground(new java.awt.Color(142, 199, 178));
        jPanel1.setFocusCycleRoot(true);

        BackToMenu.setText("Main menu");
        BackToMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BackToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenuActionPerformed(evt);
            }
        });

        firstName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstNameFocusLost(evt);
            }
        });
        firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameActionPerformed(evt);
            }
        });

        lastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastNameFocusLost(evt);
            }
        });
        lastName.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                lastNameCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameActionPerformed(evt);
            }
        });

        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        phone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                phoneFocusLost(evt);
            }
        });
        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });

        company.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyActionPerformed(evt);
            }
        });

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jLabel1.setText("Company");

        jLabel2.setText("Firstname");

        jLabel3.setText("Lastname");

        jLabel4.setText("Email");

        jLabel5.setText("Phone");

        jLabel6.setText("Email Company");

        mailCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailCompanyActionPerformed(evt);
            }
        });

        jLabel7.setText("Phone Company");

        phoneCompany.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                phoneCompanyFocusLost(evt);
            }
        });
        phoneCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneCompanyActionPerformed(evt);
            }
        });

        jLabel8.setText("Location Company");

        locationCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationCompanyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lastName, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                    .addComponent(firstName, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(62, 62, 62))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(phone, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(phoneCompany)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(locationCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(company, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mailCompany))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(111, 111, 111))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(BackToMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BackToMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(company)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(phoneCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mailCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(73, 73, 73)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(locationCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(147, 147, 147)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenuActionPerformed
                this.hide();
                MainMenu StartPage = new MainMenu();
                StartPage.setVisible(true);
                
    }//GEN-LAST:event_BackToMenuActionPerformed

    private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameActionPerformed

    private void lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void companyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_companyActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
         
        String s="";
        String fname= firstName.getText();
        String lname= lastName.getText();
        String mail=email.getText();
        String phoneN=phone.getText();
        String Company= company.getText();
        String mailcompany= mailCompany.getText();
        String phonecompany = phoneCompany.getText();
        String locationcompany= locationCompany.getText();
        boolean appearing=false;
        
       if (fname.equals(s) || lname.equals(s) || mail.equals(s)|| phoneN.equals(s) || Company.equals(s)  )
      
       {
       
          Pop2 popup2 = new Pop2();
          popup2.show();
          this.hide();   
     
       } else { 
        
            try{
                    // εκχωρηση αυτοματου id και καταχωρηση του customer στη βαση
                   statement = dbConnection.createStatement();
                     String selectString ="select * from customer order by id1 desc FETCH FIRST 1 ROWS ONLY" ;                                                                                              
                     rs=statement.executeQuery(selectString);
                     while(rs.next())
                     {
                     int counter = rs.getInt("ID1");                        
                     System.out.println(counter);                            
                     changeid=counter+1;
                     }
                                            
                    insertCustomer.setInt(1,changeid);  
                    insertCustomer.setString(2,fname);
                    insertCustomer.setString(3,lname);
                    insertCustomer.setString(4,mail);
                    insertCustomer.setString(5,phoneN);
                    insertCustomer.setString(6,Company);
                    insertCustomer.executeUpdate();  
      
               CallableStatement  checkIfExists= dbConnection.prepareCall("{call  checkIfExists(?,?)}"); 
               
               String exist ;
               checkIfExists.setString(1,Company);
               checkIfExists.registerOutParameter(2, Types.VARCHAR);
               checkIfExists.executeUpdate();
               exist = checkIfExists.getString(2);                                    
                 if (Company.equals(exist))
                 {
                     
                      JOptionPane.showMessageDialog(jPanel1, "Company name exists in board");
                 
                 }
                 
                 else{ 
                     
                     String selectString2 ="select * from company  order by id2 desc FETCH FIRST 1 ROWS ONLY ";
                     rs=statement.executeQuery(selectString2);

                     while(rs.next())
                     {
                     int counter = rs.getInt("ID2");                    
                       changeid2= counter+1;
                     }                                          
                     insertCompany.setInt(1,changeid2);
                     insertCompany.setString(2, Company);
                     
                     if (mailcompany.equals(""))
                     {
                         mailcompany="-";  
                         
                     }
 
                    if (  phonecompany.equals("")){
                         phonecompany="-";   
                     }  
                    
                    if (  locationcompany.equals(""))
                    {
                        locationcompany="-"; 
                    } 
                        
                     insertCompany.setString(3,mailcompany);
                     insertCompany.setString(4,phonecompany);
                     insertCompany.setString(5,locationcompany);                    
                     insertCompany.executeUpdate();                                                            
                     statement.close();
                     dbConnection.close();
                 }
            } catch(SQLException ex)
             {
                 System.out.println("");
                 while(ex != null){
                 System.out.println("\n -- SQL Exception -- \n" + ex.getMessage());
                 ex=ex.getNextException();
                appearing =false;
                }
                   
             }
            
            
          
         if (appearing==false){ 
            Pop1 popup = new Pop1();
            popup.show();
            this.hide();  
        }else 
            {
            Pop3 popup3 = new Pop3();
            popup3.show();
            this.hide();
             }
      
 
       }
    
        
         
       
        
        
    }//GEN-LAST:event_submitActionPerformed

    private void mailCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailCompanyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailCompanyActionPerformed

    private void phoneCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneCompanyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneCompanyActionPerformed

    private void locationCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationCompanyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationCompanyActionPerformed

    private void lastNameCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_lastNameCaretPositionChanged
      
    }//GEN-LAST:event_lastNameCaretPositionChanged

    private void lastNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameFocusLost
         
          String lname= lastName.getText().trim();
     
     if (lname=="null"){     
         
         
     }else{
       if (!lname.matches("[ Α-Ωα-ωA-Za-z ]*") )
       
       {
       
                 JOptionPane.showMessageDialog(jPanel1, "Something go wrong, please try again"); 
                   lastName.setText("");
       }
           
     }     
           
           
    }//GEN-LAST:event_lastNameFocusLost

    private void firstNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameFocusLost
          String fname= firstName.getText().trim();
        
        if (fname==""){     
         
         
     }else{   
       if (!fname.matches("[ Α-Ωα-ωA-Za-z ]*") )
       
       {
       
                 JOptionPane.showMessageDialog(jPanel1, "Something go wrong, please try again"); 
                   firstName.setText("");
       }
     }    
    }//GEN-LAST:event_firstNameFocusLost

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
   
    }//GEN-LAST:event_emailFocusLost

    private void phoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneFocusLost
             String phoneN=phone.getText().trim();
        
        
        if (!phoneN.matches("[ 0-9 ]*") )
       
       {
       
                 JOptionPane.showMessageDialog(jPanel1, "Something go wrong, please try again"); 
                   phone.setText("");
       }
    
        
        
        
    }//GEN-LAST:event_phoneFocusLost

    private void phoneCompanyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneCompanyFocusLost
            String phonecompany = phoneCompany.getText().trim();
        
        
        if (!phonecompany.matches("[ 0-9 ]*") )
       
       {
       
                 JOptionPane.showMessageDialog(jPanel1, "Something go wrong, please try again"); 
                   phoneCompany.setText("");
       }
    
    }//GEN-LAST:event_phoneCompanyFocusLost

    
   void myconnection()
      {
         try{
             Class.forName(driverClassName);
                
         } catch(ClassNotFoundException ex) {}
         
         try{
                dbConnection= DriverManager.getConnection(url,username,passwd);                
               String insertString= "insert into CUSTOMER  (id1,firstName,lastName,email,phone,company) values(?,?,?,?,?,?)";
                insertCustomer= dbConnection.prepareStatement(insertString);
                
                String insertString2 = "insert into COMPANY(id2,coname,comail,cophone,location) values (?,?,?,?,?)";
                insertCompany= dbConnection.prepareStatement(insertString2);
         
         } catch(SQLException ex) 
         {
            System.out.print("\n -- SQL Exception -- \n" + ex.getMessage());
            ex=ex.getNextException();
         
         }
               
          
            
   }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception{
     
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
    private javax.swing.JFormattedTextField company;
    private javax.swing.JFormattedTextField email;
    private javax.swing.JFormattedTextField firstName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField lastName;
    private javax.swing.JFormattedTextField locationCompany;
    private javax.swing.JFormattedTextField mailCompany;
    private javax.swing.JFormattedTextField phone;
    private javax.swing.JFormattedTextField phoneCompany;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
