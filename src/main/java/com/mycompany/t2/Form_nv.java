/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.t2;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author allec
 */
public final class Form_nv extends javax.swing.JFrame {
private Staff[] staffs;
   
    /**
     * Creates new form Form
     * @param staff
     */
    public Form_nv(Staff[] staff) {
       this.staffs = staff;
      
        initComponents();
        Nhap.requestFocus();
        displayStaff(this.staffs); // Hiển thị dữ liệu ban đầu
        // Đăng ký sự kiện KeyListener cho ô nhập liệu
        Nhap.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textKeyReleased(evt);
            }
        });
        Timkiem.setEnabled(false);
    }

    private Form_nv() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        labelNhap = new javax.swing.JLabel();
        Nhap = new javax.swing.JTextField();
        Timkiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bangthongtin = new javax.swing.JTable();
        Thoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelNhap.setText("Nhập mã sinh viên:");

        Nhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NhapActionPerformed(evt);
            }
        });

        Timkiem.setText("Search");
        Timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimkiemActionPerformed(evt);
            }
        });

        bangthongtin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Nhân Viên", "Họ tên", "Tuổi", "Giới tính", "Chuyên ngành"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        bangthongtin.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                bangthongtinAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(bangthongtin);

        Thoat.setText("Exit");
        Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(labelNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nhap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Timkiem)
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Thoat)
                        .addGap(204, 204, 204))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNhap)
                    .addComponent(Nhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Timkiem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(Thoat)
                .addContainerGap())
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

    private void NhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NhapActionPerformed
        // TODO add your handling code here:
         String textContent = Nhap.getText().trim();

        // Kiểm tra nếu trường nhập MSV không rỗng
        if (!Nhap.getText().isEmpty()) {
            // Kích hoạt nút Tìm kiếm
            Timkiem.setEnabled(true);
        }
        else{
            Timkiem.setEnabled(false);
        }
    }//GEN-LAST:event_NhapActionPerformed

    private void ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThoatActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ThoatActionPerformed

    private void TimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimkiemActionPerformed
        // TODO add your handling code here:
        String staffID = Nhap.getText().trim();
        // Kiểm tra xem mã sinh viên có chứa kí tự không phải là số không
        if (!staffID.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Mã nhân viên chỉ được phép nhập kí tự số.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (staffID.length() != 9) {
            JOptionPane.showMessageDialog(this, "Mã nhân viên phải có đúng 9 kí tự.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
         // Lấy mã sinh viên từ ô nhập liệu
        String StaffID = Nhap.getText().trim();
        DefaultTableModel model = (DefaultTableModel) bangthongtin.getModel();
        model.setRowCount(0); // Xóa dữ liệu cũ trên bảng
        boolean found = false;
        // Duyệt qua danh sách nhân viên và thêm vào bảng nếu tìm thấy
        for (Staff staff : staffs) {
            if (staff != null && staff.StaffID.equals(StaffID)) {
                model.addRow(new Object[]{
                    staff.StaffID,
                    staff.name,
                    staff.age,
                    staff.gender,
                    staff.getSpecialize()
                });
            found = true;
            break;
            }
        }

    if (!found) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy nhân viên với mã số " + StaffID, "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            displayStaff(this.staffs); // Hiển thị lại dữ liệu ban đầu nếu không tìm thấy sinh viên
        }
    }//GEN-LAST:event_TimkiemActionPerformed

    private void bangthongtinAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_bangthongtinAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_bangthongtinAncestorAdded

    public void displayStaff(Staff[] staff) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã Nhân Viên");
        model.addColumn("Họ Tên");
        model.addColumn("Tuổi");
        model.addColumn("Giới tính");
        model.addColumn("Chuyên môn");

        for (Staff Staff : staff) {
            String Specialize = "";
            if (Staff instanceof OfficeStaff officeStaff) {
                Specialize = officeStaff.getSpecialize(); //Staff thu 2
            } else if (Staff instanceof SalesAgent salesAgent) {
                Specialize = salesAgent.getSpecialize();
            } else if (Staff instanceof ITStaff iTStaff) {
                Specialize = iTStaff.getSpecialize();
            }
            model.addRow(new Object[]{Staff.StaffID, Staff.name, Staff.age, Staff.gender, Specialize});
        }

        bangthongtin.setModel(model);
        }
        
   
         
        private void textKeyReleased(java.awt.event.KeyEvent evt) {                                  
        // Lấy text từ JTextField (loại bỏ khoảng trắng đầu - cuối)
        String textContent = Nhap.getText().trim();

        // Kiểm tra độ dài của mã nhân viên và xem liệu tất cả các ký tự có phải là số không
        if (textContent.length() >= 1 && isNumeric(textContent)) {
            // Kích hoạt nút Tìm kiếm
            Timkiem.setEnabled(true);
        } else {
            // Vô hiệu hóa nút Tìm kiếm
            Timkiem.setEnabled(false);
        }
    }
    // Phương thức kiểm tra xem một chuỗi có chứa toàn kí tự số hay không
    private boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Nhap;
    private javax.swing.JButton Thoat;
    private javax.swing.JButton Timkiem;
    private javax.swing.JTable bangthongtin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelNhap;
    // End of variables declaration//GEN-END:variables
}
