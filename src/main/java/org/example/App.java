package org.example;

import org.example.peaksoft.congiguratin.Capital;
import org.example.peaksoft.congiguratin.Country;
import org.example.peaksoft.congiguratin.CountryRepo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        Country country = new Country();
        country.setName("UZBEKSTAN");

        Capital capital = new Capital();
        capital.setCapitalName("TASHKENT");
        capital.setPopulation(3600000L);
        capital.setCode(5423532L);
        country.setCapital(capital);

//        Country country1 = new Country();
//        country1.setName("U.S.A");
//        Capital capital1 = new Capital();
//        capital.setCapitalName("VASHIHTON");
//        capital.setPopulation(3600000l);
//        capital.setCode(124352525l);
//        country1.setCapital(capital1);


        CountryRepo countryRepo = new CountryRepo();
        System.out.println(countryRepo.findAll());


    }
}
