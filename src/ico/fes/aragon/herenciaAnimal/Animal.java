/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.aragon.herenciaAnimal;

/**
 *
 * @author JOSEALBERTO
 */
public class Animal {
    private int numeroDePatas;

    public Animal() {
    }

    public Animal(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }
    
    public void Hablar(){
        System.out.println("animal Hablando\n");
        
    }
}
