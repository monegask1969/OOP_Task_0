package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Max on 21.01.2016.
 */
public class Student {
    private int id;
    public String first_name;
    public String second_name;
    public String patronymic;
    public Calendar date;
    public String address;
    private String telephone;
    public String faculty;
    private int curse;
    private int group;

    Student(){
        id = 0;
        first_name = "Петр";
        second_name = "Петров";
        patronymic = "Петрович";
        date = new GregorianCalendar(1985, 6, 24);
        address = "ул.Будмена, 27";
        telephone = "+380732548011 - DEFAULT VALUE";
        faculty = "IF";
        curse = 2;
        group = 34;
    }

    Student(int id, String first_name, String second_name, String patronymic, Calendar date, String address, String telephone, String faculty, int curse, int group) {
        this.id = id;
        this.first_name = first_name;
        this.second_name = second_name;
        this.patronymic = patronymic;
        this.date = date;
        this.address = address;
        this.telephone = telephone;
        this.faculty = faculty;
        this.curse = curse;
        this.group = group;
    }



    public void setId(int id) {
       if(id > -1) this.id = id;
        else System.out.println("Enter valid id!");
    }

    public void setTelephone(String telephone) {
        if(telephone.length() >=8 )this.telephone = telephone;
        else System.out.println("Enter 8-digit (or more) telephone number!");
    }

    public void setCurse(int curse) {
       if(curse > 0) this.curse = curse;
        else System.out.println("Enter valid curse!");
    }

    public void setGroup(int group) {
        if(group > 0)this.group = group;
        else System.out.println("Enter valid group!");
    }



    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Calendar getDate() {
        return date;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getCurse() {
        return curse;
    }

    public int getGroup() {
        return group;
    }


    @Override
    public String toString() {
        return "Student:" + "\n" +
                " id=" + id + "\n" +
                " First name : " + first_name + "\n" +
                " Second name: " + second_name + "\n" +
                " Patronymic: " + patronymic + "\n" +
                " date of birth: " +date.get(Calendar.DAY_OF_MONTH)+"." + date.get(Calendar.MONTH) + "." + date.get(Calendar.YEAR) + "\n" +
                " address: " + address + "\n" +
                " telephone: " + telephone + "\n" +
                " faculty: " + faculty + "\n" +
                " curse: " + curse + "\n" +
                " group: " + group + "\n";
    }

}
