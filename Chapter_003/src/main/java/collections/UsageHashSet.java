package collections;

import java.util.HashSet;

public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<String>();
        autos.add("Lada");
        autos.add("bmw");
        autos.add("Volvo");
        autos.add("Toyota");
        for (String aut : autos) {
            System.out.println(aut);
        }
    }
    }
