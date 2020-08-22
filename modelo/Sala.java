/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

public class Sala {
   
    private String id;
    private Silla sillas[] = new Silla[60];

    public String getId() {
        return id;
    }

    public Silla[] getSillas() {
        return sillas;
    }
    

    public Sala(String id){
        this.id = id;
        //Se crean las sillas con su repectivo tipo, número y precio de acuerdo a él 
        for (int i = 0; i < 60; i++){
            String tipo = "general";
            int precio = 11000;
            if (i >= 40){
                tipo = "preferencial";
                precio = 15000;
            }
            sillas[i] = new Silla(tipo, precio, i+1);
        }        
    }
}
