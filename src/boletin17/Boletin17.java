/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17;

/**
 *
 * @author aalvarezbretana
 */
public class Boletin17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("-Tigre-");
        Tigre tigre = new Tigre();
        tigre.camiñar();
        tigre.nadar();
        System.out.println("\n-Gato-");
        Gato gato = new Gato();
        gato.camiñar();
        gato.nadar();
        System.out.println("\n-Avestruz-");
        Avestruz avestruz = new Avestruz();
        avestruz.camiñar();
        System.out.println("\n-Papagaio-");
        Papagaio papagaio = new Papagaio();
        papagaio.camiñar();
        papagaio.voar();
        System.out.println("\n-Morcego-");
        Morcego morcego = new Morcego();
        morcego.camiñar();
        morcego.voar();
  
    }
    
}
