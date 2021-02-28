package org.app;

import javax.swing.JOptionPane;
import org.db.Database;

/**
 *
 * @author Achmad Baihaqi
 */
public class ShowBiodata extends javax.swing.JFrame {

    private Database dbase = new Database();
    
    public ShowBiodata() {
        initComponents();
        this.setTitle("Tampilkan Biodata ~ App Biodata");
        this.setLocationRelativeTo(null);
        this.btnEdit.setUI(new javax.swing.plaf.basic.BasicButtonUI());
        this.btnHapus.setUI(new javax.swing.plaf.basic.BasicButtonUI());
        this.btnKembali.setUI(new javax.swing.plaf.basic.BasicButtonUI());
        this.showBiodata();
    }
    
    private void showBiodata(){
        Object[] strings = dbase.listBiodata();
        listBiodata.setModel(new javax.swing.AbstractListModel() {
            @Override
            public int getSize() { return strings.length; }
            @Override
            public Object getElementAt(int i) { return strings[i]; }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        lblTop = new javax.swing.JLabel();
        pnlData = new javax.swing.JPanel();
        lblNis = new javax.swing.JLabel();
        dataNis = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        dataNama = new javax.swing.JLabel();
        dataKelas = new javax.swing.JLabel();
        lblKelas = new javax.swing.JLabel();
        dataJurusan = new javax.swing.JLabel();
        lblJurusan = new javax.swing.JLabel();
        dataEmail = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listBiodata = new javax.swing.JList();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));

        lblTop.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTop.setForeground(new java.awt.Color(21, 90, 154));
        lblTop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTop.setText("Biodata Siswa");

        pnlData.setBackground(new java.awt.Color(255, 255, 255));
        pnlData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNis.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNis.setText("   NIS");

        dataNis.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        dataNis.setText(": 6156");

        lblNama.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNama.setText("   Nama");

        dataNama.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        dataNama.setText(": Achmad Baihaqi");

        dataKelas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        dataKelas.setText(": X (sepuluh)");

        lblKelas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblKelas.setText("   Kelas");

        dataJurusan.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        dataJurusan.setText(": Rekayasa Perangkat Lunak");

        lblJurusan.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblJurusan.setText("   Jurusan");

        dataEmail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        dataEmail.setText(": hakiahmad756@gmail.com");

        lblEmail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblEmail.setText("   Email");

        javax.swing.GroupLayout pnlDataLayout = new javax.swing.GroupLayout(pnlData);
        pnlData.setLayout(pnlDataLayout);
        pnlDataLayout.setHorizontalGroup(
            pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataLayout.createSequentialGroup()
                .addComponent(lblNis, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dataNis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlDataLayout.createSequentialGroup()
                .addComponent(lblNama, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dataNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlDataLayout.createSequentialGroup()
                .addComponent(lblKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dataKelas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlDataLayout.createSequentialGroup()
                .addComponent(lblJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dataJurusan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlDataLayout.createSequentialGroup()
                .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dataEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDataLayout.setVerticalGroup(
            pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNis, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataNis, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNama, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataNama, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        listBiodata.setBackground(new java.awt.Color(215, 219, 228));
        listBiodata.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        listBiodata.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "6156\\Achmad Baihaqi\\XII\\RPL\\hakiahmad756@gmail.com", "6157\\Ade Raihan Masha\\XII\\RPL\\aderaihanaaca@gmail.com", "6158\\Adelia Puteri Gita Novita Sari\\XII\\RPL\\adelia2019adelia@gmail.com", "6159\\Adetya Wardani\\XII\\RPL\\adetyawardani5@gmail.com", "6160\\Agung Tri Laksono\\XII\\RPL\\agungtrilaksono1287@gmail.com" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listBiodata.setSelectionBackground(new java.awt.Color(7, 159, 231));
        listBiodata.setSelectionForeground(new java.awt.Color(253, 253, 253));
        listBiodata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listBiodataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listBiodata);

        btnEdit.setBackground(new java.awt.Color(16, 89, 165));
        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(21, 127, 38));
        btnHapus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnKembali.setBackground(new java.awt.Color(233, 30, 30));
        btnKembali.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnKembali.setForeground(new java.awt.Color(255, 255, 255));
        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTop, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
            .addComponent(pnlData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKembali)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTop)
                .addGap(18, 18, 18)
                .addComponent(pnlData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(btnHapus)
                    .addComponent(btnKembali))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
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

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        dbase.closeConn();
    }//GEN-LAST:event_formWindowClosed

    private void listBiodataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listBiodataMouseClicked
        String selected = this.listBiodata.getSelectedValue().toString();
        int nis = Integer.parseInt(selected.substring(0, selected.indexOf("\\")));
        this.dataNis.setText(": " + nis);
        this.dataNama.setText(": " + this.dbase.getData(nis, Database.BIODATA_NAMA));
        this.dataEmail.setText(": " + this.dbase.getData(nis, Database.BIODATA_EMAIL));
        
        String kelas = this.dbase.getData(nis, Database.BIODATA_KELAS), jurusan = dbase.getData(nis, Database.BIODATA_JURUSAN);
        if(kelas.equalsIgnoreCase("X")){
            kelas = "X (sepuluh)";
        }else if(kelas.equalsIgnoreCase("XI")){
            kelas = "XI (sebelas)";
        }else if(kelas.equalsIgnoreCase("XII")){
            kelas = "XII (dua belas)";
        }else if(kelas.equalsIgnoreCase("XIII")){
            kelas = "XIII (tiga belas)";
        }else{
            kelas = "Kelas tidak diketahui!";
        }
        if(jurusan.equalsIgnoreCase("TPM")){
            jurusan = "Teknik Pemesinan";
        }else if(jurusan.equalsIgnoreCase("TITL")){
            jurusan = "Teknik Instalasi Tenaga Listrik";
        }else if(jurusan.equalsIgnoreCase("TOI")){
            jurusan = "Teknik Otomasi Industri";
        }else if(jurusan.equalsIgnoreCase("TBG")){
            jurusan = "Tata Boga";
        }else if(jurusan.equalsIgnoreCase("TBS")){
            jurusan = "Tata Busana";
        }else if(jurusan.equalsIgnoreCase("RPL")){
            jurusan = "Rekayasa Perangkat Lunak";
        }
        
        this.dataKelas.setText(": " + kelas);
        this.dataJurusan.setText(": " + jurusan);
        
    }//GEN-LAST:event_listBiodataMouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if(!this.listBiodata.isSelectionEmpty()){
            String selected = this.listBiodata.getSelectedValue().toString();
            int nis = Integer.parseInt(selected.substring(0, selected.indexOf("\\")));
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new EditBiodata(nis).setVisible(true);
                }
            });
            dispose();
            
        }else{
            JOptionPane.showMessageDialog(null, "Tidak ada data yang dipilih!");
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        if(!this.listBiodata.isSelectionEmpty()){
            String selected = this.listBiodata.getSelectedValue().toString();
            int nis = Integer.parseInt(selected.substring(0, selected.indexOf("\\")));
            boolean hapus = dbase.deleteBiodata(nis);
            if(hapus){
                this.showBiodata();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
            }else{
                JOptionPane.showMessageDialog(null, "Data gagal dihapus!");
            }            
        }else{
            JOptionPane.showMessageDialog(null, "Tidak ada data yang dipilih!");
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Beranda().setVisible(true);
            }
        });
        dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

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
            java.util.logging.Logger.getLogger(ShowBiodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowBiodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowBiodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowBiodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ShowBiodata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JLabel dataEmail;
    private javax.swing.JLabel dataJurusan;
    private javax.swing.JLabel dataKelas;
    private javax.swing.JLabel dataNama;
    private javax.swing.JLabel dataNis;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblJurusan;
    private javax.swing.JLabel lblKelas;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblNis;
    private javax.swing.JLabel lblTop;
    private javax.swing.JList listBiodata;
    private javax.swing.JPanel pnlData;
    private javax.swing.JPanel pnlMain;
    // End of variables declaration//GEN-END:variables

}
