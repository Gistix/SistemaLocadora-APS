package locadora.ui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marco
 */
public class int_add_filme extends javax.swing.JFrame {

    /**
     * Creates new form int_add_filme
     */
    public int_add_filme() {
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

        jLabel6 = new javax.swing.JLabel();
        titulo_ct = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        classificacao_opcoes = new javax.swing.JComboBox<>();
        acao_cs = new javax.swing.JCheckBox();
        drama_cs = new javax.swing.JCheckBox();
        animacao_cs = new javax.swing.JCheckBox();
        ficcao_cs = new javax.swing.JCheckBox();
        aventura_cs = new javax.swing.JCheckBox();
        romance_cs = new javax.swing.JCheckBox();
        comedia_cs = new javax.swing.JCheckBox();
        terror_cs = new javax.swing.JCheckBox();
        port_br_cs = new javax.swing.JCheckBox();
        port_pt_cs = new javax.swing.JCheckBox();
        espanhol_cs = new javax.swing.JCheckBox();
        ingles_cs = new javax.swing.JCheckBox();
        frances_cs = new javax.swing.JCheckBox();
        italiano_cs = new javax.swing.JCheckBox();
        russo_cs = new javax.swing.JCheckBox();
        japones_cs = new javax.swing.JCheckBox();
        dt_lanc_ct = new javax.swing.JTextField();
        confirmar_cadastro_filme_bt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setText("Título:");

        jLabel7.setText("Classificação:");

        jLabel8.setText("Data de lançamento:");

        jLabel9.setText("Gênero: ");

        jLabel10.setText("Idiomas disponiveis:");

        classificacao_opcoes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "L (Livre para todas as idades).", "Proibido para menores de 10 anos de idade.", "Proibido para menores de 12 anos de idade.", "Proibido para menores de 14 anos de idade.", "Proibido para menores de 16 anos de idade.", "Proibido para menores de 18 anos de idade." }));

        acao_cs.setText("Ação");

        drama_cs.setText("Drama");

        animacao_cs.setText("Animação");

        ficcao_cs.setText("Ficção Ciêntifica");

        aventura_cs.setText("Aventura");

        romance_cs.setText("Romance");

        comedia_cs.setText("Comédia");

        terror_cs.setText("Terror");

        port_br_cs.setText("Português-BR");

        port_pt_cs.setText("Português-PT");

        espanhol_cs.setText("Espanhol");

        ingles_cs.setText("Inglês");

        frances_cs.setText("Francês");

        italiano_cs.setText("Italiano");

        russo_cs.setText("Russo");

        japones_cs.setText("Japonês");

        dt_lanc_ct.setToolTipText("00/00/2020");
        dt_lanc_ct.setName(""); // NOI18N

        confirmar_cadastro_filme_bt.setText("Adicionar filme");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(dt_lanc_ct, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(titulo_ct, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(classificacao_opcoes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(drama_cs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ficcao_cs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(romance_cs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(terror_cs))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(acao_cs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(animacao_cs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aventura_cs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comedia_cs))
                    .addComponent(jLabel10)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(port_br_cs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(port_pt_cs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(espanhol_cs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ingles_cs))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(frances_cs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(italiano_cs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(russo_cs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(japones_cs)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirmar_cadastro_filme_bt)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titulo_ct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(classificacao_opcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dt_lanc_ct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(acao_cs)
                                    .addComponent(animacao_cs)
                                    .addComponent(aventura_cs)
                                    .addComponent(comedia_cs))
                                .addGap(23, 23, 23))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(drama_cs)
                                .addComponent(ficcao_cs)
                                .addComponent(romance_cs)
                                .addComponent(terror_cs)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(port_br_cs)
                            .addComponent(port_pt_cs)
                            .addComponent(espanhol_cs)
                            .addComponent(ingles_cs))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(frances_cs)
                            .addComponent(italiano_cs)
                            .addComponent(russo_cs)
                            .addComponent(japones_cs))))
                .addGap(18, 18, 18)
                .addComponent(confirmar_cadastro_filme_bt)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(int_add_filme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(int_add_filme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(int_add_filme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(int_add_filme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new int_add_filme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox acao_cs;
    private javax.swing.JCheckBox animacao_cs;
    private javax.swing.JCheckBox aventura_cs;
    private javax.swing.JComboBox<String> classificacao_opcoes;
    private javax.swing.JCheckBox comedia_cs;
    private javax.swing.JButton confirmar_cadastro_filme_bt;
    private javax.swing.JCheckBox drama_cs;
    private javax.swing.JTextField dt_lanc_ct;
    private javax.swing.JCheckBox espanhol_cs;
    private javax.swing.JCheckBox ficcao_cs;
    private javax.swing.JCheckBox frances_cs;
    private javax.swing.JCheckBox ingles_cs;
    private javax.swing.JCheckBox italiano_cs;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JCheckBox japones_cs;
    private javax.swing.JCheckBox port_br_cs;
    private javax.swing.JCheckBox port_pt_cs;
    private javax.swing.JCheckBox romance_cs;
    private javax.swing.JCheckBox russo_cs;
    private javax.swing.JCheckBox terror_cs;
    private javax.swing.JTextField titulo_ct;
    // End of variables declaration//GEN-END:variables
}