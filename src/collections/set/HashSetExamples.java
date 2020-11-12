package collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSetExamples {
    public static void main(String[] args) {
        Set<String> diet1 = new HashSet<>();
        diet1.add("Egg");
        diet1.add("Orange Juice");
        diet1.add("French Toast");
        diet1.add("French Fries");
        diet1.add("Coffee");
        diet1.add("Egg");

        Set<String> diet2 = new HashSet<>();
        diet2.add("Rice");
        diet2.add("Egg");
        diet2.add("Tomato");
        diet2.add("Waffle");
        diet2.add("Maple Syrup");
        diet2.add("French Fries");
        diet2.add("Bacon");

        System.out.println(diet1.size());

        diet1.retainAll(diet2);
        System.out.println(diet1);

        ArrayList<String> food = new ArrayList<>();
        food.add("Sushi");
        food.add("Sushi");
        food.add("Pasta");
        food.add("Curry");
        food.add("Curry");
        food.add("Pizza");
        food.add("Pizza");
        food.add("Burger");
        food.add("Burger");
        food.add("Burger");
        food.add("Burger");
        food.add("Burger");

        System.out.println(food.size());
        HashSet<String> uniqueFood = new HashSet<>(food);
        System.out.println(uniqueFood);

        HashSet<String> r1 = new HashSet<String>();
        r1.add("Xian");
        r1.add("Guangzhou");
        r1.add("Shanghai");
        r1.add("Beijing");
        r1.add("Chengdu");
        r1.add("Harbin");
        r1.add("Kunming");
        r1.add("Harbin");
        HashSet<String> r2 = new HashSet<String>();
        r2 = (HashSet)r1.clone();
        System.out.println(r2);
    }
}
