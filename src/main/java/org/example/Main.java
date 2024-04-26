package org.example;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Иван", Genders.MALE);
        employees[1] = new Employee("Мария", Genders.FEMALE);
        employees[2] = new Employee("Петр", Genders.MALE);

        Parties today = Parties.NEW_YEAR;

        Celebration.celebrate(employees, today);
    }
}