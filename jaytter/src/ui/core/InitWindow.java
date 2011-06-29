/*
 *  Copyright (C) 2011
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/*
 * InitWindow.java
 *
 * Created on 13/06/2011, 10:48:24
 */
package ui.core;

import ui.core.containers.AccountsList;
import ui.newaccount.NewAccountDialog;

/**
 * Janela onde o usuário vai criar uma credencial ou se autenticar.
 */
public class InitWindow extends javax.swing.JFrame {

    /** Creates new form InitWindow */
    public InitWindow() {
        initComponents();

        setupComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelContainerLogin = new javax.swing.JPanel();
        painelAdicionarConta = new javax.swing.JPanel();
        botaoAdicionarConta = new javax.swing.JButton();
        painelContas = new javax.swing.JPanel();
        painelBaixo = new javax.swing.JPanel();
        barraMenu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JayTTer");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(320, 660));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        painelContainerLogin.setBackground(new java.awt.Color(51, 51, 0));
        painelContainerLogin.setLayout(new java.awt.BorderLayout());

        painelAdicionarConta.setBackground(new java.awt.Color(204, 255, 51));

        botaoAdicionarConta.setText("Adicionar Conta");
        botaoAdicionarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarContaActionPerformed(evt);
            }
        });
        painelAdicionarConta.add(botaoAdicionarConta);

        painelContainerLogin.add(painelAdicionarConta, java.awt.BorderLayout.NORTH);

        painelContas.setBackground(new java.awt.Color(0, 255, 102));
        painelContainerLogin.add(painelContas, java.awt.BorderLayout.CENTER);

        painelBaixo.setPreferredSize(new java.awt.Dimension(306, 250));

        javax.swing.GroupLayout painelBaixoLayout = new javax.swing.GroupLayout(painelBaixo);
        painelBaixo.setLayout(painelBaixoLayout);
        painelBaixoLayout.setHorizontalGroup(
            painelBaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        painelBaixoLayout.setVerticalGroup(
            painelBaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        painelContainerLogin.add(painelBaixo, java.awt.BorderLayout.SOUTH);

        getContentPane().add(painelContainerLogin);

        jMenu1.setText("Twitter");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        barraMenu.add(jMenu1);

        jMenu2.setText("Editar");
        barraMenu.add(jMenu2);

        jMenu3.setText("Ajuda");
        barraMenu.add(jMenu3);

        setJMenuBar(barraMenu);

        getAccessibleContext().setAccessibleDescription("JayTter, O Cliente Twitter multiplataforma");

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void botaoAdicionarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarContaActionPerformed
        NewAccountDialog d = new NewAccountDialog(this, true);
        d.setVisible(true);
    }//GEN-LAST:event_botaoAdicionarContaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new InitWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton botaoAdicionarConta;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel painelAdicionarConta;
    private javax.swing.JPanel painelBaixo;
    private javax.swing.JPanel painelContainerLogin;
    private javax.swing.JPanel painelContas;
    // End of variables declaration//GEN-END:variables

    private void setupComponents() {
        AccountsList listaDeContas = new AccountsList(this);
        this.painelContas.add(listaDeContas);
    }
}
