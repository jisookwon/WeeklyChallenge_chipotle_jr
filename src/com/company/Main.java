package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

	    ArrayList<String> rice   = new ArrayList<>();
        ArrayList<String> meat   = new ArrayList<>();
        ArrayList<String> beans  = new ArrayList<>();
        ArrayList<String> salsa  = new ArrayList<>();
        ArrayList<String> veggies = new ArrayList<>();

	    rice.add("white");
        rice.add("brown");
        rice.add("no_rice");

        meat.add("chicken");
        meat.add("steak");
        meat.add("carnidas");
        meat.add("chorizo");
        meat.add("sofritas");
        meat.add("veggie");

        beans.add("pinto");
        beans.add("black");
        beans.add("no_beans");

        salsa.add("mild");
        salsa.add("medium");
        salsa.add("hot");
        salsa.add("no_salsa");

        veggies.add("lettuce");
        veggies.add("fajita_veggies");
        veggies.add("no_veggies");

        int[] lenIng = {3,6,3,4,3};
        int x,y=0;
        Random r = new Random();
        String[] ingredient = {"rice", "meat", "beans", "salsa","veggies"};

        for (int i=1;i<11;i++) {
            System.out.print("burrito " + i + ": ");
            for (int j = 0; j < 5; j++) {
                x = lenIng[j];
                y = r.nextInt(x);
                switch (j) {
                    case 0:
                        System.out.print(rice.get(y) + ", ");
                        break;
                    case 1:
                        System.out.print(meat.get(y) + ", ");
                        break;
                    case 2:
                        System.out.print(beans.get(y) + ", ");
                        break;
                    case 3:
                        System.out.print(salsa.get(y) + ", ");
                        break;
                    case 4:
                        System.out.println(veggies.get(y));
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
