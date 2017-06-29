
package imgs;


import static imgs.AvailableRooms.d1;
import static imgs.AvailableRooms.d2;
import static imgs.AvailableRooms.hot;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Krithi
 */
public class CustDetails extends javax.swing.JFrame {

    public static String ht;
    public static String stri,typ;
    public static java.sql.Date dd1,dd2;
    public static int aa,cc,rr,tot,pr;
//String prevNumber="G01";
    /**
     * Creates new form CustDetails
     */
    public CustDetails( java.sql.Date d1,java.sql.Date d2,String hot,int a,int c, int r,int p) {
        initComponents();
        dd1=d1;dd2=d2;ht=new String(hot);
        aa=a;cc=c;rr=r;tot=aa+cc;pr=p;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 450));
        setSize(new java.awt.Dimension(700, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 0, 0));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Please Enter your Details (  * indicates Mandatory field )");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 31));

        jLabel1.setText("First Name*:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 53, -1, -1));

        jLabel2.setText("Last Name*:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 97, -1, -1));

        jLabel3.setText("Phone No.*:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 142, -1, -1));

        jLabel4.setText("Address*:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 187, -1, -1));

        jLabel5.setText("Email ID*:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 277, -1, -1));

        jLabel6.setText("Date of Birth*:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 233, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 50, 172, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 94, 172, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 139, 172, -1));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 180, 172, 29));

        jTextField6.setForeground(new java.awt.Color(204, 204, 204));
        jTextField6.setText("YYYY-MM-DD");
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 230, 172, -1));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 274, 172, -1));

        jButton1.setText("Proceed");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 49, -1, -1));

        jButton2.setText("Go Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 168, -1, -1));

        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 273, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 421, 148, 14));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/resources/vertical-horizons-barron-holland.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 260, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String s1,s2,s3,s4,s5,s6,s7;
         java.sql.Date sqld1,sqld2;
        s1=jTextField2.getText();//f
        s2=jTextField3.getText();//l
        s3=jTextField4.getText();//ph
        s4=jTextField5.getText();//add
        s5=jTextField6.getText();//dob
        s6=jTextField7.getText();//id
        if(s1.equals("")||s2.equals("")||s3.equals("")||s4.equals("")||s5.equals("")||s6.equals("")){
           
                // final JPanel panel = new JPanel();

    //JOptionPane.showMessageDialog(panel, "Please Enter All details", "Warning",
       // JOptionPane.WARNING_MESSAGE);
         jLabel7.setText("Please Enter All details");  
          
        }
        else{
         
          
            try {  
                
                Long ph = Long.parseLong(s3);Date date;
        SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-DD");
            date = formatter.parse(s5);
            java.sql.Date sqld=new java.sql.Date(date.getTime());
 
                Class.forName("com.mysql.jdbc.Driver");
            
        Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/hotel","root","mysql123")
                ; 
       
        
         
         Statement s= con.createStatement();
              ResultSet rst=s.executeQuery("select gid from guest order by gid desc limit 1");
             rst.next();
             String Lgid=rst.getString("gid");
              
              String prevNumber = new String(Lgid);
    String incredNumber = "";
    for (int i = prevNumber.length() - 1; i >= 0; i--) {
        char ch = prevNumber.charAt(i);
//System.out.println(ch);
        if (incredNumber.length() > 0 && !Character.isDigit(ch)) {
            break;
        } else if (Character.isDigit(ch)) {
            incredNumber = incredNumber + ch;
        }

    }
    if (incredNumber.length() > 0) {
        incredNumber = new StringBuffer(incredNumber).reverse().toString();
          //System.out.println(incredNumber+"\n");
          if (9>Integer.parseInt(incredNumber))
        prevNumber = prevNumber.replace(incredNumber, "0"
                + (Long.parseLong(incredNumber) + 1));
                else
                prevNumber = prevNumber.replace(incredNumber, ""
                + (Long.parseLong(incredNumber) + 1));

    }
    
    PreparedStatement ps = con.prepareStatement("insert into guest values(?,?,?,?,?,?,?)");//gid,f,l,add,ph,email,dob
      ps.setString(1,prevNumber);
         ps.setString(2,s1);
         ps.setString(3,s2);
         ps.setString(4,s4); 
         ps.setLong(5,ph); 
         ps.setString(6,s6); 
         ps.setDate(7,sqld);
            ps .executeUpdate();
            PreparedStatement ps2 = con.prepareStatement("select hid from hotel where hname=?");
            ps2.setString(1,ht);
             ResultSet rs = ps2.executeQuery();
             while(rs.next()){
                stri=rs.getString(1);
             
             }
              PreparedStatement ps3 = con.prepareStatement("select typeid from room where roomno=?");
            ps3.setString(1,AvailableRooms.s);
             ResultSet rs3 = ps3.executeQuery();
             while(rs3.next()){
                typ=rs3.getString(1);
             }
             
             String prevNumber1,Lrid;
             Statement s11= con.createStatement();
              ResultSet rst1=s11.executeQuery("select rid from reservation order by rid desc limit 1");
              rst1.next();
              
                  Lrid=rst1.getString("rid");
              
              prevNumber1 = new String(Lrid);
        String incredNumber1 = "";
    for (int i = prevNumber1.length() - 1; i >= 0; i--) {
        char ch = prevNumber1.charAt(i);
//System.out.println(ch);
        if (incredNumber1.length() > 0 && !Character.isDigit(ch)) {
            break;
        } else if (Character.isDigit(ch)) {
            incredNumber1 = incredNumber1 + ch;
        }

    }
    if (incredNumber1.length() > 0) {
        incredNumber1 = new StringBuffer(incredNumber1).reverse().toString();
          //System.out.println(incredNumber+"\n");
          if (9>Integer.parseInt(incredNumber1))
        prevNumber1 = prevNumber1.replace(incredNumber1, "0"
                + (Long.parseLong(incredNumber1) + 1));
                else
                prevNumber1 = prevNumber1.replace(incredNumber1, ""
                + (Long.parseLong(incredNumber1) + 1));

    }
              

    
   // System.out.println(prefixId.getTransactionNumber());
PreparedStatement ps4 = con.prepareStatement("insert into reservation values(?,?,?,?)");
             ps4.setString(1,prevNumber1);
             ps4.setString(2,prevNumber);
             ps4.setInt(3,rr); ps4.setInt(4,tot);
             ps4.executeUpdate();
            PreparedStatement ps1 = con.prepareStatement("insert into roomres values(?,?,?,?,?,?,NULL)");
          
                    //rid,roomno,typeid,hid,chin,chout
           
            ps1.setString(1,prevNumber1);
         ps1.setString(2, AvailableRooms.s);//roomno
         ps1.setString(3,typ);//typeid
         ps1.setString(4,stri); //hotelid not wotking
         
        ps1.setDate(5,dd1); //not wotking
        ps1.setDate(6,dd2);
        //ps1.setnull(7);//not working
        ps1 .executeUpdate();
     PreparedStatement prep;
                prep = con.prepareStatement("update roomres set numofdays=datediff(?,?) where rid=?");
     prep.setDate(1,dd2);
     prep.setDate(2,dd1);
     prep.setString(3,prevNumber1);
     prep.executeUpdate();
            
        }catch(Exception e){System.out.print(e);}
        endframe ef=new endframe();
        ef.setVisible(true);
        
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       //AvailableRooms arr= new AvailableRooms(dd1,dd2,ht);
       //arr.setVisible(true);
       this.setVisible(false);
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(CustDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              CustDetails cu=  new CustDetails(dd1,dd2,ht,aa,cc,rr,pr);
                      cu.setVisible(true);
                     //cu.jTextField8.setText(String.valueOf(pr));
                      
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}