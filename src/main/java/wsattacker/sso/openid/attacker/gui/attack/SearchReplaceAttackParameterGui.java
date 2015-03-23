package wsattacker.sso.openid.attacker.gui.attack;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.HierarchyBoundsListener;
import java.awt.event.HierarchyEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.beansbinding.AutoBinding;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.Binding;
import org.jdesktop.beansbinding.BindingGroup;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.Converter;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.swingbinding.JTableBinding;
import org.jdesktop.swingbinding.SwingBindings;
import wsattacker.sso.openid.attacker.attack.parameter.SearchReplaceAttackParameter;
import wsattacker.sso.openid.attacker.attack.parameter.utilities.HttpMethod;
import wsattacker.sso.openid.attacker.attack.parameter.utilities.SearchReplaceHolder;
import wsattacker.sso.openid.attacker.controller.ServerController;
import wsattacker.sso.openid.attacker.user.UserData;

public class SearchReplaceAttackParameterGui extends AbstractAttackParameterGui {

    private SearchReplaceAttackParameter parameter = new SearchReplaceAttackParameter();
    public static final String PROP_PARAMETER = "parameter";

    @Override
    public SearchReplaceAttackParameter getParameter() {
        return parameter;
    }

    /*
     * protected void setParameter(AttackParameter parameter) {
     * AttackParameter oldParameter = this.parameter;
     * this.parameter = parameter;
     * firePropertyChange(PROP_PARAMETER, oldParameter, parameter);
     * }
     */
    /**
     * Creates new form AttackParameterGui
     */
    public SearchReplaceAttackParameterGui() {
        initComponents();
    }

    class ColorConverter extends Converter<Boolean, Color> {

        final private Color COLOR_SIGNED;
        final private Color COLOR_UNSIGNED = Color.WHITE;

        public ColorConverter(Color signed) {
            COLOR_SIGNED = signed;
        }

        @Override
        public Color convertForward(Boolean isSigned) {
            return (isSigned ? COLOR_SIGNED : COLOR_UNSIGNED);
        }

        @Override
        public Boolean convertReverse(Color value) {
            return COLOR_SIGNED.equals(value);
        }
    };

    public SearchReplaceAttackParameterGui(SearchReplaceAttackParameter parameter) {
        this.parameter = parameter;
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
        bindingGroup = new BindingGroup();

        name = new JLabel();
        useForSignatureCheckbox = new JCheckBox();
        deleteButton = new JButton();
        reloadButton = new JButton();
        upButton = new JButton();
        downButton = new JButton();
        tabs = new JTabbedPane();
        standardSettings = new JPanel();
        validIsSigned = new JPanel();
        validValueLabel = new JLabel();
        validValue = new JTextField();
        validMethod = new JComboBox();
        attackIsSigned = new JPanel();
        attackValueLabel = new JLabel();
        attackValue = new JTextField();
        attackMethod = new JComboBox();
        advancedSettings = new JPanel();
        addButton = new JButton();
        removeButton = new JButton();
        removeButton.setVisible(false);
        searchReplaceTableScrollPane = new JScrollPane();
        searchReplaceTableScrollPane.setVisible(false);
        searchReplaceTable = new JTable();

        setMaximumSize(new Dimension(1000, 146));
        setMinimumSize(new Dimension(400, 146));
        setName("\"Parameter\""); // NOI18N
        addHierarchyBoundsListener(new HierarchyBoundsListener() {
            public void ancestorMoved(HierarchyEvent evt) {
            }
            public void ancestorResized(HierarchyEvent evt) {
                formAncestorResized(evt);
            }
        });

        name.setFont(new Font("Dialog", 1, 18)); // NOI18N

        Binding binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ, this, ELProperty.create("${parameter.name}"), name, BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        useForSignatureCheckbox.setText("modify for attack signature computation");

        binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, this, ELProperty.create("${parameter.attackValueUsedForSignatureComputation}"), useForSignatureCheckbox, BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        deleteButton.setFont(new Font("Dialog", 1, 14)); // NOI18N
        deleteButton.setForeground(new Color(153, 0, 0));
        deleteButton.setText("✘");
        deleteButton.setMargin(new Insets(1, 1, 1, 1));

        binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ, this, ELProperty.create("${background}"), deleteButton, BeanProperty.create("background"));
        bindingGroup.addBinding(binding);

        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        reloadButton.setFont(new Font("Dialog", 1, 14)); // NOI18N
        reloadButton.setForeground(new Color(51, 153, 0));
        reloadButton.setText("↻");
        reloadButton.setMargin(new Insets(1, 1, 1, 1));

        binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, this, ELProperty.create("${parameter.attackValueUsedForSignatureComputation}"), reloadButton, BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        reloadButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                reloadButtonActionPerformed(evt);
            }
        });

        upButton.setText("▲");
        upButton.setMargin(new Insets(2, 0, 2, 0));
        upButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                upButtonActionPerformed(evt);
            }
        });

        downButton.setText("▼");
        downButton.setMargin(new Insets(2, 0, 2, 0));
        downButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                downButtonActionPerformed(evt);
            }
        });

        tabs.setFont(new Font("Dialog", 1, 10)); // NOI18N

        validIsSigned.setPreferredSize(new Dimension(16, 16));

        binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ, this, ELProperty.create("${parameter.inValidSignature}"), validIsSigned, BeanProperty.create("background"), "inValidSignature");
        binding.setConverter(new ColorConverter(Color.GREEN));
        bindingGroup.addBinding(binding);

        GroupLayout validIsSignedLayout = new GroupLayout(validIsSigned);
        validIsSigned.setLayout(validIsSignedLayout);
        validIsSignedLayout.setHorizontalGroup(
            validIsSignedLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        validIsSignedLayout.setVerticalGroup(
            validIsSignedLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        validValueLabel.setText("Valid Value:");

        validValue.setEditable(false);
        validValue.setBackground(new Color(204, 204, 204));

        binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, this, ELProperty.create("${parameter.validValue}"), validValue, BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        validMethod.setModel(new DefaultComboBoxModel(HttpMethod.values()));

        binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, this, ELProperty.create("${parameter.validMethod}"), validMethod, BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        attackIsSigned.setPreferredSize(new Dimension(16, 16));

        binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ, this, ELProperty.create("${parameter.inAttackSignature}"), attackIsSigned, BeanProperty.create("background"), "inAttackSignature");
        binding.setConverter(new ColorConverter(Color.RED));
        bindingGroup.addBinding(binding);

        GroupLayout attackIsSignedLayout = new GroupLayout(attackIsSigned);
        attackIsSigned.setLayout(attackIsSignedLayout);
        attackIsSignedLayout.setHorizontalGroup(
            attackIsSignedLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        attackIsSignedLayout.setVerticalGroup(
            attackIsSignedLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        attackValueLabel.setText("Attack Value:");

        binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, this, ELProperty.create("${parameter.attackValue}"), attackValue, BeanProperty.create("text"), "");
        bindingGroup.addBinding(binding);
        binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, this, ELProperty.create("${parameter.attackValueUsedForSignatureComputation}"), attackValue, BeanProperty.create("editable"));
        bindingGroup.addBinding(binding);
        binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, this, ELProperty.create("${parameter.attackValueUsedForSignatureComputation}"), attackValue, BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        attackMethod.setModel(new DefaultComboBoxModel(HttpMethod.values()));

        binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, this, ELProperty.create("${parameter.attackMethod}"), attackMethod, BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        GroupLayout standardSettingsLayout = new GroupLayout(standardSettings);
        standardSettings.setLayout(standardSettingsLayout);
        standardSettingsLayout.setHorizontalGroup(
            standardSettingsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(standardSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(standardSettingsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(validIsSigned, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(attackIsSigned, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addGroup(standardSettingsLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(attackValueLabel)
                    .addComponent(validValueLabel))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(standardSettingsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(attackValue, GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(validValue))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(standardSettingsLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(validMethod, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(attackMethod, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        standardSettingsLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {attackIsSigned, validIsSigned});

        standardSettingsLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {attackMethod, validMethod});

        standardSettingsLayout.setVerticalGroup(
            standardSettingsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(standardSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(standardSettingsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(validIsSigned, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                    .addGroup(standardSettingsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(validMethod, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(validValueLabel)
                        .addComponent(validValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(standardSettingsLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(standardSettingsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(attackValueLabel)
                        .addComponent(attackMethod)
                        .addComponent(attackValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addComponent(attackIsSigned, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tabs.addTab("Standard Settings", standardSettings);

        addButton.setText("Add Search/Replace");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        removeButton.setText("Remove Selected");
        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        searchReplaceTable.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));

        ELProperty eLProperty = ELProperty.create("${parameter.searchReplaceList}");
        JTableBinding jTableBinding = SwingBindings.createJTableBinding(AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, searchReplaceTable);
        JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${search}"));
        columnBinding.setColumnName("Search");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${replace}"));
        columnBinding.setColumnName("Replace");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${urlEncode}"));
        columnBinding.setColumnName("Url Encode");
        columnBinding.setColumnClass(Boolean.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        searchReplaceTableScrollPane.setViewportView(searchReplaceTable);

        GroupLayout advancedSettingsLayout = new GroupLayout(advancedSettings);
        advancedSettings.setLayout(advancedSettingsLayout);
        advancedSettingsLayout.setHorizontalGroup(
            advancedSettingsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(searchReplaceTableScrollPane, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(GroupLayout.Alignment.TRAILING, advancedSettingsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addButton)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeButton))
        );
        advancedSettingsLayout.setVerticalGroup(
            advancedSettingsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(advancedSettingsLayout.createSequentialGroup()
                .addGroup(advancedSettingsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(removeButton)
                    .addComponent(addButton))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchReplaceTableScrollPane, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tabs.addTab("Advanced Settings", advancedSettings);

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteButton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reloadButton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(useForSignatureCheckbox))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tabs)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(upButton)
                            .addComponent(downButton, GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(useForSignatureCheckbox, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(name, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(deleteButton)
                        .addComponent(reloadButton)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(upButton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(downButton))
                    .addComponent(tabs, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        deleteButton.getAccessibleContext().setAccessibleName("X");

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        ServerController controller = new ServerController();
        controller.getServer().removeParameter(getParameterName());
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void reloadButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_reloadButtonActionPerformed

        ServerController controller = new ServerController();
        String parameterName = name.getText();
        String newValue;
        try {
            UserData d;
            d = controller.getConfig().getAttackData().getByName(parameterName);
            newValue = d.getValue();
        } catch (IllegalArgumentException e) {
            newValue = "Parametername not found";
        }
        attackValue.setText(newValue);
    }//GEN-LAST:event_reloadButtonActionPerformed

    private void upButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upButtonActionPerformed
        ServerController controller = new ServerController();
        controller.getServer().getParameterConfiguration().moveUp(parameter);
    }//GEN-LAST:event_upButtonActionPerformed

    private void downButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_downButtonActionPerformed
        ServerController controller = new ServerController();
        controller.getServer().getParameterConfiguration().moveDown(parameter);
    }//GEN-LAST:event_downButtonActionPerformed

    private void formAncestorResized(HierarchyEvent evt) {//GEN-FIRST:event_formAncestorResized
        Component parent = evt.getChangedParent();
        int newHeight = getSize().height;
        int newWidth = parent.getSize().width - 40;
        setSize(newWidth, newHeight);
        setPreferredSize(getSize());
        revalidate();
    }//GEN-LAST:event_formAncestorResized

    private void removeButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        int selected = searchReplaceTable.getSelectedRow();
        if (selected >= 0) {
            parameter.getSearchReplaceList().remove(selected);
        }
        if (parameter.getSearchReplaceList().isEmpty()) {
            searchReplaceTableScrollPane.setVisible(false);
            removeButton.setVisible(false);
//            revalidate();
            repaint();
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void addButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        parameter.getSearchReplaceList().add(new SearchReplaceHolder());
        searchReplaceTableScrollPane.setVisible(true);
        removeButton.setVisible(true);
//        revalidate();
        repaint();
    }//GEN-LAST:event_addButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton addButton;
    private JPanel advancedSettings;
    private JPanel attackIsSigned;
    private JComboBox attackMethod;
    private JTextField attackValue;
    private JLabel attackValueLabel;
    private JButton deleteButton;
    private JButton downButton;
    private JLabel name;
    private JButton reloadButton;
    private JButton removeButton;
    private JTable searchReplaceTable;
    private JScrollPane searchReplaceTableScrollPane;
    private JPanel standardSettings;
    private JTabbedPane tabs;
    private JButton upButton;
    private JCheckBox useForSignatureCheckbox;
    private JPanel validIsSigned;
    private JComboBox validMethod;
    private JTextField validValue;
    private JLabel validValueLabel;
    private BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    @Override
    public String getParameterName() {
        return name.getText();
    }

    @Override
    public void doUnbind() {
        bindingGroup.unbind();
    }
}
