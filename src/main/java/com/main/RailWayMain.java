/*Part-B
Write a program on Railway ticket reservation systems,

[Hints: consider an entity class RailwayReservastion, take attributes as ‘passengerName’, ‘passengerAge’, ‘choosenSeat’, ‘typeOfReservasion’ (AC / Non-AC), ‘amountPaid’, ‘isSeniorCitizen’.
             Take input of passengerName, age, seat, and type, while taking input do proper validation like age provided as integer not any other format like float or String and if age > 60 then.
             Consider passenger as senior citizen and populate ‘isSeniorCitizen’ as true assign the lower berth/seat. And after taking all the input need to calculate the amount to be paid for booking,
             if ‘AC’ is the type of reservation then rate will be $100 and if non-AC the rate will be $60.



1. Create one table using hibernate XML configuration named: ‘railway_reservastion’
with column name as ‘passenger_name’, ‘paggenger_age’, ‘choosen_seat’,
‘reservation_type’, ‘is_senior_citizen’, ‘amount_paid’.
2. Once take input of passengerName, passengerAge, choosenSeat and
typeOfReservation, then please insert those records to database.
3. Once calculated weather the passenger is senior citizen or not then update the same
under column name ‘is_senior_citizen’ in the already inserted row (in point 2) with 0
/ 1 value (while true value to be saved 1 and 0 while value will be false)
4. Once amount been calculated then same would be updated under ‘amount_paid’
column for the inserted row (in point 2).
 ** Make sure you follow the steps mentioned above while inserting and updating the row.*/


package com.main;

import com.database.RailwayToDataBase;
import com.model.RailwayReservastion;
import com.service.MethodService;

import java.util.Scanner;

public class RailWayMain {



    public static void main(String[] args) {
        RailwayReservastion rr=new RailwayReservastion();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter passenger Name:");
        String pName=sc.nextLine();
        rr.setPassengerName(pName);




        System.out.println("Enter Reservation Type:");
        String rType=sc.nextLine();
        rr.setTypeOfReservasion(rType);

        System.out.println("Enter passenger Age:");
        int pAge=sc.nextInt();
        rr.setPassengerAge(pAge);

        System.out.println("Enter passenger Seat no:");
        int seatNo=sc.nextInt();
        rr.setChoosenSeat(seatNo);

        double amount=MethodService.rateCalculation(rType,100.00);
        rr.setAmountPaid(amount);


        boolean isSenior= MethodService.validateAge(pAge);
        rr.setSeniorCitizen(isSenior);

        RailwayToDataBase.establishAndcreateAndInsert(rr);


    }
}

