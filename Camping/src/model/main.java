/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import view.Menu;
import model.Datos;

/******************************************************************************
 *  IS2_L1_Pactica2-3-4_CampingParty
 *  Se realizara una aplicacion para gestionar diversas funciones de un
 *  camping como gestionar reservas, clientes, historicos entre otros.
 * 
 *  Direccion URL del repositorio: https://github.com/Xiquet73/Xiquet73
 * 
 * @author L1_CampingParty_G2
 * @author Callejo, Miguel Angel
 * @author Heras Labrada, Pablo
 * @author Nuñez, Sergio 
 * @author Pacheco Garcia, Jose Miguel
 * @author Raga Casan, Ignacio 
 * @author Sanchez Monreal, Benjamin
 * @version 1.0 11/11/2021
 *****************************************************************************/
public class main {
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Datos datos = new Datos();
                Menu menu = new Menu(datos);
                menu.pack();
                menu.setLocationRelativeTo(null);
                menu.setVisible(true);
            }
        });
    }
    //Direccion URL del repositorio: https://github.com/Xiquet73/Xiquet73
}
