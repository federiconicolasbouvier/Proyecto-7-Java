/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project7;

import javax.swing.JOptionPane;

/**
 *
 * @author Federico Nicolás Bouvier
 */
public class Project7 {

    public static void main(String[] args) {
        Project7GUI ventana = new Project7GUI();
        ventana.setVisible(true);   
        JOptionPane.showMessageDialog(null, "Si lo desea, puede oprimir el botón ABRIR para mostrar todos los socios."); //Mensaje indicativo para utilizar la aplicación
    }
}
