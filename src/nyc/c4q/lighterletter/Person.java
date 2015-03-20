package nyc.c4q.lighterletter;

import java.util.Calendar;

/**
     * Access Code 2.1
     *
     * Author  Gregory Gundersen
     * Date    March 2015
     *
     * This class represents a person with a name and age.
     */

    public class Person {

        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Person(String name) {
            this.name = name;
        }

        public void setName(String newName) {
            this.name = newName;
        }

        public String getName() {
            return this.name;
        }

        public void setAge(int newAge) {
            this.age = newAge;
        }

        public int getAge() {
            return this.age;
        }
        public static void greet(){
            System.out.println("I'm Speaking for all persons");
        }

        public static void main(String[] args) {
            int n = 0;
            Person fred = new Person("Fred",25);
            System.out.println(fred.getAge());


            Person.greet();


            fred.getAge();

            fred.setAge(30);
            System.out.println(fred.getAge());


            Calendar c = Calendar.getInstance();

            Person bob = fred; // Now refer to the same object

            bob.setName("John");

            System.out.println(fred.getName());


            String.format("Formatting thr number %d", 9);
        }
    }


