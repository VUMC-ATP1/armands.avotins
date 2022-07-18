package main.java.homework;

public class FirstClass {


    public static void main(String[] args) {

        String countryName = "Latvia";
        int countryPopulation = 1875757;
        int countryArea = 64589;
        String countryCapital = "Riga";
        String countryLanguage = "Latviešu";
        boolean isEUCountry = true;
        char countryCurrency = '€';

        System.out.printf(" Valsts: %s,\n Iedzīvotāju skaits: %d,\n Platība: %d,\n Galvaspilsēta: %s,\n Valsts valoda: %s,\n Atrodas EU: %b,\n Valūtas simbols: %c\n", countryName, countryPopulation, countryArea, countryCapital, countryLanguage, isEUCountry, countryCurrency);

        System.out.println("==========================");
        String pirmaTekstaDala = "Vasarā saldējumu ēst ir vislabāk. ";
        String otraTekstaDala = "Dažreiz vasarā ir ļoti karsti. ";
        String tresaTekstaDala = "Šīs vasaras temperatūras rekords manā dzīvojamajā istabā bija ";
        int temperaturaC = 32;
        char temperatureMesurementUnit = 'c';
        System.out.printf("Ja runā par vasaru... %s %s %s %d grādi pēc celsija (%s)\n", pirmaTekstaDala, otraTekstaDala, tresaTekstaDala, temperaturaC, temperatureMesurementUnit);
        System.out.println("==========================");

        aritmetiskasDarbibas(9, 2, 3);


    }

    public static void aritmetiskasDarbibas(double sk1, double sk2, double sk3) {

        System.out.println("Saskaitīšana");
        System.out.printf("%.3f + %.3f = %.3f%n", sk1, sk2, (sk1 + sk2));
        System.out.printf("%.3f + %.3f = %.3f%n", sk2, sk3, (sk2 + sk3));
        System.out.printf("%.3f + %.3f = %.3f%n", sk1, sk3, (sk1 + sk3));

        System.out.println("Atņemšana");
        System.out.printf("%.3f - %.3f = %.3f%n", sk1, sk2, (sk1 - sk2));
        System.out.printf("%.3f - %.3f = %.3f%n", sk2, sk3, (sk2 - sk3));
        System.out.printf("%.3f - %.3f = %.3f%n", sk1, sk3, (sk1 - sk3));

        System.out.println("Reizināšana");
        System.out.printf("%.3f * %.3f = %.3f%n", sk1, sk2, (sk1 * sk2));
        System.out.printf("%.3f * %.3f = %.3f%n", sk2, sk3, (sk2 * sk3));
        System.out.printf("%.3f * %.3f = %.3f%n", sk1, sk3, (sk1 * sk3));

        System.out.println("Dalīšana");
        System.out.printf("%.3f / %.3f = %.3f%n", sk1, sk2, (sk1 / sk2));
        System.out.printf("%.3f / %.3f = %.3f%n", sk2, sk3, (sk2 / sk3));
        System.out.printf("%.3f / %.3f = %.3f%n", sk1, sk3, (sk1 / sk3));

        System.out.println("Atlikums");
        System.out.printf("%.3f %c %.3f = %.3f%n", sk1, '%', sk2, (sk1 % sk2));
        System.out.printf("%.3f %c %.3f = %.3f%n", sk2, '%', sk3, (sk2 % sk3));
        System.out.printf("%.3f %c %.3f = %.3f%n", sk1, '%', sk3, (sk1 % sk3));
    }
}
