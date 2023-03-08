package lv.acodemy.Homework;

public class FirstHomeWork {
    public static void main (String [] args){
        //byte data type
        byte ticketPrice = 15;
        System.out.println(ticketPrice);
        byte amountOfPrizes =3;
        System.out.println(amountOfPrizes);
        //short data type
        short paymentPerFacility = 2000;
        System.out.println(paymentPerFacility);
        short annualPremiumCost = 900;
        System.out.println(annualPremiumCost);
        //char data type
        char firstBookTitle = 'M';
        System.out.println(firstBookTitle);
        char firstSurnameLetter = 'R';
        System.out.println(firstSurnameLetter);
        //int data type
        int dateOfHolidays = 23062023;
        System.out.println(dateOfHolidays);
        int dateOfProjectStart = 15052023;
        System.out.println(dateOfProjectStart);
        //long data type
        long populationOfEurope = 746000000;
        System.out.println(populationOfEurope);
        long diametrOfEarth = 1274200;
        System.out.println(diametrOfEarth);
        //float data type
        float size = 84.1f;
        System.out.println(size);
        float weight = 55.5f;
        System.out.println(weight);
        //double data type
        double boeings = 183.5;
        System.out.println(boeings);
        //boolean data type
        boolean isSun = true;
        boolean isRain = false;
        boolean isSea = true;
        System.out.printf("%s %s %s\n", isSun, isRain, isSea);
        boolean hasTest = true;
        boolean isHolidays= true;
        System.out.printf("%s %s\n", hasTest, isHolidays);
        // string data type
        String name = "Jelena";
        String surName = "Rodionova";
        System.out.println(name+ " " + surName);

        String fullName = "Jelena Rodionova.\n";
        String aboutMyself1 = "Highly motivated with analytical ability";
       String aboutMyself2 = "very organized and with lot of experience working in a busy office environment.\n";
       String myContactNumber = "My contact is +37129396659.\n";
       System.out.printf(fullName + " " + aboutMyself1 + " " + aboutMyself2 + " " + myContactNumber);


       // + Addition
        int a = 375;
        int b = 448;
        int c =a+b;
        System.out.println(c);

        // - Subtraction
        int d = 26;
        int e = 2;
        int i = d-e;
        System.out.println(i);

        // * Multiplication
        int h = 488;
        int j = 25;
        int k = h*j;
        System.out.println(k);

        // / Division
        int l =500;
        int m =25;
        int n = l/m;
        System.out.println(n);

        int p =250;
        int r =500;
        double result = (double) p/r;
        System.out.println(result);

        // % Remainder
        int number = 25 % 5;
        System.out.println(number);







    }



}
