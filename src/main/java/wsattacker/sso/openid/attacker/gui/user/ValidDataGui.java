package wsattacker.sso.openid.attacker.gui.user;

import java.util.ArrayList;
import java.util.List;
import wsattacker.sso.openid.attacker.user.UserData;
import wsattacker.sso.openid.attacker.user.UserDataCollector;

public class ValidDataGui extends javax.swing.JPanel {

    private static final int UP = 1;
    private static final int DOWN = -1;

    /**
     * Creates new form ValidDataGui
     */
    public ValidDataGui() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        controller = new wsattacker.sso.openid.attacker.controller.ServerController();
        title = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        dataScrollPane = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        upBotton = new javax.swing.JButton();
        downButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        title.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        title.setText("Valid Data");

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        dataTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${config.validUser.dataList}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, controller, eLProperty, dataTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${name}"));
        columnBinding.setColumnName("Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${value}"));
        columnBinding.setColumnName("Value");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        dataScrollPane.setViewportView(dataTable);

        upBotton.setText("▲");
        upBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upBottonActionPerformed(evt);
            }
        });

        downButton.setText("▼");
        downButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("Hint: Upper values with same name are prefered");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dataScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(title)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removeButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(upBotton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(downButton)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addButton, removeButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(removeButton)
                    .addComponent(upBotton)
                    .addComponent(downButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addContainerGap())
        );

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        controller.getConfig().getValidUser().addOne();
    }//GEN-LAST:event_addButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        int selected = dataTable.getSelectedRow();
        if (selected >= 0) {
            controller.getConfig().getValidUser().removeById(selected);
        }

    }//GEN-LAST:event_removeButtonActionPerformed

    private void upBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upBottonActionPerformed
        if (dataTable.getSelectedRow() > 0) {
            moveSelectedRows(UP);
        }
    }//GEN-LAST:event_upBottonActionPerformed

    private void downButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downButtonActionPerformed
        if (dataTable.getSelectedRow() < dataTable.getRowCount() - 1) {
            moveSelectedRows(DOWN);
        }
    }//GEN-LAST:event_downButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private wsattacker.sso.openid.attacker.controller.ServerController controller;
    private javax.swing.JScrollPane dataScrollPane;
    private javax.swing.JTable dataTable;
    private javax.swing.JButton downButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton removeButton;
    private javax.swing.JLabel title;
    private javax.swing.JButton upBotton;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    private void moveSelectedRows(int rowToMove) {
        int anz = dataTable.getSelectedRowCount();
        int first = dataTable.getSelectedRow();
        if (anz > 0) {
            UserDataCollector data = controller.getConfig().getValidUser();
            List<UserData> dataList = data.getDataList();
            List<UserData> toMove = new ArrayList<>();
            for (int i = first; i < first + anz; ++i) {
                toMove.add(dataList.get(i));
            }
            dataList.removeAll(toMove);
            dataList.addAll(first - rowToMove, toMove);
            dataTable.setRowSelectionInterval(first - rowToMove, first - rowToMove + anz - 1);
        }
    }
}
