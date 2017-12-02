/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

/**
 *
 * @author Toshiba
 */
public class TipoDeMetodo {

    public static void metodoStatico() {
        System.out.println("Este es un metodo estatico");

    }

    public static void metodoStatico2(int p) {                      //este es el modelo formalmente llamado metodo
        System.out.println("El numero ingresado es:" + p);

    }

    public static int metodoStatico3(int p) {
        return p;                                           //retorna un valor en este caso un entero int
    }
    public static void suma(int x, int y) {
        System.out.println("la suma es" +(x+y));
        
    }
    
    
}
