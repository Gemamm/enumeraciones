
package com.ceep.enumeraciones;


public enum Continentes {
    AFRICA(53, "1.2 billones de habitantes"),
    ASIA(46, ""),
    AMERICA(44, ""),
    EUROPA(34, ""),
    OCEANIA(14, "");
    
    private final int numPaises;
    private final String numHab;
        
    Continentes (int numPaises,  String numHab){
    this.numPaises=numPaises;
    this.numHab=numHab;
}

    public String getNumHab() {
        return numHab;
    }

    public int getNumPaises() {
        return numPaises;
    }
    
}
