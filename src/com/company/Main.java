package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Student[] array = new Student[5];
        array[0] = new Student(0, "Иванов", "Иван", "Иванович", new GregorianCalendar(1988,7,25),"ул. Григория Победоносца, 9", "+380663266487", "КИТ", 3,5);
        array[1] = new Student(1, "Никифоров", "Инокентий", "Петрович", new GregorianCalendar(1990,10,4),"ул. Льва Толстого, 19", "+380600446458", "КИТ", 2,6);
        array[2] = new Student(2, "Клименко", "Кирилл", "Кириллович", new GregorianCalendar(1997,11,28),"ул. Шлягеров, 22", "+380661289844", "ИФ", 2,1);
        array[3] = new Student(3, "Зеленогоров", "Руслан", "Русланович", new GregorianCalendar(1992,3,16),"ул. Федора Бондарчука, 2", "+380504568233", "МТ", 5,2);
        array[4] = new Student(4, "Менторов", "Федор", "Григорьевич", new GregorianCalendar(1999,6,21),"ул. Никиты Михалкова, 2", "+380933254069", "МШ", 1,4);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student's faculty: ");
        String faculty = scanner.nextLine();
        System.out.println("Students, which are on the " + faculty + " faculty:");
        for (int i = 0; i < array.length; i++) {
            if(array[i].getFaculty().equals(faculty)){
                System.out.println(array[i].toString());
            }
        }

        System.out.println("Enter student's faculty: ");
        faculty = scanner.nextLine();
        System.out.println("Enter student's curse: ");
        int curse = scanner.nextInt();
        System.out.println("Students, which are on the " + faculty + " faculty and " + curse + " curse:");
        for (int i = 0; i < array.length; i++) {
            if(array[i].getFaculty().equals(faculty) && array[i].getCurse() == curse){
                System.out.println(array[i].toString());
            }
        }

        System.out.println("Enter student's the year of birth: ");
        int year = scanner.nextInt();
        System.out.println("Here student's which were born after " + year + " year:");
        for (int i = 0; i < array.length ; i++) {
            if(array[i].getDate().get(Calendar.YEAR) > year){
                System.out.println(array[i].toString());
            }
        }

        System.out.println("Enter number of group: ");
        int group = scanner.nextInt();
        System.out.println("Here all students from " + group + " group:");
        for (int i = 0; i < array.length; i++) {
            if(array[i].getGroup() == group){
                System.out.println(array[i].toString());
            }
        }

    }
}
