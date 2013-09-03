/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package autocomp.UI;

import autocomp.entidades.Grupo;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.ImportacaoProf;
import logica.Questoes;

/**
 *
 * @author adriano
 */
public class ConsQuestaoPanel extends javax.swing.JPanel {

    /**
     * Creates new form QuestaoPanel
     */
    public ConsQuestaoPanel(Grupo g) {
        grupo = g;
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

        AltCorretaGroup = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        VoltarButton = new javax.swing.JButton();
        AlterarButton = new javax.swing.JButton();

        Questoes questoes = new Questoes();
        DefaultTableModel model = new DefaultTableModel(
            new String [] {
                "Id", "Enunciado", "DIsciplina", "Dificuldade"
            }, 0);
            for(int i = 1; i < questoes.novaQuestao(); i++)
            model.addRow(    new Object []{
                questoes.getQuestao(i).getId(),
                questoes.getQuestao(i).getEnunciado(),
                questoes.getQuestao(i).getDisciplina().getNome(),
                questoes.getQuestao(i).getDificuldadeText()
            });
            jTable1.setModel(model);
            jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
            jTable1.getTableHeader().setReorderingAllowed(false);
            jScrollPane2.setViewportView(jTable1);

            VoltarButton.setText("Voltar");
            VoltarButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    VoltarButtonActionPerformed(evt);
                }
            });

            AlterarButton.setText("Alterar");
            AlterarButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    AlterarButtonActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2)
                    .addContainerGap())
                .addGroup(layout.createSequentialGroup()
                    .addGap(278, 278, 278)
                    .addComponent(VoltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addComponent(AlterarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(253, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(VoltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AlterarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(32, Short.MAX_VALUE))
            );
        }// </editor-fold>//GEN-END:initComponents

    private void VoltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarButtonActionPerformed
        MenuPanel menuPanel = new MenuPanel(grupo);
        JFrame jf = (JFrame) this.getTopLevelAncestor();
        jf.getContentPane().removeAll();
        jf.getContentPane().add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, menuPanel.getPreferredSize().height));
        jf.setMinimumSize(menuPanel.getPreferredSize());
        jf.pack();  
    }//GEN-LAST:event_VoltarButtonActionPerformed

    private void AlterarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarButtonActionPerformed
        int id = jTable1.getSelectedRow();
        if(!ImportacaoProf.isImported())
            JOptionPane.showMessageDialog(this, "Não há disciplinas cadastradas!", "Erro", JOptionPane.ERROR_MESSAGE);
        else{
            QuestaoAltPanel questaoPanel = new QuestaoAltPanel(grupo, id + 1);
            JFrame jf = (JFrame) this.getTopLevelAncestor();
            jf.getContentPane().removeAll();
            jf.getContentPane().add(questaoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, questaoPanel.getPreferredSize().height));
            jf.setMinimumSize(questaoPanel.getPreferredSize());
            jf.pack();
        }

    }//GEN-LAST:event_AlterarButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup AltCorretaGroup;
    private javax.swing.JButton AlterarButton;
    private javax.swing.JButton VoltarButton;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    Grupo grupo;
}