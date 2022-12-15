package gui;

import java.net.SocketOptions;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import oop6.Paciente;
import oop6.Sistema;

public class PainelAtestadosPaciente extends javax.swing.JFrame {
    Sistema sistema_painel_atestado_paciente;
    Paciente paciente;

    public PainelAtestadosPaciente() {
        paciente = new Paciente();
        sistema_painel_atestado_paciente = new Sistema();
        initComponents();
        this.setLocationRelativeTo(null);
        tabelaAtestados.setDefaultEditor(Object.class, null);
        tabelaAtestados.getTableHeader().setReorderingAllowed(false);
    }
    
    public void carrega_atestados(){
        DefaultTableModel model = (DefaultTableModel) tabelaAtestados.getModel();
        for(int i = 0; i < this.sistema_painel_atestado_paciente.lista_atestados.size(); i++){
            if(this.paciente.getNome().compareTo(this.sistema_painel_atestado_paciente.lista_atestados.get(i).getNomePaciente())==0){
                model.addRow(recupera_dados(i));
            }
        }
    }
    
    private String[] recupera_dados(int i){
        List<String> dados = new ArrayList<>();
        String nome_paciente = this.sistema_painel_atestado_paciente.lista_atestados.get(i).getNomePaciente();
        String nome_medico = this.sistema_painel_atestado_paciente.lista_atestados.get(i).getNomeMedico();
        String razao = this.sistema_painel_atestado_paciente.lista_atestados.get(i).getRazao();
        String crm_medico = this.sistema_painel_atestado_paciente.lista_atestados.get(i).getCRM();
        int days = this.sistema_painel_atestado_paciente.lista_atestados.get(i).duracao_dias;
        LocalDate com = (this.sistema_painel_atestado_paciente.lista_atestados.get(i).data);
        LocalDate lim = com.plusDays(days);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        String data_consulta = com.format(formatter);
        String data_limite = lim.format(formatter);
        dados.add(nome_paciente);
        dados.add(data_consulta);
        dados.add(data_limite);
        dados.add(razao);
        dados.add(crm_medico);
        dados.add(nome_medico);
        String[] stringarray = dados.toArray(new String[0]);
        return stringarray;
    }
    
    public void setPaciente(Paciente novo_paciente){
        this.paciente = novo_paciente;
    }
    
    public Paciente getPaciente(){
        return this.paciente;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaAtestados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Atestados Médicos");

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabelaAtestados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Paciente", "Data Consulta", "Data Limite", "Razão", "CRM Medico", "Nome Medico"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaAtestados);
        if (tabelaAtestados.getColumnModel().getColumnCount() > 0) {
            tabelaAtestados.getColumnModel().getColumn(3).setPreferredWidth(150);
        }

        jScrollPane3.setViewportView(jScrollPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(516, 516, 516)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 927, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(436, 436, 436)
                        .addComponent(jLabel1)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PainelPaciente painel_paciente = new PainelPaciente();
        painel_paciente.setPaciente(paciente);
        painel_paciente.setLabels();
        painel_paciente.setVisible(true);
        painel_paciente.sistema_painel_paciente.carrega_listas(this.sistema_painel_atestado_paciente.lista_funcionarios, this.sistema_painel_atestado_paciente.lista_pacientes);
        painel_paciente.sistema_painel_paciente.carrega_listas_medicas(this.sistema_painel_atestado_paciente.lista_consultas, this.sistema_painel_atestado_paciente.lista_atestados);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

  
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
            java.util.logging.Logger.getLogger(PainelAtestadosPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PainelAtestadosPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PainelAtestadosPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PainelAtestadosPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PainelAtestadosPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabelaAtestados;
    // End of variables declaration//GEN-END:variables
}
