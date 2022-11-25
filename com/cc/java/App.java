package com.cc.java;

public class App {
    
    public static void main(String[] args) {
        Mitarbeiter mitarbeiter1 = new Mitarbeiter("Müller", "Michael", "Juniorpartner", 2024);
        //output(mitarbeiter1.getInfo("#lastName"));
        System.out.print(mitarbeiter1.getInfo("#lastName") +" ");
        System.out.println(mitarbeiter1.getInfo("#firstName"));
        output(mitarbeiter1.getInfo("#role"));
        output(mitarbeiter1.getYearofEntry());
        

        output("------------------------");
    
    Mitarbeiter mitarbeiter2 = new Mitarbeiter("Sonnenberg", "Maik", "Chefprogrammierer", 2010);
    System.out.print(mitarbeiter2.getInfo("#lastName") + " ");
    System.out.println(mitarbeiter2.getInfo("#firstName"));
   output(mitarbeiter2.getInfo("#role"));
   output(mitarbeiter2.getYearofEntry());

   output("------------------------");

   Mitarbeiter mitarbeiter3 = new Mitarbeiter("Eggert", "Marcel", "Netzwerkadministrator", 2015);
   System.out.print(mitarbeiter3.getInfo("#lastName") + " ");
   System.out.println(mitarbeiter3.getInfo("#firstName"));
   output(mitarbeiter3.getInfo("#role"));
   output(mitarbeiter3.getYearofEntry());

   output("------------------------");

   Mitarbeiter mitarbeiter4 = new Mitarbeiter("Kamenetski", "Mia", "Meme-Expertin", 2008);
   System.out.print(mitarbeiter4.getInfo("#lastName") + " ");
   System.out.println(mitarbeiter4.getInfo("#firstName"));
   output(mitarbeiter4.getInfo("#role"));
   output(mitarbeiter4.getYearofEntry());
    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }
}

