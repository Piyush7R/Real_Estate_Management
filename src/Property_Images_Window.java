
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author kalra
 */
public class Property_Images_Window extends javax.swing.JFrame {

    /**
     * Creates new form Property_Images_Window
     */
    P_TYPE type = new P_TYPE();
    HashMap<String, Integer> map = type.getTypeMap();
    String property_image_path = "";
    int propertyId = 0;
    public Property_Images_Window() {
        initComponents();
        Border title_label_border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(255, 255, 255));
        jPanel_title.setBorder(title_label_border);
        bindCombo();
        fillJPropertytable();
        jTable1.setRowHeight(40);
        jTable1.setSelectionBackground(new Color(27, 150, 77));
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(25);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(250);
    }
    public void bindCombo(){
        for(String s : map.keySet()){
            jComboBox1_type.addItem(s);
        }
    }

    public void fillJPropertytable(){
        P_Property property = new P_Property();
        ArrayList<P_Property> propertyList = property.proprtiesList();
        
        String[] colNames = {"ID", "Address"};
        
        Object[][] rows = new Object[propertyList.size()][2];
        
        for (int i = 0; i < propertyList.size(); i++) {
            rows[i][0] = propertyList.get(i).getId();
            rows[i][1] = propertyList.get(i).getAddress();
        }
        
        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable1.setModel(model);
        
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
        jPanel_title = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton_show = new javax.swing.JButton();
        jButton_remove = new javax.swing.JButton();
        jButton_addimage = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1_type = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButton_browse = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel_title.setBackground(new java.awt.Color(255, 51, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Property Images");

        javax.swing.GroupLayout jPanel_titleLayout = new javax.swing.GroupLayout(jPanel_title);
        jPanel_title.setLayout(jPanel_titleLayout);
        jPanel_titleLayout.setHorizontalGroup(
            jPanel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_titleLayout.createSequentialGroup()
                .addGap(441, 441, 441)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_titleLayout.setVerticalGroup(
            jPanel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_titleLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jButton_show.setBackground(new java.awt.Color(0, 153, 255));
        jButton_show.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_show.setForeground(new java.awt.Color(255, 255, 255));
        jButton_show.setText("Show Property Images");
        jButton_show.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton_show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_showActionPerformed(evt);
            }
        });

        jButton_remove.setBackground(new java.awt.Color(255, 51, 51));
        jButton_remove.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_remove.setForeground(new java.awt.Color(255, 255, 255));
        jButton_remove.setText("Remove");
        jButton_remove.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton_remove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_removeActionPerformed(evt);
            }
        });

        jButton_addimage.setBackground(new java.awt.Color(51, 255, 51));
        jButton_addimage.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_addimage.setForeground(new java.awt.Color(255, 255, 255));
        jButton_addimage.setText("Add");
        jButton_addimage.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton_addimage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_addimage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addimageActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select a type:");

        jComboBox1_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1_typeActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select Image:");

        jButton_browse.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton_browse.setText("Browse");
        jButton_browse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_browseActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 204, 204));
        jLabel4.setOpaque(true);

        jList1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1_type, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_show, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                            .addComponent(jButton_remove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_browse, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_addimage, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE))
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jButton_browse, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jComboBox1_type, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_addimage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_show, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_addimageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addimageActionPerformed
       
        P_Property property = new P_Property();
        if (propertyId != 0) {
            if(property.addImage(propertyId, property_image_path)){
                JOptionPane.showMessageDialog(null, "Image Added To This Property", "Add Image", 1);
            }
            else{
                JOptionPane.showMessageDialog(null, "Image Not Added To This Property", "Add Image", 2);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Select the Property First ", "Select Property", 2);

        }
        
    }//GEN-LAST:event_jButton_addimageActionPerformed

    private void jButton_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_removeActionPerformed
        // TODO add your handling code here:
        String selectedListItem = String.valueOf(jList1.getSelectedValue());
        Integer imageId = Integer.valueOf(selectedListItem);
        int yes_or_no = JOptionPane.showConfirmDialog(null, "Do You Want To Delete This Image?", "Delete image", JOptionPane.YES_NO_OPTION);
        if(yes_or_no == JOptionPane.YES_OPTION){
            if(new P_Property().removeImage(imageId)){
                JOptionPane.showMessageDialog(null, "Image Deleted", "Delete Image", 1);
            }else{
                JOptionPane.showMessageDialog(null, "Operation Failed", "Delete Image", 2);                
            } 
        }
       
    }//GEN-LAST:event_jButton_removeActionPerformed

    private void jButton_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_showActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton_showActionPerformed
public ImageIcon resizeImage(String path, byte[] byteImage){
    ImageIcon pic;
    if(byteImage != null){
        pic = new ImageIcon(byteImage);
    }else{
        pic = new ImageIcon(path);
    }
    
    Image img = pic.getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(img);
    return image;
}
    private void jButton_browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_browseActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select The Property Image");
        fileChooser.setCurrentDirectory(new File("C:\\Users\\Kalra\\properties"));
        
        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("Images", ".jpg", ".png", ".jpeg");
        fileChooser.addChoosableFileFilter(fileFilter);
        
        int fileState = fileChooser.showSaveDialog(null);
        if(fileState == JFileChooser.APPROVE_OPTION){
            String path = fileChooser.getSelectedFile().getAbsolutePath();
            jLabel4.setIcon(resizeImage(path, null));
            property_image_path = path;
        }
    }//GEN-LAST:event_jButton_browseActionPerformed

    private void jComboBox1_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1_typeActionPerformed
        // TODO add your handling code here:
        int typeID = map.get(jComboBox1_type.getSelectedItem().toString());
        P_Property property = new P_Property();
        ArrayList<P_Property> propertyList = property.proprtiesListByType(typeID);
        
        String[] colNames = {"ID", "Address"};
        
        Object[][] rows = new Object[propertyList.size()][14];
        
        for (int i = 0; i < propertyList.size(); i++) {
            rows[i][0] = propertyList.get(i).getId();
            rows[i][1] = propertyList.get(i).getAddress();
        }
        
        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable1.setModel(model);
        
    }//GEN-LAST:event_jComboBox1_typeActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int rowIndex = jTable1.getSelectedRow();
        propertyId = Integer.valueOf(jTable1.getValueAt(rowIndex, 0).toString());

        fillTypeList();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // TODO add your handling code here:
        String selectedListItem = String.valueOf(jList1.getSelectedValue());
        Integer imageId = Integer.valueOf(selectedListItem);
        byte[] image = new P_Property().getImageById(imageId);
        jLabel4.setIcon(resizeImage("", image));
    }//GEN-LAST:event_jList1MouseClicked

    public void fillTypeList(){
        HashMap<byte[], Integer> imagesList = new P_Property().proprtyImagesList(propertyId);       
        
        DefaultListModel listModel = new DefaultListModel();
        int i = 0;
        
        for(Integer id: imagesList.values()){
            listModel.add(i, id);
            i++;
        }
        jList1.setModel(listModel);
    }
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
            java.util.logging.Logger.getLogger(Property_Images_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Property_Images_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Property_Images_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Property_Images_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Property_Images_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_addimage;
    private javax.swing.JButton jButton_browse;
    private javax.swing.JButton jButton_remove;
    private javax.swing.JButton jButton_show;
    private javax.swing.JComboBox<String> jComboBox1_type;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_title;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
