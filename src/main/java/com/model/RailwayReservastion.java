package com.model;

public class RailwayReservastion {
    private int passengerId;
    private String passengerName;
    private int passengerAge;
    private int choosenSeat;
    private String typeOfReservasion;
    private double amountPaid;
    private boolean seniorCitizen;

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public int getPassengerAge() {
        return passengerAge;
    }

    public void setPassengerAge(int passengerAge) {
        this.passengerAge = passengerAge;
    }

    public int getChoosenSeat() {
        return choosenSeat;
    }

    public void setChoosenSeat(int choosenSeat) {
        this.choosenSeat = choosenSeat;
    }

    public String getTypeOfReservasion() {
        return typeOfReservasion;
    }

    public void setTypeOfReservasion(String typeOfReservasion) {
        this.typeOfReservasion = typeOfReservasion;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public boolean isSeniorCitizen() {
        return seniorCitizen;
    }

    public void setSeniorCitizen(boolean seniorCitizen) {
        this.seniorCitizen = seniorCitizen;
    }

    public RailwayReservastion() {
    }

    public RailwayReservastion(int passengerId, String passengerName, int passengerAge,
                               int choosenSeat, String typeOfReservasion,
                               double amountPaid, boolean seniorCitizen) {
        this.passengerId = passengerId;
        this.passengerName = passengerName;
        this.passengerAge = passengerAge;
        this.choosenSeat = choosenSeat;
        this.typeOfReservasion = typeOfReservasion;
        this.amountPaid = amountPaid;
        this.seniorCitizen = seniorCitizen;
    }
}
