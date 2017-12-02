/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.vista;

import ec.edu.ister.modelo.Persona;
import ec.edu.ister.modelo.TipoDeMetodo;
import static ec.edu.ister.modelo.TipoDeMetodo.*;   //exporta todas los metodos estaticos de la clase tipo de metodo
import static javax.swing.JOptionPane.*;             //exporta todos los metodos estaticos de la clase jotion pane
import static java.lang.Math.*;                      // con esto solo 

/**
 *
 * @author Toshiba
 */
public class Aplicacion {

    public static void main(String[] args) {
        //TipoDeMetodo.metodoStatico();
        //TipoDeMetodo.metodoStatico2(5);
      //  showMessageDialog(null, pow(2,3));
        ///TipoDeMetodo tp=new TipoDeMetodo();                                      // esta haciendo un constructor por el parentesis es un constructor por new
        
        //tp.suma(6,7);
        
        
        Persona p=new Persona();
        p.setCedula("1724306962");
        
        showMessageDialog(null, p.getCedula());
    }
    
}
