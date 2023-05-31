package com.mycompany.liga.futbol;



public class Primera extends Liga {

    @Override
    public void Bonus(Equipo a) {
        
        a.setValorE(a.getValorE()* 1.2);
        
    }
    
    @Override
    public void Victoria(Equipo a) {
        System.out.println(a.getEquipo() + " a ganado");
    }
   
}
