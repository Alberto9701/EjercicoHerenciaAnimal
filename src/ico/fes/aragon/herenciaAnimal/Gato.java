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
public class Gato extends Animal {
    private String raza;

    public Gato() {
    }

    public Gato(String raza) {
        this.raza = raza;
    }

    public Gato(String raza, int numeroDePatas) {
        super(numeroDePatas);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    @Override
    public void Hablar(){
        System.out.println("Maullido");
    }
    
}
