package org.app;

import javax.swing.JOptionPane;
import org.db.Database;

/**
 *
 * @author Achmad Baihaqi
 */
public class EditBiodata extends javax.swing.JFrame {

    private Database dbase = new Database();
    
    private int nis = 0;
    
    public EditBiodata(int nis) {
        initComponents();
        this.nis = nis;
        this.setTitle("Edit Biodata ~ App Biodata");
        this.setLocationRelativeTo(null);
        
        this.inpNis.setEditable(false);
        this.btnSimpan.setUI(new javax.swing.plaf.basic.BasicButtonUI());
        this.btnKembali.setUI(new javax.swing.plaf.basic.BasicButtonUI());
        this.inpNis.setText(Integer.toString(nis));
        this.inpNama.setText(dbase.getData(nis, Database.BIODATA_NAMA));
        this.inpEmail.setText(dbase.getData(nis, Database.BIODATA_EMAIL));
        
        String kelas = dbase.getData(nis, Database.BIODATA_KELAS), jurusan = dbase.getData(nis, Database.BIODATA_JURUSAN);
        if(kelas.equalsIgnoreCase("X")){
            this.inpKelas.setSelectedIndex(0);
        }else if(kelas.equalsIgnoreCase("XI")){
            this.inpKelas.setSelectedIndex(1);
        }else if(kelas.equalsIgnoreCase("XII")){
            this.inpKelas.setSelectedIndex(2);
        }else if(kelas.equalsIgnoreCase("XIII")){
            this.inpKelas.setSelectedIndex(3);
        }else {
            this.inpKelas.setSelectedIndex(0);
        }
        if(jurusan.equalsIgnoreCase("TPM")){
            this.inpJurusan.setSelectedIndex(0);
        }else if(jurusan.equalsIgnoreCase("TITL")){
            this.inpJurusan.setSelectedIndex(1);
        }else if(jurusan.equalsIgnoreCase("TOI")){
            this.inpJurusan.setSelectedIndex(2);
        }else if(jurusan.equalsIgnoreCase("TBG")){
            this.inpJurusan.setSelectedIndex(3);
        }else if(jurusan.equalsIgnoreCase("TBS")){
            this.inpJurusan.setSelectedIndex(4);
        }else if(jurusan.equalsIgnoreCase("RPL")){
            this.inpJurusan.setSelectedIndex(5);
        }else{
            this.inpJurusan.setSelectedIndex(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        lblTop = new javax.swing.JLabel();
        lblNis = new javax.swing.JLabel();
        inpNis = new javax.swing.JTextField();
        lblNama = new javax.swing.JLabel();
        inpNama = new javax.swing.JTextField();
        lblKelas = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        inpEmail = new javax.swing.JTextField();
        inpKelas = new javax.swing.JComboBox();
        inpJurusan = new javax.swing.JComboBox();
        lblJurusan = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));

        lblTop.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTop.setForeground(new java.awt.Color(204, 126, 4));
        lblTop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTop.setText("Edit Biodata");

        lblNis.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblNis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNis.setText("NIS");

        inpNis.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        inpNis.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblNama.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblNama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNama.setText("Nama");

        inpNama.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        inpNama.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblKelas.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblKelas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKelas.setText("Kelas");

        lblEmail.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmail.setText("Email");

        inpEmail.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        inpEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        inpKelas.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        inpKelas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "                                X", "                               XI", "                              XII", "                             XIII" }));

        inpJurusan.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        inpJurusan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "                              TPM", "                              TITL", "                              TOI", "                              TBG", "                              TBS", "                              RPL" }));

        lblJurusan.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblJurusan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJurusan.setText("Jurusan");

        btnSimpan.setBackground(new java.awt.Color(18, 81, 194));
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnKembali.setBackground(new java.awt.Color(208, 15, 15));
        btnKembali.setForeground(new java.awt.Color(255, 255, 255));
        btnKembali.setText("Batal");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTop, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(lblNis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblNama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblKelas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblJurusan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inpNis, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inpNama, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(inpKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(inpJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(inpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnKembali)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTop)
                .addGap(26, 26, 26)
                .addComponent(lblNis, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inpNis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNama, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inpNama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inpKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inpJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnKembali))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        int nis = 0;
        String nama, kelas, jurusan, email;
        
        if(this.inpNama.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nama tidak boleh kosong!");
        }else if(this.inpKelas.getSelectedIndex() == 3 && this.inpJurusan.getSelectedIndex() != 2){
            JOptionPane.showMessageDialog(null, "Kelas XIII hanya untuk jurusan TOI saja!");
        }else if(this.inpEmail.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Email tidak boleh kosong!");
        }else{
            nama = inpNama.getText();
            kelas = inpKelas.getSelectedItem().toString();
            kelas = kelas.substring(kelas.lastIndexOf(" ")+1);
            jurusan = inpJurusan.getSelectedItem().toString();
            jurusan = jurusan.substring(jurusan.lastIndexOf(" ")+1);
            email = inpEmail.getText();
            
            boolean editNama = dbase.editBiodata(this.nis, Database.BIODATA_NAMA, nama),
                    editKelas = dbase.editBiodata(this.nis, Database.BIODATA_KELAS, kelas),
                    editJurusan = dbase.editBiodata(this.nis, Database.BIODATA_JURUSAN, jurusan),
                    editEmail = dbase.editBiodata(this.nis, Database.BIODATA_EMAIL, email);
            if(editNama && editKelas && editJurusan && editEmail){
                JOptionPane.showMessageDialog(null, "Data berhasil diedit!");
                java.awt.EventQueue.invokeLater(new Runnable(){
                    
                    @Override
                    public void run(){
                        new ShowBiodata().setVisible(true);
                    }
                });
                dispose();
            }
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            @Override
            public void run(){
                new ShowBiodata().setVisible(true);
            }
        });
        dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        dbase.closeConn();
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(EditBiodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditBiodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditBiodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditBiodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditBiodata(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JTextField inpEmail;
    private javax.swing.JComboBox inpJurusan;
    private javax.swing.JComboBox inpKelas;
    private javax.swing.JTextField inpNama;
    private javax.swing.JTextField inpNis;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblJurusan;
    private javax.swing.JLabel lblKelas;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblNis;
    private javax.swing.JLabel lblTop;
    private javax.swing.JPanel pnlMain;
    // End of variables declaration//GEN-END:variables

}
