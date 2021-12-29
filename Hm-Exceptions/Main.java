package com.company;

public class Main {

    public static void main(String[] args) {
        FamilyDoctor Dralon = new FamilyDoctor(6589775, "Alon cohen", "Siba", "Ramat-Hayal-TLV");
        Dralon.acceptClient();
        System.out.println("is Dr Alon busy? "+ Dralon.isM_is_occupied());

        Dralon.acceptClient();

        Dralon.finishAppointment();
        System.out.println("is Dr Alon busy? "+Dralon.isM_is_occupied());
    }
}
