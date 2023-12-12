
package cadastroUsuarios;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.sql.*;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vinicius Soares
 */
public class AdminRegister extends javax.swing.JFrame {
    Connection con;
    int selectedSort = 0;

    public AdminRegister() {
        initComponents();
        initializeConnection();
    }

    void initializeConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/throwaway", "root", "1234");
            System.out.println("Connection Success!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        inputName = new javax.swing.JTextField();
        inputPass = new javax.swing.JTextField();
        inputNick = new javax.swing.JTextField();
        button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();
        buttonAddUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "User", "Password", "Nickname", "Balance", "isAdmin"
                }));
        jScrollPane1.setViewportView(tabela);

        inputName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNameActionPerformed(evt);
            }
        });

        inputNick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNickActionPerformed(evt);
            }
        });

        button.setBackground(new java.awt.Color(204, 255, 204));
        button.setText("Add as Admin");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        jLabel1.setText("Insert Username");

        jLabel2.setText("Insert Password");

        jLabel3.setText("Insert Nickname");

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "Ordenar por adminstrador", "Ordenar por usuario", "Sem ordenar" }));
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });

        buttonAddUser.setBackground(new java.awt.Color(204, 255, 204));
        buttonAddUser.setText("Add as User");
        buttonAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                .addComponent(inputName)
                                                                .addComponent(inputPass,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE, 259,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(inputNick))
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        134, Short.MAX_VALUE)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(button, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(comboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)
                                                        .addComponent(buttonAddUser,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(13, 13, 13))))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button))
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(inputPass, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonAddUser))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel3)
                                                .addGap(7, 7, 7)
                                                .addComponent(inputNick, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17,
                                        Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_comboBoxActionPerformed
        selectedSort = comboBox.getSelectedIndex();
        atualizaTabela();
    }// GEN-LAST:event_comboBoxActionPerformed

    private void buttonAddUserActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonAddUserActionPerformed
        if (!validInput()) {
            JOptionPane.showMessageDialog(null, "One or more invalid entrys");
        } else {
            cadastraUsuario("F");
            atualizaTabela();
        }
    }// GEN-LAST:event_buttonAddUserActionPerformed

    private void inputNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_inputNameActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_inputNameActionPerformed

    private void inputNickActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_inputNickActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_inputNickActionPerformed

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonActionPerformed
        if (!validInput()) {
            JOptionPane.showMessageDialog(null, "One or more invalid entrys");
        } else {
            cadastraUsuario("T");
            atualizaTabela();
        }

    }// GEN-LAST:event_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminRegister.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminRegister.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminRegister.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminRegister.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button;
    private javax.swing.JButton buttonAddUser;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JTextField inputName;
    private javax.swing.JTextField inputNick;
    private javax.swing.JTextField inputPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

    private void cadastraUsuario(String s) {

        try {
            Statement stmt = con.createStatement();
            String name = inputName.getText();
            String password = inputPass.getText();
            String nickname = inputNick.getText();
            if (!alreadyRegistered()) {
                String operation = "Insert into users values('" + name + "','" + password + "','" + nickname
                        + "'," + defaultBalance(s) + ",'" + s + "');";
                stmt.execute(operation);
                stmt.close();
                JOptionPane.showMessageDialog(null, userType(s) + " " + name + " adicionado ao sistema!");
                clearAllInputs();
            }

        } catch (SQLException ex) {
            Logger.getLogger(AdminRegister.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void clearAllInputs() {
        inputName.setText(null);
        inputPass.setText(null);
        inputNick.setText(null);
    }

    private boolean validInput() {
        return inputName.getText() != null && !inputName.getText().equals("")
                && inputPass.getText() != null && !inputPass.getText().equals("")
                && inputNick.getText() != null && !inputNick.getText().equals("");
    }

    private String queryResult(int i) {
        if (i == 0) {
            return ("Select * from users order by admin desc, balance desc;");
        } else if (i == 1) {
            return ("Select * from users order by admin, balance desc;");
        }
        return ("Select * from users");

    }

    void atualizaTabela() {
        DefaultTableModel table = (DefaultTableModel) tabela.getModel();
        // Limpando a tabela antes de adicionar qualquer coisa
        int rowCount = table.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            table.removeRow(i);
        }

        try {
            Statement stmt = con.createStatement();
            ResultSet resultTable = stmt.executeQuery(queryResult(selectedSort));

            while (resultTable.next()) {
                String userLogin = resultTable.getString("userlogin");
                String userPass = resultTable.getString("userpassword");
                String userNick = resultTable.getString("nickname");
                String userBalance = resultTable.getString("balance");
                String isAdmin = resultTable.getString("admin");
                table.addRow(new Object[] { userLogin, userPass, userNick, userBalance, isAdmin });
            }

            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdminRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    String userType(String s) {
        if (s.equals("T"))
            return "Adminstrador";
        return "Usuário";
    }

    int defaultBalance(String s) {
        if (s.equals("T"))
            return 999999;
        return 0;
    }

    boolean alreadyRegistered() {
        try {
            Statement stmt = con.createStatement();
            String name = inputName.getText();
            String op = ("Select * from users where userlogin ='" + name + "';");
            ResultSet rs = stmt.executeQuery(op);
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Já existe um usuário cadastrado com esse nome");
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
