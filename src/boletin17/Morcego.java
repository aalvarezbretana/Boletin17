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
public class Morcego extends Mamifero implements IPodeVolar{

    @Override
    public void voar() {
        System.out.println("Pode Voar");
    }
    
}
