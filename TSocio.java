/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project7;

/**
 *
 * @author Federico Nicolás Bouvier
 */
public class TSocio {
    private String nombreApellido, documentoIdentidad, numeroTelefono, categoriaSocio; //Atributos privados de la clase
    
    public TSocio(String nomApe, String docIde, String numTel, String catSoc){ //Constructor con parámetros que asigna los valores correspondientes a cada variable
        nombreApellido = nomApe;
        documentoIdentidad = docIde;
        numeroTelefono = numTel;
        categoriaSocio = catSoc;
    }
    
    public String getNombreApellido() { //Método para devolver el valor de "nombreApellido"
        return nombreApellido;
    }

    public String getDocumentoIdentidad() { //Método para devolver el valor de "documentoIdentidad"
        return documentoIdentidad;
    }

    public String getNumeroTelefono() { //Método para devolver el valor de "numeroTelefono"
        return numeroTelefono;
    }

    public String getCategoriaSocio() { //Método para devolver el valor de "categoriaSocio"
        return categoriaSocio;
    }

    @Override
    public String toString() { //Utilizo el método toString() para luego mostrar cada característica de los socios en una misma línea 
        return nombreApellido + " - " + documentoIdentidad + " - " + numeroTelefono + " - " + categoriaSocio;
    }
}
