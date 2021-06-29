/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaanimal;

import ico.fes.aragon.herenciaAnimal.*;

/**
 *
 * @author JOSEALBERTO
 */
public class HerenciaAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //prueaba con clase de animal
        System.out.println("**Prueba con clase animal**\n");
        Animal animal1=new Animal();
        animal1.setNumeroDePatas(6);
        System.out.println("Numero de patas del animal: "+ animal1.getNumeroDePatas()); //System.out.println(animal1.getNumeroDePatas());
        System.out.println("\nSonido del animal: ");
        animal1.Hablar();
        //prueba con clase perro
        System.out.println("**Prueba con clase perro**\n");
        Perro perro1=new Perro();
        perro1.setNumeroDePatas(4);
        perro1.setRaza("Doberman");
        System.out.println("Numero de patas del perro: "+perro1.getNumeroDePatas());  // System.out.println(perro1.getNumeroDePatas());
        System.out.println("\nRaza del perro: "+perro1.getRaza());   //System.out.println(perro1.getRaza());
        System.out.println("\nSonido del animal: ");
        perro1.Hablar();
        //prueba con clse gato
        System.out.println("\n**Prueba con clase gato**\n");
        Gato gato1 =new Gato();
        gato1.setNumeroDePatas(4);
        gato1.setRaza("gato persa");
        System.out.println("Numero de patas del gato: "+gato1.getNumeroDePatas());   //System.out.println(gato1.getNumeroDePatas());
        System.out.println("\nRaza del gato: "+gato1.getRaza());   //System.out.println(gato1.getRaza());
        System.out.println("\nSonido del animal: ");
        gato1.Hablar();
    }
    
}
