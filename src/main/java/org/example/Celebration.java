package org.example;

public class Celebration {
    public static void celebrate(Employee[] employees, Parties today) {
        for (Employee employee : employees) {
            switch (today) {
                case NEW_YEAR:
                    System.out.println(employee.getName() + ", с Новым Годом!");
                    break;
                case FEB_23:
                    if (employee.getGender() == Genders.MALE)
                        System.out.println(employee.getName() + ", с Днем защитника Отечества!");
                    break;
                case MARCH_8:
                    if (employee.getGender() == Genders.FEMALE)
                        System.out.println(employee.getName() + ", с Международным женским днем!");
                    break;
                default:
                    System.out.println(employee.getName() + ", праздника нет!");
                    break;
            }
        }
    }
}
