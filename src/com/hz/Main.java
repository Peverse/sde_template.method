package com.hz;

public class Main {

    public static void main(String[] args) {

        // Lets print some cards
        Printer printer = new Console();

        //It is now super easy!
        PostCard card = new PostCard(printer);
        GraduationCard card2 = new GraduationCard(printer);

        card.print();
        card2.print();
    }
}
