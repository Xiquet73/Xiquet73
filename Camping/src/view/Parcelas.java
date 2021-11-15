/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import model.Datos;
import model.ModelParcela;

/**
 *
 * @author Freedan
 */
public class Parcelas extends javax.swing.JFrame {
public Datos datos;
public DefaultComboBoxModel modeloParcela = new DefaultComboBoxModel();

    /**
     * Creates new form Parcelas
     */
    public Parcelas(Datos datos) {
        this.datos = datos;
        initComponents();
        
        comboParcela.setModel(modeloParcela);
        int id;
        for (int i=0; i<datos.getParcelas().size();i++)
        {
            id = datos.getParcelas().get(i).getIdentificador();
            String iden = Integer.toString(id);
            comboParcela.addItem(iden);
            
        }
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
        jLabel1 = new javax.swing.JLabel();
        comboParcela = new javax.swing.JComboBox<>();
        crearJbutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtMetros = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comboLuz = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        txtDescuento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(204, 153, 0));

        jLabel1.setForeground(new java.awt.Color(204, 153, 0));
        jLabel1.setText("Selecciona una parcela:");

        comboParcela.setBackground(new java.awt.Color(102, 102, 102));
        comboParcela.setForeground(new java.awt.Color(255, 255, 255));
        comboParcela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboParcelaActionPerformed(evt);
            }
        });

        crearJbutton.setBackground(new java.awt.Color(255, 153, 0));
        crearJbutton.setText("Crear Parcela");
        crearJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearJbuttonActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(204, 153, 0));
        jLabel2.setText("M2:");

        txtMetros.setBackground(new java.awt.Color(102, 102, 102));
        txtMetros.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setForeground(new java.awt.Color(204, 153, 0));
        jLabel4.setText("Luz:");

        comboLuz.setBackground(new java.awt.Color(102, 102, 102));
        comboLuz.setForeground(new java.awt.Color(255, 255, 255));
        comboLuz.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        comboLuz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboLuzActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(204, 153, 0));
        jLabel3.setText("Codigo:");

        txtId.setBackground(new java.awt.Color(102, 102, 102));
        txtId.setForeground(new java.awt.Color(255, 255, 255));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(204, 153, 0));
        jLabel5.setText("€/dia:");

        txtPrecio.setBackground(new java.awt.Color(102, 102, 102));
        txtPrecio.setForeground(new java.awt.Color(255, 255, 255));

        txtDescuento.setBackground(new java.awt.Color(102, 102, 102));
        txtDescuento.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setForeground(new java.awt.Color(204, 153, 0));
        jLabel6.setText("Descuento por mas de 15 dias:");

        jButton3.setBackground(new java.awt.Color(184, 47, 47));
        jButton3.setText("Volver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 153, 0));
        jButton2.setText("Guardar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(comboLuz, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel5))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtMetros, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36)
                                                .addComponent(jLabel3)))
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(24, 24, 24)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtId)
                                    .addComponent(txtPrecio)
                                    .addComponent(txtDescuento)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addComponent(crearJbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(crearJbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMetros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboLuz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Admin admin = new Admin(datos);
        this.setVisible(false);
        admin.pack();
        admin.setLocationRelativeTo(null);
        admin.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void comboParcelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboParcelaActionPerformed
       
        for(int i=0; i<datos.getParcelas().size();i++){
            int id = datos.getParcelas().get(i).getIdentificador();
            String iden = Integer.toString(id);
            if(iden.equals(comboParcela.getSelectedItem())){
                float m = datos.getParcelas().get(i).getTamanyo();
                String metros = String.valueOf(m);
                txtMetros.setText(metros);
                int codigo = datos.getParcelas().get(i).getIdentificador();
                String c = String.valueOf(codigo);
                txtId.setText(c);
                float precio = datos.getParcelas().get(i).getPrecio();
                String p = String.valueOf(precio);
                txtPrecio.setText(p);
                boolean luz = datos.getParcelas().get(i).isElectricidad();
                {
                    if(luz){
                        comboLuz.setSelectedIndex(0);
                    }
                    else
                        comboLuz.setSelectedIndex(1);
                }
                float descuento = datos.getParcelas().get(i).getDescuento();
                String desc = String.valueOf(descuento);
                txtDescuento.setText(desc);
                
            }
        }
        
    }//GEN-LAST:event_comboParcelaActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        
    }//GEN-LAST:event_txtIdActionPerformed

    private void crearJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearJbuttonActionPerformed
        boolean l;
        String metros = txtMetros.getText();
        float m = Float.parseFloat(metros);
        String id = txtId.getText();
        int iden = Integer.parseInt(id);  //Cambiar
        int luz = comboLuz.getSelectedIndex();
        if (luz == 0){
           l = true;
        }
        else 
        {
            comboLuz.setSelectedIndex(1);
            l = false;
        }
        String precio = txtPrecio.getText();
        float p = Float.parseFloat(precio);
        String descuento = txtPrecio.getText();
        float desc = Float.parseFloat(descuento);
        
        ModelParcela parcela = new ModelParcela(iden,m,desc,false, p,l);
        datos.addParcela(parcela);
        
        modeloParcela.removeAllElements();
        
        for (int i=0; i<datos.getParcelas().size();i++)
        {
            int identificador = datos.getParcelas().get(i).getIdentificador();
            String identi = Integer.toString(identificador);
            comboParcela.addItem(identi);
            
        }
    }//GEN-LAST:event_crearJbuttonActionPerformed

    private void comboLuzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboLuzActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboLuzActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboLuz;
    private javax.swing.JComboBox<String> comboParcela;
    private javax.swing.JButton crearJbutton;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMetros;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

}
