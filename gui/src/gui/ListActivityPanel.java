/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import javax.swing.*;
/**
 *
 * @author Arvid
 */
public class ListActivityPanel extends javax.swing.JPanel {

    /**
     * Creates new form ListActivityPanel
     */
    public ListActivityPanel() {
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

        activityTypeRadioGroup = new javax.swing.ButtonGroup();
        listActivityLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        listTypeLabel = new javax.swing.JLabel();
        groupActivityRadio = new javax.swing.JRadioButton();
        visitActivityRadio = new javax.swing.JRadioButton();
        privateActivityRadio = new javax.swing.JRadioButton();
        allActivityRadio = new javax.swing.JRadioButton();
        listActivitiesButton = new javax.swing.JButton();
        listActivitiesSrollPane = new javax.swing.JScrollPane();
        listActivitiesResultList = new javax.swing.JList();

        listActivityLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listActivityLabel.setText("Lista aktiviteter");

        backButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        backButton.setText("Tillbaka");
        backButton.setPreferredSize(new java.awt.Dimension(80, 23));

        listTypeLabel.setText("Typ:");

        activityTypeRadioGroup.add(groupActivityRadio);
        groupActivityRadio.setText("Grupp");

        activityTypeRadioGroup.add(visitActivityRadio);
        visitActivityRadio.setText("Besök");

        activityTypeRadioGroup.add(privateActivityRadio);
        privateActivityRadio.setText("Privat");

        activityTypeRadioGroup.add(allActivityRadio);
        allActivityRadio.setSelected(true);
        allActivityRadio.setText("Alla");

        listActivitiesButton.setText("Lista");

        listActivitiesSrollPane.setViewportView(listActivitiesResultList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listActivityLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1009, Short.MAX_VALUE)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listActivitiesSrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(listTypeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(groupActivityRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(visitActivityRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(privateActivityRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(allActivityRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(listActivitiesButton)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listActivityLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listTypeLabel)
                    .addComponent(groupActivityRadio)
                    .addComponent(visitActivityRadio)
                    .addComponent(privateActivityRadio)
                    .addComponent(allActivityRadio)
                    .addComponent(listActivitiesButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listActivitiesSrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup activityTypeRadioGroup;
    private javax.swing.JRadioButton allActivityRadio;
    private javax.swing.JButton backButton;
    private javax.swing.JRadioButton groupActivityRadio;
    private javax.swing.JButton listActivitiesButton;
    private javax.swing.JList listActivitiesResultList;
    private javax.swing.JScrollPane listActivitiesSrollPane;
    private javax.swing.JLabel listActivityLabel;
    private javax.swing.JLabel listTypeLabel;
    private javax.swing.JRadioButton privateActivityRadio;
    private javax.swing.JRadioButton visitActivityRadio;
    // End of variables declaration//GEN-END:variables

    public JButton getBackButton() { return backButton; }
    public JButton getListActivitiesButton() { return listActivitiesButton; }
    
    public JRadioButton getAllRadio() { return allActivityRadio; }
    public JRadioButton getGroupRadio() { return groupActivityRadio; }
    public JRadioButton getVisitRadio() { return visitActivityRadio; }
    public JRadioButton getPrivateRadio() { return privateActivityRadio; }
    
    public JList getActivitiesResultList() { return listActivitiesResultList; }
    public void setActivitiesResultList(JList result) { listActivitiesResultList = result; }
    public void updateResultPane() { listActivitiesSrollPane.setViewportView(listActivitiesResultList); }
    
}