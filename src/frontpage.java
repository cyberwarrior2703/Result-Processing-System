/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANUJ KAUSHAL
 */
public class frontpage extends javax.swing.JFrame {

    /**
     * Creates new form frontpage
     */
    public frontpage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        dataentry = new javax.swing.JButton();
        studentinformation = new javax.swing.JButton();
        facultyinformation = new javax.swing.JButton();
        marksinformation = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        details = new javax.swing.JButton();
        studentdetails = new javax.swing.JButton();
        facultydetails = new javax.swing.JButton();
        markdetails = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        studentinfo = new javax.swing.JMenu();
        facultyinfo = new javax.swing.JMenu();
        marksinfo = new javax.swing.JMenu();
        studentdetail = new javax.swing.JMenu();
        facultydetail = new javax.swing.JMenu();
        marksdetails = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 10));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 51));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RGPV-College-Code-Madhya-Pradesh-UIT-RGPV-University.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        dataentry.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        dataentry.setForeground(new java.awt.Color(255, 102, 0));
        dataentry.setText("DATA ENTRY");
        dataentry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataentryActionPerformed(evt);
            }
        });

        studentinformation.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        studentinformation.setForeground(new java.awt.Color(255, 102, 0));
        studentinformation.setText("STUDENT INFORMATION");
        studentinformation.setEnabled(false);
        studentinformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentinformationActionPerformed(evt);
            }
        });

        facultyinformation.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        facultyinformation.setForeground(new java.awt.Color(153, 51, 0));
        facultyinformation.setText("FACULTY INFORMATION");
        facultyinformation.setEnabled(false);
        facultyinformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyinformationActionPerformed(evt);
            }
        });

        marksinformation.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        marksinformation.setForeground(new java.awt.Color(204, 0, 102));
        marksinformation.setText("MARKS INFORMATION");
        marksinformation.setEnabled(false);
        marksinformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marksinformationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(facultyinformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marksinformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(studentinformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dataentry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(dataentry, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(studentinformation, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(facultyinformation, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(marksinformation, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 204, 255));

        details.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        details.setForeground(new java.awt.Color(255, 102, 0));
        details.setText("DETAILS");
        details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsActionPerformed(evt);
            }
        });

        studentdetails.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        studentdetails.setForeground(new java.awt.Color(153, 51, 0));
        studentdetails.setText("STUDENT DETAILS");
        studentdetails.setEnabled(false);
        studentdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentdetailsActionPerformed(evt);
            }
        });

        facultydetails.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        facultydetails.setForeground(new java.awt.Color(0, 153, 153));
        facultydetails.setText("FACULTY DETAILS");
        facultydetails.setEnabled(false);
        facultydetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultydetailsActionPerformed(evt);
            }
        });

        markdetails.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        markdetails.setForeground(new java.awt.Color(204, 0, 102));
        markdetails.setText("MARKS DETAILS");
        markdetails.setEnabled(false);
        markdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markdetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(markdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(studentdetails, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                        .addComponent(facultydetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(43, 43, 43))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(details, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(details, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(studentdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(facultydetails, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(markdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47))))
        );

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 0));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jMenuBar1.setFont(new java.awt.Font("Algerian", 2, 24)); // NOI18N

        studentinfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        studentinfo.setForeground(new java.awt.Color(204, 0, 0));
        studentinfo.setMnemonic('s');
        studentinfo.setText("STUDENT INFORMATION");
        studentinfo.setToolTipText("");
        studentinfo.setEnabled(false);
        studentinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentinfoMouseClicked(evt);
            }
        });
        jMenuBar1.add(studentinfo);

        facultyinfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        facultyinfo.setForeground(new java.awt.Color(0, 51, 204));
        facultyinfo.setMnemonic('f');
        facultyinfo.setText(" FACULTY INFORMATION");
        facultyinfo.setEnabled(false);
        facultyinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facultyinfoMouseClicked(evt);
            }
        });
        jMenuBar1.add(facultyinfo);

        marksinfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        marksinfo.setForeground(new java.awt.Color(51, 102, 0));
        marksinfo.setMnemonic('m');
        marksinfo.setText("MARKS INFORMATION");
        marksinfo.setEnabled(false);
        marksinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                marksinfoMouseClicked(evt);
            }
        });
        jMenuBar1.add(marksinfo);

        studentdetail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        studentdetail.setForeground(new java.awt.Color(0, 255, 51));
        studentdetail.setMnemonic('m');
        studentdetail.setText("STUDENT DETAILS ");
        studentdetail.setEnabled(false);
        studentdetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentdetailMouseClicked(evt);
            }
        });
        jMenuBar1.add(studentdetail);

        facultydetail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        facultydetail.setForeground(new java.awt.Color(153, 0, 255));
        facultydetail.setText("FACULTY DETAILS");
        facultydetail.setEnabled(false);
        facultydetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facultydetailMouseClicked(evt);
            }
        });
        jMenuBar1.add(facultydetail);

        marksdetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        marksdetails.setForeground(new java.awt.Color(51, 0, 102));
        marksdetails.setText("MARKS DETAILS");
        marksdetails.setEnabled(false);
        marksdetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                marksdetailsMouseClicked(evt);
            }
        });
        jMenuBar1.add(marksdetails);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentinfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentinfoMouseClicked
