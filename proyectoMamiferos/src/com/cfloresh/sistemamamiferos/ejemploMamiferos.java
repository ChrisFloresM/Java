package com.cfloresh.sistemamamiferos;

import com.cfloresh.sistemamamiferos.mamiferos.Mamifero;
import com.cfloresh.sistemamamiferos.mamiferos.especies.Guepardo;
import com.cfloresh.sistemamamiferos.mamiferos.especies.Leon;

import java.util.ArrayList;

public class ejemploMamiferos {

    public static void main(String[] args) {

        ArrayList<Mamifero> mamiferosList = new ArrayList<>();

        mamiferosList.add(new Guepardo("La sabana", 1.3f, 2.2f, 250.2f, "Guepardus pardus",
                12.3f, 250));
        mamiferosList.add(new Leon("La sabana", 1.8f, 3.2f, 300f, "Leonicus",
                23.3f, 220, 6, 234f));

        for(Mamifero m : mamiferosList) {
            String[] Especie = m.getClass().getName().split("\\.");

            System.out.println("Especie: " + Especie[Especie.length - 1]);
            System.out.println(m.comer());
            System.out.println(m.dormir());
            System.out.println(m.correr());
            System.out.println(m.comunicarse());
            System.out.println();
        }
    }
}
