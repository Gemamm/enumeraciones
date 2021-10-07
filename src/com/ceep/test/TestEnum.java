package com.ceep.test;


import com.ceep.enumeraciones.Continentes;
import com.ceep.enumeraciones.Dias;



public class TestEnum {
    
    public static void main(String[] args) {
//        System.out.println("Primer dia de la semana: "+Dias.LUNES);
        
        diasSemana(Dias.LUNES);
        System.out.println("EL pais numero 1 es: "+Continentes.AFRICA);
        System.out.println("Numero de paises de Africa: "+Continentes.AFRICA.getNumPaises());
        
    }
    
    public static void diasSemana(Dias dias){
    switch (dias){
        case LUNES:
            System.out.println("EL PRIMER DIA DE LA SEMANA");
            break;
        case MARTES:
            System.out.println("El segundo dia de la semana");
            break;
        default:
            throw new AssertionError();
            
    }
}
  
}
