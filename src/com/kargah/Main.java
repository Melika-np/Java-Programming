package com.kargah;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person person = new Person();
        person.setName("Melika");
        person.setFamily("Naghavi");
        person.setAge(19);
        person.setJob("student");
        person.setUsername("melika-np");
        person.setPass("1234");
        System.out.println(person.getName());
        System.out.println(person.getFamily());
        System.out.println(person.getAge());
        System.out.println(person.getJob());
        System.out.println(person.getUsername());
        System.out.println(person.getPass());
    }
}
