package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {
        Human me = new Human();
        me.firstName = "Vitalii";
        me.lastName = "Sumka";
        me.pet = new Animal("Dog");
        me.pet.name = "Emma";
        me.getLastSalaryCheckInfo();
        System.out.println("First salary check. Salary: " + me.getSalary());
        me.getLastSalaryCheckInfo();
        me.setSalary(3500.0);
        me.setCar(new Car("BMW", "3 series"));
        System.out.println(me.getCar().getProducer()+ " " + me.getCar().getModel());

        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();

        Car car1 = new Car("Ford", "Mondeo");
        Car car2 = new Car("Ford", "Mondeo");
        if (car1 == car2) {
            System.out.println("car1 i car2 są takie same");
        } else {
            System.out.println("car1 i car2 nie są takie same");
        }
        System.out.println(car1);

        me.mobile = new Phone("Iphone", "8 plus");

        System.out.println(me);
        System.out.println(me.pet);
        System.out.println(me.getCar());
        me.getCar().turnOn();
        System.out.println(me.mobile);
        me.mobile.turnOn();
    }
}
