package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("HP", 15, 256));
        laptops.add(new Laptop("Acer", 10, 128));
        laptops.add(new Laptop("Mac", 105, 512));
        laptops.add(new Laptop("Lenovo", 25, 64));

        //Collections.sort(laptops);
        //Collections.max(laptops);
        //Collection.min(laptops); - puikiai veikia su streams

        Collections.sort(laptops);
        for (Laptop laptop : laptops) {
            System.out.println(laptop);

        }

        System.out.println("Brangiausias kompas yra: ");
        System.out.println(Collections.max(laptops));

    }
}
