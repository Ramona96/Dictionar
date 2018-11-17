package com.company;

import java.util.HashMap;
import java.util.Map;

public class Dictionar {

    Map<String,Cuvant> mapCuvinte = new HashMap<String, Cuvant>();


    public boolean adaugaInLista(String cuvant, String traducere, String antonim){

        Cuvant cuvantIntrodus = new Cuvant(cuvant,traducere,antonim);

        if (this.mapCuvinte.containsKey(cuvant))
            return false;

        mapCuvinte.put(cuvant,cuvantIntrodus);
        return true;

    }


    public boolean stergeDinLista(String cuvant){

        if(!(this.mapCuvinte.containsKey(cuvant)))
            return false;

        this.mapCuvinte.remove(cuvant);
        return true;
}

    public Cuvant gasesteCuvant(String cuvant){

        return this.mapCuvinte.get(cuvant);

    }




}
