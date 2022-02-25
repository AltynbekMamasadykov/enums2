package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {


       //birinchi variant

       Oblast[] oblasts = Oblast.values(); //Бут константаларды массивгесалып кайтарып берет

        for (Oblast obl:oblasts) {
            System.out.println(obl);
        }

        System.out.println();

        //ekinchi variant

        Oblasttar oblasttar = Oblasttar.ЖАЛАЛАБАД;

        switch (oblasttar){
            case ОШ -> System.out.println("Kerme Too");
            case ЧУЙ -> System.out.println("Sary Ozon");
            case НАРЫН -> System.out.println("Tenir Too");
            case ТАЛАС -> System.out.println("Manas");
            case ЫСЫККОЛ -> System.out.println("Kyrgyz Bermeti");
            case БАТКЕН -> System.out.println("Orukzar");
            case ЖАЛАЛАБАД -> System.out.println("Arslanbab");

        }
        System.out.println(oblasttar.ordinal()); //  канчанчы орунда туратэкенин кайтарып берет,
        System.out.println(oblasttar.name()); // атын кайтарат

        String str  = "жаллават";

        try{
            System.out.println(oblasttar.valueOf(str.toUpperCase(Locale.ROOT))); // Созго карата константа кайтарат.
        } catch (IllegalArgumentException e) {
            System.out.println(str+" деген област жок");
        }

    }
}
