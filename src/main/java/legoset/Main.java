package legoset;


import java.time.Year;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

import jaxb.JAXBHelper;


public class Main {

    public static void main(String[] args) throws Exception {
        LegoSet legoset = new LegoSet();
        legoset.setNumber("75211");
        legoset.setName("Imperial TIE Fighter");
        legoset.setTheme("Star Wars");
        legoset.setSubtheme("Solo");
        legoset.setYear(Year.of(2018));
        legoset.setPieces(519);

    //    legoset.setTags(Set.of("Starfighter", "Stormtrooper", "Star Wars", "Solo"));

        Set<String> tags = new LinkedHashSet<>();
        tags.add("Starfighter");
        tags.add("Stormtrooper");
        tags.add("Star Wars");
        tags.add("Solo");
        legoset.setTags(tags);

        ArrayList<Minifig> minifigs = new ArrayList<>();
        minifigs.add(new Minifig("Imperial Mudtrooper",2));
        minifigs.add(new Minifig("Imperial Pilot",1));
        minifigs.add(new Minifig("Mimban Stormtrooper",1));
        legoset.setMinifigs(minifigs);

        Weight weight = new Weight();

        weight.setUnit("kg");
        weight.setValue(0.89);
        legoset.setWeight(weight);


        legoset.setUrl("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter");

        JAXBHelper.toXML(legoset, System.out);

    }
}