setVisible(false);
STUDENTINFO Si=new STUDENTINFO();
Si.setVisible(true);


        // TODO add your handling code here:
    }//GEN-LAST:event_studentinfoMouseClicked

    private void facultyinfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facultyinfoMouseClicked
setVisible(false);
        faculty_info fac=new faculty_info();
fac.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_facultyinfoMouseClicked

    private void marksinfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marksinfoMouseClicked
 setVisible(false);
        marksinfo mi=new marksinfo();
mi.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_marksinfoMouseClicked

    private void studentdetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentdetailMouseClicked
setVisible(false);
        studentdetails md=new studentdetails();
md.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_studentdetailMouseClicked

    private void facultydetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facultydetailMouseClicked
setVisible(false);
        facultydetails fd=new facultydetails();
fd.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_facultydetailMouseClicked

    private void marksdetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marksdetailsMouseClicked

setVisible(false);
        marksdetails md=new marksdetails();
md.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_marksdetailsMouseClicked

    private void dataentryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataentryActionPerformed
        studentinformation.setEnabled(true);
        facultyinformation.setEnabled(true);
        marksinformation.setEnabled(true);
        studentinfo.setEnabled(true);
        facultyinfo.setEnabled(true);
        marksinfo.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_dataentryActionPerformed

    private void studentinformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentinformationActionPerformed
        setVisible(false);
        STUDENTINFO STD=new STUDENTINFO();
        STD.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_studentinformationActionPerformed

    private void facultyinformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyinformationActionPerformed
        setVisible(false);
        faculty_info fac=new faculty_info();
        fac.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_facultyinformationActionPerformed

    private void marksinformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marksinformationActionPerformed
        setVisible(false);
        marksinfo mi=new marksinfo();
        mi.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_marksinformationActionPerformed

    private void detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsActionPerformed
        studentdetails.setEnabled(true);
        facultydetails.setEnabled(true);
        markdetails.setEnabled(true);
        studentdetail.setEnabled(true);
        facultydetail.setEnabled(true);
        marksdetails.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_detailsActionPerformed

    private void studentdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentdetailsActionPerformed
        setVisible(false);
        studentdetails md=new studentdetails();
        md.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_studentdetailsActionPerformed

    private void facultydetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultydetailsActionPerformed
        setVisible(false);
        facultydetails fd=new facultydetails();
        fd.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_facultydetailsActionPerformed

    private void markdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markdetailsActionPerformed
        setVisible(false);
        marksdetails md=new marksdetails();
        md.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_markdetailsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
indexpage ip=new indexpage();
ip.setVisible(true);
setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frontpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frontpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frontpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frontpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frontpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dataentry;
    private javax.swing.JButton details;
    private javax.swing.JMenu facultydetail;
    private javax.swing.JButton facultydetails;
    private javax.swing.JMenu facultyinfo;
    private javax.swing.JButton facultyinformation;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton markdetails;
    private javax.swing.JMenu marksdetails;
    private javax.swing.JMenu marksinfo;
    private javax.swing.JButton marksinformation;
    private javax.swing.JMenu studentdetail;
    private javax.swing.JButton studentdetails;
    private javax.swing.JMenu studentinfo;
    private javax.swing.JButton studentinformation;
    // End of variables declaration//GEN-END:variables
}
